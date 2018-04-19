package ideal;

import com.ideal.antlr.IdealLexer;
import com.ideal.antlr.IdealParser;
import ideal.antlr.TestVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import java.io.IOException;
import java.io.InputStream;

public class IdealMain
{
    public static void main(final String[] args) throws IOException, RecognitionException
    {
        final InputStream is = IdealMain.class.getResourceAsStream("/input.ideal");
        final ANTLRInputStream ais = new ANTLRInputStream(is);
        final IdealLexer il = new IdealLexer(ais);
        final CommonTokenStream cts = new CommonTokenStream(il);
//        cts.fill();
//        final StringBuilder sb = new StringBuilder();
//        for (Token token : cts.getTokens())
//        {
//            sb.append(token).append("\n");
//        }
//        System.out.print(sb.toString());
        final IdealParser ip = new IdealParser(cts);
        //ParseTreeWalker.DEFAULT.walk(new EvaluationListener(), ip.evaluate());
        final TestVisitor ev = new TestVisitor();
        System.out.println(ip.parse().accept(ev));
    }
}
