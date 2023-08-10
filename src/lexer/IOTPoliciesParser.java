package src.com.lexer;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;


public class IOTPoliciesParser extends Parser {
  protected static final DFA[] _decisionToDFA;
  
  static {
    RuntimeMetaData.checkVersion("4.6", "4.6");
  }
  public static final int T__0 = 1; public static final int DATETIME = 2; public static final int HOUR = 3; public static final int INT = 4; public static final int FLOAT = 5; public static final int STRING = 6; public static final int IF = 7; public static final int THEN = 8; public static final int AND = 9; public static final int OR = 10; public static final int AT = 11; public static final int THE = 12; public static final int TIME = 13; public static final int DATE = 14; public static final int AFTER = 15; public static final int BEFORE = 16; public static final int BETWEEN = 17;
  public static final int EXACTLY = 18;
  protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
  
  public static final int GREATERTHAN = 19;
  public static final int GREATERTHANOREQUAL = 20;
  public static final int LESSERTHAN = 21;
  public static final int LESSERTHANOREQUAL = 22;
  public static final int EQUALSTO = 23;
  public static final int TRUE = 24;
  public static final int FALSE = 25;
  public static final int ON = 26;
  public static final int OFF = 27;
  public static final int OPEN = 28;
  public static final int CLOSE = 29;
  public static final int LEFTPAREN = 30;
  public static final int RIGHTPAREN = 31;
  public static final int COLON = 32;
  public static final int SEMI = 33;
  public static final int COMMA = 34;
  public static final int DOT = 35;
  public static final String[] ruleNames = new String[] { 
      "policies", "policy", "condition", "action", "conditionExpression", "timedEvent", 
      "timedFunction", "singleTimePeriod", "composedTimePeriod", "simpleEvent", 
      "operators", "relationalOperator", "booleanOperator", "stateOperator", 
      "actionExpression", "actionEvent", "actionFunction", "parameters", "parameterList", 
      "deviceIdentifier", "device", "location", "identifier", "digitIdentifier", 
      "letterDigitIdentifier", "parameter", "integer", "decimal", "string", 
      "date", "hour" }; public static final int SLASH = 36; public static final int IDENTIFIER = 37; public static final int LINE_COMMENT = 38; public static final int COMMENT = 39; public static final int WS = 40; public static final int RULE_policies = 0; public static final int RULE_policy = 1; public static final int RULE_condition = 2; public static final int RULE_action = 3; public static final int RULE_conditionExpression = 4; public static final int RULE_timedEvent = 5; public static final int RULE_timedFunction = 6; public static final int RULE_singleTimePeriod = 7; public static final int RULE_composedTimePeriod = 8; public static final int RULE_simpleEvent = 9; public static final int RULE_operators = 10;
  public static final int RULE_relationalOperator = 11;
  public static final int RULE_booleanOperator = 12;
  private static final String[] _LITERAL_NAMES = new String[] { 
      null, "'is'", "'if'", "'then'", "'and'", 
      "'or'", "'at'", "'the'", "'time'", "'date'", "'after'", "'before'", "'between'", 
      "'exactly'", "'greater than'", "'greater than or equal'", "'lesser than'", 
      "'lesser than or equal'", "'equals to'", "'true'", "'false'", "'on'", 
      "'off'", "'open'", "'close'", "'('", "')'", "':'", "';'", "','", "'.'", 
      "'/'" }; public static final int RULE_stateOperator = 13; public static final int RULE_actionExpression = 14; public static final int RULE_actionEvent = 15; public static final int RULE_actionFunction = 16; public static final int RULE_parameters = 17; public static final int RULE_parameterList = 18; public static final int RULE_deviceIdentifier = 19; public static final int RULE_device = 20; public static final int RULE_location = 21; public static final int RULE_identifier = 22; public static final int RULE_digitIdentifier = 23; public static final int RULE_letterDigitIdentifier = 24; public static final int RULE_parameter = 25; public static final int RULE_integer = 26; public static final int RULE_decimal = 27; public static final int RULE_string = 28; public static final int RULE_date = 29;
  public static final int RULE_hour = 30;
  private static final String[] _SYMBOLIC_NAMES = new String[] { 
      null, null, "DATETIME", "HOUR", "INT", "FLOAT", "STRING", "IF", "THEN", 
      "AND", "OR", "AT", "THE", "TIME", "DATE", "AFTER", "BEFORE", "BETWEEN", 
      "EXACTLY", "GREATERTHAN", "GREATERTHANOREQUAL", "LESSERTHAN", "LESSERTHANOREQUAL", 
      "EQUALSTO", "TRUE", "FALSE", "ON", "OFF", "OPEN", "CLOSE", "LEFTPAREN", 
      "RIGHTPAREN", "COLON", "SEMI", "COMMA", "DOT", "SLASH", "IDENTIFIER", 
      "LINE_COMMENT", "COMMENT", "WS" };
  
