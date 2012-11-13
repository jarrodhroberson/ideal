// $ANTLR 3.4 C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g 2012-11-13 14:40:23

  package ideal;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class IdealParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATOM", "COMMENT", "DIGIT", "ESC", "FLOAT", "HEX_DIGIT", "HEX_NUMBER", "ID", "INTEGER", "NAMESPACE", "TYPE_ID", "UNICODE_STRING", "UNI_ESC", "WS", "'!'", "'!='", "'%'", "'&&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'->'", "'.'", "'/'", "':'", "'<'", "'<='", "'='", "'>'", "'>='", "'^'", "'mod'", "'||'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "negation", "mult", "number", "expression", "add", "power", 
    "type_definition", "relation", "eval", "function_signature", "term", 
    "function_invocation", "statement", "unary", "program", "assignment", 
    "string"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false
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
    public String getGrammarFileName() { return "C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g"; }


    public static class eval_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eval"
    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:18:1: eval : program EOF !;
    public final IdealParser.eval_return eval() throws RecognitionException {
        IdealParser.eval_return retval = new IdealParser.eval_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        IdealParser.program_return program1 =null;


        CommonTree EOF2_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "eval");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 0);

        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:18:6: ( program EOF !)
            dbg.enterAlt(1);

            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:18:8: program EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(18,8);
            pushFollow(FOLLOW_program_in_eval64);
            program1=program();

            state._fsp--;

            adaptor.addChild(root_0, program1.getTree());
            dbg.location(18,19);
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_eval66); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(18, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "eval");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "eval"


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:20:1: program : ( statement '.' )* ;
    public final IdealParser.program_return program() throws RecognitionException {
        IdealParser.program_return retval = new IdealParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal4=null;
        IdealParser.statement_return statement3 =null;


        CommonTree char_literal4_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 0);

        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:20:9: ( ( statement '.' )* )
            dbg.enterAlt(1);

            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:20:11: ( statement '.' )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(20,11);
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:20:11: ( statement '.' )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==ATOM||LA1_0==ID||(LA1_0 >= NAMESPACE && LA1_0 <= TYPE_ID)||LA1_0==31) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:20:12: statement '.'
            	    {
            	    dbg.location(20,12);
            	    pushFollow(FOLLOW_statement_in_program77);
            	    statement3=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement3.getTree());
            	    dbg.location(20,21);
            	    char_literal4=(Token)match(input,29,FOLLOW_29_in_program78); 
            	    char_literal4_tree = 
            	    (CommonTree)adaptor.create(char_literal4)
            	    ;
            	    adaptor.addChild(root_0, char_literal4_tree);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(20, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "program"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:22:1: statement : ( function_invocation | assignment | type_definition | ATOM );
    public final IdealParser.statement_return statement() throws RecognitionException {
        IdealParser.statement_return retval = new IdealParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ATOM8=null;
        IdealParser.function_invocation_return function_invocation5 =null;

        IdealParser.assignment_return assignment6 =null;

        IdealParser.type_definition_return type_definition7 =null;


        CommonTree ATOM8_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 0);

        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:22:11: ( function_invocation | assignment | type_definition | ATOM )
            int alt2=4;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            try {
                isCyclicDecision = true;
                alt2 = dfa2.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:22:13: function_invocation
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(22,13);
                    pushFollow(FOLLOW_function_invocation_in_statement89);
                    function_invocation5=function_invocation();

                    state._fsp--;

                    adaptor.addChild(root_0, function_invocation5.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:23:13: assignment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(23,13);
                    pushFollow(FOLLOW_assignment_in_statement103);
                    assignment6=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment6.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:24:13: type_definition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(24,13);
                    pushFollow(FOLLOW_type_definition_in_statement117);
                    type_definition7=type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, type_definition7.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:25:13: ATOM
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(25,13);
                    ATOM8=(Token)match(input,ATOM,FOLLOW_ATOM_in_statement131); 
                    ATOM8_tree = 
                    (CommonTree)adaptor.create(ATOM8)
                    ;
                    adaptor.addChild(root_0, ATOM8_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(26, 10);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:28:1: assignment : ( ID '->' expression | ATOM '->' expression | function_signature '->' ( assignment ',' )* expression );
    public final IdealParser.assignment_return assignment() throws RecognitionException {
        IdealParser.assignment_return retval = new IdealParser.assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID9=null;
        Token string_literal10=null;
        Token ATOM12=null;
        Token string_literal13=null;
        Token string_literal16=null;
        Token char_literal18=null;
        IdealParser.expression_return expression11 =null;

        IdealParser.expression_return expression14 =null;

        IdealParser.function_signature_return function_signature15 =null;

        IdealParser.assignment_return assignment17 =null;

        IdealParser.expression_return expression19 =null;


        CommonTree ID9_tree=null;
        CommonTree string_literal10_tree=null;
        CommonTree ATOM12_tree=null;
        CommonTree string_literal13_tree=null;
        CommonTree string_literal16_tree=null;
        CommonTree char_literal18_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 0);

        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:28:12: ( ID '->' expression | ATOM '->' expression | function_signature '->' ( assignment ',' )* expression )
            int alt4=3;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==28) ) {
                    alt4=1;
                }
                else if ( (LA4_1==22) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA4_0==ATOM) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:28:14: ID '->' expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(28,14);
                    ID9=(Token)match(input,ID,FOLLOW_ID_in_assignment166); 
                    ID9_tree = 
                    (CommonTree)adaptor.create(ID9)
                    ;
                    adaptor.addChild(root_0, ID9_tree);

                    dbg.location(28,17);
                    string_literal10=(Token)match(input,28,FOLLOW_28_in_assignment168); 
                    string_literal10_tree = 
                    (CommonTree)adaptor.create(string_literal10)
                    ;
                    adaptor.addChild(root_0, string_literal10_tree);

                    dbg.location(28,22);
                    pushFollow(FOLLOW_expression_in_assignment170);
                    expression11=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression11.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:29:14: ATOM '->' expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(29,14);
                    ATOM12=(Token)match(input,ATOM,FOLLOW_ATOM_in_assignment185); 
                    ATOM12_tree = 
                    (CommonTree)adaptor.create(ATOM12)
                    ;
                    adaptor.addChild(root_0, ATOM12_tree);

                    dbg.location(29,19);
                    string_literal13=(Token)match(input,28,FOLLOW_28_in_assignment187); 
                    string_literal13_tree = 
                    (CommonTree)adaptor.create(string_literal13)
                    ;
                    adaptor.addChild(root_0, string_literal13_tree);

                    dbg.location(29,24);
                    pushFollow(FOLLOW_expression_in_assignment189);
                    expression14=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression14.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:30:14: function_signature '->' ( assignment ',' )* expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(30,14);
                    pushFollow(FOLLOW_function_signature_in_assignment204);
                    function_signature15=function_signature();

                    state._fsp--;

                    adaptor.addChild(root_0, function_signature15.getTree());
                    dbg.location(30,33);
                    string_literal16=(Token)match(input,28,FOLLOW_28_in_assignment206); 
                    string_literal16_tree = 
                    (CommonTree)adaptor.create(string_literal16)
                    ;
                    adaptor.addChild(root_0, string_literal16_tree);

                    dbg.location(30,38);
                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:30:38: ( assignment ',' )*
                    try { dbg.enterSubRule(3);

                    loop3:
                    do {
                        int alt3=2;
                        try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                        try {
                            isCyclicDecision = true;
                            alt3 = dfa3.predict(input);
                        }
                        catch (NoViableAltException nvae) {
                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                        } finally {dbg.exitDecision(3);}

                        switch (alt3) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:30:40: assignment ','
                    	    {
                    	    dbg.location(30,40);
                    	    pushFollow(FOLLOW_assignment_in_assignment210);
                    	    assignment17=assignment();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, assignment17.getTree());
                    	    dbg.location(30,51);
                    	    char_literal18=(Token)match(input,26,FOLLOW_26_in_assignment212); 
                    	    char_literal18_tree = 
                    	    (CommonTree)adaptor.create(char_literal18)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal18_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(3);}

                    dbg.location(30,58);
                    pushFollow(FOLLOW_expression_in_assignment217);
                    expression19=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression19.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(31, 11);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assignment"


    public static class type_definition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_definition"
    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:33:1: type_definition : TYPE_ID '->' assignment ( ',' assignment )* ;
    public final IdealParser.type_definition_return type_definition() throws RecognitionException {
        IdealParser.type_definition_return retval = new IdealParser.type_definition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TYPE_ID20=null;
        Token string_literal21=null;
        Token char_literal23=null;
        IdealParser.assignment_return assignment22 =null;

        IdealParser.assignment_return assignment24 =null;


        CommonTree TYPE_ID20_tree=null;
        CommonTree string_literal21_tree=null;
        CommonTree char_literal23_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "type_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 0);

        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:33:17: ( TYPE_ID '->' assignment ( ',' assignment )* )
            dbg.enterAlt(1);

            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:33:19: TYPE_ID '->' assignment ( ',' assignment )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(33,19);
            TYPE_ID20=(Token)match(input,TYPE_ID,FOLLOW_TYPE_ID_in_type_definition237); 
            TYPE_ID20_tree = 
            (CommonTree)adaptor.create(TYPE_ID20)
            ;
            adaptor.addChild(root_0, TYPE_ID20_tree);

            dbg.location(33,27);
            string_literal21=(Token)match(input,28,FOLLOW_28_in_type_definition239); 
            string_literal21_tree = 
            (CommonTree)adaptor.create(string_literal21)
            ;
            adaptor.addChild(root_0, string_literal21_tree);

            dbg.location(33,32);
            pushFollow(FOLLOW_assignment_in_type_definition241);
            assignment22=assignment();

            state._fsp--;

            adaptor.addChild(root_0, assignment22.getTree());
            dbg.location(33,43);
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:33:43: ( ',' assignment )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:33:44: ',' assignment
            	    {
            	    dbg.location(33,44);
            	    char_literal23=(Token)match(input,26,FOLLOW_26_in_type_definition244); 
            	    char_literal23_tree = 
            	    (CommonTree)adaptor.create(char_literal23)
            	    ;
            	    adaptor.addChild(root_0, char_literal23_tree);

            	    dbg.location(33,48);
            	    pushFollow(FOLLOW_assignment_in_type_definition246);
            	    assignment24=assignment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assignment24.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(33, 60);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type_definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "type_definition"


    public static class function_signature_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_signature"
    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:35:1: function_signature : ID '(' ! ID ( ',' ID )* ')' !;
    public final IdealParser.function_signature_return function_signature() throws RecognitionException {
        IdealParser.function_signature_return retval = new IdealParser.function_signature_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID25=null;
        Token char_literal26=null;
        Token ID27=null;
        Token char_literal28=null;
        Token ID29=null;
        Token char_literal30=null;

        CommonTree ID25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree ID27_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree ID29_tree=null;
        CommonTree char_literal30_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "function_signature");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(35, 0);

        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:35:20: ( ID '(' ! ID ( ',' ID )* ')' !)
            dbg.enterAlt(1);

            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:35:22: ID '(' ! ID ( ',' ID )* ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(35,22);
            ID25=(Token)match(input,ID,FOLLOW_ID_in_function_signature257); 
            ID25_tree = 
            (CommonTree)adaptor.create(ID25)
            ;
            adaptor.addChild(root_0, ID25_tree);

            dbg.location(35,28);
            char_literal26=(Token)match(input,22,FOLLOW_22_in_function_signature259); 
            dbg.location(35,30);
            ID27=(Token)match(input,ID,FOLLOW_ID_in_function_signature262); 
            ID27_tree = 
            (CommonTree)adaptor.create(ID27)
            ;
            adaptor.addChild(root_0, ID27_tree);

            dbg.location(35,33);
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:35:33: ( ',' ID )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:35:34: ',' ID
            	    {
            	    dbg.location(35,34);
            	    char_literal28=(Token)match(input,26,FOLLOW_26_in_function_signature265); 
            	    char_literal28_tree = 
            	    (CommonTree)adaptor.create(char_literal28)
            	    ;
            	    adaptor.addChild(root_0, char_literal28_tree);

            	    dbg.location(35,38);
            	    ID29=(Token)match(input,ID,FOLLOW_ID_in_function_signature267); 
            	    ID29_tree = 
            	    (CommonTree)adaptor.create(ID29)
            	    ;
            	    adaptor.addChild(root_0, ID29_tree);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}

            dbg.location(35,46);
            char_literal30=(Token)match(input,23,FOLLOW_23_in_function_signature271); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(35, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function_signature");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function_signature"


    public static class function_invocation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_invocation"
    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:37:1: function_invocation : ( NAMESPACE ':' | TYPE_ID ':' | ID ':' | ':' )? ID '(' ! term ( ',' term )* ')' !;
    public final IdealParser.function_invocation_return function_invocation() throws RecognitionException {
        IdealParser.function_invocation_return retval = new IdealParser.function_invocation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NAMESPACE31=null;
        Token char_literal32=null;
        Token TYPE_ID33=null;
        Token char_literal34=null;
        Token ID35=null;
        Token char_literal36=null;
        Token char_literal37=null;
        Token ID38=null;
        Token char_literal39=null;
        Token char_literal41=null;
        Token char_literal43=null;
        IdealParser.term_return term40 =null;

        IdealParser.term_return term42 =null;


        CommonTree NAMESPACE31_tree=null;
        CommonTree char_literal32_tree=null;
        CommonTree TYPE_ID33_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree ID35_tree=null;
        CommonTree char_literal36_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree ID38_tree=null;
        CommonTree char_literal39_tree=null;
        CommonTree char_literal41_tree=null;
        CommonTree char_literal43_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "function_invocation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 0);

        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:37:21: ( ( NAMESPACE ':' | TYPE_ID ':' | ID ':' | ':' )? ID '(' ! term ( ',' term )* ')' !)
            dbg.enterAlt(1);

            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:37:23: ( NAMESPACE ':' | TYPE_ID ':' | ID ':' | ':' )? ID '(' ! term ( ',' term )* ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(37,23);
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:37:23: ( NAMESPACE ':' | TYPE_ID ':' | ID ':' | ':' )?
            int alt7=5;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            switch ( input.LA(1) ) {
                case NAMESPACE:
                    {
                    alt7=1;
                    }
                    break;
                case TYPE_ID:
                    {
                    alt7=2;
                    }
                    break;
                case ID:
                    {
                    int LA7_3 = input.LA(2);

                    if ( (LA7_3==31) ) {
                        alt7=3;
                    }
                    }
                    break;
                case 31:
                    {
                    alt7=4;
                    }
                    break;
            }

            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:37:25: NAMESPACE ':'
                    {
                    dbg.location(37,25);
                    NAMESPACE31=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_function_invocation283); 
                    NAMESPACE31_tree = 
                    (CommonTree)adaptor.create(NAMESPACE31)
                    ;
                    adaptor.addChild(root_0, NAMESPACE31_tree);

                    dbg.location(37,35);
                    char_literal32=(Token)match(input,31,FOLLOW_31_in_function_invocation285); 
                    char_literal32_tree = 
                    (CommonTree)adaptor.create(char_literal32)
                    ;
                    adaptor.addChild(root_0, char_literal32_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:37:41: TYPE_ID ':'
                    {
                    dbg.location(37,41);
                    TYPE_ID33=(Token)match(input,TYPE_ID,FOLLOW_TYPE_ID_in_function_invocation289); 
                    TYPE_ID33_tree = 
                    (CommonTree)adaptor.create(TYPE_ID33)
                    ;
                    adaptor.addChild(root_0, TYPE_ID33_tree);

                    dbg.location(37,49);
                    char_literal34=(Token)match(input,31,FOLLOW_31_in_function_invocation291); 
                    char_literal34_tree = 
                    (CommonTree)adaptor.create(char_literal34)
                    ;
                    adaptor.addChild(root_0, char_literal34_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:37:55: ID ':'
                    {
                    dbg.location(37,55);
                    ID35=(Token)match(input,ID,FOLLOW_ID_in_function_invocation295); 
                    ID35_tree = 
                    (CommonTree)adaptor.create(ID35)
                    ;
                    adaptor.addChild(root_0, ID35_tree);

                    dbg.location(37,58);
                    char_literal36=(Token)match(input,31,FOLLOW_31_in_function_invocation297); 
                    char_literal36_tree = 
                    (CommonTree)adaptor.create(char_literal36)
                    ;
                    adaptor.addChild(root_0, char_literal36_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:37:64: ':'
                    {
                    dbg.location(37,64);
                    char_literal37=(Token)match(input,31,FOLLOW_31_in_function_invocation301); 
                    char_literal37_tree = 
                    (CommonTree)adaptor.create(char_literal37)
                    ;
                    adaptor.addChild(root_0, char_literal37_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(37,71);
            ID38=(Token)match(input,ID,FOLLOW_ID_in_function_invocation306); 
            ID38_tree = 
            (CommonTree)adaptor.create(ID38)
            ;
            adaptor.addChild(root_0, ID38_tree);

            dbg.location(37,77);
            char_literal39=(Token)match(input,22,FOLLOW_22_in_function_invocation308); 
            dbg.location(37,79);
            pushFollow(FOLLOW_term_in_function_invocation311);
            term40=term();

            state._fsp--;

            adaptor.addChild(root_0, term40.getTree());
            dbg.location(37,84);
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:37:84: ( ',' term )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:37:85: ',' term
            	    {
            	    dbg.location(37,85);
            	    char_literal41=(Token)match(input,26,FOLLOW_26_in_function_invocation314); 
            	    char_literal41_tree = 
            	    (CommonTree)adaptor.create(char_literal41)
            	    ;
            	    adaptor.addChild(root_0, char_literal41_tree);

            	    dbg.location(37,89);
            	    pushFollow(FOLLOW_term_in_function_invocation316);
            	    term42=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term42.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}

            dbg.location(37,99);
            char_literal43=(Token)match(input,23,FOLLOW_23_in_function_invocation320); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(37, 100);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function_invocation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function_invocation"


    public static class string_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string"
    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:39:1: string : UNICODE_STRING ;
    public final IdealParser.string_return string() throws RecognitionException {
        IdealParser.string_return retval = new IdealParser.string_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token UNICODE_STRING44=null;

        CommonTree UNICODE_STRING44_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "string");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 0);

        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:39:8: ( UNICODE_STRING )
            dbg.enterAlt(1);

            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:39:10: UNICODE_STRING
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(39,10);
            UNICODE_STRING44=(Token)match(input,UNICODE_STRING,FOLLOW_UNICODE_STRING_in_string345); 
            UNICODE_STRING44_tree = 
            (CommonTree)adaptor.create(UNICODE_STRING44)
            ;
            adaptor.addChild(root_0, UNICODE_STRING44_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(39, 23);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:41:1: number : ( HEX_NUMBER | FLOAT | INTEGER );
    public final IdealParser.number_return number() throws RecognitionException {
        IdealParser.number_return retval = new IdealParser.number_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set45=null;

        CommonTree set45_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(41, 0);

        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:41:8: ( HEX_NUMBER | FLOAT | INTEGER )
            dbg.enterAlt(1);

            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(41,8);
            set45=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==HEX_NUMBER||input.LA(1)==INTEGER ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set45)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(44, 7);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:48:1: term : ( '(' expression ')' | number | string | function_invocation | ID | ATOM );
    public final IdealParser.term_return term() throws RecognitionException {
        IdealParser.term_return retval = new IdealParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal46=null;
        Token char_literal48=null;
        Token ID52=null;
        Token ATOM53=null;
        IdealParser.expression_return expression47 =null;

        IdealParser.number_return number49 =null;

        IdealParser.string_return string50 =null;

        IdealParser.function_invocation_return function_invocation51 =null;


        CommonTree char_literal46_tree=null;
        CommonTree char_literal48_tree=null;
        CommonTree ID52_tree=null;
        CommonTree ATOM53_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 0);

        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:48:6: ( '(' expression ')' | number | string | function_invocation | ID | ATOM )
            int alt9=6;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case FLOAT:
            case HEX_NUMBER:
            case INTEGER:
                {
                alt9=2;
                }
                break;
            case UNICODE_STRING:
                {
                alt9=3;
                }
                break;
            case NAMESPACE:
            case TYPE_ID:
            case 31:
                {
                alt9=4;
                }
                break;
            case ID:
                {
                int LA9_5 = input.LA(2);

                if ( (LA9_5==22||LA9_5==31) ) {
                    alt9=4;
                }
                else if ( ((LA9_5 >= 19 && LA9_5 <= 21)||(LA9_5 >= 23 && LA9_5 <= 27)||(LA9_5 >= 29 && LA9_5 <= 30)||(LA9_5 >= 32 && LA9_5 <= 39)) ) {
                    alt9=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ATOM:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:48:8: '(' expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(48,8);
                    char_literal46=(Token)match(input,22,FOLLOW_22_in_term393); 
                    char_literal46_tree = 
                    (CommonTree)adaptor.create(char_literal46)
                    ;
                    adaptor.addChild(root_0, char_literal46_tree);

                    dbg.location(48,12);
                    pushFollow(FOLLOW_expression_in_term395);
                    expression47=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression47.getTree());
                    dbg.location(48,23);
                    char_literal48=(Token)match(input,23,FOLLOW_23_in_term397); 
                    char_literal48_tree = 
                    (CommonTree)adaptor.create(char_literal48)
                    ;
                    adaptor.addChild(root_0, char_literal48_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:49:8: number
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(49,8);
                    pushFollow(FOLLOW_number_in_term406);
                    number49=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number49.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:50:8: string
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(50,8);
                    pushFollow(FOLLOW_string_in_term415);
                    string50=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string50.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:51:8: function_invocation
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(51,8);
                    pushFollow(FOLLOW_function_invocation_in_term424);
                    function_invocation51=function_invocation();

                    state._fsp--;

                    adaptor.addChild(root_0, function_invocation51.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:52:8: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(52,8);
                    ID52=(Token)match(input,ID,FOLLOW_ID_in_term433); 
                    ID52_tree = 
                    (CommonTree)adaptor.create(ID52)
                    ;
                    adaptor.addChild(root_0, ID52_tree);


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:53:8: ATOM
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(53,8);
                    ATOM53=(Token)match(input,ATOM,FOLLOW_ATOM_in_term442); 
                    ATOM53_tree = 
                    (CommonTree)adaptor.create(ATOM53)
                    ;
                    adaptor.addChild(root_0, ATOM53_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(54, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "term"


    public static class power_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "power"
    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:55:1: power : term ( '^' term )* ;
    public final IdealParser.power_return power() throws RecognitionException {
        IdealParser.power_return retval = new IdealParser.power_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal55=null;
        IdealParser.term_return term54 =null;

        IdealParser.term_return term56 =null;


        CommonTree char_literal55_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "power");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(55, 0);

        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:55:7: ( term ( '^' term )* )
            dbg.enterAlt(1);

            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:55:9: term ( '^' term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(55,9);
            pushFollow(FOLLOW_term_in_power455);
            term54=term();

            state._fsp--;

            adaptor.addChild(root_0, term54.getTree());
            dbg.location(55,14);
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:55:14: ( '^' term )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==37) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:55:15: '^' term
            	    {
            	    dbg.location(55,15);
            	    char_literal55=(Token)match(input,37,FOLLOW_37_in_power458); 
            	    char_literal55_tree = 
            	    (CommonTree)adaptor.create(char_literal55)
            	    ;
            	    adaptor.addChild(root_0, char_literal55_tree);

            	    dbg.location(55,19);
            	    pushFollow(FOLLOW_term_in_power460);
            	    term56=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term56.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(55, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "power");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "power"


    public static class negation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "negation"
    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:57:1: negation : ( '!' negation | power );
    public final IdealParser.negation_return negation() throws RecognitionException {
        IdealParser.negation_return retval = new IdealParser.negation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal57=null;
        IdealParser.negation_return negation58 =null;

        IdealParser.power_return power59 =null;


        CommonTree char_literal57_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "negation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(57, 0);

        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:57:10: ( '!' negation | power )
            int alt11=2;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            else if ( (LA11_0==ATOM||LA11_0==FLOAT||(LA11_0 >= HEX_NUMBER && LA11_0 <= UNICODE_STRING)||LA11_0==22||LA11_0==31) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:57:12: '!' negation
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(57,12);
                    char_literal57=(Token)match(input,18,FOLLOW_18_in_negation471); 
                    char_literal57_tree = 
                    (CommonTree)adaptor.create(char_literal57)
                    ;
                    adaptor.addChild(root_0, char_literal57_tree);

                    dbg.location(57,16);
                    pushFollow(FOLLOW_negation_in_negation473);
                    negation58=negation();

                    state._fsp--;

                    adaptor.addChild(root_0, negation58.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:57:27: power
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(57,27);
                    pushFollow(FOLLOW_power_in_negation477);
                    power59=power();

                    state._fsp--;

                    adaptor.addChild(root_0, power59.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(57, 32);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:59:1: unary : ( '+' !| '-' ^)* negation ;
    public final IdealParser.unary_return unary() throws RecognitionException {
        IdealParser.unary_return retval = new IdealParser.unary_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal60=null;
        Token char_literal61=null;
        IdealParser.negation_return negation62 =null;


        CommonTree char_literal60_tree=null;
        CommonTree char_literal61_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "unary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(59, 0);

        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:59:10: ( ( '+' !| '-' ^)* negation )
            dbg.enterAlt(1);

            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:59:12: ( '+' !| '-' ^)* negation
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(59,12);
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:59:12: ( '+' !| '-' ^)*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=3;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }
                else if ( (LA12_0==27) ) {
                    alt12=2;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:59:13: '+' !
            	    {
            	    dbg.location(59,16);
            	    char_literal60=(Token)match(input,25,FOLLOW_25_in_unary490); 

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:59:20: '-' ^
            	    {
            	    dbg.location(59,23);
            	    char_literal61=(Token)match(input,27,FOLLOW_27_in_unary495); 
            	    char_literal61_tree = 
            	    (CommonTree)adaptor.create(char_literal61)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal61_tree, root_0);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}

            dbg.location(59,27);
            pushFollow(FOLLOW_negation_in_unary500);
            negation62=negation();

            state._fsp--;

            adaptor.addChild(root_0, negation62.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(59, 35);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult"
    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:61:1: mult : unary ( ( '*' | '/' | ( '%' | 'mod' ) ) unary )* ;
    public final IdealParser.mult_return mult() throws RecognitionException {
        IdealParser.mult_return retval = new IdealParser.mult_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set64=null;
        IdealParser.unary_return unary63 =null;

        IdealParser.unary_return unary65 =null;


        CommonTree set64_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mult");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 0);

        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:61:6: ( unary ( ( '*' | '/' | ( '%' | 'mod' ) ) unary )* )
            dbg.enterAlt(1);

            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:61:8: unary ( ( '*' | '/' | ( '%' | 'mod' ) ) unary )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(61,8);
            pushFollow(FOLLOW_unary_in_mult509);
            unary63=unary();

            state._fsp--;

            adaptor.addChild(root_0, unary63.getTree());
            dbg.location(61,14);
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:61:14: ( ( '*' | '/' | ( '%' | 'mod' ) ) unary )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==20||LA13_0==24||LA13_0==30||LA13_0==38) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:61:15: ( '*' | '/' | ( '%' | 'mod' ) ) unary
            	    {
            	    dbg.location(61,15);
            	    set64=(Token)input.LT(1);

            	    if ( input.LA(1)==20||input.LA(1)==24||input.LA(1)==30||input.LA(1)==38 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set64)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(61,42);
            	    pushFollow(FOLLOW_unary_in_mult529);
            	    unary65=unary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary65.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(61, 49);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:63:1: add : mult ( ( '+' | '-' ) mult )* ;
    public final IdealParser.add_return add() throws RecognitionException {
        IdealParser.add_return retval = new IdealParser.add_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set67=null;
        IdealParser.mult_return mult66 =null;

        IdealParser.mult_return mult68 =null;


        CommonTree set67_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "add");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 0);

        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:63:5: ( mult ( ( '+' | '-' ) mult )* )
            dbg.enterAlt(1);

            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:63:7: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(63,7);
            pushFollow(FOLLOW_mult_in_add540);
            mult66=mult();

            state._fsp--;

            adaptor.addChild(root_0, mult66.getTree());
            dbg.location(63,12);
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:63:12: ( ( '+' | '-' ) mult )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==25||LA14_0==27) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:63:13: ( '+' | '-' ) mult
            	    {
            	    dbg.location(63,13);
            	    set67=(Token)input.LT(1);

            	    if ( input.LA(1)==25||input.LA(1)==27 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set67)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(63,25);
            	    pushFollow(FOLLOW_mult_in_add551);
            	    mult68=mult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult68.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(63, 31);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relation"
    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:65:1: relation : add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )* ;
    public final IdealParser.relation_return relation() throws RecognitionException {
        IdealParser.relation_return retval = new IdealParser.relation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set70=null;
        IdealParser.add_return add69 =null;

        IdealParser.add_return add71 =null;


        CommonTree set70_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "relation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 0);

        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:65:10: ( add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )* )
            dbg.enterAlt(1);

            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:65:12: add ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(65,12);
            pushFollow(FOLLOW_add_in_relation562);
            add69=add();

            state._fsp--;

            adaptor.addChild(root_0, add69.getTree());
            dbg.location(65,16);
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:65:16: ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                int LA15_0 = input.LA(1);

                if ( (LA15_0==19||(LA15_0 >= 32 && LA15_0 <= 36)) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:65:17: ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) add
            	    {
            	    dbg.location(65,17);
            	    set70=(Token)input.LT(1);

            	    if ( input.LA(1)==19||(input.LA(1) >= 32 && input.LA(1) <= 36) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set70)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(65,56);
            	    pushFollow(FOLLOW_add_in_relation589);
            	    add71=add();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add71.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(65, 61);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:67:1: expression : relation ( ( '&&' | '||' ) relation )* ;
    public final IdealParser.expression_return expression() throws RecognitionException {
        IdealParser.expression_return retval = new IdealParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set73=null;
        IdealParser.relation_return relation72 =null;

        IdealParser.relation_return relation74 =null;


        CommonTree set73_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(67, 0);

        try {
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:67:12: ( relation ( ( '&&' | '||' ) relation )* )
            dbg.enterAlt(1);

            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:67:14: relation ( ( '&&' | '||' ) relation )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(67,14);
            pushFollow(FOLLOW_relation_in_expression600);
            relation72=relation();

            state._fsp--;

            adaptor.addChild(root_0, relation72.getTree());
            dbg.location(67,23);
            // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:67:23: ( ( '&&' | '||' ) relation )*
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16, decisionCanBacktrack[16]);

                int LA16_0 = input.LA(1);

                if ( (LA16_0==21||LA16_0==39) ) {
                    alt16=1;
                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\jroberson\\IdeaProjects\\ideal\\src\\main\\antlr3\\ideal\\Ideal.g:67:24: ( '&&' | '||' ) relation
            	    {
            	    dbg.location(67,24);
            	    set73=(Token)input.LT(1);

            	    if ( input.LA(1)==21||input.LA(1)==39 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set73)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(67,38);
            	    pushFollow(FOLLOW_relation_in_expression611);
            	    relation74=relation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relation74.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);
            } finally {dbg.exitSubRule(16);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(67, 48);

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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA2_eotS =
        "\15\uffff";
    static final String DFA2_eofS =
        "\15\uffff";
    static final String DFA2_minS =
        "\1\4\1\uffff\1\34\1\26\1\34\1\uffff\1\4\2\uffff\1\26\1\4\1\34\1"+
        "\26";
    static final String DFA2_maxS =
        "\1\37\1\uffff\2\37\1\35\1\uffff\1\37\2\uffff\2\37\1\35\1\37";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\1\uffff\1\2\1\4\4\uffff";
    static final String DFA2_specialS =
        "\15\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\4\6\uffff\1\3\1\uffff\1\1\1\2\20\uffff\1\1",
            "",
            "\1\5\2\uffff\1\1",
            "\1\6\5\uffff\1\7\2\uffff\1\1",
            "\1\7\1\10",
            "",
            "\1\1\3\uffff\1\1\1\uffff\1\1\1\11\4\1\6\uffff\1\1\10\uffff"+
            "\1\1",
            "",
            "",
            "\1\1\1\13\2\uffff\1\12\4\uffff\1\1",
            "\1\1\3\uffff\1\1\1\uffff\1\1\1\14\4\1\6\uffff\1\1\10\uffff"+
            "\1\1",
            "\1\7\1\1",
            "\1\1\1\13\2\uffff\1\12\4\uffff\1\1"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "22:1: statement : ( function_invocation | assignment | type_definition | ATOM );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA3_eotS =
        "\12\uffff";
    static final String DFA3_eofS =
        "\12\uffff";
    static final String DFA3_minS =
        "\1\4\1\uffff\2\23\1\4\1\uffff\1\26\1\4\1\23\1\26";
    static final String DFA3_maxS =
        "\1\37\1\uffff\2\47\1\37\1\uffff\2\37\1\47\1\37";
    static final String DFA3_acceptS =
        "\1\uffff\1\2\3\uffff\1\1\4\uffff";
    static final String DFA3_specialS =
        "\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\3\uffff\1\1\1\uffff\1\1\1\2\4\1\2\uffff\1\1\3\uffff\1\1"+
            "\2\uffff\1\1\1\uffff\1\1\3\uffff\1\1",
            "",
            "\3\1\1\4\1\uffff\4\1\1\5\13\1",
            "\3\1\2\uffff\4\1\1\5\2\1\1\uffff\10\1",
            "\1\1\3\uffff\1\1\1\uffff\1\1\1\6\4\1\6\uffff\1\1\10\uffff\1"+
            "\1",
            "",
            "\1\1\1\10\2\uffff\1\7\4\uffff\1\1",
            "\1\1\3\uffff\1\1\1\uffff\1\1\1\11\4\1\6\uffff\1\1\10\uffff"+
            "\1\1",
            "\3\1\2\uffff\4\1\1\5\2\1\1\uffff\10\1",
            "\1\1\1\10\2\uffff\1\7\4\uffff\1\1"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 30:38: ( assignment ',' )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_program_in_eval64 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_eval66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_program77 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_program78 = new BitSet(new long[]{0x0000000080006812L});
    public static final BitSet FOLLOW_function_invocation_in_statement89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_definition_in_statement117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATOM_in_statement131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment166 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_assignment168 = new BitSet(new long[]{0x000000008A44FD10L});
    public static final BitSet FOLLOW_expression_in_assignment170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATOM_in_assignment185 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_assignment187 = new BitSet(new long[]{0x000000008A44FD10L});
    public static final BitSet FOLLOW_expression_in_assignment189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_signature_in_assignment204 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_assignment206 = new BitSet(new long[]{0x000000008A44FD10L});
    public static final BitSet FOLLOW_assignment_in_assignment210 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_assignment212 = new BitSet(new long[]{0x000000008A44FD10L});
    public static final BitSet FOLLOW_expression_in_assignment217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_ID_in_type_definition237 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_type_definition239 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_assignment_in_type_definition241 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_type_definition244 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_assignment_in_type_definition246 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ID_in_function_signature257 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_function_signature259 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_function_signature262 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_26_in_function_signature265 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_function_signature267 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_23_in_function_signature271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_function_invocation283 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_function_invocation285 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TYPE_ID_in_function_invocation289 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_function_invocation291 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_function_invocation295 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_function_invocation297 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_31_in_function_invocation301 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_function_invocation306 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_function_invocation308 = new BitSet(new long[]{0x000000008040FD10L});
    public static final BitSet FOLLOW_term_in_function_invocation311 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_26_in_function_invocation314 = new BitSet(new long[]{0x000000008040FD10L});
    public static final BitSet FOLLOW_term_in_function_invocation316 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_23_in_function_invocation320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNICODE_STRING_in_string345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_term393 = new BitSet(new long[]{0x000000008A44FD10L});
    public static final BitSet FOLLOW_expression_in_term395 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_term397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_term406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_term415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_invocation_in_term424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATOM_in_term442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_power455 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_power458 = new BitSet(new long[]{0x000000008040FD10L});
    public static final BitSet FOLLOW_term_in_power460 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_18_in_negation471 = new BitSet(new long[]{0x000000008044FD10L});
    public static final BitSet FOLLOW_negation_in_negation473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_power_in_negation477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_unary490 = new BitSet(new long[]{0x000000008A44FD10L});
    public static final BitSet FOLLOW_27_in_unary495 = new BitSet(new long[]{0x000000008A44FD10L});
    public static final BitSet FOLLOW_negation_in_unary500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult509 = new BitSet(new long[]{0x0000004041100002L});
    public static final BitSet FOLLOW_set_in_mult512 = new BitSet(new long[]{0x000000008A44FD10L});
    public static final BitSet FOLLOW_unary_in_mult529 = new BitSet(new long[]{0x0000004041100002L});
    public static final BitSet FOLLOW_mult_in_add540 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_set_in_add543 = new BitSet(new long[]{0x000000008A44FD10L});
    public static final BitSet FOLLOW_mult_in_add551 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_add_in_relation562 = new BitSet(new long[]{0x0000001F00080002L});
    public static final BitSet FOLLOW_set_in_relation565 = new BitSet(new long[]{0x000000008A44FD10L});
    public static final BitSet FOLLOW_add_in_relation589 = new BitSet(new long[]{0x0000001F00080002L});
    public static final BitSet FOLLOW_relation_in_expression600 = new BitSet(new long[]{0x0000008000200002L});
    public static final BitSet FOLLOW_set_in_expression603 = new BitSet(new long[]{0x000000008A44FD10L});
    public static final BitSet FOLLOW_relation_in_expression611 = new BitSet(new long[]{0x0000008000200002L});

}