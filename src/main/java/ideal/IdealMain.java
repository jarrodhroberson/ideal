package ideal;

import java.io.IOException;
import java.io.InputStream;

import com.ideal.antlr.IdealLexer;
import com.ideal.antlr.IdealParser;
import ideal.com.ideal.antlr.listeners.FunctionAssignmentListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class IdealMain
{
    public static void main(final String[] args) throws IOException, RecognitionException
    {
        final InputStream is = IdealMain.class.getResourceAsStream("/input.ideal");
        final ANTLRInputStream ais = new ANTLRInputStream(is);
        final IdealLexer il = new IdealLexer(ais);
        final CommonTokenStream cts = new CommonTokenStream(il);
        final IdealParser ip = new IdealParser(cts);
        ParseTreeWalker.DEFAULT.walk(new FunctionAssignmentListener(),ip.eval());
    }
}
