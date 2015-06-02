package ideal.com.ideal.antlr.listeners;

import com.ideal.antlr.IdealBaseListener;
import com.ideal.antlr.IdealParser;

public class FunctionSignatureListener extends IdealBaseListener
{
    @Override
    public void enterFunction_signature(final IdealParser.Function_signatureContext ctx)
    {
        System.out.println(ctx.getText());
    }
}
