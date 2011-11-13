// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g 2011-11-11 16:35:50
 package ideal; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class IdealLexer extends Lexer {
    public static final int INTEGER=8;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int UNI_ESC=13;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int ESC=11;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int HEX_DIGIT=9;
    public static final int ATOM=5;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int WS=12;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int UNICODE_STRING=6;
    public static final int DIGIT=10;
    public static final int HEX_NUMBER=7;
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
    public String getGrammarFileName() { return "C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:9:7: ( '.' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:9:9: '.'
            {
            match('.'); 

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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:10:7: ( '(' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:10:9: '('
            {
            match('('); 

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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:11:7: ( ')' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:11:9: ')'
            {
            match(')'); 

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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:12:7: ( '->' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:12:9: '->'
            {
            match("->"); 


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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:13:7: ( ',' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:13:9: ','
            {
            match(','); 

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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:14:7: ( '!' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:14:9: '!'
            {
            match('!'); 

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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:15:7: ( '+' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:15:9: '+'
            {
            match('+'); 

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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:16:7: ( '-' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:16:9: '-'
            {
            match('-'); 

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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:17:7: ( '*' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:17:9: '*'
            {
            match('*'); 

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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:18:7: ( '/' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:18:9: '/'
            {
            match('/'); 

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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:19:7: ( '%' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:19:9: '%'
            {
            match('%'); 

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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:20:7: ( 'mod' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:20:9: 'mod'
            {
            match("mod"); 


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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:21:7: ( '=' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:21:9: '='
            {
            match('='); 

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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:22:7: ( '!=' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:22:9: '!='
            {
            match("!="); 


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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:23:7: ( '<' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:23:9: '<'
            {
            match('<'); 

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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:24:7: ( '<=' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:24:9: '<='
            {
            match("<="); 


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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:25:7: ( '>=' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:25:9: '>='
            {
            match(">="); 


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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:26:7: ( '>' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:26:9: '>'
            {
            match('>'); 

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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:27:7: ( '&&' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:27:9: '&&'
            {
            match("&&"); 


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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:28:7: ( '||' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:28:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "HEX_NUMBER"
    public final void mHEX_NUMBER() throws RecognitionException {
        try {
            int _type = HEX_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:58:12: ( '0x' ( HEX_DIGIT )+ )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:58:14: '0x' ( HEX_DIGIT )+
            {
            match("0x"); 

            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:58:19: ( HEX_DIGIT )+
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
            	    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:58:19: HEX_DIGIT
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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:60:9: ( ( DIGIT )+ )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:60:11: ( DIGIT )+
            {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:60:11: ( DIGIT )+
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
            	    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:60:11: DIGIT
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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:62:17: ( '\"' ( ESC | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )* '\"' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:62:19: '\"' ( ESC | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:62:23: ( ESC | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )*
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
            	    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:62:25: ESC
            	    {
            	    mESC(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:62:31: ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' )
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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:65:4: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:65:6: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:65:6: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:68:5: ( '\\\\' ( UNI_ESC | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:68:7: '\\\\' ( UNI_ESC | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:68:12: ( UNI_ESC | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 'u':
                {
                alt5=1;
                }
                break;
            case 'b':
                {
                alt5=2;
                }
                break;
            case 't':
                {
                alt5=3;
                }
                break;
            case 'n':
                {
                alt5=4;
                }
                break;
            case 'f':
                {
                alt5=5;
                }
                break;
            case 'r':
                {
                alt5=6;
                }
                break;
            case '\"':
                {
                alt5=7;
                }
                break;
            case '\'':
                {
                alt5=8;
                }
                break;
            case '\\':
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:68:14: UNI_ESC
                    {
                    mUNI_ESC(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:68:23: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:68:27: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:68:31: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:68:35: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:68:39: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:68:43: '\\\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:68:48: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:68:53: '\\\\'
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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:71:9: ( 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:71:11: 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:74:11: ( ( DIGIT | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:74:13: ( DIGIT | 'a' .. 'f' | 'A' .. 'F' )
            {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:74:13: ( DIGIT | 'a' .. 'f' | 'A' .. 'F' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt6=1;
                }
                break;
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
                {
                alt6=2;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:74:14: DIGIT
                    {
                    mDIGIT(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:74:20: 'a' .. 'f'
                    {
                    matchRange('a','f'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:74:29: 'A' .. 'F'
                    {
                    matchRange('A','F'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:77:7: ( ( '0' .. '9' ) )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:77:9: ( '0' .. '9' )
            {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:77:9: ( '0' .. '9' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:77:10: '0' .. '9'
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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:79:6: ( ( 'A' .. 'Z' | '_' )+ )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:79:8: ( 'A' .. 'Z' | '_' )+
            {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:79:8: ( 'A' .. 'Z' | '_' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='A' && LA7_0<='Z')||LA7_0=='_') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:81:4: ( ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:81:6: ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:81:20: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:
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
            	    break loop8;
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
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:83:9: ( '/*' ( . )* '*/' )
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:83:11: '/*' ( . )* '*/'
            {
            match("/*"); 

            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:83:16: ( . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:83:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
        // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | HEX_NUMBER | INTEGER | UNICODE_STRING | WS | ATOM | ID | COMMENT )
        int alt10=27;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:130: HEX_NUMBER
                {
                mHEX_NUMBER(); 

                }
                break;
            case 22 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:141: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 23 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:149: UNICODE_STRING
                {
                mUNICODE_STRING(); 

                }
                break;
            case 24 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:164: WS
                {
                mWS(); 

                }
                break;
            case 25 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:167: ATOM
                {
                mATOM(); 

                }
                break;
            case 26 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:172: ID
                {
                mID(); 

                }
                break;
            case 27 :
                // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:1:175: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\4\uffff\1\31\1\uffff\1\33\2\uffff\1\35\1\uffff\1\27\1\uffff\1"+
        "\40\1\42\2\uffff\1\22\3\uffff\1\26\10\uffff\1\27\5\uffff\1\26\1"+
        "\46\1\uffff";
    static final String DFA10_eofS =
        "\47\uffff";
    static final String DFA10_minS =
        "\1\11\3\uffff\1\76\1\uffff\1\75\2\uffff\1\52\1\uffff\1\157\1\uffff"+
        "\2\75\2\uffff\1\170\3\uffff\1\60\10\uffff\1\144\5\uffff\2\60\1\uffff";
    static final String DFA10_maxS =
        "\1\174\3\uffff\1\76\1\uffff\1\75\2\uffff\1\52\1\uffff\1\157\1\uffff"+
        "\2\75\2\uffff\1\170\3\uffff\1\172\10\uffff\1\144\5\uffff\2\172\1"+
        "\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\uffff\1\7\1\11\1\uffff\1\13"+
        "\1\uffff\1\15\2\uffff\1\23\1\24\1\uffff\1\26\1\27\1\30\1\uffff\1"+
        "\31\1\32\1\4\1\10\1\16\1\6\1\33\1\12\1\uffff\1\20\1\17\1\21\1\22"+
        "\1\25\2\uffff\1\14";
    static final String DFA10_specialS =
        "\47\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\24\2\uffff\1\24\22\uffff\1\24\1\6\1\23\2\uffff\1\12\1\17"+
            "\1\uffff\1\2\1\3\1\10\1\7\1\5\1\4\1\1\1\11\1\21\11\22\2\uffff"+
            "\1\15\1\14\1\16\2\uffff\32\26\4\uffff\1\25\1\uffff\14\27\1\13"+
            "\15\27\1\uffff\1\20",
            "",
            "",
            "",
            "\1\30",
            "",
            "\1\32",
            "",
            "",
            "\1\34",
            "",
            "\1\36",
            "",
            "\1\37",
            "\1\41",
            "",
            "",
            "\1\43",
            "",
            "",
            "",
            "\12\27\7\uffff\32\44\4\uffff\1\44\1\uffff\32\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45",
            "",
            "",
            "",
            "",
            "",
            "\12\27\7\uffff\32\44\4\uffff\1\44\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | HEX_NUMBER | INTEGER | UNICODE_STRING | WS | ATOM | ID | COMMENT );";
        }
    }
 

}