package ideal.antlr;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.ideal.antlr.IdealBaseVisitor;
import com.ideal.antlr.IdealParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.google.common.base.Strings.isNullOrEmpty;
import static java.lang.String.format;

public class TestVisitor extends IdealBaseVisitor<String>
{
    private static int FIRST = 0;
    private static int LEFT = 0;
    private static int RIGHT = 1;

    @Override
    public String visitParse(final IdealParser.ParseContext ctx)
    {
        final StringBuilder sb = new StringBuilder();
        final Iterator<IdealParser.StatementContext> sci = ctx.statement().iterator();
        while (sci.hasNext())
        {
            final String s = this.visit(sci.next());
            if (!isNullOrEmpty(s))
            {
                sb.append(s);
                if (sci.hasNext()) { sb.append("\n"); }
            }
        }
        return sb.toString();
    }

    @Override
    public String visitArrayIndexAssignment(IdealParser.ArrayIndexAssignmentContext ctx)
    {
        return format("ASSIGN INDEX %s OF %s TO %s", this.visit(ctx.expression(LEFT)), ctx.ID().getText(), this.visit(ctx.expression(RIGHT)));
    }

    @Override
    public String visitArrayAssignment(IdealParser.ArrayAssignmentContext ctx)
    {
        final StringBuilder sb = new StringBuilder();
        sb.append(ctx.ID().getText()).append(" AS ");
        final Iterator<IdealParser.ExpressionContext> eci = ctx.expression().iterator();
        while (eci.hasNext())
        {
            sb.append(this.visit(eci.next()));
            if (eci.hasNext()) { sb.append(","); }
        }
        return sb.toString();
    }

    @Override
    public String visitArrayElementExpression(IdealParser.ArrayElementExpressionContext ctx)
    {
        return format("INDEX %s OF %s", this.visit(ctx.expression()), ctx.ID().getText());
    }

    @Override
    public String visitAssignmentStatement(IdealParser.AssignmentStatementContext ctx)
    {
        return this.visit(ctx.assignment());
    }

    @Override
    public String visitFunctionAssignment(IdealParser.FunctionAssignmentContext ctx)
    {
        final String name = ctx.ID().getText();
        final String parameters = this.visit(ctx.parameters());
        final List<String> body = Lists.transform(ctx.assignment(), new Function<IdealParser.AssignmentContext, String>() {
            @Nullable
            @Override
            public String apply(IdealParser.AssignmentContext input)
            {
                return TestVisitor.this.visit(input);
            }
        });
        final String expression = this.visit(ctx.expression());
        return format("ASSIGN %s WITH %s FROM %s RETURNING %s", name, parameters, body, expression);
    }

    @Override
    public String visitPatternMatchAssignment(IdealParser.PatternMatchAssignmentContext ctx)
    {
        final String name = ctx.ID().getText();
        final String pattern = this.visit(ctx.pattern_match());
        final String expression = this.visit(ctx.expression());
        return format("IF %s MATCHES %s RETURN %s", name, pattern, expression);
    }

    @Override
    public String visitPattern_match(IdealParser.Pattern_matchContext ctx)
    {
        final StringBuilder sb = new StringBuilder();
        final Iterator<IdealParser.Key_valueContext> kvci = ctx.key_value().iterator();
        while(kvci.hasNext())
        {
            final IdealParser.Key_valueContext kvc = kvci.next();
            sb.append(this.visit(kvc));
            if (kvci.hasNext()) { sb.append(" AND "); }
        }
        return sb.toString();
    }

    @Override
    public String visitParameters(IdealParser.ParametersContext ctx)
    {
        final List<String> ls = new ArrayList<String>();
        for (final TerminalNode tn : ctx.ID())
        {
            ls.add(tn.getText());
        }
        return Joiner.on(',').join(ls);
    }

    @Override
    public String visitBooleanExpression(IdealParser.BooleanExpressionContext ctx)
    {
        return this.visit(ctx.comparison());
    }

    @Override
    public String visitInvocationTerm(IdealParser.InvocationTermContext ctx)
    {
        final StringBuilder sb = new StringBuilder();
        sb.append("CALL ").append(ctx.ID().getText());
        sb.append(" WITH ");
        for (final IdealParser.Key_valueContext kvc : ctx.key_value())
        {
            sb.append(this.visit(kvc));
        }
        return sb.toString();
    }

