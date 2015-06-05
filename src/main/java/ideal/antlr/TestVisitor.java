package ideal.antlr;

import static java.lang.String.format;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.common.base.Joiner;
import com.ideal.antlr.IdealBaseVisitor;
import com.ideal.antlr.IdealParser;
import org.antlr.v4.runtime.tree.TerminalNode;

public class TestVisitor extends IdealBaseVisitor<String>
{
    private static int FIRST = 0;
    private static int LEFT = 0;
    private static int RIGHT = 1;

    @Override
    public String visitEvaluate(final IdealParser.EvaluateContext ctx)
    {
        final StringBuilder sb = new StringBuilder();
        for (IdealParser.StatementContext sc : ctx.statement())
        {
            sb.append(this.visit(sc)).append('\n');
        }
        return sb.toString();
    }

    @Override
    public String visitFunctionDefinition(final IdealParser.FunctionDefinitionContext ctx)
    {
        return this.visit(ctx.function_definition());
    }

    @Override
    public String visitFunction_definition(final IdealParser.Function_definitionContext ctx)
    {
        final String fs = this.visit(ctx.function_signature());
        final List<String> expressions = new ArrayList<String>();
        for (final IdealParser.ExpressionContext e : ctx.expression())
        {
            expressions.add(this.visit(e));
        }
        final String exp = Joiner.on(";\n").join(expressions) + ";\n";
        return fs + "\n{\n" + exp + "}";
    }

    @Override
    public String visitUnaryExpression(final IdealParser.UnaryExpressionContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitStatement(final IdealParser.StatementContext ctx)
    {
        return this.visit(ctx.assignment());
    }

    @Override
    public String visitNumberTerm(final IdealParser.NumberTermContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitFunction_id(final IdealParser.Function_idContext ctx)
    {
        return ctx.ID().getText();
    }

    @Override
    public String visitFunction_signature(final IdealParser.Function_signatureContext ctx)
    {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.visit(ctx.function_id())).append("(");
        final Iterator<TerminalNode> iter = ctx.ID().iterator();
        sb.append(iter.next().getText()).append(")");
        while(iter.hasNext())
        {
            sb.append(iter.next().getText());
        }
        return sb.toString();
    }

    @Override
    public String visitParenExpression(final IdealParser.ParenExpressionContext ctx)
    {
        return "(" + this.visit(ctx.expression()) + ")";
    }

    @Override
    public String visitIdAssignment(final IdealParser.IdAssignmentContext ctx)
    {
        return this.visit(ctx.id_assignment());
    }

    @Override
    public String visitId_assignment(final IdealParser.Id_assignmentContext ctx)
    {
        final String id = ctx.ID().getText();
        final String expression = this.visit(ctx.expression());
        return id + " = " + expression + ";";
    }

    @Override
    public String visitAtomAssignment(final IdealParser.AtomAssignmentContext ctx)
    {
        return this.visit(ctx.atom_assignment());
    }

    @Override
    public String visitAtom_assignment(final IdealParser.Atom_assignmentContext ctx)
    {
        final String l = ctx.ATOM().getText();
        final String r = this.visit(ctx.expression());
        return format("%s => %s", l, r);
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
    public String visitBoolean_expression(final IdealParser.Boolean_expressionContext ctx)
    {
        return ctx.getText();
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
    public String visitIdTerm(final IdealParser.IdTermContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitUnary(final IdealParser.UnaryContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitStringTerm(final IdealParser.StringTermContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitDecimalNumber(final IdealParser.DecimalNumberContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitOr(final IdealParser.OrContext ctx)
    {
        return "||";
    }

    @Override
    public String visitAnd(final IdealParser.AndContext ctx)
    {
        return "&&";
    }

    @Override
    public String visitIntegerNumber(final IdealParser.IntegerNumberContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitHexNumber(final IdealParser.HexNumberContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitString(final IdealParser.StringContext ctx)
    {
        return ctx.getText();
    }
}
