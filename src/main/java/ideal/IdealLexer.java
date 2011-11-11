// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g 2011-11-10 19:40:23
 package ideal; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class IdealLexer extends Lexer {
    public static final int INTEGER=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int UNI_ESC=12;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int ESC=10;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int HEX_DIGIT=8;
    public static final int ATOM=13;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int WS=11;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int UNICODE_STRING=5;
    public static final int DIGIT=9;
    public static final int HEX_NUMBER=6;
    public static final int COMMENT=14;

    // delegates
    // delegators

    public IdealLexer() {;} 
    public IdealLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public IdealLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:9:7: ( '(' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:9:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:10:7: ( ')' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:10:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:11:7: ( '->' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:11:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:12:7: ( ',' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:13:7: ( '.' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:13:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:14:7: ( 'if' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:14:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:15:7: ( ':' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:15:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:16:7: ( 'elseif' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:16:9: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:17:7: ( 'else' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:17:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:18:7: ( '!' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:18:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:19:7: ( '+' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:19:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:20:7: ( '-' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:20:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:21:7: ( '*' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:21:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:22:7: ( '/' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:22:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:23:7: ( '%' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:23:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:24:7: ( 'mod' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:24:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:25:7: ( '=' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:25:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:26:7: ( '!=' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:26:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:27:7: ( '<' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:27:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:28:7: ( '<=' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:28:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:29:7: ( '>=' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:29:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:30:7: ( '>' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:30:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:31:7: ( '&&' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:31:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:32:7: ( '||' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:32:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "HEX_NUMBER"
    public final void mHEX_NUMBER() throws RecognitionException {
        try {
            int _type = HEX_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:55:12: ( '0x' ( HEX_DIGIT )+ )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:55:14: '0x' ( HEX_DIGIT )+
            {
            match("0x"); 

            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:55:19: ( HEX_DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:55:19: HEX_DIGIT
            	    {
            	    mHEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEX_NUMBER"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:57:9: ( ( DIGIT )+ )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:57:11: ( DIGIT )+
            {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:57:11: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:57:11: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "UNICODE_STRING"
    public final void mUNICODE_STRING() throws RecognitionException {
        try {
            int _type = UNICODE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:59:17: ( '\"' ( ESC | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )* '\"' | '\\'' ( ESC | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\'' ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:59:19: '\"' ( ESC | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )* '\"'
                    {
                    match('\"'); 
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:59:23: ( ESC | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>=' ' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:59:24: ESC
                    	    {
                    	    mESC(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:59:30: ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' )
                    	    {
                    	    if ( (input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:60:19: '\\'' ( ESC | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:60:24: ( ESC | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\'' ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>=' ' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:60:25: ESC
                    	    {
                    	    mESC(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:60:31: ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>=' ' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:62:3: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:62:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:62:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:65:8: ( '\\\\' ( UNI_ESC | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:65:12: '\\\\' ( UNI_ESC | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:65:17: ( UNI_ESC | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            int alt7=9;
            switch ( input.LA(1) ) {
            case 'u':
                {
                alt7=1;
                }
                break;
            case 'b':
                {
                alt7=2;
                }
                break;
            case 't':
                {
                alt7=3;
                }
                break;
            case 'n':
                {
                alt7=4;
                }
                break;
            case 'f':
                {
                alt7=5;
                }
                break;
            case 'r':
                {
                alt7=6;
                }
                break;
            case '\"':
                {
                alt7=7;
                }
                break;
            case '\'':
                {
                alt7=8;
                }
                break;
            case '\\':
                {
                alt7=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:65:18: UNI_ESC
                    {
                    mUNI_ESC(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:65:27: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:65:31: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:65:35: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:65:39: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:65:43: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:65:47: '\\\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:65:52: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:65:57: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "ESC"

    // $ANTLR start "UNI_ESC"
    public final void mUNI_ESC() throws RecognitionException {
        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:68:9: ( 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:68:11: 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNI_ESC"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:71:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:71:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:74:9: ( ( '0' .. '9' ) )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:74:13: ( '0' .. '9' )
            {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:74:13: ( '0' .. '9' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:74:14: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ATOM"
    public final void mATOM() throws RecognitionException {
        try {
            int _type = ATOM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:76:7: ( ( 'A' .. 'Z' | '_' )+ )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:76:9: ( 'A' .. 'Z' | '_' )+
            {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:76:9: ( 'A' .. 'Z' | '_' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='A' && LA8_0<='Z')||LA8_0=='_') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATOM"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:78:5: ( ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:78:9: ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:78:23: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:80:9: ( '/*' ( . )* '*/' )
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:80:11: '/*' ( . )* '*/'
            {
            match("/*"); 

            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:80:16: ( . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:80:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | HEX_NUMBER | INTEGER | UNICODE_STRING | WS | ATOM | ID | COMMENT )
        int alt11=31;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:154: HEX_NUMBER
                {
                mHEX_NUMBER(); 

                }
                break;
            case 26 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:165: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 27 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:173: UNICODE_STRING
                {
                mUNICODE_STRING(); 

                }
                break;
            case 28 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:188: WS
                {
                mWS(); 

                }
                break;
            case 29 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:191: ATOM
                {
                mATOM(); 

                }
                break;
            case 30 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:196: ID
                {
                mID(); 

                }
                break;
            case 31 :
                // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:1:199: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\3\uffff\1\34\2\uffff\1\32\1\uffff\1\32\1\40\2\uffff\1\42\1\uffff"+
        "\1\32\1\uffff\1\45\1\47\2\uffff\1\25\3\uffff\1\31\4\uffff\1\52\1"+
        "\32\4\uffff\1\32\5\uffff\1\31\1\uffff\1\32\1\56\1\60\1\uffff\1\32"+
        "\1\uffff\1\62\1\uffff";
    static final String DFA11_eofS =
        "\63\uffff";
    static final String DFA11_minS =
        "\1\11\2\uffff\1\76\2\uffff\1\146\1\uffff\1\154\1\75\2\uffff\1\52"+
        "\1\uffff\1\157\1\uffff\2\75\2\uffff\1\170\3\uffff\1\60\4\uffff\1"+
        "\60\1\163\4\uffff\1\144\5\uffff\1\60\1\uffff\1\145\2\60\1\uffff"+
        "\1\146\1\uffff\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\174\2\uffff\1\76\2\uffff\1\146\1\uffff\1\154\1\75\2\uffff\1"+
        "\52\1\uffff\1\157\1\uffff\2\75\2\uffff\1\170\3\uffff\1\172\4\uffff"+
        "\1\172\1\163\4\uffff\1\144\5\uffff\1\172\1\uffff\1\145\2\172\1\uffff"+
        "\1\146\1\uffff\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\uffff\1\7\2\uffff\1\13\1\15"+
        "\1\uffff\1\17\1\uffff\1\21\2\uffff\1\27\1\30\1\uffff\1\32\1\33\1"+
        "\34\1\uffff\1\35\1\36\1\3\1\14\2\uffff\1\22\1\12\1\37\1\16\1\uffff"+
        "\1\24\1\23\1\25\1\26\1\31\1\uffff\1\6\3\uffff\1\20\1\uffff\1\11"+
        "\1\uffff\1\10";
    static final String DFA11_specialS =
        "\63\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\27\2\uffff\1\27\22\uffff\1\27\1\11\1\26\2\uffff\1\15\1\22"+
            "\1\26\1\1\1\2\1\13\1\12\1\4\1\3\1\5\1\14\1\24\11\25\1\7\1\uffff"+
            "\1\20\1\17\1\21\2\uffff\32\31\4\uffff\1\30\1\uffff\4\32\1\10"+
            "\3\32\1\6\3\32\1\16\15\32\1\uffff\1\23",
            "",
            "",
            "\1\33",
            "",
            "",
            "\1\35",
            "",
            "\1\36",
            "\1\37",
            "",
            "",
            "\1\41",
            "",
            "\1\43",
            "",
            "\1\44",
            "\1\46",
            "",
            "",
            "\1\50",
            "",
            "",
            "",
            "\12\32\7\uffff\32\51\4\uffff\1\51\1\uffff\32\32",
            "",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\53",
            "",
            "",
            "",
            "",
            "\1\54",
            "",
            "",
            "",
            "",
            "",
            "\12\32\7\uffff\32\51\4\uffff\1\51\1\uffff\32\32",
            "",
            "\1\55",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32\1\57\21\32",
            "",
            "\1\61",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | HEX_NUMBER | INTEGER | UNICODE_STRING | WS | ATOM | ID | COMMENT );";
        }
    }
 

}