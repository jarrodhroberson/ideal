package ideal;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import java.io.IOException;
import java.io.InputStream;

public class IdealMain
{
    public static void main(final String[] args) throws IOException, RecognitionException
    {
        final InputStream is = IdealMain.class.getResourceAsStream(args[0]);
        final ANTLRInputStream ais = new ANTLRInputStream(is);
        final IdealLexer lexer = new IdealLexer(ais);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final IdealParser parser = new IdealParser(tokens);
        parser.program();

    }
}