    @Override
    public String visitBooleanTerm(IdealParser.BooleanTermContext ctx)
    {
        return this.visit(ctx.bool());
    }

    @Override
    public String visitBool(IdealParser.BoolContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitUnaryExpression(final IdealParser.UnaryExpressionContext ctx)
    {
        return this.visit(ctx.unary());
    }


    @Override
    public String visitNumberTerm(final IdealParser.NumberTermContext ctx)
    {
        return this.visit(ctx.number());
    }

    @Override
    public String visitParenExpression(final IdealParser.ParenExpressionContext ctx)
    {
        return "(" + this.visit(ctx.expression()) + ")";
    }

    @Override
    public String visitIdAssignment(final IdealParser.IdAssignmentContext ctx)
    {
        final String id = ctx.ID().getText();
        final String expression = this.visit(ctx.expression());
        return "ASSIGN " + id + " AS " + expression;
    }

    @Override
    public String visitAtomAssignment(final IdealParser.AtomAssignmentContext ctx)
    {
        final String id = ctx.ATOM().getText();
        final String expression = this.visit(ctx.expression());
        return id + " = " + expression;
    }

    @Override
    public String visitComparison(final IdealParser.ComparisonContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitPowerExpression(final IdealParser.PowerExpressionContext ctx)
    {
        final String l = this.visit(ctx.expression(LEFT));
        final String r = this.visit(ctx.expression(RIGHT));
        return format("%s %s %s", l, "POWER_OF", r);
    }

    @Override
    public String visitDivideExpression(final IdealParser.DivideExpressionContext ctx)
    {
        final String l = this.visit(ctx.expression(LEFT));
        final String r = this.visit(ctx.expression(RIGHT));
        return format("%s %s %s", l, "DIVIDED_BY", r);
    }

    @Override
    public String visitMultiplyExpression(final IdealParser.MultiplyExpressionContext ctx)
    {
        final String l = this.visit(ctx.expression(LEFT));
        final String r = this.visit(ctx.expression(RIGHT));
        return format("%s %s %s", l, "TIMES", r);
    }

    @Override
    public String visitSubstractExpression(final IdealParser.SubstractExpressionContext ctx)
    {
        final String l = this.visit(ctx.expression(LEFT));
        final String r = this.visit(ctx.expression(RIGHT));
        return format("%s %s %s", l, "MINUS", r);
    }

    @Override
    public String visitAddExpression(final IdealParser.AddExpressionContext ctx)
    {
        final String l = this.visit(ctx.expression(LEFT));
        final String r = this.visit(ctx.expression(RIGHT));
        return format("%s %s %s", l, "PLUS", r);
    }

    @Override
    public String visitExpressionKeyValue(IdealParser.ExpressionKeyValueContext ctx)
    {
        return format("%s = %s", ctx.ID().getText(), this.visit(ctx.expression()));
    }

    @Override
    public String visitAtomTerm(IdealParser.AtomTermContext ctx)
    {
        return ctx.ATOM().getText();
    }

    @Override
    public String visitIdTerm(final IdealParser.IdTermContext ctx)
    {
        return ctx.ID().getText();
    }

    @Override
    public String visitUnary(final IdealParser.UnaryContext ctx)
    {
        return this.visit(ctx.term());
    }

    @Override
    public String visitStringTerm(final IdealParser.StringTermContext ctx)
    {
        return this.visit(ctx.string());
    }

    @Override
    public String visitDecimalNumber(final IdealParser.DecimalNumberContext ctx)
    {
        return ctx.DECIMAL().getText();
    }

    @Override
    public String visitOr(final IdealParser.OrContext ctx)
    {
        return ctx.OR().getText();
    }

    @Override
    public String visitAnd(final IdealParser.AndContext ctx)
    {
        return ctx.AND().getText();
    }

    @Override
    public String visitIntegerNumber(final IdealParser.IntegerNumberContext ctx)
    {
        return ctx.INTEGER().getText();
    }

    @Override
    public String visitHexNumber(final IdealParser.HexNumberContext ctx)
    {
        return ctx.HEX_NUMBER().getText();
    }

    @Override
    public String visitString(final IdealParser.StringContext ctx)
    {
        return ctx.UNICODE_STRING().getText();
    }
}
