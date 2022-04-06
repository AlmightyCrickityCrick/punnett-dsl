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
		LOCATION=36, LABEL=37, GENOTYPE=38, FIND=39, CROSS=40, PRED=41, ESTIMATE=42, 
		IF=43, THEN=44, ELSE=45, END=46, WHILE=47, DO=48, ALL=49, PRINT=50;
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
			"LOCATION", "LABEL", "GENOTYPE", "FIND", "CROSS", "PRED", "ESTIMATE", 
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
			"'location'", "'label'", "'genotype'", "'find'", "'cross'", "'pred'", 
			"'estimate'", "'if'", "'then'", "'else'", "'end'", "'while'", "'do'", 
			"'all'", "'print'"
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
			"FIND", "CROSS", "PRED", "ESTIMATE", "IF", "THEN", "ELSE", "END", "WHILE", 
			"DO", "ALL", "PRINT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u018a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\6\f\u0088"+
		"\n\f\r\f\16\f\u0089\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u009e\n\23\f\23\16\23\u00a1\13"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00aa\n\24\f\24\16\24\u00ad"+
		"\13\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\5\27\u00b6\n\27\3\27\3\27\3"+
		"\27\6\27\u00bb\n\27\r\27\16\27\u00bc\3\27\5\27\u00c0\n\27\3\27\5\27\u00c3"+
		"\n\27\3\27\3\27\3\27\3\27\5\27\u00c9\n\27\3\27\5\27\u00cc\n\27\3\30\3"+
		"\30\3\30\7\30\u00d1\n\30\f\30\16\30\u00d4\13\30\5\30\u00d6\n\30\3\31\3"+
		"\31\5\31\u00da\n\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u00e4"+
		"\n\33\f\33\16\33\u00e7\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,"+
		"\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\u009f\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61"+
		"\2\63\2\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-"+
		"_.a/c\60e\61g\62i\63k\64\3\2\n\5\2\13\f\17\17\"\"\5\2\60\61==AA\4\2\f"+
		"\f\17\17\3\2\62;\3\2\63;\4\2GGgg\4\2--//\6\2\f\f\17\17$$^^\2\u0195\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5o\3\2\2\2\7q\3\2\2\2\tt\3\2\2\2\13w\3"+
		"\2\2\2\rz\3\2\2\2\17}\3\2\2\2\21\177\3\2\2\2\23\u0081\3\2\2\2\25\u0084"+
		"\3\2\2\2\27\u0087\3\2\2\2\31\u008d\3\2\2\2\33\u008f\3\2\2\2\35\u0091\3"+
		"\2\2\2\37\u0093\3\2\2\2!\u0095\3\2\2\2#\u0097\3\2\2\2%\u0099\3\2\2\2\'"+
		"\u00a5\3\2\2\2)\u00b0\3\2\2\2+\u00b2\3\2\2\2-\u00cb\3\2\2\2/\u00d5\3\2"+
		"\2\2\61\u00d7\3\2\2\2\63\u00dd\3\2\2\2\65\u00e0\3\2\2\2\67\u00ea\3\2\2"+
		"\29\u00ef\3\2\2\2;\u00f5\3\2\2\2=\u00f9\3\2\2\2?\u00fc\3\2\2\2A\u00fe"+
		"\3\2\2\2C\u0104\3\2\2\2E\u010c\3\2\2\2G\u0117\3\2\2\2I\u011b\3\2\2\2K"+
		"\u011f\3\2\2\2M\u0129\3\2\2\2O\u0135\3\2\2\2Q\u013e\3\2\2\2S\u0144\3\2"+
		"\2\2U\u014d\3\2\2\2W\u0152\3\2\2\2Y\u0158\3\2\2\2[\u015d\3\2\2\2]\u0166"+
		"\3\2\2\2_\u0169\3\2\2\2a\u016e\3\2\2\2c\u0173\3\2\2\2e\u0177\3\2\2\2g"+
		"\u017d\3\2\2\2i\u0180\3\2\2\2k\u0184\3\2\2\2mn\7@\2\2n\4\3\2\2\2op\7>"+
		"\2\2p\6\3\2\2\2qr\7>\2\2rs\7?\2\2s\b\3\2\2\2tu\7@\2\2uv\7?\2\2v\n\3\2"+
		"\2\2wx\7?\2\2xy\7?\2\2y\f\3\2\2\2z{\7#\2\2{|\7?\2\2|\16\3\2\2\2}~\7?\2"+
		"\2~\20\3\2\2\2\177\u0080\7<\2\2\u0080\22\3\2\2\2\u0081\u0082\7/\2\2\u0082"+
		"\u0083\7@\2\2\u0083\24\3\2\2\2\u0084\u0085\7A\2\2\u0085\26\3\2\2\2\u0086"+
		"\u0088\t\2\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\f\2\2\u008c"+
		"\30\3\2\2\2\u008d\u008e\7*\2\2\u008e\32\3\2\2\2\u008f\u0090\7+\2\2\u0090"+
		"\34\3\2\2\2\u0091\u0092\7.\2\2\u0092\36\3\2\2\2\u0093\u0094\7=\2\2\u0094"+
		" \3\2\2\2\u0095\u0096\t\3\2\2\u0096\"\3\2\2\2\u0097\u0098\7$\2\2\u0098"+
		"$\3\2\2\2\u0099\u009a\7\61\2\2\u009a\u009b\7,\2\2\u009b\u009f\3\2\2\2"+
		"\u009c\u009e\13\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a3\7,\2\2\u00a3\u00a4\7\61\2\2\u00a4&\3\2\2\2\u00a5\u00a6\7\61\2\2"+
		"\u00a6\u00a7\7\61\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00aa\n\4\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\b\24\3\2\u00af(\3\2\2\2"+
		"\u00b0\u00b1\4C\\\2\u00b1*\3\2\2\2\u00b2\u00b3\4c|\2\u00b3,\3\2\2\2\u00b4"+
		"\u00b6\7/\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\5/\30\2\u00b8\u00ba\7\60\2\2\u00b9\u00bb\t\5\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00bf\3\2\2\2\u00be\u00c0\5\61\31\2\u00bf\u00be\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00cc\3\2\2\2\u00c1\u00c3\7/\2\2\u00c2\u00c1\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\5/\30\2\u00c5"+
		"\u00c6\5\61\31\2\u00c6\u00cc\3\2\2\2\u00c7\u00c9\7/\2\2\u00c8\u00c7\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\5/\30\2\u00cb"+
		"\u00b5\3\2\2\2\u00cb\u00c2\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc.\3\2\2\2"+
		"\u00cd\u00d6\7\62\2\2\u00ce\u00d2\t\6\2\2\u00cf\u00d1\t\5\2\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00cd\3\2\2\2\u00d5\u00ce\3\2"+
		"\2\2\u00d6\60\3\2\2\2\u00d7\u00d9\t\7\2\2\u00d8\u00da\t\b\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\5/\30\2\u00dc"+
		"\62\3\2\2\2\u00dd\u00de\7^\2\2\u00de\u00df\13\2\2\2\u00df\64\3\2\2\2\u00e0"+
		"\u00e5\7$\2\2\u00e1\u00e4\5\63\32\2\u00e2\u00e4\n\t\2\2\u00e3\u00e1\3"+
		"\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7$"+
		"\2\2\u00e9\66\3\2\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed"+
		"\7w\2\2\u00ed\u00ee\7g\2\2\u00ee8\3\2\2\2\u00ef\u00f0\7h\2\2\u00f0\u00f1"+
		"\7c\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7g\2\2\u00f4"+
		":\3\2\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7f\2\2\u00f8"+
		"<\3\2\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7t\2\2\u00fb>\3\2\2\2\u00fc\u00fd"+
		"\7z\2\2\u00fd@\3\2\2\2\u00fe\u00ff\7i\2\2\u00ff\u0100\7g\2\2\u0100\u0101"+
		"\7p\2\2\u0101\u0102\7g\2\2\u0102\u0103\7u\2\2\u0103B\3\2\2\2\u0104\u0105"+
		"\7r\2\2\u0105\u0106\7c\2\2\u0106\u0107\7t\2\2\u0107\u0108\7g\2\2\u0108"+
		"\u0109\7p\2\2\u0109\u010a\7v\2\2\u010a\u010b\7u\2\2\u010bD\3\2\2\2\u010c"+
		"\u010d\7i\2\2\u010d\u010e\7g\2\2\u010e\u010f\7p\2\2\u010f\u0110\7g\2\2"+
		"\u0110\u0111\7t\2\2\u0111\u0112\7c\2\2\u0112\u0113\7v\2\2\u0113\u0114"+
		"\7k\2\2\u0114\u0115\7q\2\2\u0115\u0116\7p\2\2\u0116F\3\2\2\2\u0117\u0118"+
		"\7u\2\2\u0118\u0119\7g\2\2\u0119\u011a\7v\2\2\u011aH\3\2\2\2\u011b\u011c"+
		"\7f\2\2\u011c\u011d\7q\2\2\u011d\u011e\7o\2\2\u011eJ\3\2\2\2\u011f\u0120"+
		"\7r\2\2\u0120\u0121\7j\2\2\u0121\u0122\7g\2\2\u0122\u0123\7p\2\2\u0123"+
		"\u0124\7q\2\2\u0124\u0125\7v\2\2\u0125\u0126\7{\2\2\u0126\u0127\7r\2\2"+
		"\u0127\u0128\7g\2\2\u0128L\3\2\2\2\u0129\u012a\7e\2\2\u012a\u012b\7q\2"+
		"\2\u012b\u012c\7f\2\2\u012c\u012d\7q\2\2\u012d\u012e\7o\2\2\u012e\u012f"+
		"\7k\2\2\u012f\u0130\7p\2\2\u0130\u0131\7c\2\2\u0131\u0132\7p\2\2\u0132"+
		"\u0133\7e\2\2\u0133\u0134\7g\2\2\u0134N\3\2\2\2\u0135\u0136\7n\2\2\u0136"+
		"\u0137\7q\2\2\u0137\u0138\7e\2\2\u0138\u0139\7c\2\2\u0139\u013a\7v\2\2"+
		"\u013a\u013b\7k\2\2\u013b\u013c\7q\2\2\u013c\u013d\7p\2\2\u013dP\3\2\2"+
		"\2\u013e\u013f\7n\2\2\u013f\u0140\7c\2\2\u0140\u0141\7d\2\2\u0141\u0142"+
		"\7g\2\2\u0142\u0143\7n\2\2\u0143R\3\2\2\2\u0144\u0145\7i\2\2\u0145\u0146"+
		"\7g\2\2\u0146\u0147\7p\2\2\u0147\u0148\7q\2\2\u0148\u0149\7v\2\2\u0149"+
		"\u014a\7{\2\2\u014a\u014b\7r\2\2\u014b\u014c\7g\2\2\u014cT\3\2\2\2\u014d"+
		"\u014e\7h\2\2\u014e\u014f\7k\2\2\u014f\u0150\7p\2\2\u0150\u0151\7f\2\2"+
		"\u0151V\3\2\2\2\u0152\u0153\7e\2\2\u0153\u0154\7t\2\2\u0154\u0155\7q\2"+
		"\2\u0155\u0156\7u\2\2\u0156\u0157\7u\2\2\u0157X\3\2\2\2\u0158\u0159\7"+
		"r\2\2\u0159\u015a\7t\2\2\u015a\u015b\7g\2\2\u015b\u015c\7f\2\2\u015cZ"+
		"\3\2\2\2\u015d\u015e\7g\2\2\u015e\u015f\7u\2\2\u015f\u0160\7v\2\2\u0160"+
		"\u0161\7k\2\2\u0161\u0162\7o\2\2\u0162\u0163\7c\2\2\u0163\u0164\7v\2\2"+
		"\u0164\u0165\7g\2\2\u0165\\\3\2\2\2\u0166\u0167\7k\2\2\u0167\u0168\7h"+
		"\2\2\u0168^\3\2\2\2\u0169\u016a\7v\2\2\u016a\u016b\7j\2\2\u016b\u016c"+
		"\7g\2\2\u016c\u016d\7p\2\2\u016d`\3\2\2\2\u016e\u016f\7g\2\2\u016f\u0170"+
		"\7n\2\2\u0170\u0171\7u\2\2\u0171\u0172\7g\2\2\u0172b\3\2\2\2\u0173\u0174"+
		"\7g\2\2\u0174\u0175\7p\2\2\u0175\u0176\7f\2\2\u0176d\3\2\2\2\u0177\u0178"+
		"\7y\2\2\u0178\u0179\7j\2\2\u0179\u017a\7k\2\2\u017a\u017b\7n\2\2\u017b"+
		"\u017c\7g\2\2\u017cf\3\2\2\2\u017d\u017e\7f\2\2\u017e\u017f\7q\2\2\u017f"+
		"h\3\2\2\2\u0180\u0181\7c\2\2\u0181\u0182\7n\2\2\u0182\u0183\7n\2\2\u0183"+
		"j\3\2\2\2\u0184\u0185\7r\2\2\u0185\u0186\7t\2\2\u0186\u0187\7k\2\2\u0187"+
		"\u0188\7p\2\2\u0188\u0189\7v\2\2\u0189l\3\2\2\2\21\2\u0089\u009f\u00ab"+
		"\u00b5\u00bc\u00bf\u00c2\u00c8\u00cb\u00d2\u00d5\u00d9\u00e3\u00e5\4\b"+
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