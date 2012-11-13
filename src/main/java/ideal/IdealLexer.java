// $ANTLR 3.4 C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g 2012-11-13 14:40:24

  package ideal;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class IdealLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int ATOM=4;
    public static final int COMMENT=5;
    public static final int DIGIT=6;
    public static final int ESC=7;
    public static final int FLOAT=8;
    public static final int HEX_DIGIT=9;
    public static final int HEX_NUMBER=10;
    public static final int ID=11;
    public static final int INTEGER=12;
    public static final int NAMESPACE=13;
    public static final int TYPE_ID=14;
    public static final int UNICODE_STRING=15;
    public static final int UNI_ESC=16;
    public static final int WS=17;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public IdealLexer() {} 
    public IdealLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public IdealLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:11:7: ( '!' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:11:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:12:7: ( '!=' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:12:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:13:7: ( '%' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:13:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:14:7: ( '&&' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:14:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:15:7: ( '(' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:15:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:16:7: ( ')' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:16:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:17:7: ( '*' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:17:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:18:7: ( '+' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:18:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:19:7: ( ',' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:20:7: ( '-' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:20:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:21:7: ( '->' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:21:9: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:22:7: ( '.' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:22:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:23:7: ( '/' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:23:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:24:7: ( ':' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:25:7: ( '<' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:25:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:26:7: ( '<=' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:26:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:27:7: ( '=' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:27:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:28:7: ( '>' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:28:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:29:7: ( '>=' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:29:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:30:7: ( '^' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:30:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:31:7: ( 'mod' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:31:9: 'mod'
            {
            match("mod"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:32:7: ( '||' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:32:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "HEX_NUMBER"
    public final void mHEX_NUMBER() throws RecognitionException {
        try {
            int _type = HEX_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:71:12: ( '0x' ( HEX_DIGIT )+ )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:71:14: '0x' ( HEX_DIGIT )+
            {
            match("0x"); 



            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:71:19: ( HEX_DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'F')||(LA1_0 >= 'a' && LA1_0 <= 'f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_NUMBER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:75:6: ()
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:75:8: 
            {
            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:76:9: ( ( DIGIT )+ ({...}? => '.' ( DIGIT )+ )? )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:76:11: ( DIGIT )+ ({...}? => '.' ( DIGIT )+ )?
            {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:76:11: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:76:18: ({...}? => '.' ( DIGIT )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') && ((input.LA(1)=='.' && input.LA(2)>='0' && input.LA(2)<='9'))) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:76:19: {...}? => '.' ( DIGIT )+
                    {
                    if ( !((input.LA(1)=='.' && input.LA(2)>='0' && input.LA(2)<='9')) ) {
                        throw new FailedPredicateException(input, "INTEGER", "input.LA(1)=='.' && input.LA(2)>='0' && input.LA(2)<='9'");
                    }

                    match('.'); 

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:76:85: ( DIGIT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    _type=FLOAT;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "UNICODE_STRING"
    public final void mUNICODE_STRING() throws RecognitionException {
        try {
            int _type = UNICODE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:78:16: ( '\"' ( ESC |~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )* '\"' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:78:18: '\"' ( ESC |~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )* '\"'
            {
            match('\"'); 

            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:78:22: ( ESC |~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    alt5=1;
                }
                else if ( ((LA5_0 >= ' ' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:78:24: ESC
            	    {
            	    mESC(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:78:30: ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' )
            	    {
            	    if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:80:4: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:80:6: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:80:6: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:84:5: ( '\\\\' ( UNI_ESC | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:84:7: '\\\\' ( UNI_ESC | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:84:12: ( UNI_ESC | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:84:14: UNI_ESC
                    {
                    mUNI_ESC(); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:84:23: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:84:27: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:84:31: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:84:35: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:84:39: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:84:43: '\\\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:84:48: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:84:53: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC"

    // $ANTLR start "UNI_ESC"
    public final void mUNI_ESC() throws RecognitionException {
        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:87:9: ( 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:87:11: 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNI_ESC"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:90:11: ( ( DIGIT | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:93:7: ( ( '0' .. '9' ) )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ATOM"
    public final void mATOM() throws RecognitionException {
        try {
            int _type = ATOM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:95:6: ( ( 'A' .. 'Z' ) ( 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:95:8: ( 'A' .. 'Z' ) ( 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:95:18: ( 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ATOM"

    // $ANTLR start "TYPE_ID"
    public final void mTYPE_ID() throws RecognitionException {
        try {
            int _type = TYPE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:97:9: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:97:11: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:97:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'Z')||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_ID"

    // $ANTLR start "NAMESPACE"
    public final void mNAMESPACE() throws RecognitionException {
        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:101:11: ( ( TYPE_ID ( ':' TYPE_ID )* )? )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:101:13: ( TYPE_ID ( ':' TYPE_ID )* )?
            {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:101:13: ( TYPE_ID ( ':' TYPE_ID )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0 >= 'A' && LA11_0 <= 'Z')) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:101:14: TYPE_ID ( ':' TYPE_ID )*
                    {
                    mTYPE_ID(); 


                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:101:22: ( ':' TYPE_ID )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==':') ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:101:24: ':' TYPE_ID
                    	    {
                    	    match(':'); 

                    	    mTYPE_ID(); 


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAMESPACE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:102:4: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:102:6: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:102:16: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '0' && LA12_0 <= '9')||(LA12_0 >= 'A' && LA12_0 <= 'Z')||LA12_0=='_'||(LA12_0 >= 'a' && LA12_0 <= 'z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:104:9: ( '/*' ( . )* '*/' )
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:104:11: '/*' ( . )* '*/'
            {
            match("/*"); 



            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:104:16: ( . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1 >= '\u0000' && LA13_1 <= '.')||(LA13_1 >= '0' && LA13_1 <= '\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0 >= '\u0000' && LA13_0 <= ')')||(LA13_0 >= '+' && LA13_0 <= '\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:104:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match("*/"); 



            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | HEX_NUMBER | INTEGER | UNICODE_STRING | WS | ATOM | TYPE_ID | ID | COMMENT )
        int alt14=30;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:10: T__18
                {
                mT__18(); 


                }
                break;
            case 2 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:16: T__19
                {
                mT__19(); 


                }
                break;
            case 3 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:22: T__20
                {
                mT__20(); 


                }
                break;
            case 4 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:28: T__21
                {
                mT__21(); 


                }
                break;
            case 5 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:34: T__22
                {
                mT__22(); 


                }
                break;
            case 6 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:40: T__23
                {
                mT__23(); 


                }
                break;
            case 7 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:46: T__24
                {
                mT__24(); 


                }
                break;
            case 8 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:52: T__25
                {
                mT__25(); 


                }
                break;
            case 9 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:58: T__26
                {
                mT__26(); 


                }
                break;
            case 10 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:64: T__27
                {
                mT__27(); 


                }
                break;
            case 11 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:70: T__28
                {
                mT__28(); 


                }
                break;
            case 12 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:76: T__29
                {
                mT__29(); 


                }
                break;
            case 13 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:82: T__30
                {
                mT__30(); 


                }
                break;
            case 14 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:88: T__31
                {
                mT__31(); 


                }
                break;
            case 15 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:94: T__32
                {
                mT__32(); 


                }
                break;
            case 16 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:100: T__33
                {
                mT__33(); 


                }
                break;
            case 17 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:106: T__34
                {
                mT__34(); 


                }
                break;
            case 18 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:112: T__35
                {
                mT__35(); 


                }
                break;
            case 19 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:118: T__36
                {
                mT__36(); 


                }
                break;
            case 20 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:124: T__37
                {
                mT__37(); 


                }
                break;
            case 21 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:130: T__38
                {
                mT__38(); 


                }
                break;
            case 22 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:136: T__39
                {
                mT__39(); 


                }
                break;
            case 23 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:142: HEX_NUMBER
                {
                mHEX_NUMBER(); 


                }
                break;
            case 24 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:153: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 25 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:161: UNICODE_STRING
                {
                mUNICODE_STRING(); 


                }
                break;
            case 26 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:176: WS
                {
                mWS(); 


                }
                break;
            case 27 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:179: ATOM
                {
                mATOM(); 


                }
                break;
            case 28 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:184: TYPE_ID
                {
                mTYPE_ID(); 


                }
                break;
            case 29 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:192: ID
                {
                mID(); 


                }
                break;
            case 30 :
                // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:1:195: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\32\7\uffff\1\34\1\uffff\1\36\1\uffff\1\40\1\uffff\1\42"+
        "\1\uffff\1\30\1\uffff\1\24\3\uffff\1\46\13\uffff\1\30\1\uffff\1"+
        "\46\2\uffff\1\51\1\uffff";
    static final String DFA14_eofS =
        "\52\uffff";
    static final String DFA14_minS =
        "\1\11\1\75\7\uffff\1\76\1\uffff\1\52\1\uffff\1\75\1\uffff\1\75\1"+
        "\uffff\1\157\1\uffff\1\170\3\uffff\1\60\13\uffff\1\144\1\uffff\1"+
        "\60\2\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\174\1\75\7\uffff\1\76\1\uffff\1\52\1\uffff\1\75\1\uffff\1\75"+
        "\1\uffff\1\157\1\uffff\1\170\3\uffff\1\172\13\uffff\1\144\1\uffff"+
        "\1\172\2\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\14\1\uffff\1\16"+
        "\1\uffff\1\21\1\uffff\1\24\1\uffff\1\26\1\uffff\1\30\1\31\1\32\1"+
        "\uffff\1\35\1\2\1\1\1\13\1\12\1\36\1\15\1\20\1\17\1\23\1\22\1\uffff"+
        "\1\27\1\uffff\1\33\1\34\1\uffff\1\25";
    static final String DFA14_specialS =
        "\52\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\26\2\uffff\1\26\22\uffff\1\26\1\1\1\25\2\uffff\1\2\1\3\1"+
            "\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\23\11\24\1\14\1"+
            "\uffff\1\15\1\16\1\17\2\uffff\32\27\3\uffff\1\20\2\uffff\14"+
            "\30\1\21\15\30\1\uffff\1\22",
            "\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33",
            "",
            "\1\35",
            "",
            "\1\37",
            "",
            "\1\41",
            "",
            "\1\43",
            "",
            "\1\44",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\6\uffff\32\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50",
            "",
            "\12\45\7\uffff\32\45\6\uffff\32\47",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | HEX_NUMBER | INTEGER | UNICODE_STRING | WS | ATOM | TYPE_ID | ID | COMMENT );";
        }
    }
 

}