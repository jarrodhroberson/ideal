package ideal.com.ideal.antlr.listeners;

import com.ideal.antlr.IdealBaseListener;
import com.ideal.antlr.IdealParser;

public class ExpressionListener extends IdealBaseListener
{
    @Override
    public void enterExpression(final IdealParser.ExpressionContext ctx)
    {
        System.out.println(ctx.getText());
    }
}
