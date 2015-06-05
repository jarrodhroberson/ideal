package ideal;

import java.io.IOException;
import java.io.InputStream;

import com.ideal.antlr.IdealLexer;
import com.ideal.antlr.IdealParser;
import ideal.antlr.TestVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

public class IdealMain
{
    public static void main(final String[] args) throws IOException, RecognitionException
    {
        final InputStream is = IdealMain.class.getResourceAsStream("/input.ideal");
        final ANTLRInputStream ais = new ANTLRInputStream(is);
        final IdealLexer il = new IdealLexer(ais);
        final CommonTokenStream cts = new CommonTokenStream(il);
        final IdealParser ip = new IdealParser(cts);
        //ParseTreeWalker.DEFAULT.walk(new EvaluationListener(), ip.evaluate());
        final TestVisitor ev = new TestVisitor();
        System.out.println(ip.evaluate().accept(ev));
    }
}
