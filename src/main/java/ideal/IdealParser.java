// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g 2011-11-10 19:40:22
 package ideal; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class IdealParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "UNICODE_STRING", "HEX_NUMBER", "INTEGER", "HEX_DIGIT", "DIGIT", "ESC", "WS", "UNI_ESC", "ATOM", "COMMENT", "'('", "')'", "'->'", "','", "'.'", "'if'", "':'", "'elseif'", "'else'", "'!'", "'+'", "'-'", "'*'", "'/'", "'%'", "'mod'", "'='", "'!='", "'<'", "'<='", "'>='", "'>'", "'&&'", "'||'"
    };
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
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=11;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int UNICODE_STRING=5;
    public static final int DIGIT=9;
    public static final int COMMENT=14;
    public static final int HEX_NUMBER=6;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "function", "string", "args", "ifstmt", "negation", 
        "arg", "number", "program", "assignment", "term", "relation", "statement", 
        "mult", "add", "unary", "expression"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public IdealParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public IdealParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public IdealParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return IdealParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:12:1: program : ( ( statement )* | ( function )* );
    public final IdealParser.program_return program() throws RecognitionException {
        IdealParser.program_return retval = new IdealParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        IdealParser.statement_return statement1 = null;

        IdealParser.function_return function2 = null;



        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:12:9: ( ( statement )* | ( function )* )
            int alt3=2;
            try { dbg.enterDecision(3);

            switch ( input.LA(1) ) {
            case ID:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==17) ) {
                    alt3=1;
                }
                else if ( (LA3_1==15) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case UNICODE_STRING:
            case HEX_NUMBER:
            case INTEGER:
            case 20:
                {
                alt3=1;
                }
                break;
            case EOF:
                {
                alt3=1;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:12:11: ( statement )*
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(12,11);
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:12:11: ( statement )*
                    try { dbg.enterSubRule(1);

                    loop1:
                    do {
                        int alt1=2;
                        try { dbg.enterDecision(1);

                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=ID && LA1_0<=INTEGER)||LA1_0==20) ) {
                            alt1=1;
                        }


                        } finally {dbg.exitDecision(1);}

                        switch (alt1) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:12:11: statement
                    	    {
                    	    dbg.location(12,11);
                    	    pushFollow(FOLLOW_statement_in_program56);
                    	    statement1=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement1.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(1);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:12:24: ( function )*
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(12,24);
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:12:24: ( function )*
                    try { dbg.enterSubRule(2);

                    loop2:
                    do {
                        int alt2=2;
                        try { dbg.enterDecision(2);

                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==ID) ) {
                            alt2=1;
                        }


                        } finally {dbg.exitDecision(2);}

                        switch (alt2) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:12:24: function
                    	    {
                    	    dbg.location(12,24);
                    	    pushFollow(FOLLOW_function_in_program61);
                    	    function2=function();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, function2.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(2);}


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(12, 33);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "program"

    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:14:1: function : ID '(' args ')' '->' ( statement )+ ( ',' ( statement )+ ) '.' ;
    public final IdealParser.function_return function() throws RecognitionException {
        IdealParser.function_return retval = new IdealParser.function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID3=null;
        Token char_literal4=null;
        Token char_literal6=null;
        Token string_literal7=null;
        Token char_literal9=null;
        Token char_literal11=null;
        IdealParser.args_return args5 = null;

        IdealParser.statement_return statement8 = null;

        IdealParser.statement_return statement10 = null;


        Object ID3_tree=null;
        Object char_literal4_tree=null;
        Object char_literal6_tree=null;
        Object string_literal7_tree=null;
        Object char_literal9_tree=null;
        Object char_literal11_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:14:10: ( ID '(' args ')' '->' ( statement )+ ( ',' ( statement )+ ) '.' )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:14:12: ID '(' args ')' '->' ( statement )+ ( ',' ( statement )+ ) '.'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(14,12);
            ID3=(Token)match(input,ID,FOLLOW_ID_in_function70); 
            ID3_tree = (Object)adaptor.create(ID3);
            adaptor.addChild(root_0, ID3_tree);

            dbg.location(14,15);
            char_literal4=(Token)match(input,15,FOLLOW_15_in_function72); 
            char_literal4_tree = (Object)adaptor.create(char_literal4);
            adaptor.addChild(root_0, char_literal4_tree);

            dbg.location(14,19);
            pushFollow(FOLLOW_args_in_function74);
            args5=args();

            state._fsp--;

            adaptor.addChild(root_0, args5.getTree());
            dbg.location(14,24);
            char_literal6=(Token)match(input,16,FOLLOW_16_in_function76); 
            char_literal6_tree = (Object)adaptor.create(char_literal6);
            adaptor.addChild(root_0, char_literal6_tree);

            dbg.location(14,28);
            string_literal7=(Token)match(input,17,FOLLOW_17_in_function78); 
            string_literal7_tree = (Object)adaptor.create(string_literal7);
            adaptor.addChild(root_0, string_literal7_tree);

            dbg.location(14,33);
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:14:33: ( statement )+
            int cnt4=0;
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4);

                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=ID && LA4_0<=INTEGER)||LA4_0==20) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:14:33: statement
            	    {
            	    dbg.location(14,33);
            	    pushFollow(FOLLOW_statement_in_function80);
            	    statement8=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement8.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt4++;
            } while (true);
            } finally {dbg.exitSubRule(4);}

            dbg.location(14,44);
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:14:44: ( ',' ( statement )+ )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:14:45: ',' ( statement )+
            {
            dbg.location(14,45);
            char_literal9=(Token)match(input,18,FOLLOW_18_in_function84); 
            char_literal9_tree = (Object)adaptor.create(char_literal9);
            adaptor.addChild(root_0, char_literal9_tree);

            dbg.location(14,48);
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:14:48: ( statement )+
            int cnt5=0;
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5);

                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=ID && LA5_0<=INTEGER)||LA5_0==20) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:14:48: statement
            	    {
            	    dbg.location(14,48);
            	    pushFollow(FOLLOW_statement_in_function85);
            	    statement10=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement10.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt5++;
            } while (true);
            } finally {dbg.exitSubRule(5);}


            }

            dbg.location(14,60);
            char_literal11=(Token)match(input,19,FOLLOW_19_in_function89); 
            char_literal11_tree = (Object)adaptor.create(char_literal11);
            adaptor.addChild(root_0, char_literal11_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(14, 64);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function"

    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args"
    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:16:1: args : arg ( ',' arg )* ;
    public final IdealParser.args_return args() throws RecognitionException {
        IdealParser.args_return retval = new IdealParser.args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal13=null;
        IdealParser.arg_return arg12 = null;

        IdealParser.arg_return arg14 = null;


        Object char_literal13_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:16:7: ( arg ( ',' arg )* )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:16:9: arg ( ',' arg )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(16,9);
            pushFollow(FOLLOW_arg_in_args100);
            arg12=arg();

            state._fsp--;

            adaptor.addChild(root_0, arg12.getTree());
            dbg.location(16,13);
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:16:13: ( ',' arg )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:16:14: ',' arg
            	    {
            	    dbg.location(16,14);
            	    char_literal13=(Token)match(input,18,FOLLOW_18_in_args103); 
            	    char_literal13_tree = (Object)adaptor.create(char_literal13);
            	    adaptor.addChild(root_0, char_literal13_tree);

            	    dbg.location(16,18);
            	    pushFollow(FOLLOW_arg_in_args105);
            	    arg14=arg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arg14.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(16, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "args");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "args"

    public static class arg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arg"
    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:18:1: arg : ID ( '->' expression )? ;
    public final IdealParser.arg_return arg() throws RecognitionException {
        IdealParser.arg_return retval = new IdealParser.arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID15=null;
        Token string_literal16=null;
        IdealParser.expression_return expression17 = null;


        Object ID15_tree=null;
        Object string_literal16_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:18:6: ( ID ( '->' expression )? )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:18:8: ID ( '->' expression )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(18,8);
            ID15=(Token)match(input,ID,FOLLOW_ID_in_arg118); 
            ID15_tree = (Object)adaptor.create(ID15);
            adaptor.addChild(root_0, ID15_tree);

            dbg.location(18,11);
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:18:11: ( '->' expression )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:18:12: '->' expression
                    {
                    dbg.location(18,12);
                    string_literal16=(Token)match(input,17,FOLLOW_17_in_arg121); 
                    string_literal16_tree = (Object)adaptor.create(string_literal16);
                    adaptor.addChild(root_0, string_literal16_tree);

                    dbg.location(18,17);
                    pushFollow(FOLLOW_expression_in_arg123);
                    expression17=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression17.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(18, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arg");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arg"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:20:1: statement : ( assignment | ifstmt | number | string );
    public final IdealParser.statement_return statement() throws RecognitionException {
        IdealParser.statement_return retval = new IdealParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        IdealParser.assignment_return assignment18 = null;

        IdealParser.ifstmt_return ifstmt19 = null;

        IdealParser.number_return number20 = null;

        IdealParser.string_return string21 = null;



        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:20:11: ( assignment | ifstmt | number | string )
            int alt8=4;
            try { dbg.enterDecision(8);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case HEX_NUMBER:
            case INTEGER:
                {
                alt8=3;
                }
                break;
            case UNICODE_STRING:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:20:13: assignment
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(20,13);
                    pushFollow(FOLLOW_assignment_in_statement133);
                    assignment18=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment18.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:21:13: ifstmt
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(21,13);
                    pushFollow(FOLLOW_ifstmt_in_statement147);
                    ifstmt19=ifstmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ifstmt19.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:22:13: number
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(22,13);
                    pushFollow(FOLLOW_number_in_statement161);
                    number20=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number20.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:23:13: string
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(23,13);
                    pushFollow(FOLLOW_string_in_statement175);
                    string21=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string21.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(24, 11);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statement"

    public static class ifstmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifstmt"
    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:26:1: ifstmt : 'if' expression ':' ( statement )+ ( ',' ( statement )+ ) '.' ( 'elseif' expression ':' ( statement )+ ( ',' ( statement )+ ) '.' )* ( 'else' ':' ( statement )+ ( ',' ( statement )+ ) '.' )? ;
    public final IdealParser.ifstmt_return ifstmt() throws RecognitionException {
        IdealParser.ifstmt_return retval = new IdealParser.ifstmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal22=null;
        Token char_literal24=null;
        Token char_literal26=null;
        Token char_literal28=null;
        Token string_literal29=null;
        Token char_literal31=null;
        Token char_literal33=null;
        Token char_literal35=null;
        Token string_literal36=null;
        Token char_literal37=null;
        Token char_literal39=null;
        Token char_literal41=null;
        IdealParser.expression_return expression23 = null;

        IdealParser.statement_return statement25 = null;

        IdealParser.statement_return statement27 = null;

        IdealParser.expression_return expression30 = null;

        IdealParser.statement_return statement32 = null;

        IdealParser.statement_return statement34 = null;

        IdealParser.statement_return statement38 = null;

        IdealParser.statement_return statement40 = null;


        Object string_literal22_tree=null;
        Object char_literal24_tree=null;
        Object char_literal26_tree=null;
        Object char_literal28_tree=null;
        Object string_literal29_tree=null;
        Object char_literal31_tree=null;
        Object char_literal33_tree=null;
        Object char_literal35_tree=null;
        Object string_literal36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal39_tree=null;
        Object char_literal41_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ifstmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(26, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:26:9: ( 'if' expression ':' ( statement )+ ( ',' ( statement )+ ) '.' ( 'elseif' expression ':' ( statement )+ ( ',' ( statement )+ ) '.' )* ( 'else' ':' ( statement )+ ( ',' ( statement )+ ) '.' )? )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:26:11: 'if' expression ':' ( statement )+ ( ',' ( statement )+ ) '.' ( 'elseif' expression ':' ( statement )+ ( ',' ( statement )+ ) '.' )* ( 'else' ':' ( statement )+ ( ',' ( statement )+ ) '.' )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(26,11);
            string_literal22=(Token)match(input,20,FOLLOW_20_in_ifstmt205); 
            string_literal22_tree = (Object)adaptor.create(string_literal22);
            adaptor.addChild(root_0, string_literal22_tree);

            dbg.location(26,16);
            pushFollow(FOLLOW_expression_in_ifstmt207);
            expression23=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression23.getTree());
            dbg.location(26,27);
            char_literal24=(Token)match(input,21,FOLLOW_21_in_ifstmt209); 
            char_literal24_tree = (Object)adaptor.create(char_literal24);
            adaptor.addChild(root_0, char_literal24_tree);

            dbg.location(26,31);
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:26:31: ( statement )+
            int cnt9=0;
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9);

                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=ID && LA9_0<=INTEGER)||LA9_0==20) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:26:31: statement
            	    {
            	    dbg.location(26,31);
            	    pushFollow(FOLLOW_statement_in_ifstmt211);
            	    statement25=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement25.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt9++;
            } while (true);
            } finally {dbg.exitSubRule(9);}

            dbg.location(26,42);
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:26:42: ( ',' ( statement )+ )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:26:43: ',' ( statement )+
            {
            dbg.location(26,43);
            char_literal26=(Token)match(input,18,FOLLOW_18_in_ifstmt215); 
            char_literal26_tree = (Object)adaptor.create(char_literal26);
            adaptor.addChild(root_0, char_literal26_tree);

            dbg.location(26,46);
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:26:46: ( statement )+
            int cnt10=0;
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10);

                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=ID && LA10_0<=INTEGER)||LA10_0==20) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:26:46: statement
            	    {
            	    dbg.location(26,46);
            	    pushFollow(FOLLOW_statement_in_ifstmt216);
            	    statement27=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement27.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt10++;
            } while (true);
            } finally {dbg.exitSubRule(10);}


            }

            dbg.location(26,58);
            char_literal28=(Token)match(input,19,FOLLOW_19_in_ifstmt220); 
            char_literal28_tree = (Object)adaptor.create(char_literal28);
            adaptor.addChild(root_0, char_literal28_tree);

            dbg.location(27,11);
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:27:11: ( 'elseif' expression ':' ( statement )+ ( ',' ( statement )+ ) '.' )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:27:12: 'elseif' expression ':' ( statement )+ ( ',' ( statement )+ ) '.'
            	    {
            	    dbg.location(27,12);
            	    string_literal29=(Token)match(input,22,FOLLOW_22_in_ifstmt233); 
            	    string_literal29_tree = (Object)adaptor.create(string_literal29);
            	    adaptor.addChild(root_0, string_literal29_tree);

            	    dbg.location(27,21);
            	    pushFollow(FOLLOW_expression_in_ifstmt235);
            	    expression30=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression30.getTree());
            	    dbg.location(27,32);
            	    char_literal31=(Token)match(input,21,FOLLOW_21_in_ifstmt237); 
            	    char_literal31_tree = (Object)adaptor.create(char_literal31);
            	    adaptor.addChild(root_0, char_literal31_tree);

            	    dbg.location(27,36);
            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:27:36: ( statement )+
            	    int cnt11=0;
            	    try { dbg.enterSubRule(11);

            	    loop11:
            	    do {
            	        int alt11=2;
            	        try { dbg.enterDecision(11);

            	        int LA11_0 = input.LA(1);

            	        if ( ((LA11_0>=ID && LA11_0<=INTEGER)||LA11_0==20) ) {
            	            alt11=1;
            	        }


            	        } finally {dbg.exitDecision(11);}

            	        switch (alt11) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:27:36: statement
            	    	    {
            	    	    dbg.location(27,36);
            	    	    pushFollow(FOLLOW_statement_in_ifstmt239);
            	    	    statement32=statement();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement32.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt11 >= 1 ) break loop11;
            	                EarlyExitException eee =
            	                    new EarlyExitException(11, input);
            	                dbg.recognitionException(eee);

            	                throw eee;
            	        }
            	        cnt11++;
            	    } while (true);
            	    } finally {dbg.exitSubRule(11);}

            	    dbg.location(27,48);
            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:27:48: ( ',' ( statement )+ )
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:27:49: ',' ( statement )+
            	    {
            	    dbg.location(27,49);
            	    char_literal33=(Token)match(input,18,FOLLOW_18_in_ifstmt244); 
            	    char_literal33_tree = (Object)adaptor.create(char_literal33);
            	    adaptor.addChild(root_0, char_literal33_tree);

            	    dbg.location(27,52);
            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:27:52: ( statement )+
            	    int cnt12=0;
            	    try { dbg.enterSubRule(12);

            	    loop12:
            	    do {
            	        int alt12=2;
            	        try { dbg.enterDecision(12);

            	        int LA12_0 = input.LA(1);

            	        if ( ((LA12_0>=ID && LA12_0<=INTEGER)||LA12_0==20) ) {
            	            alt12=1;
            	        }


            	        } finally {dbg.exitDecision(12);}

            	        switch (alt12) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:27:52: statement
            	    	    {
            	    	    dbg.location(27,52);
            	    	    pushFollow(FOLLOW_statement_in_ifstmt245);
            	    	    statement34=statement();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement34.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt12 >= 1 ) break loop12;
            	                EarlyExitException eee =
            	                    new EarlyExitException(12, input);
            	                dbg.recognitionException(eee);

            	                throw eee;
            	        }
            	        cnt12++;
            	    } while (true);
            	    } finally {dbg.exitSubRule(12);}


            	    }

            	    dbg.location(27,64);
            	    char_literal35=(Token)match(input,19,FOLLOW_19_in_ifstmt249); 
            	    char_literal35_tree = (Object)adaptor.create(char_literal35);
            	    adaptor.addChild(root_0, char_literal35_tree);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}

            dbg.location(28,11);
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:28:11: ( 'else' ':' ( statement )+ ( ',' ( statement )+ ) '.' )?
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:28:12: 'else' ':' ( statement )+ ( ',' ( statement )+ ) '.'
                    {
                    dbg.location(28,12);
                    string_literal36=(Token)match(input,23,FOLLOW_23_in_ifstmt265); 
                    string_literal36_tree = (Object)adaptor.create(string_literal36);
                    adaptor.addChild(root_0, string_literal36_tree);

                    dbg.location(28,19);
                    char_literal37=(Token)match(input,21,FOLLOW_21_in_ifstmt267); 
                    char_literal37_tree = (Object)adaptor.create(char_literal37);
                    adaptor.addChild(root_0, char_literal37_tree);

                    dbg.location(28,23);
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:28:23: ( statement )+
                    int cnt14=0;
                    try { dbg.enterSubRule(14);

                    loop14:
                    do {
                        int alt14=2;
                        try { dbg.enterDecision(14);

                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=ID && LA14_0<=INTEGER)||LA14_0==20) ) {
                            alt14=1;
                        }


                        } finally {dbg.exitDecision(14);}

                        switch (alt14) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:28:23: statement
                    	    {
                    	    dbg.location(28,23);
                    	    pushFollow(FOLLOW_statement_in_ifstmt269);
                    	    statement38=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement38.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt14++;
                    } while (true);
                    } finally {dbg.exitSubRule(14);}

                    dbg.location(28,35);
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:28:35: ( ',' ( statement )+ )
                    dbg.enterAlt(1);

                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:28:36: ',' ( statement )+
                    {
                    dbg.location(28,36);
                    char_literal39=(Token)match(input,18,FOLLOW_18_in_ifstmt274); 
                    char_literal39_tree = (Object)adaptor.create(char_literal39);
                    adaptor.addChild(root_0, char_literal39_tree);

                    dbg.location(28,39);
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:28:39: ( statement )+
                    int cnt15=0;
                    try { dbg.enterSubRule(15);

                    loop15:
                    do {
                        int alt15=2;
                        try { dbg.enterDecision(15);

                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>=ID && LA15_0<=INTEGER)||LA15_0==20) ) {
                            alt15=1;
                        }


                        } finally {dbg.exitDecision(15);}

                        switch (alt15) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:28:39: statement
                    	    {
                    	    dbg.location(28,39);
                    	    pushFollow(FOLLOW_statement_in_ifstmt275);
                    	    statement40=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement40.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt15++;
                    } while (true);
                    } finally {dbg.exitSubRule(15);}


                    }

                    dbg.location(28,51);
                    char_literal41=(Token)match(input,19,FOLLOW_19_in_ifstmt279); 
                    char_literal41_tree = (Object)adaptor.create(char_literal41);
                    adaptor.addChild(root_0, char_literal41_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(29, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifstmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ifstmt"

    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:31:1: assignment : ID '->' expression ;
    public final IdealParser.assignment_return assignment() throws RecognitionException {
        IdealParser.assignment_return retval = new IdealParser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID42=null;
        Token string_literal43=null;
        IdealParser.expression_return expression44 = null;


        Object ID42_tree=null;
        Object string_literal43_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:31:12: ( ID '->' expression )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:31:14: ID '->' expression
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(31,14);
            ID42=(Token)match(input,ID,FOLLOW_ID_in_assignment291); 
            ID42_tree = (Object)adaptor.create(ID42);
            adaptor.addChild(root_0, ID42_tree);

            dbg.location(31,17);
            string_literal43=(Token)match(input,17,FOLLOW_17_in_assignment293); 
            string_literal43_tree = (Object)adaptor.create(string_literal43);
            adaptor.addChild(root_0, string_literal43_tree);

            dbg.location(31,22);
            pushFollow(FOLLOW_expression_in_assignment295);
            expression44=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression44.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(31, 32);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assignment"

    public static class string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:33:1: string : UNICODE_STRING ;
    public final IdealParser.string_return string() throws RecognitionException {
        IdealParser.string_return retval = new IdealParser.string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNICODE_STRING45=null;

        Object UNICODE_STRING45_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "string");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:33:9: ( UNICODE_STRING )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:33:11: UNICODE_STRING
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(33,11);
            UNICODE_STRING45=(Token)match(input,UNICODE_STRING,FOLLOW_UNICODE_STRING_in_string305); 
            UNICODE_STRING45_tree = (Object)adaptor.create(UNICODE_STRING45);
            adaptor.addChild(root_0, UNICODE_STRING45_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(33, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "string");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "string"

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:35:1: number : ( HEX_NUMBER | INTEGER ( '.' INTEGER )? );
    public final IdealParser.number_return number() throws RecognitionException {
        IdealParser.number_return retval = new IdealParser.number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token HEX_NUMBER46=null;
        Token INTEGER47=null;
        Token char_literal48=null;
        Token INTEGER49=null;

        Object HEX_NUMBER46_tree=null;
        Object INTEGER47_tree=null;
        Object char_literal48_tree=null;
        Object INTEGER49_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(35, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:35:8: ( HEX_NUMBER | INTEGER ( '.' INTEGER )? )
            int alt18=2;
            try { dbg.enterDecision(18);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==HEX_NUMBER) ) {
                alt18=1;
            }
            else if ( (LA18_0==INTEGER) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:35:10: HEX_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(35,10);
                    HEX_NUMBER46=(Token)match(input,HEX_NUMBER,FOLLOW_HEX_NUMBER_in_number314); 
                    HEX_NUMBER46_tree = (Object)adaptor.create(HEX_NUMBER46);
                    adaptor.addChild(root_0, HEX_NUMBER46_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:35:23: INTEGER ( '.' INTEGER )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(35,23);
                    INTEGER47=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number318); 
                    INTEGER47_tree = (Object)adaptor.create(INTEGER47);
                    adaptor.addChild(root_0, INTEGER47_tree);

                    dbg.location(35,31);
                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:35:31: ( '.' INTEGER )?
                    int alt17=2;
                    try { dbg.enterSubRule(17);
                    try { dbg.enterDecision(17);

                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==19) ) {
                        int LA17_1 = input.LA(2);

                        if ( (LA17_1==INTEGER) ) {
                            alt17=1;
                        }
                    }
                    } finally {dbg.exitDecision(17);}

                    switch (alt17) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:35:33: '.' INTEGER
                            {
                            dbg.location(35,33);
                            char_literal48=(Token)match(input,19,FOLLOW_19_in_number322); 
                            char_literal48_tree = (Object)adaptor.create(char_literal48);
                            adaptor.addChild(root_0, char_literal48_tree);

                            dbg.location(35,37);
                            INTEGER49=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number324); 
                            INTEGER49_tree = (Object)adaptor.create(INTEGER49);
                            adaptor.addChild(root_0, INTEGER49_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(17);}


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(35, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "number");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "number"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:39:1: term : ( ID | '(' expression ')' | number | string );
    public final IdealParser.term_return term() throws RecognitionException {
        IdealParser.term_return retval = new IdealParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID50=null;
        Token char_literal51=null;
        Token char_literal53=null;
        IdealParser.expression_return expression52 = null;

        IdealParser.number_return number54 = null;

        IdealParser.string_return string55 = null;


        Object ID50_tree=null;
        Object char_literal51_tree=null;
        Object char_literal53_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:39:7: ( ID | '(' expression ')' | number | string )
            int alt19=4;
            try { dbg.enterDecision(19);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt19=1;
                }
                break;
            case 15:
                {
                alt19=2;
                }
                break;
            case HEX_NUMBER:
            case INTEGER:
                {
                alt19=3;
                }
                break;
            case UNICODE_STRING:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:39:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,9);
                    ID50=(Token)match(input,ID,FOLLOW_ID_in_term338); 
                    ID50_tree = (Object)adaptor.create(ID50);
                    adaptor.addChild(root_0, ID50_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:39:14: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,14);
                    char_literal51=(Token)match(input,15,FOLLOW_15_in_term342); 
                    char_literal51_tree = (Object)adaptor.create(char_literal51);
                    adaptor.addChild(root_0, char_literal51_tree);

                    dbg.location(39,18);
                    pushFollow(FOLLOW_expression_in_term344);
                    expression52=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression52.getTree());
                    dbg.location(39,29);
                    char_literal53=(Token)match(input,16,FOLLOW_16_in_term346); 
                    char_literal53_tree = (Object)adaptor.create(char_literal53);
                    adaptor.addChild(root_0, char_literal53_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:39:35: number
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,35);
                    pushFollow(FOLLOW_number_in_term350);
                    number54=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number54.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:39:44: string
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,44);
                    pushFollow(FOLLOW_string_in_term354);
                    string55=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string55.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(39, 50);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "term"

    public static class negation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negation"
    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:41:1: negation : ( '!' )* term ;
    public final IdealParser.negation_return negation() throws RecognitionException {
        IdealParser.negation_return retval = new IdealParser.negation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal56=null;
        IdealParser.term_return term57 = null;


        Object char_literal56_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "negation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(41, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:41:10: ( ( '!' )* term )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:41:12: ( '!' )* term
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(41,12);
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:41:12: ( '!' )*
            try { dbg.enterSubRule(20);

            loop20:
            do {
                int alt20=2;
                try { dbg.enterDecision(20);

                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                } finally {dbg.exitDecision(20);}

                switch (alt20) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:41:12: '!'
            	    {
            	    dbg.location(41,12);
            	    char_literal56=(Token)match(input,24,FOLLOW_24_in_negation362); 
            	    char_literal56_tree = (Object)adaptor.create(char_literal56);
            	    adaptor.addChild(root_0, char_literal56_tree);


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);
            } finally {dbg.exitSubRule(20);}

            dbg.location(41,17);
            pushFollow(FOLLOW_term_in_negation365);
            term57=term();

            state._fsp--;

            adaptor.addChild(root_0, term57.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(41, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "negation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "negation"

    public static class unary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary"
    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:43:1: unary : ( '+' | '-' )* negation ;
    public final IdealParser.unary_return unary() throws RecognitionException {
        IdealParser.unary_return retval = new IdealParser.unary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set58=null;
        IdealParser.negation_return negation59 = null;


        Object set58_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "unary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:43:8: ( ( '+' | '-' )* negation )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:43:10: ( '+' | '-' )* negation
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(43,10);
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:43:10: ( '+' | '-' )*
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21);

                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=25 && LA21_0<=26)) ) {
                    alt21=1;
                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:
            	    {
            	    dbg.location(43,10);
            	    set58=(Token)input.LT(1);
            	    if ( (input.LA(1)>=25 && input.LA(1)<=26) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set58));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);
            } finally {dbg.exitSubRule(21);}

            dbg.location(43,21);
            pushFollow(FOLLOW_negation_in_unary382);
            negation59=negation();

            state._fsp--;

            adaptor.addChild(root_0, negation59.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(43, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unary");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unary"

    public static class mult_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult"
    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:45:1: mult : unary ( ( '*' | '/' | ( '%' | 'mod' ) ) unary )* ;
    public final IdealParser.mult_return mult() throws RecognitionException {
        IdealParser.mult_return retval = new IdealParser.mult_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set61=null;
        IdealParser.unary_return unary60 = null;

        IdealParser.unary_return unary62 = null;


        Object set61_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mult");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(45, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:45:7: ( unary ( ( '*' | '/' | ( '%' | 'mod' ) ) unary )* )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:45:9: unary ( ( '*' | '/' | ( '%' | 'mod' ) ) unary )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(45,9);
            pushFollow(FOLLOW_unary_in_mult391);
            unary60=unary();

            state._fsp--;

            adaptor.addChild(root_0, unary60.getTree());
            dbg.location(45,15);
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:45:15: ( ( '*' | '/' | ( '%' | 'mod' ) ) unary )*
            try { dbg.enterSubRule(22);

            loop22:
            do {
                int alt22=2;
                try { dbg.enterDecision(22);

                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=27 && LA22_0<=30)) ) {
                    alt22=1;
                }


                } finally {dbg.exitDecision(22);}

                switch (alt22) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:45:16: ( '*' | '/' | ( '%' | 'mod' ) ) unary
            	    {
            	    dbg.location(45,16);
            	    set61=(Token)input.LT(1);
            	    if ( (input.LA(1)>=27 && input.LA(1)<=30) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set61));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(45,43);
            	    pushFollow(FOLLOW_unary_in_mult411);
            	    unary62=unary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary62.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);
            } finally {dbg.exitSubRule(22);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(45, 50);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mult");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mult"

    public static class add_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add"
    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:47:1: add : mult ( ( '+' | '-' ) mult )* ;
    public final IdealParser.add_return add() throws RecognitionException {
        IdealParser.add_return retval = new IdealParser.add_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set64=null;
        IdealParser.mult_return mult63 = null;

        IdealParser.mult_return mult65 = null;


        Object set64_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "add");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(47, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:47:6: ( mult ( ( '+' | '-' ) mult )* )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:47:8: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(47,8);
            pushFollow(FOLLOW_mult_in_add423);
            mult63=mult();

            state._fsp--;

            adaptor.addChild(root_0, mult63.getTree());
            dbg.location(47,13);
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:47:13: ( ( '+' | '-' ) mult )*
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23);

                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=25 && LA23_0<=26)) ) {
                    alt23=1;
                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:47:14: ( '+' | '-' ) mult
            	    {
            	    dbg.location(47,14);
            	    set64=(Token)input.LT(1);
            	    if ( (input.LA(1)>=25 && input.LA(1)<=26) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set64));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(47,26);
            	    pushFollow(FOLLOW_mult_in_add434);
            	    mult65=mult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult65.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);
            } finally {dbg.exitSubRule(23);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(47, 32);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "add");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "add"

    public static class relation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relation"
    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:49:1: relation : add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )* ;
    public final IdealParser.relation_return relation() throws RecognitionException {
        IdealParser.relation_return retval = new IdealParser.relation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set67=null;
        IdealParser.add_return add66 = null;

        IdealParser.add_return add68 = null;


        Object set67_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "relation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:49:10: ( add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )* )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:49:12: add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(49,12);
            pushFollow(FOLLOW_add_in_relation445);
            add66=add();

            state._fsp--;

            adaptor.addChild(root_0, add66.getTree());
            dbg.location(49,16);
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:49:16: ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )*
            try { dbg.enterSubRule(24);

            loop24:
            do {
                int alt24=2;
                try { dbg.enterDecision(24);

                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=31 && LA24_0<=36)) ) {
                    alt24=1;
                }


                } finally {dbg.exitDecision(24);}

                switch (alt24) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:49:17: ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add
            	    {
            	    dbg.location(49,17);
            	    set67=(Token)input.LT(1);
            	    if ( (input.LA(1)>=31 && input.LA(1)<=36) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set67));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(49,56);
            	    pushFollow(FOLLOW_add_in_relation472);
            	    add68=add();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add68.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);
            } finally {dbg.exitSubRule(24);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(49, 61);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relation"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:51:1: expression : relation ( ( '&&' | '||' ) relation )* ;
    public final IdealParser.expression_return expression() throws RecognitionException {
        IdealParser.expression_return retval = new IdealParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set70=null;
        IdealParser.relation_return relation69 = null;

        IdealParser.relation_return relation71 = null;


        Object set70_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:51:12: ( relation ( ( '&&' | '||' ) relation )* )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:51:14: relation ( ( '&&' | '||' ) relation )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(51,14);
            pushFollow(FOLLOW_relation_in_expression485);
            relation69=relation();

            state._fsp--;

            adaptor.addChild(root_0, relation69.getTree());
            dbg.location(51,23);
            // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:51:23: ( ( '&&' | '||' ) relation )*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25);

                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=37 && LA25_0<=38)) ) {
                    alt25=1;
                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\scratch\\src\\main\\Ideal.g:51:24: ( '&&' | '||' ) relation
            	    {
            	    dbg.location(51,24);
            	    set70=(Token)input.LT(1);
            	    if ( (input.LA(1)>=37 && input.LA(1)<=38) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set70));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(51,38);
            	    pushFollow(FOLLOW_relation_in_expression496);
            	    relation71=relation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relation71.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);
            } finally {dbg.exitSubRule(25);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(51, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_program56 = new BitSet(new long[]{0x00000000001000F2L});
    public static final BitSet FOLLOW_function_in_program61 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ID_in_function70 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_function72 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_args_in_function74 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_function76 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_function78 = new BitSet(new long[]{0x00000000001400F0L});
    public static final BitSet FOLLOW_statement_in_function80 = new BitSet(new long[]{0x00000000001400F0L});
    public static final BitSet FOLLOW_18_in_function84 = new BitSet(new long[]{0x00000000001800F0L});
    public static final BitSet FOLLOW_statement_in_function85 = new BitSet(new long[]{0x00000000001800F0L});
    public static final BitSet FOLLOW_19_in_function89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args100 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_args103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_arg_in_args105 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ID_in_arg118 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_arg121 = new BitSet(new long[]{0x00000000071080F0L});
    public static final BitSet FOLLOW_expression_in_arg123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_statement147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_statement161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_statement175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ifstmt205 = new BitSet(new long[]{0x00000000071080F0L});
    public static final BitSet FOLLOW_expression_in_ifstmt207 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ifstmt209 = new BitSet(new long[]{0x00000000001400F0L});
    public static final BitSet FOLLOW_statement_in_ifstmt211 = new BitSet(new long[]{0x00000000001400F0L});
    public static final BitSet FOLLOW_18_in_ifstmt215 = new BitSet(new long[]{0x00000000001800F0L});
    public static final BitSet FOLLOW_statement_in_ifstmt216 = new BitSet(new long[]{0x00000000001800F0L});
    public static final BitSet FOLLOW_19_in_ifstmt220 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_22_in_ifstmt233 = new BitSet(new long[]{0x00000000071080F0L});
    public static final BitSet FOLLOW_expression_in_ifstmt235 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ifstmt237 = new BitSet(new long[]{0x00000000001400F0L});
    public static final BitSet FOLLOW_statement_in_ifstmt239 = new BitSet(new long[]{0x00000000001400F0L});
    public static final BitSet FOLLOW_18_in_ifstmt244 = new BitSet(new long[]{0x00000000001800F0L});
    public static final BitSet FOLLOW_statement_in_ifstmt245 = new BitSet(new long[]{0x00000000001800F0L});
    public static final BitSet FOLLOW_19_in_ifstmt249 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_23_in_ifstmt265 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ifstmt267 = new BitSet(new long[]{0x00000000001400F0L});
    public static final BitSet FOLLOW_statement_in_ifstmt269 = new BitSet(new long[]{0x00000000001400F0L});
    public static final BitSet FOLLOW_18_in_ifstmt274 = new BitSet(new long[]{0x00000000001800F0L});
    public static final BitSet FOLLOW_statement_in_ifstmt275 = new BitSet(new long[]{0x00000000001800F0L});
    public static final BitSet FOLLOW_19_in_ifstmt279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment291 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_assignment293 = new BitSet(new long[]{0x00000000071080F0L});
    public static final BitSet FOLLOW_expression_in_assignment295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNICODE_STRING_in_string305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_NUMBER_in_number314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number318 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_number322 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_number324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_term342 = new BitSet(new long[]{0x00000000071080F0L});
    public static final BitSet FOLLOW_expression_in_term344 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_term346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_term350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_term354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_negation362 = new BitSet(new long[]{0x00000000071080F0L});
    public static final BitSet FOLLOW_term_in_negation365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unary375 = new BitSet(new long[]{0x00000000071080F0L});
    public static final BitSet FOLLOW_negation_in_unary382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult391 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_set_in_mult394 = new BitSet(new long[]{0x00000000071080F0L});
    public static final BitSet FOLLOW_unary_in_mult411 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_mult_in_add423 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_set_in_add426 = new BitSet(new long[]{0x00000000071080F0L});
    public static final BitSet FOLLOW_mult_in_add434 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_add_in_relation445 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_set_in_relation448 = new BitSet(new long[]{0x00000000071080F0L});
    public static final BitSet FOLLOW_add_in_relation472 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_relation_in_expression485 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_set_in_expression488 = new BitSet(new long[]{0x00000000071080F0L});
    public static final BitSet FOLLOW_relation_in_expression496 = new BitSet(new long[]{0x0000006000000002L});

}