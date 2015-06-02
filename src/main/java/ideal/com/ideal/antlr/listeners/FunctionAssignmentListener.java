package ideal.com.ideal.antlr.listeners;

import com.ideal.antlr.IdealBaseListener;
import com.ideal.antlr.IdealParser;

public class FunctionAssignmentListener extends IdealBaseListener
{
    @Override
    public void enterFunction_assignment(final IdealParser.Function_assignmentContext ctx)
    {
        System.out.println(ctx.getText());
    }
}