  public static final Vocabulary VOCABULARY = (Vocabulary)new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  @Deprecated
  public static final String[] tokenNames = new String[_SYMBOLIC_NAMES.length]; public static final String _serializedATN = "\003а훑舆괭䐗껱趀ꫝ\003*Ë\004\002\t\002\004\003\t\003\004\004\t\004\004\005\t\005\004\006\t\006\004\007\t\007\004\b\t\b\004\t\t\t\004\n\t\n\004\013\t\013\004\f\t\f\004\r\t\r\004\016\t\016\004\017\t\017\004\020\t\020\004\021\t\021\004\022\t\022\004\023\t\023\004\024\t\024\004\025\t\025\004\026\t\026\004\027\t\027\004\030\t\030\004\031\t\031\004\032\t\032\004\033\t\033\004\034\t\034\004\035\t\035\004\036\t\036\004\037\t\037\004 \t \003\002\006\002B\n\002\r\002\016\002C\003\002\003\002\003\003\003\003\003\003\003\003\003\004\003\004\003\004\003\005\003\005\003\005\003\006\003\006\003\006\005\006U\n\006\003\006\003\006\003\006\003\006\003\006\003\006\007\006]\n\006\f\006\016\006`\013\006\003\007\003\007\003\007\003\b\003\b\003\b\003\b\005\bi\n\b\003\t\003\t\005\tm\n\t\003\n\003\n\003\n\003\n\003\n\003\n\003\n\003\n\005\nw\n\n\003\013\003\013\003\013\003\f\003\f\003\f\005\f\n\f\003\r\003\r\003\r\005\r\n\r\003\016\003\016\003\017\003\017\003\017\003\020\003\020\003\020\003\020\003\020\003\020\007\020\n\020\f\020\016\020\013\020\003\021\003\021\003\021\003\021\003\022\003\022\003\022\003\022\005\022\n\022\003\023\003\023\003\023\003\023\003\024\003\024\003\024\007\024§\n\024\f\024\016\024ª\013\024\003\025\003\025\003\025\003\025\003\026\003\026\003\027\003\027\003\030\003\030\005\030¶\n\030\003\031\003\031\003\032\003\032\003\033\003\033\003\033\005\033¿\n\033\003\034\003\034\003\035\003\035\003\036\003\036\003\037\003\037\003 \003 \003 \002\004\n\036!\002\004\006\b\n\f\016\020\022\024\026\030\032\034\036 \"$&(*,.02468:<>\002\007\003\002\017\020\004\002\021\022\024\024\003\002\025\031\003\002\032\033\003\002\034\037»\002A\003\002\002\002\004G\003\002\002\002\006K\003\002\002\002\bN\003\002\002\002\nT\003\002\002\002\fa\003\002\002\002\016h\003\002\002\002\020l\003\002\002\002\022v\003\002\002\002\024x\003\002\002\002\026~\003\002\002\002\030\003\002\002\002\032\003\002\002\002\034\003\002\002\002\036\003\002\002\002 \003\002\002\002\"\003\002\002\002$\003\002\002\002&£\003\002\002\002(«\003\002\002\002*¯\003\002\002\002,±\003\002\002\002.µ\003\002\002\0020·\003\002\002\0022¹\003\002\002\0024¾\003\002\002\0026À\003\002\002\0028Â\003\002\002\002:Ä\003\002\002\002<Æ\003\002\002\002>È\003\002\002\002@B\005\004\003\002A@\003\002\002\002BC\003\002\002\002CA\003\002\002\002CD\003\002\002\002DE\003\002\002\002EF\007\002\002\003F\003\003\002\002\002GH\005\006\004\002HI\005\b\005\002IJ\007#\002\002J\005\003\002\002\002KL\007\t\002\002LM\005\n\006\002M\007\003\002\002\002NO\007\n\002\002OP\005\036\020\002P\t\003\002\002\002QR\b\006\001\002RU\005\f\007\002SU\005\024\013\002TQ\003\002\002\002TS\003\002\002\002U^\003\002\002\002VW\f\004\002\002WX\007\013\002\002X]\005\n\006\005YZ\f\003\002\002Z[\007\f\002\002[]\005\n\006\004\\V\003\002\002\002\\Y\003\002\002\002]`\003\002\002\002^\\\003\002\002\002^_\003\002\002\002_\013\003\002\002\002`^\003\002\002\002ab\t\002\002\002bc\005\016\b\002c\r\003\002\002\002de\t\003\002\002ei\005\020\t\002fg\007\023\002\002gi\005\022\n\002hd\003\002\002\002hf\003\002\002\002i\017\003\002\002\002jm\005<\037\002km\005> \002lj\003\002\002\002lk\003\002\002\002m\021\003\002\002\002no\005<\037\002op\007\013\002\002pq\005<\037\002qw\003\002\002\002rs\005> \002st\007\013\002\002tu\005> \002uw\003\002\002\002vn\003\002\002\002vr\003\002\002\002w\023\003\002\002\002xy\005(\025\002yz\005\026\f\002z\025\003\002\002\002{\005\030\r\002|\005\032\016\002}\005\034\017\002~{\003\002\002\002~|\003\002\002\002~}\003\002\002\002\027\003\002\002\002\t\004\002\002\0056\034\002\0058\035\002\003\002\002\002\003\002\002\002\031\003\002\002\002\t\005\002\002\033\003\002\002\002\007\003\002\002\t\006\002\002\035\003\002\002\002\b\020\001\002\005 \021\002\003\002\002\002\f\003\002\002\007\013\002\002\005\036\020\004\003\002\002\002\003\002\002\002\003\002\002\002\003\002\002\002\037\003\002\002\002\003\002\002\002\005\"\022\002\007\016\002\002\005(\025\002!\003\002\002\002\005.\030\002\005.\030\002\005$\023\002\003\002\002\002\003\002\002\002\003\002\002\002#\003\002\002\002 \007 \002\002 ¡\005&\024\002¡¢\007!\002\002¢%\003\002\002\002£¨\0054\033\002¤¥\007$\002\002¥§\0054\033\002¦¤\003\002\002\002§ª\003\002\002\002¨¦\003\002\002\002¨©\003\002\002\002©'\003\002\002\002ª¨\003\002\002\002«¬\005*\026\002¬­\007\r\002\002­®\005,\027\002®)\003\002\002\002¯°\005.\030\002°+\003\002\002\002±²\005.\030\002²-\003\002\002\002³¶\0050\031\002´¶\0052\032\002µ³\003\002\002\002µ´\003\002\002\002¶/\003\002\002\002·¸\007\006\002\002¸1\003\002\002\002¹º\007'\002\002º3\003\002\002\002»¿\0056\034\002¼¿\0058\035\002½¿\005:\036\002¾»\003\002\002\002¾¼\003\002\002\002¾½\003\002\002\002¿5\003\002\002\002ÀÁ\007\006\002\002Á7\003\002\002\002ÂÃ\007\007\002\002Ã9\003\002\002\002ÄÅ\007\b\002\002Å;\003\002\002\002ÆÇ\007\004\002\002Ç=\003\002\002\002ÈÉ\007\005\002\002É?\003\002\002\002\020CT\\^hlv~¨µ¾"; static { int i;
    for (i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }
      
      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }  }

  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }
  
  public String getGrammarFileName() {
    return "IOTPolicies.g4";
  }
  public String[] getRuleNames() {
    return ruleNames;
  }
  public String getSerializedATN() {
    return "\003а훑舆괭䐗껱趀ꫝ\003*Ë\004\002\t\002\004\003\t\003\004\004\t\004\004\005\t\005\004\006\t\006\004\007\t\007\004\b\t\b\004\t\t\t\004\n\t\n\004\013\t\013\004\f\t\f\004\r\t\r\004\016\t\016\004\017\t\017\004\020\t\020\004\021\t\021\004\022\t\022\004\023\t\023\004\024\t\024\004\025\t\025\004\026\t\026\004\027\t\027\004\030\t\030\004\031\t\031\004\032\t\032\004\033\t\033\004\034\t\034\004\035\t\035\004\036\t\036\004\037\t\037\004 \t \003\002\006\002B\n\002\r\002\016\002C\003\002\003\002\003\003\003\003\003\003\003\003\003\004\003\004\003\004\003\005\003\005\003\005\003\006\003\006\003\006\005\006U\n\006\003\006\003\006\003\006\003\006\003\006\003\006\007\006]\n\006\f\006\016\006`\013\006\003\007\003\007\003\007\003\b\003\b\003\b\003\b\005\bi\n\b\003\t\003\t\005\tm\n\t\003\n\003\n\003\n\003\n\003\n\003\n\003\n\003\n\005\nw\n\n\003\013\003\013\003\013\003\f\003\f\003\f\005\f\n\f\003\r\003\r\003\r\005\r\n\r\003\016\003\016\003\017\003\017\003\017\003\020\003\020\003\020\003\020\003\020\003\020\007\020\n\020\f\020\016\020\013\020\003\021\003\021\003\021\003\021\003\022\003\022\003\022\003\022\005\022\n\022\003\023\003\023\003\023\003\023\003\024\003\024\003\024\007\024§\n\024\f\024\016\024ª\013\024\003\025\003\025\003\025\003\025\003\026\003\026\003\027\003\027\003\030\003\030\005\030¶\n\030\003\031\003\031\003\032\003\032\003\033\003\033\003\033\005\033¿\n\033\003\034\003\034\003\035\003\035\003\036\003\036\003\037\003\037\003 \003 \003 \002\004\n\036!\002\004\006\b\n\f\016\020\022\024\026\030\032\034\036 \"$&(*,.02468:<>\002\007\003\002\017\020\004\002\021\022\024\024\003\002\025\031\003\002\032\033\003\002\034\037»\002A\003\002\002\002\004G\003\002\002\002\006K\003\002\002\002\bN\003\002\002\002\nT\003\002\002\002\fa\003\002\002\002\016h\003\002\002\002\020l\003\002\002\002\022v\003\002\002\002\024x\003\002\002\002\026~\003\002\002\002\030\003\002\002\002\032\003\002\002\002\034\003\002\002\002\036\003\002\002\002 \003\002\002\002\"\003\002\002\002$\003\002\002\002&£\003\002\002\002(«\003\002\002\002*¯\003\002\002\002,±\003\002\002\002.µ\003\002\002\0020·\003\002\002\0022¹\003\002\002\0024¾\003\002\002\0026À\003\002\002\0028Â\003\002\002\002:Ä\003\002\002\002<Æ\003\002\002\002>È\003\002\002\002@B\005\004\003\002A@\003\002\002\002BC\003\002\002\002CA\003\002\002\002CD\003\002\002\002DE\003\002\002\002EF\007\002\002\003F\003\003\002\002\002GH\005\006\004\002HI\005\b\005\002IJ\007#\002\002J\005\003\002\002\002KL\007\t\002\002LM\005\n\006\002M\007\003\002\002\002NO\007\n\002\002OP\005\036\020\002P\t\003\002\002\002QR\b\006\001\002RU\005\f\007\002SU\005\024\013\002TQ\003\002\002\002TS\003\002\002\002U^\003\002\002\002VW\f\004\002\002WX\007\013\002\002X]\005\n\006\005YZ\f\003\002\002Z[\007\f\002\002[]\005\n\006\004\\V\003\002\002\002\\Y\003\002\002\002]`\003\002\002\002^\\\003\002\002\002^_\003\002\002\002_\013\003\002\002\002`^\003\002\002\002ab\t\002\002\002bc\005\016\b\002c\r\003\002\002\002de\t\003\002\002ei\005\020\t\002fg\007\023\002\002gi\005\022\n\002hd\003\002\002\002hf\003\002\002\002i\017\003\002\002\002jm\005<\037\002km\005> \002lj\003\002\002\002lk\003\002\002\002m\021\003\002\002\002no\005<\037\002op\007\013\002\002pq\005<\037\002qw\003\002\002\002rs\005> \002st\007\013\002\002tu\005> \002uw\003\002\002\002vn\003\002\002\002vr\003\002\002\002w\023\003\002\002\002xy\005(\025\002yz\005\026\f\002z\025\003\002\002\002{\005\030\r\002|\005\032\016\002}\005\034\017\002~{\003\002\002\002~|\003\002\002\002~}\003\002\002\002\027\003\002\002\002\t\004\002\002\0056\034\002\0058\035\002\003\002\002\002\003\002\002\002\031\003\002\002\002\t\005\002\002\033\003\002\002\002\007\003\002\002\t\006\002\002\035\003\002\002\002\b\020\001\002\005 \021\002\003\002\002\002\f\003\002\002\007\013\002\002\005\036\020\004\003\002\002\002\003\002\002\002\003\002\002\002\003\002\002\002\037\003\002\002\002\003\002\002\002\005\"\022\002\007\016\002\002\005(\025\002!\003\002\002\002\005.\030\002\005.\030\002\005$\023\002\003\002\002\002\003\002\002\002\003\002\002\002#\003\002\002\002 \007 \002\002 ¡\005&\024\002¡¢\007!\002\002¢%\003\002\002\002£¨\0054\033\002¤¥\007$\002\002¥§\0054\033\002¦¤\003\002\002\002§ª\003\002\002\002¨¦\003\002\002\002¨©\003\002\002\002©'\003\002\002\002ª¨\003\002\002\002«¬\005*\026\002¬­\007\r\002\002­®\005,\027\002®)\003\002\002\002¯°\005.\030\002°+\003\002\002\002±²\005.\030\002²-\003\002\002\002³¶\0050\031\002´¶\0052\032\002µ³\003\002\002\002µ´\003\002\002\002¶/\003\002\002\002·¸\007\006\002\002¸1\003\002\002\002¹º\007'\002\002º3\003\002\002\002»¿\0056\034\002¼¿\0058\035\002½¿\005:\036\002¾»\003\002\002\002¾¼\003\002\002\002¾½\003\002\002\002¿5\003\002\002\002ÀÁ\007\006\002\002Á7\003\002\002\002ÂÃ\007\007\002\002Ã9\003\002\002\002ÄÅ\007\b\002\002Å;\003\002\002\002ÆÇ\007\004\002\002Ç=\003\002\002\002ÈÉ\007\005\002\002É?\003\002\002\002\020CT\\^hlv~¨µ¾";
  }
  public ATN getATN() {
    return _ATN;
  }
  public IOTPoliciesParser(TokenStream input) {
    super(input);
    this._interp = (ATNSimulator)new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }
  public static class PoliciesContext extends ParserRuleContext { public TerminalNode EOF() {
      return getToken(-1, 0);
    } public List<IOTPoliciesParser.PolicyContext> policy() {
      return getRuleContexts(IOTPoliciesParser.PolicyContext.class);
    }
    public IOTPoliciesParser.PolicyContext policy(int i) {
      return (IOTPoliciesParser.PolicyContext)getRuleContext(IOTPoliciesParser.PolicyContext.class, i);
    }
    public PoliciesContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 0;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitPolicies(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    } }

  public final PoliciesContext policies() throws RecognitionException {
    PoliciesContext _localctx = new PoliciesContext(this._ctx, getState());
    enterRule(_localctx, 0, 0);

    try { enterOuterAlt(_localctx, 1);
      
      setState(63);
      this._errHandler.sync(this);
      int _la = this._input.LA(1);

      while (true) {
        setState(62);
        policy();

        setState(65);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if (_la != 7) {
          setState(67);
          match(-1);

          return _localctx;
        } 
      }  }
    catch (RecognitionException re) { _localctx.exception = re; this._errHandler.reportError(this, re); this._errHandler.recover(this, re); }
    finally { exitRule(); }
    } public static class PolicyContext extends ParserRuleContext { public IOTPoliciesParser.ConditionContext condition() { return (IOTPoliciesParser.ConditionContext)getRuleContext(IOTPoliciesParser.ConditionContext.class, 0); }
    
    public IOTPoliciesParser.ActionContext action() {
      return (IOTPoliciesParser.ActionContext)getRuleContext(IOTPoliciesParser.ActionContext.class, 0);
    }
    public PolicyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 1;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitPolicy(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    } }

  public final PolicyContext policy() throws RecognitionException {
    PolicyContext _localctx = new PolicyContext(this._ctx, getState());
    enterRule(_localctx, 2, 1);
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(69);
      condition();
      setState(70);
      action();
      setState(71);
      match(33);
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class ConditionContext extends ParserRuleContext {
    public IOTPoliciesParser.ConditionExpressionContext conditionExpression() {
      return (IOTPoliciesParser.ConditionExpressionContext)getRuleContext(IOTPoliciesParser.ConditionExpressionContext.class, 0);
    }
    public ConditionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 2;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitCondition(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final ConditionContext condition() throws RecognitionException {
    ConditionContext _localctx = new ConditionContext(this._ctx, getState());
    enterRule(_localctx, 4, 2);
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(73);
      match(7);
      setState(74);
      conditionExpression(0);
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class ActionContext extends ParserRuleContext {
    public IOTPoliciesParser.ActionExpressionContext actionExpression() {
      return (IOTPoliciesParser.ActionExpressionContext)getRuleContext(IOTPoliciesParser.ActionExpressionContext.class, 0);
    }
    public ActionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 3;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitAction(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final ActionContext action() throws RecognitionException {
    ActionContext _localctx = new ActionContext(this._ctx, getState());
    enterRule(_localctx, 6, 3);
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(76);
      match(8);
      setState(77);
      actionExpression(0);
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class ConditionExpressionContext extends ParserRuleContext {
    public IOTPoliciesParser.TimedEventContext timedEvent() {
      return (IOTPoliciesParser.TimedEventContext)getRuleContext(IOTPoliciesParser.TimedEventContext.class, 0);
    }
    public IOTPoliciesParser.SimpleEventContext simpleEvent() {
      return (IOTPoliciesParser.SimpleEventContext)getRuleContext(IOTPoliciesParser.SimpleEventContext.class, 0);
    }
    public List<ConditionExpressionContext> conditionExpression() {
      return getRuleContexts(ConditionExpressionContext.class);
    }
    public ConditionExpressionContext conditionExpression(int i) {
      return (ConditionExpressionContext)getRuleContext(ConditionExpressionContext.class, i);
    }
    public ConditionExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 4;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitConditionExpression(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final ConditionExpressionContext conditionExpression() throws RecognitionException {
    return conditionExpression(0);
  }
  
  private ConditionExpressionContext conditionExpression(int _p) throws RecognitionException {
    ParserRuleContext _parentctx = this._ctx;
    int _parentState = getState();
    ConditionExpressionContext _localctx = new ConditionExpressionContext(this._ctx, _parentState);
    ConditionExpressionContext _prevctx = _localctx;
    int _startState = 8;
    enterRecursionRule(_localctx, 8, 4, _p);
    
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(82);
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case 13:
        case 14:
          setState(80);
          timedEvent();
          break;
        case 4:
        case 37:
          setState(81);
          simpleEvent();
          break;
        
        default:
          throw new NoViableAltException(this);
      } 
      this._ctx.stop = this._input.LT(-1);
      setState(92);
      this._errHandler.sync(this);
      int _alt = ((ParserATNSimulator)getInterpreter()).adaptivePredict(this._input, 3, this._ctx);
      while (_alt != 2 && _alt != 0) {
        if (_alt == 1) {
          if (this._parseListeners != null) triggerExitRuleEvent(); 
          _prevctx = _localctx;
          
          setState(90);
          this._errHandler.sync(this);
          switch (((ParserATNSimulator)getInterpreter()).adaptivePredict(this._input, 2, this._ctx)) {
            
            case 1:
              _localctx = new ConditionExpressionContext(_parentctx, _parentState);
              pushNewRecursionContext(_localctx, _startState, 4);
              setState(84);
              if (!precpred((RuleContext)this._ctx, 2)) throw new FailedPredicateException(this, "precpred(_ctx, 2)"); 
              setState(85);
              match(9);
              setState(86);
              conditionExpression(3);
              break;

            case 2:
              _localctx = new ConditionExpressionContext(_parentctx, _parentState);
              pushNewRecursionContext(_localctx, _startState, 4);
              setState(87);
              if (!precpred((RuleContext)this._ctx, 1)) throw new FailedPredicateException(this, "precpred(_ctx, 1)"); 
              setState(88);
              match(10);
              setState(89);
              conditionExpression(2);
              break;
          } 
        } 
        setState(94);
        this._errHandler.sync(this);
        _alt = ((ParserATNSimulator)getInterpreter()).adaptivePredict(this._input, 3, this._ctx);
      }
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      unrollRecursionContexts(_parentctx);
    } 
    return _localctx;
  }
  
  public static class TimedEventContext extends ParserRuleContext {
    public IOTPoliciesParser.TimedFunctionContext timedFunction() {
      return (IOTPoliciesParser.TimedFunctionContext)getRuleContext(IOTPoliciesParser.TimedFunctionContext.class, 0);
    }
    public TimedEventContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 5;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitTimedEvent(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final TimedEventContext timedEvent() throws RecognitionException {
    TimedEventContext _localctx = new TimedEventContext(this._ctx, getState());
    enterRule(_localctx, 10, 5);
    
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(95);
      int _la = this._input.LA(1);
      if (_la != 13 && _la != 14) {
        this._errHandler.recoverInline(this);
      } else {
        
        if (this._input.LA(1) == -1) this.matchedEOF = true; 
        this._errHandler.reportMatch(this);
        consume();
      } 
      setState(96);
      timedFunction();
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class TimedFunctionContext extends ParserRuleContext {
    public IOTPoliciesParser.SingleTimePeriodContext singleTimePeriod() {
      return (IOTPoliciesParser.SingleTimePeriodContext)getRuleContext(IOTPoliciesParser.SingleTimePeriodContext.class, 0);
    }
    public IOTPoliciesParser.ComposedTimePeriodContext composedTimePeriod() {
      return (IOTPoliciesParser.ComposedTimePeriodContext)getRuleContext(IOTPoliciesParser.ComposedTimePeriodContext.class, 0);
    }
    public TimedFunctionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 6;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitTimedFunction(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final TimedFunctionContext timedFunction() throws RecognitionException {
    TimedFunctionContext _localctx = new TimedFunctionContext(this._ctx, getState());
    enterRule(_localctx, 12, 6);
    try {
      int _la;
      setState(102);
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case 15:
        case 16:
        case 18:
          enterOuterAlt(_localctx, 1);
          
          setState(98);
          _la = this._input.LA(1);
          if ((_la & 0xFFFFFFC0) != 0 || (1L << _la & 0x58000L) == 0L) {
            this._errHandler.recoverInline(this);
          } else {
            
            if (this._input.LA(1) == -1) this.matchedEOF = true; 
            this._errHandler.reportMatch(this);
            consume();
          } 
          setState(99);
          singleTimePeriod();
          break;
        
        case 17:
          enterOuterAlt(_localctx, 2);
          
          setState(100);
          match(17);
          setState(101);
          composedTimePeriod();
          break;
        
        default:
          throw new NoViableAltException(this);
      } 
    
    } catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class SingleTimePeriodContext extends ParserRuleContext {
    public IOTPoliciesParser.DateContext date() {
      return (IOTPoliciesParser.DateContext)getRuleContext(IOTPoliciesParser.DateContext.class, 0);
    }
    public IOTPoliciesParser.HourContext hour() {
      return (IOTPoliciesParser.HourContext)getRuleContext(IOTPoliciesParser.HourContext.class, 0);
    }
    public SingleTimePeriodContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 7;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitSingleTimePeriod(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final SingleTimePeriodContext singleTimePeriod() throws RecognitionException {
    SingleTimePeriodContext _localctx = new SingleTimePeriodContext(this._ctx, getState());
    enterRule(_localctx, 14, 7);
    try {
      setState(106);
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case 2:
          enterOuterAlt(_localctx, 1);
          
          setState(104);
          date();
          break;
        
        case 3:
          enterOuterAlt(_localctx, 2);
          
          setState(105);
          hour();
          break;
        
        default:
          throw new NoViableAltException(this);
      } 
    
    } catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class ComposedTimePeriodContext extends ParserRuleContext {
    public List<IOTPoliciesParser.DateContext> date() {
      return getRuleContexts(IOTPoliciesParser.DateContext.class);
    }
    public IOTPoliciesParser.DateContext date(int i) {
      return (IOTPoliciesParser.DateContext)getRuleContext(IOTPoliciesParser.DateContext.class, i);
    }
    public List<IOTPoliciesParser.HourContext> hour() {
      return getRuleContexts(IOTPoliciesParser.HourContext.class);
    }
    public IOTPoliciesParser.HourContext hour(int i) {
      return (IOTPoliciesParser.HourContext)getRuleContext(IOTPoliciesParser.HourContext.class, i);
    }
    public ComposedTimePeriodContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 8;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitComposedTimePeriod(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final ComposedTimePeriodContext composedTimePeriod() throws RecognitionException {
    ComposedTimePeriodContext _localctx = new ComposedTimePeriodContext(this._ctx, getState());
    enterRule(_localctx, 16, 8);
    try {
      setState(116);
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case 2:
          enterOuterAlt(_localctx, 1);
          
          setState(108);
          date();
          setState(109);
          match(9);
          setState(110);
          date();
          break;
        
        case 3:
          enterOuterAlt(_localctx, 2);
          
          setState(112);
          hour();
          setState(113);
          match(9);
          setState(114);
          hour();
          break;
        
        default:
          throw new NoViableAltException(this);
      } 
    
    } catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class SimpleEventContext extends ParserRuleContext {
    public IOTPoliciesParser.DeviceIdentifierContext deviceIdentifier() {
      return (IOTPoliciesParser.DeviceIdentifierContext)getRuleContext(IOTPoliciesParser.DeviceIdentifierContext.class, 0);
    }
    public IOTPoliciesParser.OperatorsContext operators() {
      return (IOTPoliciesParser.OperatorsContext)getRuleContext(IOTPoliciesParser.OperatorsContext.class, 0);
    }
    public SimpleEventContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 9;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitSimpleEvent(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final SimpleEventContext simpleEvent() throws RecognitionException {
    SimpleEventContext _localctx = new SimpleEventContext(this._ctx, getState());
    enterRule(_localctx, 18, 9);
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(118);
      deviceIdentifier();
      setState(119);
      operators();
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class OperatorsContext extends ParserRuleContext {
    public IOTPoliciesParser.RelationalOperatorContext relationalOperator() {
      return (IOTPoliciesParser.RelationalOperatorContext)getRuleContext(IOTPoliciesParser.RelationalOperatorContext.class, 0);
    }
    public IOTPoliciesParser.BooleanOperatorContext booleanOperator() {
      return (IOTPoliciesParser.BooleanOperatorContext)getRuleContext(IOTPoliciesParser.BooleanOperatorContext.class, 0);
    }
    public IOTPoliciesParser.StateOperatorContext stateOperator() {
      return (IOTPoliciesParser.StateOperatorContext)getRuleContext(IOTPoliciesParser.StateOperatorContext.class, 0);
    }
    public OperatorsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 10;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitOperators(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final OperatorsContext operators() throws RecognitionException {
    OperatorsContext _localctx = new OperatorsContext(this._ctx, getState());
    enterRule(_localctx, 20, 10);
    try {
      setState(124);
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case 19:
        case 20:
        case 21:
        case 22:
        case 23:
          enterOuterAlt(_localctx, 1);
          
          setState(121);
          relationalOperator();
          break;
        
        case 24:
        case 25:
          enterOuterAlt(_localctx, 2);
          
          setState(122);
          booleanOperator();
          break;
        
        case 1:
          enterOuterAlt(_localctx, 3);
          
          setState(123);
          stateOperator();
          break;
        
        default:
          throw new NoViableAltException(this);
      } 
    
    } catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class RelationalOperatorContext extends ParserRuleContext {
    public IOTPoliciesParser.IntegerContext integer() {
      return (IOTPoliciesParser.IntegerContext)getRuleContext(IOTPoliciesParser.IntegerContext.class, 0);
    }
    public IOTPoliciesParser.DecimalContext decimal() {
      return (IOTPoliciesParser.DecimalContext)getRuleContext(IOTPoliciesParser.DecimalContext.class, 0);
    }
    public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 11;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitRelationalOperator(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final RelationalOperatorContext relationalOperator() throws RecognitionException {
    RelationalOperatorContext _localctx = new RelationalOperatorContext(this._ctx, getState());
    enterRule(_localctx, 22, 11);
    
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(126);
      int _la = this._input.LA(1);
      if ((_la & 0xFFFFFFC0) != 0 || (1L << _la & 0xF80000L) == 0L) {
        this._errHandler.recoverInline(this);
      } else {
        
        if (this._input.LA(1) == -1) this.matchedEOF = true; 
        this._errHandler.reportMatch(this);
        consume();
      } 
      setState(129);
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        
        case 4:
          setState(127);
          integer();
          break;

        
        case 5:
          setState(128);
          decimal();
          break;
        
        default:
          throw new NoViableAltException(this);
      } 

    
    } catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class BooleanOperatorContext extends ParserRuleContext {
    public BooleanOperatorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 12;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitBooleanOperator(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final BooleanOperatorContext booleanOperator() throws RecognitionException {
    BooleanOperatorContext _localctx = new BooleanOperatorContext(this._ctx, getState());
    enterRule(_localctx, 24, 12);
    
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(131);
      int _la = this._input.LA(1);
      if (_la != 24 && _la != 25) {
        this._errHandler.recoverInline(this);
      } else {
        
        if (this._input.LA(1) == -1) this.matchedEOF = true; 
        this._errHandler.reportMatch(this);
        consume();
      }
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class StateOperatorContext extends ParserRuleContext {
    public StateOperatorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 13;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitStateOperator(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final StateOperatorContext stateOperator() throws RecognitionException {
    StateOperatorContext _localctx = new StateOperatorContext(this._ctx, getState());
    enterRule(_localctx, 26, 13);
    
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(133);
      match(1);
      setState(134);
      int _la = this._input.LA(1);
      if ((_la & 0xFFFFFFC0) != 0 || (1L << _la & 0x3C000000L) == 0L) {
        this._errHandler.recoverInline(this);
      } else {
        
        if (this._input.LA(1) == -1) this.matchedEOF = true; 
        this._errHandler.reportMatch(this);
        consume();
      }
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class ActionExpressionContext extends ParserRuleContext {
    public IOTPoliciesParser.ActionEventContext actionEvent() {
      return (IOTPoliciesParser.ActionEventContext)getRuleContext(IOTPoliciesParser.ActionEventContext.class, 0);
    }
    public List<ActionExpressionContext> actionExpression() {
      return getRuleContexts(ActionExpressionContext.class);
    }
    public ActionExpressionContext actionExpression(int i) {
      return (ActionExpressionContext)getRuleContext(ActionExpressionContext.class, i);
    }
    public ActionExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 14;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitActionExpression(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final ActionExpressionContext actionExpression() throws RecognitionException {
    return actionExpression(0);
  }
  
  private ActionExpressionContext actionExpression(int _p) throws RecognitionException {
    ParserRuleContext _parentctx = this._ctx;
    int _parentState = getState();
    ActionExpressionContext _localctx = new ActionExpressionContext(this._ctx, _parentState);
    ActionExpressionContext _prevctx = _localctx;
    int _startState = 28;
    enterRecursionRule(_localctx, 28, 14, _p);
    
    try {
      enterOuterAlt(_localctx, 1);

      
      setState(137);
      actionEvent();
      
      this._ctx.stop = this._input.LT(-1);
      setState(144);
      this._errHandler.sync(this);
      int _alt = ((ParserATNSimulator)getInterpreter()).adaptivePredict(this._input, 9, this._ctx);
      while (_alt != 2 && _alt != 0) {
        if (_alt == 1) {
          if (this._parseListeners != null) triggerExitRuleEvent(); 
          _prevctx = _localctx;

          
          _localctx = new ActionExpressionContext(_parentctx, _parentState);
          pushNewRecursionContext(_localctx, _startState, 14);
          setState(139);
          if (!precpred((RuleContext)this._ctx, 1)) throw new FailedPredicateException(this, "precpred(_ctx, 1)"); 
          setState(140);
          match(9);
          setState(141);
          actionExpression(2);
        } 

        
        setState(146);
        this._errHandler.sync(this);
        _alt = ((ParserATNSimulator)getInterpreter()).adaptivePredict(this._input, 9, this._ctx);
      }
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      unrollRecursionContexts(_parentctx);
    } 
    return _localctx;
  }
  
  public static class ActionEventContext extends ParserRuleContext {
    public IOTPoliciesParser.ActionFunctionContext actionFunction() {
      return (IOTPoliciesParser.ActionFunctionContext)getRuleContext(IOTPoliciesParser.ActionFunctionContext.class, 0);
    }
    public IOTPoliciesParser.DeviceIdentifierContext deviceIdentifier() {
      return (IOTPoliciesParser.DeviceIdentifierContext)getRuleContext(IOTPoliciesParser.DeviceIdentifierContext.class, 0);
    }
    public ActionEventContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 15;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitActionEvent(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final ActionEventContext actionEvent() throws RecognitionException {
    ActionEventContext _localctx = new ActionEventContext(this._ctx, getState());
    enterRule(_localctx, 30, 15);
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(147);
      actionFunction();
      setState(148);
      match(12);
      setState(149);
      deviceIdentifier();
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class ActionFunctionContext extends ParserRuleContext {
    public IOTPoliciesParser.IdentifierContext identifier() {
      return (IOTPoliciesParser.IdentifierContext)getRuleContext(IOTPoliciesParser.IdentifierContext.class, 0);
    }
    public IOTPoliciesParser.ParametersContext parameters() {
      return (IOTPoliciesParser.ParametersContext)getRuleContext(IOTPoliciesParser.ParametersContext.class, 0);
    }
    public ActionFunctionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 16;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitActionFunction(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final ActionFunctionContext actionFunction() throws RecognitionException {
    ActionFunctionContext _localctx = new ActionFunctionContext(this._ctx, getState());
    enterRule(_localctx, 32, 16);
    try {
      setState(155);
      this._errHandler.sync(this);
      switch (((ParserATNSimulator)getInterpreter()).adaptivePredict(this._input, 10, this._ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          
          setState(151);
          identifier();
          break;
        
        case 2:
          enterOuterAlt(_localctx, 2);
          
          setState(152);
          identifier();
          setState(153);
          parameters();
          break;
      } 

    
    } catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class ParametersContext extends ParserRuleContext {
    public IOTPoliciesParser.ParameterListContext parameterList() {
      return (IOTPoliciesParser.ParameterListContext)getRuleContext(IOTPoliciesParser.ParameterListContext.class, 0);
    }
    public ParametersContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 17;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitParameters(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final ParametersContext parameters() throws RecognitionException {
    ParametersContext _localctx = new ParametersContext(this._ctx, getState());
    enterRule(_localctx, 34, 17);
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(157);
      match(30);
      setState(158);
      parameterList();
      setState(159);
      match(31);
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class ParameterListContext extends ParserRuleContext {
    public List<IOTPoliciesParser.ParameterContext> parameter() {
      return getRuleContexts(IOTPoliciesParser.ParameterContext.class);
    }
    public IOTPoliciesParser.ParameterContext parameter(int i) {
      return (IOTPoliciesParser.ParameterContext)getRuleContext(IOTPoliciesParser.ParameterContext.class, i);
    }
    public ParameterListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 18;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitParameterList(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final ParameterListContext parameterList() throws RecognitionException {
    ParameterListContext _localctx = new ParameterListContext(this._ctx, getState());
    enterRule(_localctx, 36, 18);
    
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(161);
      parameter();
      setState(166);
      this._errHandler.sync(this);
      int _la = this._input.LA(1);
      while (_la == 34)
      {
        
        setState(162);
        match(34);
        setState(163);
        parameter();

        
        setState(168);
        this._errHandler.sync(this);
        _la = this._input.LA(1);
      }
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class DeviceIdentifierContext extends ParserRuleContext {
    public IOTPoliciesParser.DeviceContext device() {
      return (IOTPoliciesParser.DeviceContext)getRuleContext(IOTPoliciesParser.DeviceContext.class, 0);
    }
    public IOTPoliciesParser.LocationContext location() {
      return (IOTPoliciesParser.LocationContext)getRuleContext(IOTPoliciesParser.LocationContext.class, 0);
    }
    public DeviceIdentifierContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 19;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitDeviceIdentifier(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final DeviceIdentifierContext deviceIdentifier() throws RecognitionException {
    DeviceIdentifierContext _localctx = new DeviceIdentifierContext(this._ctx, getState());
    enterRule(_localctx, 38, 19);
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(169);
      device();
      setState(170);
      match(11);
      setState(171);
      location();
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class DeviceContext extends ParserRuleContext {
    public IOTPoliciesParser.IdentifierContext identifier() {
      return (IOTPoliciesParser.IdentifierContext)getRuleContext(IOTPoliciesParser.IdentifierContext.class, 0);
    }
    public DeviceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 20;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitDevice(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final DeviceContext device() throws RecognitionException {
    DeviceContext _localctx = new DeviceContext(this._ctx, getState());
    enterRule(_localctx, 40, 20);
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(173);
      identifier();
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class LocationContext extends ParserRuleContext {
    public IOTPoliciesParser.IdentifierContext identifier() {
      return (IOTPoliciesParser.IdentifierContext)getRuleContext(IOTPoliciesParser.IdentifierContext.class, 0);
    }
    public LocationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 21;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitLocation(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final LocationContext location() throws RecognitionException {
    LocationContext _localctx = new LocationContext(this._ctx, getState());
    enterRule(_localctx, 42, 21);
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(175);
      identifier();
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class IdentifierContext extends ParserRuleContext {
    public IOTPoliciesParser.DigitIdentifierContext digitIdentifier() {
      return (IOTPoliciesParser.DigitIdentifierContext)getRuleContext(IOTPoliciesParser.DigitIdentifierContext.class, 0);
    }
    public IOTPoliciesParser.LetterDigitIdentifierContext letterDigitIdentifier() {
      return (IOTPoliciesParser.LetterDigitIdentifierContext)getRuleContext(IOTPoliciesParser.LetterDigitIdentifierContext.class, 0);
    }
    public IdentifierContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 22;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitIdentifier(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final IdentifierContext identifier() throws RecognitionException {
    IdentifierContext _localctx = new IdentifierContext(this._ctx, getState());
    enterRule(_localctx, 44, 22);
    try {
      setState(179);
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case 4:
          enterOuterAlt(_localctx, 1);
          
          setState(177);
          digitIdentifier();
          break;
        
        case 37:
          enterOuterAlt(_localctx, 2);
          
          setState(178);
          letterDigitIdentifier();
          break;
        
        default:
          throw new NoViableAltException(this);
      } 
    
    } catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class DigitIdentifierContext extends ParserRuleContext { public TerminalNode INT() {
      return getToken(4, 0);
    } public DigitIdentifierContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 23;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitDigitIdentifier(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    } }

  
  public final DigitIdentifierContext digitIdentifier() throws RecognitionException {
    DigitIdentifierContext _localctx = new DigitIdentifierContext(this._ctx, getState());
    enterRule(_localctx, 46, 23);
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(181);
      match(4);
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class LetterDigitIdentifierContext extends ParserRuleContext { public TerminalNode IDENTIFIER() {
      return getToken(37, 0);
    } public LetterDigitIdentifierContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 24;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitLetterDigitIdentifier(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    } }

  
  public final LetterDigitIdentifierContext letterDigitIdentifier() throws RecognitionException {
    LetterDigitIdentifierContext _localctx = new LetterDigitIdentifierContext(this._ctx, getState());
    enterRule(_localctx, 48, 24);
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(183);
      match(37);
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class ParameterContext extends ParserRuleContext {
    public IOTPoliciesParser.IntegerContext integer() {
      return (IOTPoliciesParser.IntegerContext)getRuleContext(IOTPoliciesParser.IntegerContext.class, 0);
    }
    public IOTPoliciesParser.DecimalContext decimal() {
      return (IOTPoliciesParser.DecimalContext)getRuleContext(IOTPoliciesParser.DecimalContext.class, 0);
    }
    public IOTPoliciesParser.StringContext string() {
      return (IOTPoliciesParser.StringContext)getRuleContext(IOTPoliciesParser.StringContext.class, 0);
    }
    public ParameterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 25;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitParameter(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    }
  }
  
  public final ParameterContext parameter() throws RecognitionException {
    ParameterContext _localctx = new ParameterContext(this._ctx, getState());
    enterRule(_localctx, 50, 25);
    try {
      setState(188);
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case 4:
          enterOuterAlt(_localctx, 1);
          
          setState(185);
          integer();
          break;
        
        case 5:
          enterOuterAlt(_localctx, 2);
          
          setState(186);
          decimal();
          break;
        
        case 6:
          enterOuterAlt(_localctx, 3);
          
          setState(187);
          string();
          break;
        
        default:
          throw new NoViableAltException(this);
      } 
    
    } catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class IntegerContext extends ParserRuleContext { public TerminalNode INT() {
      return getToken(4, 0);
    } public IntegerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 26;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitInteger(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    } }

  
  public final IntegerContext integer() throws RecognitionException {
    IntegerContext _localctx = new IntegerContext(this._ctx, getState());
    enterRule(_localctx, 52, 26);
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(190);
      match(4);
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class DecimalContext extends ParserRuleContext { public TerminalNode FLOAT() {
      return getToken(5, 0);
    } public DecimalContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 27;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitDecimal(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    } }

  
  public final DecimalContext decimal() throws RecognitionException {
    DecimalContext _localctx = new DecimalContext(this._ctx, getState());
    enterRule(_localctx, 54, 27);
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(192);
      match(5);
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class StringContext extends ParserRuleContext { public TerminalNode STRING() {
      return getToken(6, 0);
    } public StringContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 28;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitString(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    } }

  
  public final StringContext string() throws RecognitionException {
    StringContext _localctx = new StringContext(this._ctx, getState());
    enterRule(_localctx, 56, 28);
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(194);
      match(6);
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class DateContext extends ParserRuleContext { public TerminalNode DATETIME() {
      return getToken(2, 0);
    } public DateContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 29;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitDate(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    } }

  
  public final DateContext date() throws RecognitionException {
    DateContext _localctx = new DateContext(this._ctx, getState());
    enterRule(_localctx, 58, 29);
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(196);
      match(2);
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public static class HourContext extends ParserRuleContext { public TerminalNode HOUR() {
      return getToken(3, 0);
    } public HourContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    } public int getRuleIndex() {
      return 30;
    }
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof IOTPoliciesVisitor) return ((IOTPoliciesVisitor)visitor).visitHour(this); 
      return (T)visitor.visitChildren((RuleNode)this);
    } }

  
  public final HourContext hour() throws RecognitionException {
    HourContext _localctx = new HourContext(this._ctx, getState());
    enterRule(_localctx, 60, 30);
    try {
      enterOuterAlt(_localctx, 1);
      
      setState(198);
      match(3);
    
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      this._errHandler.reportError(this, re);
      this._errHandler.recover(this, re);
    } finally {
      
      exitRule();
    } 
    return _localctx;
  }
  
  public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
    switch (ruleIndex) {
      case 4:
        return conditionExpression_sempred((ConditionExpressionContext)_localctx, predIndex);
      case 14:
        return actionExpression_sempred((ActionExpressionContext)_localctx, predIndex);
    } 
    return true;
  }
  private boolean conditionExpression_sempred(ConditionExpressionContext _localctx, int predIndex) {
    switch (predIndex) {
      case 0:
        return precpred((RuleContext)this._ctx, 2);
      case 1:
        return precpred((RuleContext)this._ctx, 1);
    } 
    return true;
  }
  private boolean actionExpression_sempred(ActionExpressionContext _localctx, int predIndex) {
    switch (predIndex) {
      case 2:
        return precpred((RuleContext)this._ctx, 1);
    } 
    return true;
  }

  public static final ATN _ATN = (new ATNDeserializer()).deserialize("\003а훑舆괭䐗껱趀ꫝ\003*Ë\004\002\t\002\004\003\t\003\004\004\t\004\004\005\t\005\004\006\t\006\004\007\t\007\004\b\t\b\004\t\t\t\004\n\t\n\004\013\t\013\004\f\t\f\004\r\t\r\004\016\t\016\004\017\t\017\004\020\t\020\004\021\t\021\004\022\t\022\004\023\t\023\004\024\t\024\004\025\t\025\004\026\t\026\004\027\t\027\004\030\t\030\004\031\t\031\004\032\t\032\004\033\t\033\004\034\t\034\004\035\t\035\004\036\t\036\004\037\t\037\004 \t \003\002\006\002B\n\002\r\002\016\002C\003\002\003\002\003\003\003\003\003\003\003\003\003\004\003\004\003\004\003\005\003\005\003\005\003\006\003\006\003\006\005\006U\n\006\003\006\003\006\003\006\003\006\003\006\003\006\007\006]\n\006\f\006\016\006`\013\006\003\007\003\007\003\007\003\b\003\b\003\b\003\b\005\bi\n\b\003\t\003\t\005\tm\n\t\003\n\003\n\003\n\003\n\003\n\003\n\003\n\003\n\005\nw\n\n\003\013\003\013\003\013\003\f\003\f\003\f\005\f\n\f\003\r\003\r\003\r\005\r\n\r\003\016\003\016\003\017\003\017\003\017\003\020\003\020\003\020\003\020\003\020\003\020\007\020\n\020\f\020\016\020\013\020\003\021\003\021\003\021\003\021\003\022\003\022\003\022\003\022\005\022\n\022\003\023\003\023\003\023\003\023\003\024\003\024\003\024\007\024§\n\024\f\024\016\024ª\013\024\003\025\003\025\003\025\003\025\003\026\003\026\003\027\003\027\003\030\003\030\005\030¶\n\030\003\031\003\031\003\032\003\032\003\033\003\033\003\033\005\033¿\n\033\003\034\003\034\003\035\003\035\003\036\003\036\003\037\003\037\003 \003 \003 \002\004\n\036!\002\004\006\b\n\f\016\020\022\024\026\030\032\034\036 \"$&(*,.02468:<>\002\007\003\002\017\020\004\002\021\022\024\024\003\002\025\031\003\002\032\033\003\002\034\037»\002A\003\002\002\002\004G\003\002\002\002\006K\003\002\002\002\bN\003\002\002\002\nT\003\002\002\002\fa\003\002\002\002\016h\003\002\002\002\020l\003\002\002\002\022v\003\002\002\002\024x\003\002\002\002\026~\003\002\002\002\030\003\002\002\002\032\003\002\002\002\034\003\002\002\002\036\003\002\002\002 \003\002\002\002\"\003\002\002\002$\003\002\002\002&£\003\002\002\002(«\003\002\002\002*¯\003\002\002\002,±\003\002\002\002.µ\003\002\002\0020·\003\002\002\0022¹\003\002\002\0024¾\003\002\002\0026À\003\002\002\0028Â\003\002\002\002:Ä\003\002\002\002<Æ\003\002\002\002>È\003\002\002\002@B\005\004\003\002A@\003\002\002\002BC\003\002\002\002CA\003\002\002\002CD\003\002\002\002DE\003\002\002\002EF\007\002\002\003F\003\003\002\002\002GH\005\006\004\002HI\005\b\005\002IJ\007#\002\002J\005\003\002\002\002KL\007\t\002\002LM\005\n\006\002M\007\003\002\002\002NO\007\n\002\002OP\005\036\020\002P\t\003\002\002\002QR\b\006\001\002RU\005\f\007\002SU\005\024\013\002TQ\003\002\002\002TS\003\002\002\002U^\003\002\002\002VW\f\004\002\002WX\007\013\002\002X]\005\n\006\005YZ\f\003\002\002Z[\007\f\002\002[]\005\n\006\004\\V\003\002\002\002\\Y\003\002\002\002]`\003\002\002\002^\\\003\002\002\002^_\003\002\002\002_\013\003\002\002\002`^\003\002\002\002ab\t\002\002\002bc\005\016\b\002c\r\003\002\002\002de\t\003\002\002ei\005\020\t\002fg\007\023\002\002gi\005\022\n\002hd\003\002\002\002hf\003\002\002\002i\017\003\002\002\002jm\005<\037\002km\005> \002lj\003\002\002\002lk\003\002\002\002m\021\003\002\002\002no\005<\037\002op\007\013\002\002pq\005<\037\002qw\003\002\002\002rs\005> \002st\007\013\002\002tu\005> \002uw\003\002\002\002vn\003\002\002\002vr\003\002\002\002w\023\003\002\002\002xy\005(\025\002yz\005\026\f\002z\025\003\002\002\002{\005\030\r\002|\005\032\016\002}\005\034\017\002~{\003\002\002\002~|\003\002\002\002~}\003\002\002\002\027\003\002\002\002\t\004\002\002\0056\034\002\0058\035\002\003\002\002\002\003\002\002\002\031\003\002\002\002\t\005\002\002\033\003\002\002\002\007\003\002\002\t\006\002\002\035\003\002\002\002\b\020\001\002\005 \021\002\003\002\002\002\f\003\002\002\007\013\002\002\005\036\020\004\003\002\002\002\003\002\002\002\003\002\002\002\003\002\002\002\037\003\002\002\002\003\002\002\002\005\"\022\002\007\016\002\002\005(\025\002!\003\002\002\002\005.\030\002\005.\030\002\005$\023\002\003\002\002\002\003\002\002\002\003\002\002\002#\003\002\002\002 \007 \002\002 ¡\005&\024\002¡¢\007!\002\002¢%\003\002\002\002£¨\0054\033\002¤¥\007$\002\002¥§\0054\033\002¦¤\003\002\002\002§ª\003\002\002\002¨¦\003\002\002\002¨©\003\002\002\002©'\003\002\002\002ª¨\003\002\002\002«¬\005*\026\002¬­\007\r\002\002­®\005,\027\002®)\003\002\002\002¯°\005.\030\002°+\003\002\002\002±²\005.\030\002²-\003\002\002\002³¶\0050\031\002´¶\0052\032\002µ³\003\002\002\002µ´\003\002\002\002¶/\003\002\002\002·¸\007\006\002\002¸1\003\002\002\002¹º\007'\002\002º3\003\002\002\002»¿\0056\034\002¼¿\0058\035\002½¿\005:\036\002¾»\003\002\002\002¾¼\003\002\002\002¾½\003\002\002\002¿5\003\002\002\002ÀÁ\007\006\002\002Á7\003\002\002\002ÂÃ\007\007\002\002Ã9\003\002\002\002ÄÅ\007\b\002\002Å;\003\002\002\002ÆÇ\007\004\002\002Ç=\003\002\002\002ÈÉ\007\005\002\002É?\003\002\002\002\020CT\\^hlv~¨µ¾".toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (i = 0; i < _ATN.getNumberOfDecisions(); i++)
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i); 
  }
}