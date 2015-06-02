package ideal.com.ideal.antlr.listeners;

import com.ideal.antlr.IdealBaseListener;
import com.ideal.antlr.IdealParser;

public class FunctionInvocationListener extends IdealBaseListener
{
    @Override
    public void enterFunction_invocation(final IdealParser.Function_invocationContext ctx)
    {
        System.out.println(ctx.getText());
    }
}
