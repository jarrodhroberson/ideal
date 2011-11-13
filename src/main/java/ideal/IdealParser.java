// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g 2011-11-11 16:35:49
 package ideal; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class IdealParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "ATOM", "UNICODE_STRING", "HEX_NUMBER", "INTEGER", "HEX_DIGIT", "DIGIT", "ESC", "WS", "UNI_ESC", "COMMENT", "'.'", "'('", "')'", "'->'", "','", "'!'", "'+'", "'-'", "'*'", "'/'", "'%'", "'mod'", "'='", "'!='", "'<'", "'<='", "'>='", "'>'", "'&&'", "'||'"
    };
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
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=12;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int UNICODE_STRING=6;
    public static final int DIGIT=10;
    public static final int COMMENT=14;
    public static final int HEX_NUMBER=7;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "args", "number", "add", "unary", "program", "assignment", 
        "statement", "function", "term", "relation", "synpred2_Ideal", "synpred1_Ideal", 
        "expression", "mult", "arg", "string", "negation"
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
    public String getGrammarFileName() { return "C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:12:1: program : ( statement '.' )* ;
    public final IdealParser.program_return program() throws RecognitionException {
        IdealParser.program_return retval = new IdealParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal2=null;
        IdealParser.statement_return statement1 = null;


        Object char_literal2_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:12:9: ( ( statement '.' )* )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:12:11: ( statement '.' )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(12,11);
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:12:11: ( statement '.' )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=ID && LA1_0<=INTEGER)||LA1_0==16||(LA1_0>=20 && LA1_0<=22)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:12:12: statement '.'
            	    {
            	    dbg.location(12,12);
            	    pushFollow(FOLLOW_statement_in_program57);
            	    statement1=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement1.getTree());
            	    dbg.location(12,21);
            	    char_literal2=(Token)match(input,15,FOLLOW_15_in_program58); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal2_tree = (Object)adaptor.create(char_literal2);
            	    adaptor.addChild(root_0, char_literal2_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(12, 27);

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
    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:14:1: function : ID '(' args ')' '->' statement ( ',' statement )* ;
    public final IdealParser.function_return function() throws RecognitionException {
        IdealParser.function_return retval = new IdealParser.function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID3=null;
        Token char_literal4=null;
        Token char_literal6=null;
        Token string_literal7=null;
        Token char_literal9=null;
        IdealParser.args_return args5 = null;

        IdealParser.statement_return statement8 = null;

        IdealParser.statement_return statement10 = null;


        Object ID3_tree=null;
        Object char_literal4_tree=null;
        Object char_literal6_tree=null;
        Object string_literal7_tree=null;
        Object char_literal9_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:14:10: ( ID '(' args ')' '->' statement ( ',' statement )* )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:14:12: ID '(' args ')' '->' statement ( ',' statement )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(14,12);
            ID3=(Token)match(input,ID,FOLLOW_ID_in_function69); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID3_tree = (Object)adaptor.create(ID3);
            adaptor.addChild(root_0, ID3_tree);
            }
            dbg.location(14,15);
            char_literal4=(Token)match(input,16,FOLLOW_16_in_function71); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal4_tree = (Object)adaptor.create(char_literal4);
            adaptor.addChild(root_0, char_literal4_tree);
            }
            dbg.location(14,19);
            pushFollow(FOLLOW_args_in_function73);
            args5=args();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, args5.getTree());
            dbg.location(14,24);
            char_literal6=(Token)match(input,17,FOLLOW_17_in_function75); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal6_tree = (Object)adaptor.create(char_literal6);
            adaptor.addChild(root_0, char_literal6_tree);
            }
            dbg.location(14,28);
            string_literal7=(Token)match(input,18,FOLLOW_18_in_function77); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal7_tree = (Object)adaptor.create(string_literal7);
            adaptor.addChild(root_0, string_literal7_tree);
            }
            dbg.location(14,33);
            pushFollow(FOLLOW_statement_in_function79);
            statement8=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement8.getTree());
            dbg.location(14,43);
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:14:43: ( ',' statement )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:14:44: ',' statement
            	    {
            	    dbg.location(14,44);
            	    char_literal9=(Token)match(input,19,FOLLOW_19_in_function82); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal9_tree = (Object)adaptor.create(char_literal9);
            	    adaptor.addChild(root_0, char_literal9_tree);
            	    }
            	    dbg.location(14,48);
            	    pushFollow(FOLLOW_statement_in_function84);
            	    statement10=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement10.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(14, 60);

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
    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:16:1: args : arg ( ',' arg )* ;
    public final IdealParser.args_return args() throws RecognitionException {
        IdealParser.args_return retval = new IdealParser.args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal12=null;
        IdealParser.arg_return arg11 = null;

        IdealParser.arg_return arg13 = null;


        Object char_literal12_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:16:6: ( arg ( ',' arg )* )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:16:8: arg ( ',' arg )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(16,8);
            pushFollow(FOLLOW_arg_in_args96);
            arg11=arg();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arg11.getTree());
            dbg.location(16,12);
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:16:12: ( ',' arg )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:16:13: ',' arg
            	    {
            	    dbg.location(16,13);
            	    char_literal12=(Token)match(input,19,FOLLOW_19_in_args99); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal12_tree = (Object)adaptor.create(char_literal12);
            	    adaptor.addChild(root_0, char_literal12_tree);
            	    }
            	    dbg.location(16,17);
            	    pushFollow(FOLLOW_arg_in_args101);
            	    arg13=arg();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arg13.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(16, 22);

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
    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:18:1: arg : ( ( ID )=> ID | expression );
    public final IdealParser.arg_return arg() throws RecognitionException {
        IdealParser.arg_return retval = new IdealParser.arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID14=null;
        IdealParser.expression_return expression15 = null;


        Object ID14_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:18:5: ( ( ID )=> ID | expression )
            int alt4=2;
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred1_Ideal()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( ((LA4_0>=UNICODE_STRING && LA4_0<=INTEGER)||LA4_0==16||(LA4_0>=20 && LA4_0<=22)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:18:7: ( ID )=> ID
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(18,14);
                    ID14=(Token)match(input,ID,FOLLOW_ID_in_arg118); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID14_tree = (Object)adaptor.create(ID14);
                    adaptor.addChild(root_0, ID14_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:18:19: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(18,19);
                    pushFollow(FOLLOW_expression_in_arg122);
                    expression15=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression15.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:20:1: statement : ( ATOM | expression | assignment | function );
    public final IdealParser.statement_return statement() throws RecognitionException {
        IdealParser.statement_return retval = new IdealParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ATOM16=null;
        IdealParser.expression_return expression17 = null;

        IdealParser.assignment_return assignment18 = null;

        IdealParser.function_return function19 = null;


        Object ATOM16_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:20:11: ( ATOM | expression | assignment | function )
            int alt5=4;
            try { dbg.enterDecision(5);

            switch ( input.LA(1) ) {
            case ATOM:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==18) ) {
                    alt5=3;
                }
                else if ( (LA5_1==15||LA5_1==19) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case UNICODE_STRING:
            case HEX_NUMBER:
            case INTEGER:
            case 16:
            case 20:
            case 21:
            case 22:
                {
                alt5=2;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt5=3;
                    }
                    break;
                case 16:
                    {
                    alt5=4;
                    }
                    break;
                case 15:
                case 19:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:20:13: ATOM
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(20,13);
                    ATOM16=(Token)match(input,ATOM,FOLLOW_ATOM_in_statement130); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ATOM16_tree = (Object)adaptor.create(ATOM16);
                    adaptor.addChild(root_0, ATOM16_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:21:6: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(21,6);
                    pushFollow(FOLLOW_expression_in_statement137);
                    expression17=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression17.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:22:13: assignment
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(22,13);
                    pushFollow(FOLLOW_assignment_in_statement151);
                    assignment18=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment18.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:23:13: function
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(23,13);
                    pushFollow(FOLLOW_function_in_statement165);
                    function19=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function19.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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

    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:26:1: assignment : ( ID '->' expression | ATOM '->' ( string | number ) );
    public final IdealParser.assignment_return assignment() throws RecognitionException {
        IdealParser.assignment_return retval = new IdealParser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID20=null;
        Token string_literal21=null;
        Token ATOM23=null;
        Token string_literal24=null;
        IdealParser.expression_return expression22 = null;

        IdealParser.string_return string25 = null;

        IdealParser.number_return number26 = null;


        Object ID20_tree=null;
        Object string_literal21_tree=null;
        Object ATOM23_tree=null;
        Object string_literal24_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(26, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:26:12: ( ID '->' expression | ATOM '->' ( string | number ) )
            int alt7=2;
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==ATOM) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:26:14: ID '->' expression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(26,14);
                    ID20=(Token)match(input,ID,FOLLOW_ID_in_assignment184); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID20_tree = (Object)adaptor.create(ID20);
                    adaptor.addChild(root_0, ID20_tree);
                    }
                    dbg.location(26,17);
                    string_literal21=(Token)match(input,18,FOLLOW_18_in_assignment186); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal21_tree = (Object)adaptor.create(string_literal21);
                    adaptor.addChild(root_0, string_literal21_tree);
                    }
                    dbg.location(26,22);
                    pushFollow(FOLLOW_expression_in_assignment188);
                    expression22=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression22.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:27:14: ATOM '->' ( string | number )
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(27,14);
                    ATOM23=(Token)match(input,ATOM,FOLLOW_ATOM_in_assignment203); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ATOM23_tree = (Object)adaptor.create(ATOM23);
                    adaptor.addChild(root_0, ATOM23_tree);
                    }
                    dbg.location(27,19);
                    string_literal24=(Token)match(input,18,FOLLOW_18_in_assignment205); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal24_tree = (Object)adaptor.create(string_literal24);
                    adaptor.addChild(root_0, string_literal24_tree);
                    }
                    dbg.location(27,24);
                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:27:24: ( string | number )
                    int alt6=2;
                    try { dbg.enterSubRule(6);
                    try { dbg.enterDecision(6);

                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==UNICODE_STRING) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_0>=HEX_NUMBER && LA6_0<=INTEGER)) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(6);}

                    switch (alt6) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:27:26: string
                            {
                            dbg.location(27,26);
                            pushFollow(FOLLOW_string_in_assignment209);
                            string25=string();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, string25.getTree());

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:27:35: number
                            {
                            dbg.location(27,35);
                            pushFollow(FOLLOW_number_in_assignment213);
                            number26=number();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, number26.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(6);}


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(28, 12);

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
    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:30:1: string : UNICODE_STRING ;
    public final IdealParser.string_return string() throws RecognitionException {
        IdealParser.string_return retval = new IdealParser.string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNICODE_STRING27=null;

        Object UNICODE_STRING27_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "string");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:30:8: ( UNICODE_STRING )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:30:10: UNICODE_STRING
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(30,10);
            UNICODE_STRING27=(Token)match(input,UNICODE_STRING,FOLLOW_UNICODE_STRING_in_string236); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UNICODE_STRING27_tree = (Object)adaptor.create(UNICODE_STRING27);
            adaptor.addChild(root_0, UNICODE_STRING27_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(30, 24);

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
    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:32:1: number : ( HEX_NUMBER | ( INTEGER '.' INTEGER )=> INTEGER '.' INTEGER | INTEGER );
    public final IdealParser.number_return number() throws RecognitionException {
        IdealParser.number_return retval = new IdealParser.number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token HEX_NUMBER28=null;
        Token INTEGER29=null;
        Token char_literal30=null;
        Token INTEGER31=null;
        Token INTEGER32=null;

        Object HEX_NUMBER28_tree=null;
        Object INTEGER29_tree=null;
        Object char_literal30_tree=null;
        Object INTEGER31_tree=null;
        Object INTEGER32_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(32, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:32:8: ( HEX_NUMBER | ( INTEGER '.' INTEGER )=> INTEGER '.' INTEGER | INTEGER )
            int alt8=3;
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==HEX_NUMBER) ) {
                alt8=1;
            }
            else if ( (LA8_0==INTEGER) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==15) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==INTEGER) ) {
                        int LA8_5 = input.LA(4);

                        if ( (synpred2_Ideal()) ) {
                            alt8=2;
                        }
                        else if ( (true) ) {
                            alt8=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 5, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                    }
                    else if ( (LA8_3==EOF||(LA8_3>=ID && LA8_3<=HEX_NUMBER)||LA8_3==16||(LA8_3>=20 && LA8_3<=22)) ) {
                        alt8=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else if ( (LA8_2==17||LA8_2==19||(LA8_2>=21 && LA8_2<=34)) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:32:10: HEX_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(32,10);
                    HEX_NUMBER28=(Token)match(input,HEX_NUMBER,FOLLOW_HEX_NUMBER_in_number245); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HEX_NUMBER28_tree = (Object)adaptor.create(HEX_NUMBER28);
                    adaptor.addChild(root_0, HEX_NUMBER28_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:33:10: ( INTEGER '.' INTEGER )=> INTEGER '.' INTEGER
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(33,34);
                    INTEGER29=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number266); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER29_tree = (Object)adaptor.create(INTEGER29);
                    adaptor.addChild(root_0, INTEGER29_tree);
                    }
                    dbg.location(33,42);
                    char_literal30=(Token)match(input,15,FOLLOW_15_in_number268); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal30_tree = (Object)adaptor.create(char_literal30);
                    adaptor.addChild(root_0, char_literal30_tree);
                    }
                    dbg.location(33,46);
                    INTEGER31=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number270); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER31_tree = (Object)adaptor.create(INTEGER31);
                    adaptor.addChild(root_0, INTEGER31_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:34:10: INTEGER
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(34,10);
                    INTEGER32=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number281); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER32_tree = (Object)adaptor.create(INTEGER32);
                    adaptor.addChild(root_0, INTEGER32_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(34, 17);

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
    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:38:1: term : ( ID | '(' expression ')' | number | string );
    public final IdealParser.term_return term() throws RecognitionException {
        IdealParser.term_return retval = new IdealParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID33=null;
        Token char_literal34=null;
        Token char_literal36=null;
        IdealParser.expression_return expression35 = null;

        IdealParser.number_return number37 = null;

        IdealParser.string_return string38 = null;


        Object ID33_tree=null;
        Object char_literal34_tree=null;
        Object char_literal36_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:38:6: ( ID | '(' expression ')' | number | string )
            int alt9=4;
            try { dbg.enterDecision(9);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt9=1;
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            case HEX_NUMBER:
            case INTEGER:
                {
                alt9=3;
                }
                break;
            case UNICODE_STRING:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:38:8: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,8);
                    ID33=(Token)match(input,ID,FOLLOW_ID_in_term291); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID33_tree = (Object)adaptor.create(ID33);
                    adaptor.addChild(root_0, ID33_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:39:7: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,7);
                    char_literal34=(Token)match(input,16,FOLLOW_16_in_term300); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);
                    }
                    dbg.location(39,11);
                    pushFollow(FOLLOW_expression_in_term302);
                    expression35=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression35.getTree());
                    dbg.location(39,22);
                    char_literal36=(Token)match(input,17,FOLLOW_17_in_term304); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal36_tree = (Object)adaptor.create(char_literal36);
                    adaptor.addChild(root_0, char_literal36_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:40:8: number
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(40,8);
                    pushFollow(FOLLOW_number_in_term315);
                    number37=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number37.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:41:8: string
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(41,8);
                    pushFollow(FOLLOW_string_in_term324);
                    string38=string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, string38.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(42, 6);

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
    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:44:1: negation : ( '!' )* term ;
    public final IdealParser.negation_return negation() throws RecognitionException {
        IdealParser.negation_return retval = new IdealParser.negation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal39=null;
        IdealParser.term_return term40 = null;


        Object char_literal39_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "negation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(44, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:44:10: ( ( '!' )* term )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:44:12: ( '!' )* term
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(44,12);
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:44:12: ( '!' )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:44:12: '!'
            	    {
            	    dbg.location(44,12);
            	    char_literal39=(Token)match(input,20,FOLLOW_20_in_negation338); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal39_tree = (Object)adaptor.create(char_literal39);
            	    adaptor.addChild(root_0, char_literal39_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}

            dbg.location(44,17);
            pushFollow(FOLLOW_term_in_negation341);
            term40=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term40.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(44, 21);

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
    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:46:1: unary : ( '+' | '-' )* negation ;
    public final IdealParser.unary_return unary() throws RecognitionException {
        IdealParser.unary_return retval = new IdealParser.unary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set41=null;
        IdealParser.negation_return negation42 = null;


        Object set41_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "unary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:46:7: ( ( '+' | '-' )* negation )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:46:9: ( '+' | '-' )* negation
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(46,9);
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:46:9: ( '+' | '-' )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11);

                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=21 && LA11_0<=22)) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:
            	    {
            	    dbg.location(46,9);
            	    set41=(Token)input.LT(1);
            	    if ( (input.LA(1)>=21 && input.LA(1)<=22) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set41));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}

            dbg.location(46,20);
            pushFollow(FOLLOW_negation_in_unary357);
            negation42=negation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, negation42.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(46, 28);

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
    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:48:1: mult : unary ( ( '*' | '/' | ( '%' | 'mod' ) ) unary )* ;
    public final IdealParser.mult_return mult() throws RecognitionException {
        IdealParser.mult_return retval = new IdealParser.mult_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set44=null;
        IdealParser.unary_return unary43 = null;

        IdealParser.unary_return unary45 = null;


        Object set44_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mult");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:48:6: ( unary ( ( '*' | '/' | ( '%' | 'mod' ) ) unary )* )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:48:8: unary ( ( '*' | '/' | ( '%' | 'mod' ) ) unary )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(48,8);
            pushFollow(FOLLOW_unary_in_mult365);
            unary43=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary43.getTree());
            dbg.location(48,14);
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:48:14: ( ( '*' | '/' | ( '%' | 'mod' ) ) unary )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12);

                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=23 && LA12_0<=26)) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:48:15: ( '*' | '/' | ( '%' | 'mod' ) ) unary
            	    {
            	    dbg.location(48,15);
            	    set44=(Token)input.LT(1);
            	    if ( (input.LA(1)>=23 && input.LA(1)<=26) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set44));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(48,42);
            	    pushFollow(FOLLOW_unary_in_mult385);
            	    unary45=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary45.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(48, 49);

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
    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:50:1: add : mult ( ( '+' | '-' ) mult )* ;
    public final IdealParser.add_return add() throws RecognitionException {
        IdealParser.add_return retval = new IdealParser.add_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set47=null;
        IdealParser.mult_return mult46 = null;

        IdealParser.mult_return mult48 = null;


        Object set47_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "add");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:50:5: ( mult ( ( '+' | '-' ) mult )* )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:50:7: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(50,7);
            pushFollow(FOLLOW_mult_in_add396);
            mult46=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult46.getTree());
            dbg.location(50,12);
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:50:12: ( ( '+' | '-' ) mult )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=21 && LA13_0<=22)) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:50:13: ( '+' | '-' ) mult
            	    {
            	    dbg.location(50,13);
            	    set47=(Token)input.LT(1);
            	    if ( (input.LA(1)>=21 && input.LA(1)<=22) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set47));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(50,25);
            	    pushFollow(FOLLOW_mult_in_add407);
            	    mult48=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult48.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(50, 31);

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
    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:52:1: relation : add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )* ;
    public final IdealParser.relation_return relation() throws RecognitionException {
        IdealParser.relation_return retval = new IdealParser.relation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set50=null;
        IdealParser.add_return add49 = null;

        IdealParser.add_return add51 = null;


        Object set50_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "relation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:52:10: ( add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )* )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:52:12: add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(52,12);
            pushFollow(FOLLOW_add_in_relation418);
            add49=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add49.getTree());
            dbg.location(52,16);
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:52:16: ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14);

                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=27 && LA14_0<=32)) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:52:17: ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add
            	    {
            	    dbg.location(52,17);
            	    set50=(Token)input.LT(1);
            	    if ( (input.LA(1)>=27 && input.LA(1)<=32) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set50));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(52,56);
            	    pushFollow(FOLLOW_add_in_relation445);
            	    add51=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add51.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(52, 61);

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
    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:54:1: expression : relation ( ( '&&' | '||' ) relation )* ;
    public final IdealParser.expression_return expression() throws RecognitionException {
        IdealParser.expression_return retval = new IdealParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set53=null;
        IdealParser.relation_return relation52 = null;

        IdealParser.relation_return relation54 = null;


        Object set53_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 1);

        try {
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:54:12: ( relation ( ( '&&' | '||' ) relation )* )
            dbg.enterAlt(1);

            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:54:14: relation ( ( '&&' | '||' ) relation )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(54,14);
            pushFollow(FOLLOW_relation_in_expression458);
            relation52=relation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relation52.getTree());
            dbg.location(54,23);
            // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:54:23: ( ( '&&' | '||' ) relation )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15);

                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=33 && LA15_0<=34)) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:54:24: ( '&&' | '||' ) relation
            	    {
            	    dbg.location(54,24);
            	    set53=(Token)input.LT(1);
            	    if ( (input.LA(1)>=33 && input.LA(1)<=34) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set53));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(54,38);
            	    pushFollow(FOLLOW_relation_in_expression469);
            	    relation54=relation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relation54.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(54, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression"

    // $ANTLR start synpred1_Ideal
    public final void synpred1_Ideal_fragment() throws RecognitionException {   
        // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:18:7: ( ID )
        dbg.enterAlt(1);

        // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:18:8: ID
        {
        dbg.location(18,8);
        match(input,ID,FOLLOW_ID_in_synpred1_Ideal114); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Ideal

    // $ANTLR start synpred2_Ideal
    public final void synpred2_Ideal_fragment() throws RecognitionException {   
        // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:33:10: ( INTEGER '.' INTEGER )
        dbg.enterAlt(1);

        // C:\\Users\\Jarrod Roberson\\Projects\\ideal\\src\\main\\Ideal.g:33:11: INTEGER '.' INTEGER
        {
        dbg.location(33,11);
        match(input,INTEGER,FOLLOW_INTEGER_in_synpred2_Ideal258); if (state.failed) return ;
        dbg.location(33,19);
        match(input,15,FOLLOW_15_in_synpred2_Ideal260); if (state.failed) return ;
        dbg.location(33,23);
        match(input,INTEGER,FOLLOW_INTEGER_in_synpred2_Ideal262); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Ideal

    // Delegated rules

    public final boolean synpred2_Ideal() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred2_Ideal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Ideal() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred1_Ideal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_statement_in_program57 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_program58 = new BitSet(new long[]{0x00000000007101F2L});
    public static final BitSet FOLLOW_ID_in_function69 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_function71 = new BitSet(new long[]{0x00000000007101D0L});
    public static final BitSet FOLLOW_args_in_function73 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_function75 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_function77 = new BitSet(new long[]{0x00000000007901F0L});
    public static final BitSet FOLLOW_statement_in_function79 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_function82 = new BitSet(new long[]{0x00000000007901F0L});
    public static final BitSet FOLLOW_statement_in_function84 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_arg_in_args96 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_args99 = new BitSet(new long[]{0x00000000007101D0L});
    public static final BitSet FOLLOW_arg_in_args101 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_arg118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arg122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATOM_in_statement130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_statement165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment184 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_assignment186 = new BitSet(new long[]{0x00000000007101D0L});
    public static final BitSet FOLLOW_expression_in_assignment188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATOM_in_assignment203 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_assignment205 = new BitSet(new long[]{0x00000000007101D0L});
    public static final BitSet FOLLOW_string_in_assignment209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_assignment213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNICODE_STRING_in_string236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_NUMBER_in_number245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number266 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_number268 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTEGER_in_number270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_term300 = new BitSet(new long[]{0x00000000007101D0L});
    public static final BitSet FOLLOW_expression_in_term302 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_term304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_term315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_term324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_negation338 = new BitSet(new long[]{0x00000000007101D0L});
    public static final BitSet FOLLOW_term_in_negation341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unary350 = new BitSet(new long[]{0x00000000007101D0L});
    public static final BitSet FOLLOW_negation_in_unary357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult365 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_set_in_mult368 = new BitSet(new long[]{0x00000000007101D0L});
    public static final BitSet FOLLOW_unary_in_mult385 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_mult_in_add396 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_set_in_add399 = new BitSet(new long[]{0x00000000007101D0L});
    public static final BitSet FOLLOW_mult_in_add407 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_add_in_relation418 = new BitSet(new long[]{0x00000001F8000002L});
    public static final BitSet FOLLOW_set_in_relation421 = new BitSet(new long[]{0x00000000007101D0L});
    public static final BitSet FOLLOW_add_in_relation445 = new BitSet(new long[]{0x00000001F8000002L});
    public static final BitSet FOLLOW_relation_in_expression458 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_set_in_expression461 = new BitSet(new long[]{0x00000000007101D0L});
    public static final BitSet FOLLOW_relation_in_expression469 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ID_in_synpred1_Ideal114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_synpred2_Ideal258 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_synpred2_Ideal260 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTEGER_in_synpred2_Ideal262 = new BitSet(new long[]{0x0000000000000002L});

}