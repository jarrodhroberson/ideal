// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g 2011-11-11 10:19:18
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "UNICODE_STRING", "HEX_NUMBER", "INTEGER", "HEX_DIGIT", "DIGIT", "ESC", "WS", "UNI_ESC", "ATOM", "COMMENT", "'.'", "'('", "')'", "'->'", "','", "'!'", "'+'", "'-'", "'*'", "'/'", "'%'", "'mod'", "'='", "'!='", "'<'", "'<='", "'>='", "'>'", "'&&'", "'||'"
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
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int UNICODE_STRING=5;
    public static final int DIGIT=9;
    public static final int COMMENT=14;
    public static final int HEX_NUMBER=6;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "arg", "expression", "string", "relation", "unary", 
        "program", "negation", "args", "number", "term", "function", "mult", 
        "add", "statement", "synpred1_Ideal", "assignment"
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
    public String getGrammarFileName() { return "/Users/jhr/Documents/Projects/ideal/src/main/Ideal.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:12:1: program : ( statement '.' )* ;
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
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:12:9: ( ( statement '.' )* )
            dbg.enterAlt(1);

            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:12:11: ( statement '.' )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(12,11);
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:12:11: ( statement '.' )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:12:12: statement '.'
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
    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:14:1: function : ID '(' args ')' ( '->' ( statement | expression ) ( ',' ( statement | expression ) )* )? ;
    public final IdealParser.function_return function() throws RecognitionException {
        IdealParser.function_return retval = new IdealParser.function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID3=null;
        Token char_literal4=null;
        Token char_literal6=null;
        Token string_literal7=null;
        Token char_literal10=null;
        IdealParser.args_return args5 = null;

        IdealParser.statement_return statement8 = null;

        IdealParser.expression_return expression9 = null;

        IdealParser.statement_return statement11 = null;

        IdealParser.expression_return expression12 = null;


        Object ID3_tree=null;
        Object char_literal4_tree=null;
        Object char_literal6_tree=null;
        Object string_literal7_tree=null;
        Object char_literal10_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 1);

        try {
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:14:10: ( ID '(' args ')' ( '->' ( statement | expression ) ( ',' ( statement | expression ) )* )? )
            dbg.enterAlt(1);

            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:14:12: ID '(' args ')' ( '->' ( statement | expression ) ( ',' ( statement | expression ) )* )?
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
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:14:28: ( '->' ( statement | expression ) ( ',' ( statement | expression ) )* )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:14:29: '->' ( statement | expression ) ( ',' ( statement | expression ) )*
                    {
                    dbg.location(14,29);
                    string_literal7=(Token)match(input,18,FOLLOW_18_in_function78); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal7_tree = (Object)adaptor.create(string_literal7);
                    adaptor.addChild(root_0, string_literal7_tree);
                    }
                    dbg.location(14,34);
                    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:14:34: ( statement | expression )
                    int alt2=2;
                    try { dbg.enterSubRule(2);
                    try { dbg.enterDecision(2);

                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==ID) ) {
                        int LA2_1 = input.LA(2);

                        if ( (LA2_1==16||LA2_1==18) ) {
                            alt2=1;
                        }
                        else if ( (LA2_1==15||LA2_1==19||(LA2_1>=21 && LA2_1<=34)) ) {
                            alt2=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 1, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                    }
                    else if ( ((LA2_0>=HEX_NUMBER && LA2_0<=INTEGER)||LA2_0==16||(LA2_0>=20 && LA2_0<=22)) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(2);}

                    switch (alt2) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:14:35: statement
                            {
                            dbg.location(14,35);
                            pushFollow(FOLLOW_statement_in_function81);
                            statement8=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement8.getTree());

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:14:47: expression
                            {
                            dbg.location(14,47);
                            pushFollow(FOLLOW_expression_in_function85);
                            expression9=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression9.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(2);}

                    dbg.location(14,59);
                    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:14:59: ( ',' ( statement | expression ) )*
                    try { dbg.enterSubRule(4);

                    loop4:
                    do {
                        int alt4=2;
                        try { dbg.enterDecision(4);

                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==19) ) {
                            alt4=1;
                        }


                        } finally {dbg.exitDecision(4);}

                        switch (alt4) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:14:60: ',' ( statement | expression )
                    	    {
                    	    dbg.location(14,60);
                    	    char_literal10=(Token)match(input,19,FOLLOW_19_in_function89); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal10_tree = (Object)adaptor.create(char_literal10);
                    	    adaptor.addChild(root_0, char_literal10_tree);
                    	    }
                    	    dbg.location(14,64);
                    	    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:14:64: ( statement | expression )
                    	    int alt3=2;
                    	    try { dbg.enterSubRule(3);
                    	    try { dbg.enterDecision(3);

                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==ID) ) {
                    	        int LA3_1 = input.LA(2);

                    	        if ( (LA3_1==16||LA3_1==18) ) {
                    	            alt3=1;
                    	        }
                    	        else if ( (LA3_1==15||LA3_1==19||(LA3_1>=21 && LA3_1<=34)) ) {
                    	            alt3=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return retval;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 3, 1, input);

                    	            dbg.recognitionException(nvae);
                    	            throw nvae;
                    	        }
                    	    }
                    	    else if ( ((LA3_0>=HEX_NUMBER && LA3_0<=INTEGER)||LA3_0==16||(LA3_0>=20 && LA3_0<=22)) ) {
                    	        alt3=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 3, 0, input);

                    	        dbg.recognitionException(nvae);
                    	        throw nvae;
                    	    }
                    	    } finally {dbg.exitDecision(3);}

                    	    switch (alt3) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:14:65: statement
                    	            {
                    	            dbg.location(14,65);
                    	            pushFollow(FOLLOW_statement_in_function92);
                    	            statement11=statement();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement11.getTree());

                    	            }
                    	            break;
                    	        case 2 :
                    	            dbg.enterAlt(2);

                    	            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:14:77: expression
                    	            {
                    	            dbg.location(14,77);
                    	            pushFollow(FOLLOW_expression_in_function96);
                    	            expression12=expression();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression12.getTree());

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(3);}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(4);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}


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
        dbg.location(14, 93);

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
    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:16:1: args : arg ( ',' arg )* ;
    public final IdealParser.args_return args() throws RecognitionException {
        IdealParser.args_return retval = new IdealParser.args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal14=null;
        IdealParser.arg_return arg13 = null;

        IdealParser.arg_return arg15 = null;


        Object char_literal14_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 1);

        try {
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:16:7: ( arg ( ',' arg )* )
            dbg.enterAlt(1);

            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:16:9: arg ( ',' arg )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(16,9);
            pushFollow(FOLLOW_arg_in_args112);
            arg13=arg();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arg13.getTree());
            dbg.location(16,13);
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:16:13: ( ',' arg )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:16:14: ',' arg
            	    {
            	    dbg.location(16,14);
            	    char_literal14=(Token)match(input,19,FOLLOW_19_in_args115); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal14_tree = (Object)adaptor.create(char_literal14);
            	    adaptor.addChild(root_0, char_literal14_tree);
            	    }
            	    dbg.location(16,18);
            	    pushFollow(FOLLOW_arg_in_args117);
            	    arg15=arg();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arg15.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}


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
    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:18:1: arg : ID ( '->' expression )? ;
    public final IdealParser.arg_return arg() throws RecognitionException {
        IdealParser.arg_return retval = new IdealParser.arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID16=null;
        Token string_literal17=null;
        IdealParser.expression_return expression18 = null;


        Object ID16_tree=null;
        Object string_literal17_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 1);

        try {
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:18:6: ( ID ( '->' expression )? )
            dbg.enterAlt(1);

            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:18:8: ID ( '->' expression )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(18,8);
            ID16=(Token)match(input,ID,FOLLOW_ID_in_arg130); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID16_tree = (Object)adaptor.create(ID16);
            adaptor.addChild(root_0, ID16_tree);
            }
            dbg.location(18,11);
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:18:11: ( '->' expression )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:18:12: '->' expression
                    {
                    dbg.location(18,12);
                    string_literal17=(Token)match(input,18,FOLLOW_18_in_arg133); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal17_tree = (Object)adaptor.create(string_literal17);
                    adaptor.addChild(root_0, string_literal17_tree);
                    }
                    dbg.location(18,17);
                    pushFollow(FOLLOW_expression_in_arg135);
                    expression18=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression18.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}


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
    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:20:1: statement : ( assignment | function );
    public final IdealParser.statement_return statement() throws RecognitionException {
        IdealParser.statement_return retval = new IdealParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        IdealParser.assignment_return assignment19 = null;

        IdealParser.function_return function20 = null;



        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 1);

        try {
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:20:11: ( assignment | function )
            int alt8=2;
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==18) ) {
                    alt8=1;
                }
                else if ( (LA8_1==16) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

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

                    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:20:13: assignment
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(20,13);
                    pushFollow(FOLLOW_assignment_in_statement145);
                    assignment19=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment19.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:21:13: function
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(21,13);
                    pushFollow(FOLLOW_function_in_statement160);
                    function20=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function20.getTree());

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
        dbg.location(22, 11);

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
    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:24:1: assignment : ID '->' ( expression | function | string ) ;
    public final IdealParser.assignment_return assignment() throws RecognitionException {
        IdealParser.assignment_return retval = new IdealParser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID21=null;
        Token string_literal22=null;
        IdealParser.expression_return expression23 = null;

        IdealParser.function_return function24 = null;

        IdealParser.string_return string25 = null;


        Object ID21_tree=null;
        Object string_literal22_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 1);

        try {
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:24:12: ( ID '->' ( expression | function | string ) )
            dbg.enterAlt(1);

            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:24:14: ID '->' ( expression | function | string )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(24,14);
            ID21=(Token)match(input,ID,FOLLOW_ID_in_assignment179); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID21_tree = (Object)adaptor.create(ID21);
            adaptor.addChild(root_0, ID21_tree);
            }
            dbg.location(24,17);
            string_literal22=(Token)match(input,18,FOLLOW_18_in_assignment181); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal22_tree = (Object)adaptor.create(string_literal22);
            adaptor.addChild(root_0, string_literal22_tree);
            }
            dbg.location(24,22);
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:24:22: ( expression | function | string )
            int alt9=3;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9);

            switch ( input.LA(1) ) {
            case HEX_NUMBER:
            case INTEGER:
            case 16:
            case 20:
            case 21:
            case 22:
                {
                alt9=1;
                }
                break;
            case ID:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==16) ) {
                    alt9=2;
                }
                else if ( (LA9_2==15||LA9_2==19||(LA9_2>=21 && LA9_2<=34)) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case UNICODE_STRING:
                {
                alt9=3;
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

                    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:24:23: expression
                    {
                    dbg.location(24,23);
                    pushFollow(FOLLOW_expression_in_assignment184);
                    expression23=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression23.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:24:36: function
                    {
                    dbg.location(24,36);
                    pushFollow(FOLLOW_function_in_assignment188);
                    function24=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function24.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:24:47: string
                    {
                    dbg.location(24,47);
                    pushFollow(FOLLOW_string_in_assignment192);
                    string25=string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, string25.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}


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
        dbg.location(24, 55);

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
    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:26:1: string : UNICODE_STRING ;
    public final IdealParser.string_return string() throws RecognitionException {
        IdealParser.string_return retval = new IdealParser.string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNICODE_STRING26=null;

        Object UNICODE_STRING26_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "string");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(26, 1);

        try {
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:26:9: ( UNICODE_STRING )
            dbg.enterAlt(1);

            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:26:11: UNICODE_STRING
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(26,11);
            UNICODE_STRING26=(Token)match(input,UNICODE_STRING,FOLLOW_UNICODE_STRING_in_string204); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UNICODE_STRING26_tree = (Object)adaptor.create(UNICODE_STRING26);
            adaptor.addChild(root_0, UNICODE_STRING26_tree);
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
        dbg.location(26, 25);

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
    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:28:1: number : ( HEX_NUMBER | ( INTEGER '.' INTEGER )=> INTEGER '.' INTEGER | INTEGER );
    public final IdealParser.number_return number() throws RecognitionException {
        IdealParser.number_return retval = new IdealParser.number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token HEX_NUMBER27=null;
        Token INTEGER28=null;
        Token char_literal29=null;
        Token INTEGER30=null;
        Token INTEGER31=null;

        Object HEX_NUMBER27_tree=null;
        Object INTEGER28_tree=null;
        Object char_literal29_tree=null;
        Object INTEGER30_tree=null;
        Object INTEGER31_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 1);

        try {
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:28:8: ( HEX_NUMBER | ( INTEGER '.' INTEGER )=> INTEGER '.' INTEGER | INTEGER )
            int alt10=3;
            try { dbg.enterDecision(10);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==HEX_NUMBER) ) {
                alt10=1;
            }
            else if ( (LA10_0==INTEGER) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==15) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==INTEGER) && (synpred1_Ideal())) {
                        alt10=2;
                    }
                    else if ( (LA10_3==EOF||LA10_3==ID) ) {
                        alt10=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else if ( (LA10_2==17||LA10_2==19||(LA10_2>=21 && LA10_2<=34)) ) {
                    alt10=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:28:10: HEX_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(28,10);
                    HEX_NUMBER27=(Token)match(input,HEX_NUMBER,FOLLOW_HEX_NUMBER_in_number213); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HEX_NUMBER27_tree = (Object)adaptor.create(HEX_NUMBER27);
                    adaptor.addChild(root_0, HEX_NUMBER27_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:29:10: ( INTEGER '.' INTEGER )=> INTEGER '.' INTEGER
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(29,34);
                    INTEGER28=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number234); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER28_tree = (Object)adaptor.create(INTEGER28);
                    adaptor.addChild(root_0, INTEGER28_tree);
                    }
                    dbg.location(29,42);
                    char_literal29=(Token)match(input,15,FOLLOW_15_in_number236); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal29_tree = (Object)adaptor.create(char_literal29);
                    adaptor.addChild(root_0, char_literal29_tree);
                    }
                    dbg.location(29,46);
                    INTEGER30=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number238); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER30_tree = (Object)adaptor.create(INTEGER30);
                    adaptor.addChild(root_0, INTEGER30_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:30:10: INTEGER
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(30,10);
                    INTEGER31=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number249); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER31_tree = (Object)adaptor.create(INTEGER31);
                    adaptor.addChild(root_0, INTEGER31_tree);
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
        dbg.location(30, 17);

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
    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:34:1: term : ( ID | '(' expression ')' | number );
    public final IdealParser.term_return term() throws RecognitionException {
        IdealParser.term_return retval = new IdealParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID32=null;
        Token char_literal33=null;
        Token char_literal35=null;
        IdealParser.expression_return expression34 = null;

        IdealParser.number_return number36 = null;


        Object ID32_tree=null;
        Object char_literal33_tree=null;
        Object char_literal35_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 1);

        try {
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:34:7: ( ID | '(' expression ')' | number )
            int alt11=3;
            try { dbg.enterDecision(11);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt11=1;
                }
                break;
            case 16:
                {
                alt11=2;
                }
                break;
            case HEX_NUMBER:
            case INTEGER:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:34:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(34,9);
                    ID32=(Token)match(input,ID,FOLLOW_ID_in_term260); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID32_tree = (Object)adaptor.create(ID32);
                    adaptor.addChild(root_0, ID32_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:34:14: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(34,14);
                    char_literal33=(Token)match(input,16,FOLLOW_16_in_term264); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal33_tree = (Object)adaptor.create(char_literal33);
                    adaptor.addChild(root_0, char_literal33_tree);
                    }
                    dbg.location(34,18);
                    pushFollow(FOLLOW_expression_in_term266);
                    expression34=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression34.getTree());
                    dbg.location(34,29);
                    char_literal35=(Token)match(input,17,FOLLOW_17_in_term268); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal35_tree = (Object)adaptor.create(char_literal35);
                    adaptor.addChild(root_0, char_literal35_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:34:35: number
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(34,35);
                    pushFollow(FOLLOW_number_in_term272);
                    number36=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number36.getTree());

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
        dbg.location(34, 42);

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
    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:36:1: negation : ( '!' )* term ;
    public final IdealParser.negation_return negation() throws RecognitionException {
        IdealParser.negation_return retval = new IdealParser.negation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal37=null;
        IdealParser.term_return term38 = null;


        Object char_literal37_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "negation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(36, 1);

        try {
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:36:10: ( ( '!' )* term )
            dbg.enterAlt(1);

            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:36:12: ( '!' )* term
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(36,12);
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:36:12: ( '!' )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:36:12: '!'
            	    {
            	    dbg.location(36,12);
            	    char_literal37=(Token)match(input,20,FOLLOW_20_in_negation281); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal37_tree = (Object)adaptor.create(char_literal37);
            	    adaptor.addChild(root_0, char_literal37_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}

            dbg.location(36,17);
            pushFollow(FOLLOW_term_in_negation284);
            term38=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term38.getTree());

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
        dbg.location(36, 21);

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
    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:38:1: unary : ( '+' | '-' )* negation ;
    public final IdealParser.unary_return unary() throws RecognitionException {
        IdealParser.unary_return retval = new IdealParser.unary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set39=null;
        IdealParser.negation_return negation40 = null;


        Object set39_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "unary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 1);

        try {
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:38:8: ( ( '+' | '-' )* negation )
            dbg.enterAlt(1);

            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:38:10: ( '+' | '-' )* negation
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(38,10);
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:38:10: ( '+' | '-' )*
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

            	    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:
            	    {
            	    dbg.location(38,10);
            	    set39=(Token)input.LT(1);
            	    if ( (input.LA(1)>=21 && input.LA(1)<=22) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set39));
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
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}

            dbg.location(38,21);
            pushFollow(FOLLOW_negation_in_unary301);
            negation40=negation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, negation40.getTree());

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
        dbg.location(38, 29);

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
    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:40:1: mult : unary ( ( '*' | '/' | ( '%' | 'mod' ) ) unary )* ;
    public final IdealParser.mult_return mult() throws RecognitionException {
        IdealParser.mult_return retval = new IdealParser.mult_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set42=null;
        IdealParser.unary_return unary41 = null;

        IdealParser.unary_return unary43 = null;


        Object set42_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mult");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 1);

        try {
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:40:7: ( unary ( ( '*' | '/' | ( '%' | 'mod' ) ) unary )* )
            dbg.enterAlt(1);

            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:40:9: unary ( ( '*' | '/' | ( '%' | 'mod' ) ) unary )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(40,9);
            pushFollow(FOLLOW_unary_in_mult310);
            unary41=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary41.getTree());
            dbg.location(40,15);
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:40:15: ( ( '*' | '/' | ( '%' | 'mod' ) ) unary )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14);

                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=23 && LA14_0<=26)) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:40:16: ( '*' | '/' | ( '%' | 'mod' ) ) unary
            	    {
            	    dbg.location(40,16);
            	    set42=(Token)input.LT(1);
            	    if ( (input.LA(1)>=23 && input.LA(1)<=26) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set42));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(40,43);
            	    pushFollow(FOLLOW_unary_in_mult330);
            	    unary43=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary43.getTree());

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
        dbg.location(40, 50);

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
    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:42:1: add : mult ( ( '+' | '-' ) mult )* ;
    public final IdealParser.add_return add() throws RecognitionException {
        IdealParser.add_return retval = new IdealParser.add_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set45=null;
        IdealParser.mult_return mult44 = null;

        IdealParser.mult_return mult46 = null;


        Object set45_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "add");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 1);

        try {
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:42:6: ( mult ( ( '+' | '-' ) mult )* )
            dbg.enterAlt(1);

            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:42:8: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(42,8);
            pushFollow(FOLLOW_mult_in_add342);
            mult44=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult44.getTree());
            dbg.location(42,13);
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:42:13: ( ( '+' | '-' ) mult )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15);

                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=21 && LA15_0<=22)) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:42:14: ( '+' | '-' ) mult
            	    {
            	    dbg.location(42,14);
            	    set45=(Token)input.LT(1);
            	    if ( (input.LA(1)>=21 && input.LA(1)<=22) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set45));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(42,26);
            	    pushFollow(FOLLOW_mult_in_add353);
            	    mult46=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult46.getTree());

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
        dbg.location(42, 32);

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
    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:44:1: relation : add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )* ;
    public final IdealParser.relation_return relation() throws RecognitionException {
        IdealParser.relation_return retval = new IdealParser.relation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set48=null;
        IdealParser.add_return add47 = null;

        IdealParser.add_return add49 = null;


        Object set48_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "relation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(44, 1);

        try {
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:44:10: ( add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )* )
            dbg.enterAlt(1);

            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:44:12: add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(44,12);
            pushFollow(FOLLOW_add_in_relation364);
            add47=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add47.getTree());
            dbg.location(44,16);
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:44:16: ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )*
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16);

                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=27 && LA16_0<=32)) ) {
                    alt16=1;
                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:44:17: ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add
            	    {
            	    dbg.location(44,17);
            	    set48=(Token)input.LT(1);
            	    if ( (input.LA(1)>=27 && input.LA(1)<=32) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set48));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(44,56);
            	    pushFollow(FOLLOW_add_in_relation391);
            	    add49=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add49.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);
            } finally {dbg.exitSubRule(16);}


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
        dbg.location(44, 61);

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
    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:46:1: expression : relation ( ( '&&' | '||' ) relation )* ;
    public final IdealParser.expression_return expression() throws RecognitionException {
        IdealParser.expression_return retval = new IdealParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set51=null;
        IdealParser.relation_return relation50 = null;

        IdealParser.relation_return relation52 = null;


        Object set51_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:46:12: ( relation ( ( '&&' | '||' ) relation )* )
            dbg.enterAlt(1);

            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:46:14: relation ( ( '&&' | '||' ) relation )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(46,14);
            pushFollow(FOLLOW_relation_in_expression404);
            relation50=relation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relation50.getTree());
            dbg.location(46,23);
            // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:46:23: ( ( '&&' | '||' ) relation )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17);

                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=33 && LA17_0<=34)) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:46:24: ( '&&' | '||' ) relation
            	    {
            	    dbg.location(46,24);
            	    set51=(Token)input.LT(1);
            	    if ( (input.LA(1)>=33 && input.LA(1)<=34) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set51));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(46,38);
            	    pushFollow(FOLLOW_relation_in_expression415);
            	    relation52=relation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relation52.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);
            } finally {dbg.exitSubRule(17);}


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
        dbg.location(46, 48);

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
        // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:29:10: ( INTEGER '.' INTEGER )
        dbg.enterAlt(1);

        // /Users/jhr/Documents/Projects/ideal/src/main/Ideal.g:29:11: INTEGER '.' INTEGER
        {
        dbg.location(29,11);
        match(input,INTEGER,FOLLOW_INTEGER_in_synpred1_Ideal226); if (state.failed) return ;
        dbg.location(29,19);
        match(input,15,FOLLOW_15_in_synpred1_Ideal228); if (state.failed) return ;
        dbg.location(29,23);
        match(input,INTEGER,FOLLOW_INTEGER_in_synpred1_Ideal230); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Ideal

    // Delegated rules

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
    public static final BitSet FOLLOW_15_in_program58 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ID_in_function69 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_function71 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_args_in_function73 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_function75 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_function78 = new BitSet(new long[]{0x00000000007900D0L});
    public static final BitSet FOLLOW_statement_in_function81 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_expression_in_function85 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_function89 = new BitSet(new long[]{0x00000000007900D0L});
    public static final BitSet FOLLOW_statement_in_function92 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_expression_in_function96 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_arg_in_args112 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_args115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_arg_in_args117 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_arg130 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_arg133 = new BitSet(new long[]{0x00000000007900D0L});
    public static final BitSet FOLLOW_expression_in_arg135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_statement160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment179 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_assignment181 = new BitSet(new long[]{0x00000000007900F0L});
    public static final BitSet FOLLOW_expression_in_assignment184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_assignment188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_assignment192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNICODE_STRING_in_string204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_NUMBER_in_number213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number234 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_number236 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_number238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_term264 = new BitSet(new long[]{0x00000000007900D0L});
    public static final BitSet FOLLOW_expression_in_term266 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_term268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_term272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_negation281 = new BitSet(new long[]{0x00000000007900D0L});
    public static final BitSet FOLLOW_term_in_negation284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unary294 = new BitSet(new long[]{0x00000000007900D0L});
    public static final BitSet FOLLOW_negation_in_unary301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult310 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_set_in_mult313 = new BitSet(new long[]{0x00000000007900D0L});
    public static final BitSet FOLLOW_unary_in_mult330 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_mult_in_add342 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_set_in_add345 = new BitSet(new long[]{0x00000000007900D0L});
    public static final BitSet FOLLOW_mult_in_add353 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_add_in_relation364 = new BitSet(new long[]{0x00000001F8000002L});
    public static final BitSet FOLLOW_set_in_relation367 = new BitSet(new long[]{0x00000000007900D0L});
    public static final BitSet FOLLOW_add_in_relation391 = new BitSet(new long[]{0x00000001F8000002L});
    public static final BitSet FOLLOW_relation_in_expression404 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_set_in_expression407 = new BitSet(new long[]{0x00000000007900D0L});
    public static final BitSet FOLLOW_relation_in_expression415 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_INTEGER_in_synpred1_Ideal226 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_synpred1_Ideal228 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_synpred1_Ideal230 = new BitSet(new long[]{0x0000000000000002L});

}