package ideal.antlr;

import static java.lang.String.format;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Joiner;
import com.ideal.antlr.IdealBaseVisitor;
import com.ideal.antlr.IdealParser;

public class ExpressionVisitor extends IdealBaseVisitor<String>
{

    @Override
    public String visitEvaluate(final IdealParser.EvaluateContext ctx)
    {

        final List<String> ls = new ArrayList<String>();
        for (final IdealParser.Id_assignmentContext iac : ctx.id_assignment())
        {
            ls.add(this.visitId_assignment(iac));
        }
        return Joiner.on(";\n").join(ls) + ";\n";
    }

    @Override
    public String visitUnaryExpression(final IdealParser.UnaryExpressionContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitSubstractExpression(final IdealParser.SubstractExpressionContext ctx)
    {
        final String l = this.visit(ctx.expression(0));
        final String r = this.visit(ctx.expression(1));
        return format("%s MINUS %s", l, r);
    }

    @Override
    public String visitPowerExpression(final IdealParser.PowerExpressionContext ctx)
    {
        final String l = this.visit(ctx.expression(0));
        final String r = this.visit(ctx.expression(1));
        return format("%s TO_THE_POWER_OF %s", l, r);
    }

    @Override
    public String visitParenExpression(final IdealParser.ParenExpressionContext ctx)
    {
        return "[" + this.visit(ctx.expression()) + "]";
    }

    @Override
    public String visitId_assignment(final IdealParser.Id_assignmentContext ctx)
    {
        final String l = ctx.ID().getText();
        final String r = this.visit(ctx.expression());
        return format("ASSIGN %s TO THE VALUE OF ( %s )", l, r );
    }

    @Override
    public String visitDivideExpression(final IdealParser.DivideExpressionContext ctx)
    {
        final String l = this.visit(ctx.expression(0));
        final String r = this.visit(ctx.expression(1));
        return format("%s DIVIDE %s", l, r);
    }

    @Override
    public String visitComparison(final IdealParser.ComparisonContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitAddExpression(final IdealParser.AddExpressionContext ctx)
    {
        final String l = this.visit(ctx.expression(0));
        final String r = this.visit(ctx.expression(1));
        return format("%s PLUS %s", l, r);
    }

    @Override
    public String visitUnary(final IdealParser.UnaryContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitMultiplyExpression(final IdealParser.MultiplyExpressionContext ctx)
    {
        final String l = this.visit(ctx.expression(0));
        final String r = this.visit(ctx.expression(1));
        return format("%s TIMES %s", l, r);
    }

    @Override
    public String visitString(final IdealParser.StringContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitAnd(final IdealParser.AndContext ctx)
    {
        return "AND";
    }

    @Override
    public String visitDecimalNumber(final IdealParser.DecimalNumberContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitHexNumber(final IdealParser.HexNumberContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitIdTerm(final IdealParser.IdTermContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitIntegerNumber(final IdealParser.IntegerNumberContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitNumberTerm(final IdealParser.NumberTermContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitOr(final IdealParser.OrContext ctx)
    {
        return "OR";
    }
}
