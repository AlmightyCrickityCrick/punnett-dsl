// Generated from D:/HW University/Year2/PBL_4/antlr_dsl_genetics/src/antlr\GeneticsGrammar.g4 by ANTLR 4.9.2
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GeneticsGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, WS=11, LPAREN=12, RPAREN=13, COOMA=14, SEMICOLON=15, SYMBOLS=16, 
		DQ=17, COMMENT=18, LINE_COMMENT=19, BIGALPHA=20, SMALLALPHA=21, NUMBER=22, 
		STRING=23, TRUE=24, FALSE=25, AND=26, OR=27, CROSS_OPERATION=28, GENES=29, 
		PARENT=30, GENERATION=31, SET=32, DOM=33, PHENOTYPE=34, CODOMINANCE=35, 
		LOCATION=36, LABEL=37, GENOTYPE=38, FIND=39, CREATE=40, CROSS=41, PRED=42, 
		ESTIMATE=43, IF=44, THEN=45, ELSE=46, END=47, WHILE=48, DO=49, ALL=50, 
		PRINT=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "WS", "LPAREN", "RPAREN", "COOMA", "SEMICOLON", "SYMBOLS", "DQ", 
			"COMMENT", "LINE_COMMENT", "BIGALPHA", "SMALLALPHA", "NUMBER", "DIGIT", 
			"EXP", "ESC", "STRING", "TRUE", "FALSE", "AND", "OR", "CROSS_OPERATION", 
			"GENES", "PARENT", "GENERATION", "SET", "DOM", "PHENOTYPE", "CODOMINANCE", 
			"LOCATION", "LABEL", "GENOTYPE", "FIND", "CREATE", "CROSS", "PRED", "ESTIMATE", 
			"IF", "THEN", "ELSE", "END", "WHILE", "DO", "ALL", "PRINT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", "'<'", "'<='", "'>='", "'=='", "'!='", "'='", "':'", "'->'", 
			"'?'", null, "'('", "')'", "','", "';'", null, "'\"'", null, null, null, 
			null, null, null, "'true'", "'false'", "'and'", "'or'", "'x'", "'genes'", 
			"'parents'", "'generation'", "'set'", "'dom'", "'phenotype'", "'codominance'", 
			"'location'", "'label'", "'genotype'", "'find'", "'create'", "'cross'", 
			"'pred'", "'estimate'", "'if'", "'then'", "'else'", "'end'", "'while'", 
			"'do'", "'all'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "WS", 
			"LPAREN", "RPAREN", "COOMA", "SEMICOLON", "SYMBOLS", "DQ", "COMMENT", 
			"LINE_COMMENT", "BIGALPHA", "SMALLALPHA", "NUMBER", "STRING", "TRUE", 
			"FALSE", "AND", "OR", "CROSS_OPERATION", "GENES", "PARENT", "GENERATION", 
			"SET", "DOM", "PHENOTYPE", "CODOMINANCE", "LOCATION", "LABEL", "GENOTYPE", 
			"FIND", "CREATE", "CROSS", "PRED", "ESTIMATE", "IF", "THEN", "ELSE", 
			"END", "WHILE", "DO", "ALL", "PRINT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public GeneticsGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GeneticsGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0193\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\f\6\f\u008a\n\f\r\f\16\f\u008b\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00a0\n\23\f\23"+
		"\16\23\u00a3\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00ac\n\24"+
		"\f\24\16\24\u00af\13\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\5\27\u00b8"+
		"\n\27\3\27\3\27\3\27\6\27\u00bd\n\27\r\27\16\27\u00be\3\27\5\27\u00c2"+
		"\n\27\3\27\5\27\u00c5\n\27\3\27\3\27\3\27\3\27\5\27\u00cb\n\27\3\27\5"+
		"\27\u00ce\n\27\3\30\3\30\3\30\7\30\u00d3\n\30\f\30\16\30\u00d6\13\30\5"+
		"\30\u00d8\n\30\3\31\3\31\5\31\u00dc\n\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\7\33\u00e6\n\33\f\33\16\33\u00e9\13\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\u00a1"+
		"\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\2\65\31\67\329\33;\34"+
		"=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63k\64m\65"+
		"\3\2\n\5\2\13\f\17\17\"\"\5\2\60\61==AA\4\2\f\f\17\17\3\2\62;\3\2\63;"+
		"\4\2GGgg\4\2--//\6\2\f\f\17\17$$^^\2\u019e\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2"+
		"\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2"+
		"\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m"+
		"\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tv\3\2\2\2\13y\3\2\2\2\r|\3"+
		"\2\2\2\17\177\3\2\2\2\21\u0081\3\2\2\2\23\u0083\3\2\2\2\25\u0086\3\2\2"+
		"\2\27\u0089\3\2\2\2\31\u008f\3\2\2\2\33\u0091\3\2\2\2\35\u0093\3\2\2\2"+
		"\37\u0095\3\2\2\2!\u0097\3\2\2\2#\u0099\3\2\2\2%\u009b\3\2\2\2\'\u00a7"+
		"\3\2\2\2)\u00b2\3\2\2\2+\u00b4\3\2\2\2-\u00cd\3\2\2\2/\u00d7\3\2\2\2\61"+
		"\u00d9\3\2\2\2\63\u00df\3\2\2\2\65\u00e2\3\2\2\2\67\u00ec\3\2\2\29\u00f1"+
		"\3\2\2\2;\u00f7\3\2\2\2=\u00fb\3\2\2\2?\u00fe\3\2\2\2A\u0100\3\2\2\2C"+
		"\u0106\3\2\2\2E\u010e\3\2\2\2G\u0119\3\2\2\2I\u011d\3\2\2\2K\u0121\3\2"+
		"\2\2M\u012b\3\2\2\2O\u0137\3\2\2\2Q\u0140\3\2\2\2S\u0146\3\2\2\2U\u014f"+
		"\3\2\2\2W\u0154\3\2\2\2Y\u015b\3\2\2\2[\u0161\3\2\2\2]\u0166\3\2\2\2_"+
		"\u016f\3\2\2\2a\u0172\3\2\2\2c\u0177\3\2\2\2e\u017c\3\2\2\2g\u0180\3\2"+
		"\2\2i\u0186\3\2\2\2k\u0189\3\2\2\2m\u018d\3\2\2\2op\7@\2\2p\4\3\2\2\2"+
		"qr\7>\2\2r\6\3\2\2\2st\7>\2\2tu\7?\2\2u\b\3\2\2\2vw\7@\2\2wx\7?\2\2x\n"+
		"\3\2\2\2yz\7?\2\2z{\7?\2\2{\f\3\2\2\2|}\7#\2\2}~\7?\2\2~\16\3\2\2\2\177"+
		"\u0080\7?\2\2\u0080\20\3\2\2\2\u0081\u0082\7<\2\2\u0082\22\3\2\2\2\u0083"+
		"\u0084\7/\2\2\u0084\u0085\7@\2\2\u0085\24\3\2\2\2\u0086\u0087\7A\2\2\u0087"+
		"\26\3\2\2\2\u0088\u008a\t\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2"+
		"\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e"+
		"\b\f\2\2\u008e\30\3\2\2\2\u008f\u0090\7*\2\2\u0090\32\3\2\2\2\u0091\u0092"+
		"\7+\2\2\u0092\34\3\2\2\2\u0093\u0094\7.\2\2\u0094\36\3\2\2\2\u0095\u0096"+
		"\7=\2\2\u0096 \3\2\2\2\u0097\u0098\t\3\2\2\u0098\"\3\2\2\2\u0099\u009a"+
		"\7$\2\2\u009a$\3\2\2\2\u009b\u009c\7\61\2\2\u009c\u009d\7,\2\2\u009d\u00a1"+
		"\3\2\2\2\u009e\u00a0\13\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a4\u00a5\7,\2\2\u00a5\u00a6\7\61\2\2\u00a6&\3\2\2\2\u00a7"+
		"\u00a8\7\61\2\2\u00a8\u00a9\7\61\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00ac\n"+
		"\4\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\b\24"+
		"\3\2\u00b1(\3\2\2\2\u00b2\u00b3\4C\\\2\u00b3*\3\2\2\2\u00b4\u00b5\4c|"+
		"\2\u00b5,\3\2\2\2\u00b6\u00b8\7/\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\5/\30\2\u00ba\u00bc\7\60\2\2\u00bb"+
		"\u00bd\t\5\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00c2\5\61\31\2\u00c1"+
		"\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00ce\3\2\2\2\u00c3\u00c5\7/"+
		"\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\5/\30\2\u00c7\u00c8\5\61\31\2\u00c8\u00ce\3\2\2\2\u00c9\u00cb\7"+
		"/\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ce\5/\30\2\u00cd\u00b7\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd\u00ca\3\2"+
		"\2\2\u00ce.\3\2\2\2\u00cf\u00d8\7\62\2\2\u00d0\u00d4\t\6\2\2\u00d1\u00d3"+
		"\t\5\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00cf\3\2"+
		"\2\2\u00d7\u00d0\3\2\2\2\u00d8\60\3\2\2\2\u00d9\u00db\t\7\2\2\u00da\u00dc"+
		"\t\b\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\5/\30\2\u00de\62\3\2\2\2\u00df\u00e0\7^\2\2\u00e0\u00e1\13\2\2"+
		"\2\u00e1\64\3\2\2\2\u00e2\u00e7\7$\2\2\u00e3\u00e6\5\63\32\2\u00e4\u00e6"+
		"\n\t\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u00eb\7$\2\2\u00eb\66\3\2\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee"+
		"\7t\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7g\2\2\u00f08\3\2\2\2\u00f1\u00f2"+
		"\7h\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7u\2\2\u00f5"+
		"\u00f6\7g\2\2\u00f6:\3\2\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7p\2\2\u00f9"+
		"\u00fa\7f\2\2\u00fa<\3\2\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7t\2\2\u00fd"+
		">\3\2\2\2\u00fe\u00ff\7z\2\2\u00ff@\3\2\2\2\u0100\u0101\7i\2\2\u0101\u0102"+
		"\7g\2\2\u0102\u0103\7p\2\2\u0103\u0104\7g\2\2\u0104\u0105\7u\2\2\u0105"+
		"B\3\2\2\2\u0106\u0107\7r\2\2\u0107\u0108\7c\2\2\u0108\u0109\7t\2\2\u0109"+
		"\u010a\7g\2\2\u010a\u010b\7p\2\2\u010b\u010c\7v\2\2\u010c\u010d\7u\2\2"+
		"\u010dD\3\2\2\2\u010e\u010f\7i\2\2\u010f\u0110\7g\2\2\u0110\u0111\7p\2"+
		"\2\u0111\u0112\7g\2\2\u0112\u0113\7t\2\2\u0113\u0114\7c\2\2\u0114\u0115"+
		"\7v\2\2\u0115\u0116\7k\2\2\u0116\u0117\7q\2\2\u0117\u0118\7p\2\2\u0118"+
		"F\3\2\2\2\u0119\u011a\7u\2\2\u011a\u011b\7g\2\2\u011b\u011c\7v\2\2\u011c"+
		"H\3\2\2\2\u011d\u011e\7f\2\2\u011e\u011f\7q\2\2\u011f\u0120\7o\2\2\u0120"+
		"J\3\2\2\2\u0121\u0122\7r\2\2\u0122\u0123\7j\2\2\u0123\u0124\7g\2\2\u0124"+
		"\u0125\7p\2\2\u0125\u0126\7q\2\2\u0126\u0127\7v\2\2\u0127\u0128\7{\2\2"+
		"\u0128\u0129\7r\2\2\u0129\u012a\7g\2\2\u012aL\3\2\2\2\u012b\u012c\7e\2"+
		"\2\u012c\u012d\7q\2\2\u012d\u012e\7f\2\2\u012e\u012f\7q\2\2\u012f\u0130"+
		"\7o\2\2\u0130\u0131\7k\2\2\u0131\u0132\7p\2\2\u0132\u0133\7c\2\2\u0133"+
		"\u0134\7p\2\2\u0134\u0135\7e\2\2\u0135\u0136\7g\2\2\u0136N\3\2\2\2\u0137"+
		"\u0138\7n\2\2\u0138\u0139\7q\2\2\u0139\u013a\7e\2\2\u013a\u013b\7c\2\2"+
		"\u013b\u013c\7v\2\2\u013c\u013d\7k\2\2\u013d\u013e\7q\2\2\u013e\u013f"+
		"\7p\2\2\u013fP\3\2\2\2\u0140\u0141\7n\2\2\u0141\u0142\7c\2\2\u0142\u0143"+
		"\7d\2\2\u0143\u0144\7g\2\2\u0144\u0145\7n\2\2\u0145R\3\2\2\2\u0146\u0147"+
		"\7i\2\2\u0147\u0148\7g\2\2\u0148\u0149\7p\2\2\u0149\u014a\7q\2\2\u014a"+
		"\u014b\7v\2\2\u014b\u014c\7{\2\2\u014c\u014d\7r\2\2\u014d\u014e\7g\2\2"+
		"\u014eT\3\2\2\2\u014f\u0150\7h\2\2\u0150\u0151\7k\2\2\u0151\u0152\7p\2"+
		"\2\u0152\u0153\7f\2\2\u0153V\3\2\2\2\u0154\u0155\7e\2\2\u0155\u0156\7"+
		"t\2\2\u0156\u0157\7g\2\2\u0157\u0158\7c\2\2\u0158\u0159\7v\2\2\u0159\u015a"+
		"\7g\2\2\u015aX\3\2\2\2\u015b\u015c\7e\2\2\u015c\u015d\7t\2\2\u015d\u015e"+
		"\7q\2\2\u015e\u015f\7u\2\2\u015f\u0160\7u\2\2\u0160Z\3\2\2\2\u0161\u0162"+
		"\7r\2\2\u0162\u0163\7t\2\2\u0163\u0164\7g\2\2\u0164\u0165\7f\2\2\u0165"+
		"\\\3\2\2\2\u0166\u0167\7g\2\2\u0167\u0168\7u\2\2\u0168\u0169\7v\2\2\u0169"+
		"\u016a\7k\2\2\u016a\u016b\7o\2\2\u016b\u016c\7c\2\2\u016c\u016d\7v\2\2"+
		"\u016d\u016e\7g\2\2\u016e^\3\2\2\2\u016f\u0170\7k\2\2\u0170\u0171\7h\2"+
		"\2\u0171`\3\2\2\2\u0172\u0173\7v\2\2\u0173\u0174\7j\2\2\u0174\u0175\7"+
		"g\2\2\u0175\u0176\7p\2\2\u0176b\3\2\2\2\u0177\u0178\7g\2\2\u0178\u0179"+
		"\7n\2\2\u0179\u017a\7u\2\2\u017a\u017b\7g\2\2\u017bd\3\2\2\2\u017c\u017d"+
		"\7g\2\2\u017d\u017e\7p\2\2\u017e\u017f\7f\2\2\u017ff\3\2\2\2\u0180\u0181"+
		"\7y\2\2\u0181\u0182\7j\2\2\u0182\u0183\7k\2\2\u0183\u0184\7n\2\2\u0184"+
		"\u0185\7g\2\2\u0185h\3\2\2\2\u0186\u0187\7f\2\2\u0187\u0188\7q\2\2\u0188"+
		"j\3\2\2\2\u0189\u018a\7c\2\2\u018a\u018b\7n\2\2\u018b\u018c\7n\2\2\u018c"+
		"l\3\2\2\2\u018d\u018e\7r\2\2\u018e\u018f\7t\2\2\u018f\u0190\7k\2\2\u0190"+
		"\u0191\7p\2\2\u0191\u0192\7v\2\2\u0192n\3\2\2\2\21\2\u008b\u00a1\u00ad"+
		"\u00b7\u00be\u00c1\u00c4\u00ca\u00cd\u00d4\u00d7\u00db\u00e5\u00e7\4\b"+
		"\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}