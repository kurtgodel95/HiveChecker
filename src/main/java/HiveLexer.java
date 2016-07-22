// $ANTLR 3.5.2 Hive.g 2016-06-19 22:42:01
package org.apache.hadoop.hive.ql.parse;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HiveLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AMPERSAND=4;
	public static final int BITWISEOR=5;
	public static final int BITWISEXOR=6;
	public static final int BigintLiteral=7;
	public static final int COLON=8;
	public static final int COMMA=9;
	public static final int COMMENT=10;
	public static final int CharSetLiteral=11;
	public static final int CharSetName=12;
	public static final int DIV=13;
	public static final int DIVIDE=14;
	public static final int DOLLAR=15;
	public static final int DOT=16;
	public static final int Digit=17;
	public static final int EQUAL=18;
	public static final int Exponent=19;
	public static final int GREATERTHAN=20;
	public static final int GREATERTHANOREQUALTO=21;
	public static final int HexDigit=22;
	public static final int Identifier=23;
	public static final int KW_ADD=24;
	public static final int KW_AFTER=25;
	public static final int KW_ALL=26;
	public static final int KW_ALTER=27;
	public static final int KW_ANALYZE=28;
	public static final int KW_AND=29;
	public static final int KW_ARCHIVE=30;
	public static final int KW_ARRAY=31;
	public static final int KW_AS=32;
	public static final int KW_ASC=33;
	public static final int KW_BEFORE=34;
	public static final int KW_BETWEEN=35;
	public static final int KW_BIGINT=36;
	public static final int KW_BINARY=37;
	public static final int KW_BOOLEAN=38;
	public static final int KW_BOTH=39;
	public static final int KW_BUCKET=40;
	public static final int KW_BUCKETS=41;
	public static final int KW_BY=42;
	public static final int KW_CASCADE=43;
	public static final int KW_CASE=44;
	public static final int KW_CAST=45;
	public static final int KW_CHANGE=46;
	public static final int KW_CLUSTER=47;
	public static final int KW_CLUSTERED=48;
	public static final int KW_CLUSTERSTATUS=49;
	public static final int KW_COLLECTION=50;
	public static final int KW_COLUMN=51;
	public static final int KW_COLUMNS=52;
	public static final int KW_COMMENT=53;
	public static final int KW_COMPUTE=54;
	public static final int KW_CONCATENATE=55;
	public static final int KW_CONTINUE=56;
	public static final int KW_CREATE=57;
	public static final int KW_CROSS=58;
	public static final int KW_CURSOR=59;
	public static final int KW_DATA=60;
	public static final int KW_DATABASE=61;
	public static final int KW_DATABASES=62;
	public static final int KW_DATE=63;
	public static final int KW_DATETIME=64;
	public static final int KW_DBPROPERTIES=65;
	public static final int KW_DEFERRED=66;
	public static final int KW_DELETE=67;
	public static final int KW_DELIMITED=68;
	public static final int KW_DESC=69;
	public static final int KW_DESCRIBE=70;
	public static final int KW_DIRECTORY=71;
	public static final int KW_DISABLE=72;
	public static final int KW_DISTINCT=73;
	public static final int KW_DISTRIBUTE=74;
	public static final int KW_DOUBLE=75;
	public static final int KW_DROP=76;
	public static final int KW_ELEM_TYPE=77;
	public static final int KW_ELSE=78;
	public static final int KW_ENABLE=79;
	public static final int KW_END=80;
	public static final int KW_ESCAPED=81;
	public static final int KW_EXCLUSIVE=82;
	public static final int KW_EXISTS=83;
	public static final int KW_EXPLAIN=84;
	public static final int KW_EXPORT=85;
	public static final int KW_EXTENDED=86;
	public static final int KW_EXTERNAL=87;
	public static final int KW_FALSE=88;
	public static final int KW_FETCH=89;
	public static final int KW_FIELDS=90;
	public static final int KW_FILEFORMAT=91;
	public static final int KW_FIRST=92;
	public static final int KW_FLOAT=93;
	public static final int KW_FORMAT=94;
	public static final int KW_FORMATTED=95;
	public static final int KW_FROM=96;
	public static final int KW_FULL=97;
	public static final int KW_FUNCTION=98;
	public static final int KW_FUNCTIONS=99;
	public static final int KW_GRANT=100;
	public static final int KW_GROUP=101;
	public static final int KW_HAVING=102;
	public static final int KW_HOLD_DDLTIME=103;
	public static final int KW_IDXPROPERTIES=104;
	public static final int KW_IF=105;
	public static final int KW_IMPORT=106;
	public static final int KW_IN=107;
	public static final int KW_INDEX=108;
	public static final int KW_INDEXES=109;
	public static final int KW_INPATH=110;
	public static final int KW_INPUTDRIVER=111;
	public static final int KW_INPUTFORMAT=112;
	public static final int KW_INSERT=113;
	public static final int KW_INT=114;
	public static final int KW_INTERSECT=115;
	public static final int KW_INTO=116;
	public static final int KW_IS=117;
	public static final int KW_ITEMS=118;
	public static final int KW_JOIN=119;
	public static final int KW_KEYS=120;
	public static final int KW_KEY_TYPE=121;
	public static final int KW_LATERAL=122;
	public static final int KW_LEFT=123;
	public static final int KW_LIKE=124;
	public static final int KW_LIMIT=125;
	public static final int KW_LINES=126;
	public static final int KW_LOAD=127;
	public static final int KW_LOCAL=128;
	public static final int KW_LOCATION=129;
	public static final int KW_LOCK=130;
	public static final int KW_LOCKS=131;
	public static final int KW_LONG=132;
	public static final int KW_MAP=133;
	public static final int KW_MAPJOIN=134;
	public static final int KW_MATERIALIZED=135;
	public static final int KW_MINUS=136;
	public static final int KW_MSCK=137;
	public static final int KW_NOT=138;
	public static final int KW_NO_DROP=139;
	public static final int KW_NULL=140;
	public static final int KW_OF=141;
	public static final int KW_OFFLINE=142;
	public static final int KW_ON=143;
	public static final int KW_OPTION=144;
	public static final int KW_OR=145;
	public static final int KW_ORDER=146;
	public static final int KW_OUT=147;
	public static final int KW_OUTER=148;
	public static final int KW_OUTPUTDRIVER=149;
	public static final int KW_OUTPUTFORMAT=150;
	public static final int KW_OVERWRITE=151;
	public static final int KW_PARTITION=152;
	public static final int KW_PARTITIONED=153;
	public static final int KW_PARTITIONS=154;
	public static final int KW_PERCENT=155;
	public static final int KW_PLUS=156;
	public static final int KW_PRESERVE=157;
	public static final int KW_PROCEDURE=158;
	public static final int KW_PURGE=159;
	public static final int KW_RANGE=160;
	public static final int KW_RCFILE=161;
	public static final int KW_READ=162;
	public static final int KW_READONLY=163;
	public static final int KW_READS=164;
	public static final int KW_REBUILD=165;
	public static final int KW_RECORDREADER=166;
	public static final int KW_RECORDWRITER=167;
	public static final int KW_REDUCE=168;
	public static final int KW_REGEXP=169;
	public static final int KW_RENAME=170;
	public static final int KW_REPAIR=171;
	public static final int KW_REPLACE=172;
	public static final int KW_RESTRICT=173;
	public static final int KW_REVOKE=174;
	public static final int KW_RIGHT=175;
	public static final int KW_RLIKE=176;
	public static final int KW_ROW=177;
	public static final int KW_SCHEMA=178;
	public static final int KW_SCHEMAS=179;
	public static final int KW_SELECT=180;
	public static final int KW_SEMI=181;
	public static final int KW_SEQUENCEFILE=182;
	public static final int KW_SERDE=183;
	public static final int KW_SERDEPROPERTIES=184;
	public static final int KW_SET=185;
	public static final int KW_SHARED=186;
	public static final int KW_SHOW=187;
	public static final int KW_SHOW_DATABASE=188;
	public static final int KW_SMALLINT=189;
	public static final int KW_SORT=190;
	public static final int KW_SORTED=191;
	public static final int KW_SSL=192;
	public static final int KW_STATISTICS=193;
	public static final int KW_STORED=194;
	public static final int KW_STREAMTABLE=195;
	public static final int KW_STRING=196;
	public static final int KW_STRUCT=197;
	public static final int KW_TABLE=198;
	public static final int KW_TABLES=199;
	public static final int KW_TABLESAMPLE=200;
	public static final int KW_TBLPROPERTIES=201;
	public static final int KW_TEMPORARY=202;
	public static final int KW_TERMINATED=203;
	public static final int KW_TEXTFILE=204;
	public static final int KW_THEN=205;
	public static final int KW_TIMESTAMP=206;
	public static final int KW_TINYINT=207;
	public static final int KW_TO=208;
	public static final int KW_TOUCH=209;
	public static final int KW_TRANSFORM=210;
	public static final int KW_TRIGGER=211;
	public static final int KW_TRUE=212;
	public static final int KW_UNARCHIVE=213;
	public static final int KW_UNDO=214;
	public static final int KW_UNION=215;
	public static final int KW_UNIONTYPE=216;
	public static final int KW_UNIQUEJOIN=217;
	public static final int KW_UNLOCK=218;
	public static final int KW_UNSIGNED=219;
	public static final int KW_UPDATE=220;
	public static final int KW_USE=221;
	public static final int KW_USING=222;
	public static final int KW_UTC=223;
	public static final int KW_UTCTIMESTAMP=224;
	public static final int KW_VALUE_TYPE=225;
	public static final int KW_VIEW=226;
	public static final int KW_WHEN=227;
	public static final int KW_WHERE=228;
	public static final int KW_WHILE=229;
	public static final int KW_WITH=230;
	public static final int LCURLY=231;
	public static final int LESSTHAN=232;
	public static final int LESSTHANOREQUALTO=233;
	public static final int LPAREN=234;
	public static final int LSQUARE=235;
	public static final int Letter=236;
	public static final int MINUS=237;
	public static final int MOD=238;
	public static final int NOTEQUAL=239;
	public static final int Number=240;
	public static final int PLUS=241;
	public static final int QUESTION=242;
	public static final int RCURLY=243;
	public static final int RPAREN=244;
	public static final int RSQUARE=245;
	public static final int RegexComponent=246;
	public static final int SEMICOLON=247;
	public static final int STAR=248;
	public static final int SmallintLiteral=249;
	public static final int StringLiteral=250;
	public static final int TILDE=251;
	public static final int TOK_ALIASLIST=252;
	public static final int TOK_ALLCOLREF=253;
	public static final int TOK_ALTERDATABASE_PROPERTIES=254;
	public static final int TOK_ALTERINDEX_PROPERTIES=255;
	public static final int TOK_ALTERINDEX_REBUILD=256;
	public static final int TOK_ALTERTABLE_ADDCOLS=257;
	public static final int TOK_ALTERTABLE_ADDPARTS=258;
	public static final int TOK_ALTERTABLE_ALTERPARTS_MERGEFILES=259;
	public static final int TOK_ALTERTABLE_ALTERPARTS_PROTECTMODE=260;
	public static final int TOK_ALTERTABLE_ARCHIVE=261;
	public static final int TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION=262;
	public static final int TOK_ALTERTABLE_CLUSTER_SORT=263;
	public static final int TOK_ALTERTABLE_DROPPARTS=264;
	public static final int TOK_ALTERTABLE_FILEFORMAT=265;
	public static final int TOK_ALTERTABLE_LOCATION=266;
	public static final int TOK_ALTERTABLE_PARTITION=267;
	public static final int TOK_ALTERTABLE_PROPERTIES=268;
	public static final int TOK_ALTERTABLE_RENAME=269;
	public static final int TOK_ALTERTABLE_RENAMECOL=270;
	public static final int TOK_ALTERTABLE_RENAMEPART=271;
	public static final int TOK_ALTERTABLE_REPLACECOLS=272;
	public static final int TOK_ALTERTABLE_SERDEPROPERTIES=273;
	public static final int TOK_ALTERTABLE_SERIALIZER=274;
	public static final int TOK_ALTERTABLE_TOUCH=275;
	public static final int TOK_ALTERTABLE_UNARCHIVE=276;
	public static final int TOK_ALTERVIEW_ADDPARTS=277;
	public static final int TOK_ALTERVIEW_DROPPARTS=278;
	public static final int TOK_ALTERVIEW_PROPERTIES=279;
	public static final int TOK_ALTERVIEW_RENAME=280;
	public static final int TOK_ANALYZE=281;
	public static final int TOK_BIGINT=282;
	public static final int TOK_BINARY=283;
	public static final int TOK_BOOLEAN=284;
	public static final int TOK_CASCADE=285;
	public static final int TOK_CHARSETLITERAL=286;
	public static final int TOK_CLUSTERBY=287;
	public static final int TOK_COLTYPELIST=288;
	public static final int TOK_CREATEDATABASE=289;
	public static final int TOK_CREATEFUNCTION=290;
	public static final int TOK_CREATEINDEX=291;
	public static final int TOK_CREATEINDEX_INDEXTBLNAME=292;
	public static final int TOK_CREATEROLE=293;
	public static final int TOK_CREATETABLE=294;
	public static final int TOK_CREATEVIEW=295;
	public static final int TOK_DATABASECOMMENT=296;
	public static final int TOK_DATABASELOCATION=297;
	public static final int TOK_DATABASEPROPERTIES=298;
	public static final int TOK_DATE=299;
	public static final int TOK_DATETIME=300;
	public static final int TOK_DBPROPLIST=301;
	public static final int TOK_DEFERRED_REBUILDINDEX=302;
	public static final int TOK_DESCDATABASE=303;
	public static final int TOK_DESCFUNCTION=304;
	public static final int TOK_DESCTABLE=305;
	public static final int TOK_DESTINATION=306;
	public static final int TOK_DIR=307;
	public static final int TOK_DISABLE=308;
	public static final int TOK_DISTRIBUTEBY=309;
	public static final int TOK_DOUBLE=310;
	public static final int TOK_DROPDATABASE=311;
	public static final int TOK_DROPFUNCTION=312;
	public static final int TOK_DROPINDEX=313;
	public static final int TOK_DROPROLE=314;
	public static final int TOK_DROPTABLE=315;
	public static final int TOK_DROPVIEW=316;
	public static final int TOK_ENABLE=317;
	public static final int TOK_EXPLAIN=318;
	public static final int TOK_EXPLIST=319;
	public static final int TOK_EXPORT=320;
	public static final int TOK_FALSE=321;
	public static final int TOK_FILEFORMAT_GENERIC=322;
	public static final int TOK_FLOAT=323;
	public static final int TOK_FROM=324;
	public static final int TOK_FULLOUTERJOIN=325;
	public static final int TOK_FUNCTION=326;
	public static final int TOK_FUNCTIONDI=327;
	public static final int TOK_FUNCTIONSTAR=328;
	public static final int TOK_GRANT=329;
	public static final int TOK_GRANT_ROLE=330;
	public static final int TOK_GRANT_WITH_OPTION=331;
	public static final int TOK_GROUP=332;
	public static final int TOK_GROUPBY=333;
	public static final int TOK_HAVING=334;
	public static final int TOK_HINT=335;
	public static final int TOK_HINTARGLIST=336;
	public static final int TOK_HINTLIST=337;
	public static final int TOK_HOLD_DDLTIME=338;
	public static final int TOK_IFEXISTS=339;
	public static final int TOK_IFNOTEXISTS=340;
	public static final int TOK_IMPORT=341;
	public static final int TOK_INDEXCOMMENT=342;
	public static final int TOK_INDEXPROPERTIES=343;
	public static final int TOK_INDEXPROPLIST=344;
	public static final int TOK_INSERT=345;
	public static final int TOK_INSERT_INTO=346;
	public static final int TOK_INT=347;
	public static final int TOK_ISNOTNULL=348;
	public static final int TOK_ISNULL=349;
	public static final int TOK_JOIN=350;
	public static final int TOK_LATERAL_VIEW=351;
	public static final int TOK_LEFTOUTERJOIN=352;
	public static final int TOK_LEFTSEMIJOIN=353;
	public static final int TOK_LIKETABLE=354;
	public static final int TOK_LIMIT=355;
	public static final int TOK_LIST=356;
	public static final int TOK_LOAD=357;
	public static final int TOK_LOCAL_DIR=358;
	public static final int TOK_LOCKTABLE=359;
	public static final int TOK_MAP=360;
	public static final int TOK_MAPJOIN=361;
	public static final int TOK_MSCK=362;
	public static final int TOK_NO_DROP=363;
	public static final int TOK_NULL=364;
	public static final int TOK_OFFLINE=365;
	public static final int TOK_OP_ADD=366;
	public static final int TOK_OP_AND=367;
	public static final int TOK_OP_BITAND=368;
	public static final int TOK_OP_BITNOT=369;
	public static final int TOK_OP_BITOR=370;
	public static final int TOK_OP_BITXOR=371;
	public static final int TOK_OP_DIV=372;
	public static final int TOK_OP_EQ=373;
	public static final int TOK_OP_GE=374;
	public static final int TOK_OP_GT=375;
	public static final int TOK_OP_LE=376;
	public static final int TOK_OP_LIKE=377;
	public static final int TOK_OP_LT=378;
	public static final int TOK_OP_MOD=379;
	public static final int TOK_OP_MUL=380;
	public static final int TOK_OP_NE=381;
	public static final int TOK_OP_NOT=382;
	public static final int TOK_OP_OR=383;
	public static final int TOK_OP_SUB=384;
	public static final int TOK_ORDERBY=385;
	public static final int TOK_ORREPLACE=386;
	public static final int TOK_PARTITIONLOCATION=387;
	public static final int TOK_PARTSPEC=388;
	public static final int TOK_PARTVAL=389;
	public static final int TOK_PRINCIPAL_NAME=390;
	public static final int TOK_PRIVILEGE=391;
	public static final int TOK_PRIVILEGE_LIST=392;
	public static final int TOK_PRIV_ALL=393;
	public static final int TOK_PRIV_ALTER_DATA=394;
	public static final int TOK_PRIV_ALTER_METADATA=395;
	public static final int TOK_PRIV_CREATE=396;
	public static final int TOK_PRIV_DROP=397;
	public static final int TOK_PRIV_INDEX=398;
	public static final int TOK_PRIV_LOCK=399;
	public static final int TOK_PRIV_OBJECT=400;
	public static final int TOK_PRIV_OBJECT_COL=401;
	public static final int TOK_PRIV_SELECT=402;
	public static final int TOK_PRIV_SHOW_DATABASE=403;
	public static final int TOK_QUERY=404;
	public static final int TOK_READONLY=405;
	public static final int TOK_RECORDREADER=406;
	public static final int TOK_RECORDWRITER=407;
	public static final int TOK_RESTRICT=408;
	public static final int TOK_REVOKE=409;
	public static final int TOK_REVOKE_ROLE=410;
	public static final int TOK_RIGHTOUTERJOIN=411;
	public static final int TOK_ROLE=412;
	public static final int TOK_SELECT=413;
	public static final int TOK_SELECTDI=414;
	public static final int TOK_SELEXPR=415;
	public static final int TOK_SERDE=416;
	public static final int TOK_SERDENAME=417;
	public static final int TOK_SERDEPROPS=418;
	public static final int TOK_SHOWDATABASES=419;
	public static final int TOK_SHOWFUNCTIONS=420;
	public static final int TOK_SHOWINDEXES=421;
	public static final int TOK_SHOWLOCKS=422;
	public static final int TOK_SHOWPARTITIONS=423;
	public static final int TOK_SHOWTABLES=424;
	public static final int TOK_SHOW_GRANT=425;
	public static final int TOK_SHOW_ROLE_GRANT=426;
	public static final int TOK_SHOW_TABLESTATUS=427;
	public static final int TOK_SMALLINT=428;
	public static final int TOK_SORTBY=429;
	public static final int TOK_STORAGEHANDLER=430;
	public static final int TOK_STREAMTABLE=431;
	public static final int TOK_STRING=432;
	public static final int TOK_STRINGLITERALSEQUENCE=433;
	public static final int TOK_STRUCT=434;
	public static final int TOK_SUBQUERY=435;
	public static final int TOK_SWITCHDATABASE=436;
	public static final int TOK_TAB=437;
	public static final int TOK_TABALIAS=438;
	public static final int TOK_TABCOL=439;
	public static final int TOK_TABCOLLIST=440;
	public static final int TOK_TABCOLNAME=441;
	public static final int TOK_TABLEBUCKETS=442;
	public static final int TOK_TABLEBUCKETSAMPLE=443;
	public static final int TOK_TABLECOMMENT=444;
	public static final int TOK_TABLEFILEFORMAT=445;
	public static final int TOK_TABLELOCATION=446;
	public static final int TOK_TABLEPARTCOLS=447;
	public static final int TOK_TABLEPROPERTIES=448;
	public static final int TOK_TABLEPROPERTY=449;
	public static final int TOK_TABLEPROPLIST=450;
	public static final int TOK_TABLEROWFORMAT=451;
	public static final int TOK_TABLEROWFORMATCOLLITEMS=452;
	public static final int TOK_TABLEROWFORMATFIELD=453;
	public static final int TOK_TABLEROWFORMATLINES=454;
	public static final int TOK_TABLEROWFORMATMAPKEYS=455;
	public static final int TOK_TABLESERIALIZER=456;
	public static final int TOK_TABLESPLITSAMPLE=457;
	public static final int TOK_TABLE_OR_COL=458;
	public static final int TOK_TABLE_PARTITION=459;
	public static final int TOK_TABNAME=460;
	public static final int TOK_TABREF=461;
	public static final int TOK_TABSORTCOLNAMEASC=462;
	public static final int TOK_TABSORTCOLNAMEDESC=463;
	public static final int TOK_TABSRC=464;
	public static final int TOK_TABTYPE=465;
	public static final int TOK_TBLRCFILE=466;
	public static final int TOK_TBLSEQUENCEFILE=467;
	public static final int TOK_TBLTEXTFILE=468;
	public static final int TOK_TIMESTAMP=469;
	public static final int TOK_TINYINT=470;
	public static final int TOK_TMP_FILE=471;
	public static final int TOK_TRANSFORM=472;
	public static final int TOK_TRUE=473;
	public static final int TOK_UNION=474;
	public static final int TOK_UNIONTYPE=475;
	public static final int TOK_UNIQUEJOIN=476;
	public static final int TOK_UNLOCKTABLE=477;
	public static final int TOK_USER=478;
	public static final int TOK_USERSCRIPTCOLNAMES=479;
	public static final int TOK_USERSCRIPTCOLSCHEMA=480;
	public static final int TOK_VIEWPARTCOLS=481;
	public static final int TOK_WHERE=482;
	public static final int TinyintLiteral=483;
	public static final int WS=484;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public HiveLexer() {} 
	public HiveLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public HiveLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Hive.g"; }

	// $ANTLR start "KW_TRUE"
	public final void mKW_TRUE() throws RecognitionException {
		try {
			int _type = KW_TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2132:9: ( 'TRUE' )
			// Hive.g:2132:11: 'TRUE'
			{
			match("TRUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRUE"

	// $ANTLR start "KW_FALSE"
	public final void mKW_FALSE() throws RecognitionException {
		try {
			int _type = KW_FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2133:10: ( 'FALSE' )
			// Hive.g:2133:12: 'FALSE'
			{
			match("FALSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FALSE"

	// $ANTLR start "KW_ALL"
	public final void mKW_ALL() throws RecognitionException {
		try {
			int _type = KW_ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2134:8: ( 'ALL' )
			// Hive.g:2134:10: 'ALL'
			{
			match("ALL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ALL"

	// $ANTLR start "KW_AND"
	public final void mKW_AND() throws RecognitionException {
		try {
			int _type = KW_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2135:8: ( 'AND' )
			// Hive.g:2135:10: 'AND'
			{
			match("AND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AND"

	// $ANTLR start "KW_OR"
	public final void mKW_OR() throws RecognitionException {
		try {
			int _type = KW_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2136:7: ( 'OR' )
			// Hive.g:2136:9: 'OR'
			{
			match("OR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OR"

	// $ANTLR start "KW_NOT"
	public final void mKW_NOT() throws RecognitionException {
		try {
			int _type = KW_NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2137:8: ( 'NOT' | '!' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='N') ) {
				alt1=1;
			}
			else if ( (LA1_0=='!') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// Hive.g:2137:10: 'NOT'
					{
					match("NOT"); 

					}
					break;
				case 2 :
					// Hive.g:2137:18: '!'
					{
					match('!'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NOT"

	// $ANTLR start "KW_LIKE"
	public final void mKW_LIKE() throws RecognitionException {
		try {
			int _type = KW_LIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2138:9: ( 'LIKE' )
			// Hive.g:2138:11: 'LIKE'
			{
			match("LIKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LIKE"

	// $ANTLR start "KW_IF"
	public final void mKW_IF() throws RecognitionException {
		try {
			int _type = KW_IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2140:7: ( 'IF' )
			// Hive.g:2140:9: 'IF'
			{
			match("IF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IF"

	// $ANTLR start "KW_EXISTS"
	public final void mKW_EXISTS() throws RecognitionException {
		try {
			int _type = KW_EXISTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2141:11: ( 'EXISTS' )
			// Hive.g:2141:13: 'EXISTS'
			{
			match("EXISTS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXISTS"

	// $ANTLR start "KW_ASC"
	public final void mKW_ASC() throws RecognitionException {
		try {
			int _type = KW_ASC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2143:8: ( 'ASC' )
			// Hive.g:2143:10: 'ASC'
			{
			match("ASC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ASC"

	// $ANTLR start "KW_DESC"
	public final void mKW_DESC() throws RecognitionException {
		try {
			int _type = KW_DESC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2144:9: ( 'DESC' )
			// Hive.g:2144:11: 'DESC'
			{
			match("DESC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DESC"

	// $ANTLR start "KW_ORDER"
	public final void mKW_ORDER() throws RecognitionException {
		try {
			int _type = KW_ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2145:10: ( 'ORDER' )
			// Hive.g:2145:12: 'ORDER'
			{
			match("ORDER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ORDER"

	// $ANTLR start "KW_GROUP"
	public final void mKW_GROUP() throws RecognitionException {
		try {
			int _type = KW_GROUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2146:10: ( 'GROUP' )
			// Hive.g:2146:12: 'GROUP'
			{
			match("GROUP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_GROUP"

	// $ANTLR start "KW_BY"
	public final void mKW_BY() throws RecognitionException {
		try {
			int _type = KW_BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2147:7: ( 'BY' )
			// Hive.g:2147:9: 'BY'
			{
			match("BY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BY"

	// $ANTLR start "KW_HAVING"
	public final void mKW_HAVING() throws RecognitionException {
		try {
			int _type = KW_HAVING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2148:11: ( 'HAVING' )
			// Hive.g:2148:13: 'HAVING'
			{
			match("HAVING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_HAVING"

	// $ANTLR start "KW_WHERE"
	public final void mKW_WHERE() throws RecognitionException {
		try {
			int _type = KW_WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2149:10: ( 'WHERE' )
			// Hive.g:2149:12: 'WHERE'
			{
			match("WHERE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHERE"

	// $ANTLR start "KW_FROM"
	public final void mKW_FROM() throws RecognitionException {
		try {
			int _type = KW_FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2150:9: ( 'FROM' )
			// Hive.g:2150:11: 'FROM'
			{
			match("FROM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FROM"

	// $ANTLR start "KW_AS"
	public final void mKW_AS() throws RecognitionException {
		try {
			int _type = KW_AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2151:7: ( 'AS' )
			// Hive.g:2151:9: 'AS'
			{
			match("AS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AS"

	// $ANTLR start "KW_SELECT"
	public final void mKW_SELECT() throws RecognitionException {
		try {
			int _type = KW_SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2152:11: ( 'SELECT' )
			// Hive.g:2152:13: 'SELECT'
			{
			match("SELECT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SELECT"

	// $ANTLR start "KW_DISTINCT"
	public final void mKW_DISTINCT() throws RecognitionException {
		try {
			int _type = KW_DISTINCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2153:13: ( 'DISTINCT' )
			// Hive.g:2153:15: 'DISTINCT'
			{
			match("DISTINCT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISTINCT"

	// $ANTLR start "KW_INSERT"
	public final void mKW_INSERT() throws RecognitionException {
		try {
			int _type = KW_INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2154:11: ( 'INSERT' )
			// Hive.g:2154:13: 'INSERT'
			{
			match("INSERT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INSERT"

	// $ANTLR start "KW_OVERWRITE"
	public final void mKW_OVERWRITE() throws RecognitionException {
		try {
			int _type = KW_OVERWRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2155:14: ( 'OVERWRITE' )
			// Hive.g:2155:16: 'OVERWRITE'
			{
			match("OVERWRITE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OVERWRITE"

	// $ANTLR start "KW_OUTER"
	public final void mKW_OUTER() throws RecognitionException {
		try {
			int _type = KW_OUTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2156:10: ( 'OUTER' )
			// Hive.g:2156:12: 'OUTER'
			{
			match("OUTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTER"

	// $ANTLR start "KW_UNIQUEJOIN"
	public final void mKW_UNIQUEJOIN() throws RecognitionException {
		try {
			int _type = KW_UNIQUEJOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2157:15: ( 'UNIQUEJOIN' )
			// Hive.g:2157:17: 'UNIQUEJOIN'
			{
			match("UNIQUEJOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNIQUEJOIN"

	// $ANTLR start "KW_PRESERVE"
	public final void mKW_PRESERVE() throws RecognitionException {
		try {
			int _type = KW_PRESERVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2158:13: ( 'PRESERVE' )
			// Hive.g:2158:15: 'PRESERVE'
			{
			match("PRESERVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRESERVE"

	// $ANTLR start "KW_JOIN"
	public final void mKW_JOIN() throws RecognitionException {
		try {
			int _type = KW_JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2159:9: ( 'JOIN' )
			// Hive.g:2159:11: 'JOIN'
			{
			match("JOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_JOIN"

	// $ANTLR start "KW_LEFT"
	public final void mKW_LEFT() throws RecognitionException {
		try {
			int _type = KW_LEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2160:9: ( 'LEFT' )
			// Hive.g:2160:11: 'LEFT'
			{
			match("LEFT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LEFT"

	// $ANTLR start "KW_RIGHT"
	public final void mKW_RIGHT() throws RecognitionException {
		try {
			int _type = KW_RIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2161:10: ( 'RIGHT' )
			// Hive.g:2161:12: 'RIGHT'
			{
			match("RIGHT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RIGHT"

	// $ANTLR start "KW_FULL"
	public final void mKW_FULL() throws RecognitionException {
		try {
			int _type = KW_FULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2162:9: ( 'FULL' )
			// Hive.g:2162:11: 'FULL'
			{
			match("FULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FULL"

	// $ANTLR start "KW_ON"
	public final void mKW_ON() throws RecognitionException {
		try {
			int _type = KW_ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2163:7: ( 'ON' )
			// Hive.g:2163:9: 'ON'
			{
			match("ON"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ON"

	// $ANTLR start "KW_PARTITION"
	public final void mKW_PARTITION() throws RecognitionException {
		try {
			int _type = KW_PARTITION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2164:14: ( 'PARTITION' )
			// Hive.g:2164:16: 'PARTITION'
			{
			match("PARTITION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITION"

	// $ANTLR start "KW_PARTITIONS"
	public final void mKW_PARTITIONS() throws RecognitionException {
		try {
			int _type = KW_PARTITIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2165:15: ( 'PARTITIONS' )
			// Hive.g:2165:17: 'PARTITIONS'
			{
			match("PARTITIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITIONS"

	// $ANTLR start "KW_TABLE"
	public final void mKW_TABLE() throws RecognitionException {
		try {
			int _type = KW_TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2166:9: ( 'TABLE' )
			// Hive.g:2166:11: 'TABLE'
			{
			match("TABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLE"

	// $ANTLR start "KW_TABLES"
	public final void mKW_TABLES() throws RecognitionException {
		try {
			int _type = KW_TABLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2167:10: ( 'TABLES' )
			// Hive.g:2167:12: 'TABLES'
			{
			match("TABLES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLES"

	// $ANTLR start "KW_INDEX"
	public final void mKW_INDEX() throws RecognitionException {
		try {
			int _type = KW_INDEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2168:9: ( 'INDEX' )
			// Hive.g:2168:11: 'INDEX'
			{
			match("INDEX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INDEX"

	// $ANTLR start "KW_INDEXES"
	public final void mKW_INDEXES() throws RecognitionException {
		try {
			int _type = KW_INDEXES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2169:11: ( 'INDEXES' )
			// Hive.g:2169:13: 'INDEXES'
			{
			match("INDEXES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INDEXES"

	// $ANTLR start "KW_REBUILD"
	public final void mKW_REBUILD() throws RecognitionException {
		try {
			int _type = KW_REBUILD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2170:11: ( 'REBUILD' )
			// Hive.g:2170:13: 'REBUILD'
			{
			match("REBUILD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REBUILD"

	// $ANTLR start "KW_FUNCTIONS"
	public final void mKW_FUNCTIONS() throws RecognitionException {
		try {
			int _type = KW_FUNCTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2171:13: ( 'FUNCTIONS' )
			// Hive.g:2171:15: 'FUNCTIONS'
			{
			match("FUNCTIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FUNCTIONS"

	// $ANTLR start "KW_SHOW"
	public final void mKW_SHOW() throws RecognitionException {
		try {
			int _type = KW_SHOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2172:8: ( 'SHOW' )
			// Hive.g:2172:10: 'SHOW'
			{
			match("SHOW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHOW"

	// $ANTLR start "KW_MSCK"
	public final void mKW_MSCK() throws RecognitionException {
		try {
			int _type = KW_MSCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2173:8: ( 'MSCK' )
			// Hive.g:2173:10: 'MSCK'
			{
			match("MSCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MSCK"

	// $ANTLR start "KW_REPAIR"
	public final void mKW_REPAIR() throws RecognitionException {
		try {
			int _type = KW_REPAIR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2174:10: ( 'REPAIR' )
			// Hive.g:2174:12: 'REPAIR'
			{
			match("REPAIR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPAIR"

	// $ANTLR start "KW_DIRECTORY"
	public final void mKW_DIRECTORY() throws RecognitionException {
		try {
			int _type = KW_DIRECTORY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2175:13: ( 'DIRECTORY' )
			// Hive.g:2175:15: 'DIRECTORY'
			{
			match("DIRECTORY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DIRECTORY"

	// $ANTLR start "KW_LOCAL"
	public final void mKW_LOCAL() throws RecognitionException {
		try {
			int _type = KW_LOCAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2176:9: ( 'LOCAL' )
			// Hive.g:2176:11: 'LOCAL'
			{
			match("LOCAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCAL"

	// $ANTLR start "KW_TRANSFORM"
	public final void mKW_TRANSFORM() throws RecognitionException {
		try {
			int _type = KW_TRANSFORM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2177:14: ( 'TRANSFORM' )
			// Hive.g:2177:16: 'TRANSFORM'
			{
			match("TRANSFORM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRANSFORM"

	// $ANTLR start "KW_USING"
	public final void mKW_USING() throws RecognitionException {
		try {
			int _type = KW_USING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2178:9: ( 'USING' )
			// Hive.g:2178:11: 'USING'
			{
			match("USING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_USING"

	// $ANTLR start "KW_CLUSTER"
	public final void mKW_CLUSTER() throws RecognitionException {
		try {
			int _type = KW_CLUSTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2179:11: ( 'CLUSTER' )
			// Hive.g:2179:13: 'CLUSTER'
			{
			match("CLUSTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTER"

	// $ANTLR start "KW_DISTRIBUTE"
	public final void mKW_DISTRIBUTE() throws RecognitionException {
		try {
			int _type = KW_DISTRIBUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2180:14: ( 'DISTRIBUTE' )
			// Hive.g:2180:16: 'DISTRIBUTE'
			{
			match("DISTRIBUTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISTRIBUTE"

	// $ANTLR start "KW_SORT"
	public final void mKW_SORT() throws RecognitionException {
		try {
			int _type = KW_SORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2181:8: ( 'SORT' )
			// Hive.g:2181:10: 'SORT'
			{
			match("SORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SORT"

	// $ANTLR start "KW_UNION"
	public final void mKW_UNION() throws RecognitionException {
		try {
			int _type = KW_UNION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2182:9: ( 'UNION' )
			// Hive.g:2182:11: 'UNION'
			{
			match("UNION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNION"

	// $ANTLR start "KW_LOAD"
	public final void mKW_LOAD() throws RecognitionException {
		try {
			int _type = KW_LOAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2183:8: ( 'LOAD' )
			// Hive.g:2183:10: 'LOAD'
			{
			match("LOAD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOAD"

	// $ANTLR start "KW_EXPORT"
	public final void mKW_EXPORT() throws RecognitionException {
		try {
			int _type = KW_EXPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2184:10: ( 'EXPORT' )
			// Hive.g:2184:12: 'EXPORT'
			{
			match("EXPORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXPORT"

	// $ANTLR start "KW_IMPORT"
	public final void mKW_IMPORT() throws RecognitionException {
		try {
			int _type = KW_IMPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2185:10: ( 'IMPORT' )
			// Hive.g:2185:12: 'IMPORT'
			{
			match("IMPORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IMPORT"

	// $ANTLR start "KW_DATA"
	public final void mKW_DATA() throws RecognitionException {
		try {
			int _type = KW_DATA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2186:8: ( 'DATA' )
			// Hive.g:2186:10: 'DATA'
			{
			match("DATA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATA"

	// $ANTLR start "KW_INPATH"
	public final void mKW_INPATH() throws RecognitionException {
		try {
			int _type = KW_INPATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2187:10: ( 'INPATH' )
			// Hive.g:2187:12: 'INPATH'
			{
			match("INPATH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPATH"

	// $ANTLR start "KW_IS"
	public final void mKW_IS() throws RecognitionException {
		try {
			int _type = KW_IS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2188:6: ( 'IS' )
			// Hive.g:2188:8: 'IS'
			{
			match("IS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IS"

	// $ANTLR start "KW_NULL"
	public final void mKW_NULL() throws RecognitionException {
		try {
			int _type = KW_NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2189:8: ( 'NULL' )
			// Hive.g:2189:10: 'NULL'
			{
			match("NULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NULL"

	// $ANTLR start "KW_CREATE"
	public final void mKW_CREATE() throws RecognitionException {
		try {
			int _type = KW_CREATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2190:10: ( 'CREATE' )
			// Hive.g:2190:12: 'CREATE'
			{
			match("CREATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CREATE"

	// $ANTLR start "KW_EXTERNAL"
	public final void mKW_EXTERNAL() throws RecognitionException {
		try {
			int _type = KW_EXTERNAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2191:12: ( 'EXTERNAL' )
			// Hive.g:2191:14: 'EXTERNAL'
			{
			match("EXTERNAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXTERNAL"

	// $ANTLR start "KW_ALTER"
	public final void mKW_ALTER() throws RecognitionException {
		try {
			int _type = KW_ALTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2192:9: ( 'ALTER' )
			// Hive.g:2192:11: 'ALTER'
			{
			match("ALTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ALTER"

	// $ANTLR start "KW_CHANGE"
	public final void mKW_CHANGE() throws RecognitionException {
		try {
			int _type = KW_CHANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2193:10: ( 'CHANGE' )
			// Hive.g:2193:12: 'CHANGE'
			{
			match("CHANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CHANGE"

	// $ANTLR start "KW_COLUMN"
	public final void mKW_COLUMN() throws RecognitionException {
		try {
			int _type = KW_COLUMN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2194:10: ( 'COLUMN' )
			// Hive.g:2194:12: 'COLUMN'
			{
			match("COLUMN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLUMN"

	// $ANTLR start "KW_FIRST"
	public final void mKW_FIRST() throws RecognitionException {
		try {
			int _type = KW_FIRST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2195:9: ( 'FIRST' )
			// Hive.g:2195:11: 'FIRST'
			{
			match("FIRST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FIRST"

	// $ANTLR start "KW_AFTER"
	public final void mKW_AFTER() throws RecognitionException {
		try {
			int _type = KW_AFTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2196:9: ( 'AFTER' )
			// Hive.g:2196:11: 'AFTER'
			{
			match("AFTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AFTER"

	// $ANTLR start "KW_DESCRIBE"
	public final void mKW_DESCRIBE() throws RecognitionException {
		try {
			int _type = KW_DESCRIBE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2197:12: ( 'DESCRIBE' )
			// Hive.g:2197:14: 'DESCRIBE'
			{
			match("DESCRIBE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DESCRIBE"

	// $ANTLR start "KW_DROP"
	public final void mKW_DROP() throws RecognitionException {
		try {
			int _type = KW_DROP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2198:8: ( 'DROP' )
			// Hive.g:2198:10: 'DROP'
			{
			match("DROP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DROP"

	// $ANTLR start "KW_RENAME"
	public final void mKW_RENAME() throws RecognitionException {
		try {
			int _type = KW_RENAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2199:10: ( 'RENAME' )
			// Hive.g:2199:12: 'RENAME'
			{
			match("RENAME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RENAME"

	// $ANTLR start "KW_TO"
	public final void mKW_TO() throws RecognitionException {
		try {
			int _type = KW_TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2200:6: ( 'TO' )
			// Hive.g:2200:8: 'TO'
			{
			match("TO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TO"

	// $ANTLR start "KW_COMMENT"
	public final void mKW_COMMENT() throws RecognitionException {
		try {
			int _type = KW_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2201:11: ( 'COMMENT' )
			// Hive.g:2201:13: 'COMMENT'
			{
			match("COMMENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMMENT"

	// $ANTLR start "KW_BOOLEAN"
	public final void mKW_BOOLEAN() throws RecognitionException {
		try {
			int _type = KW_BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2202:11: ( 'BOOLEAN' )
			// Hive.g:2202:13: 'BOOLEAN'
			{
			match("BOOLEAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BOOLEAN"

	// $ANTLR start "KW_TINYINT"
	public final void mKW_TINYINT() throws RecognitionException {
		try {
			int _type = KW_TINYINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2203:11: ( 'TINYINT' )
			// Hive.g:2203:13: 'TINYINT'
			{
			match("TINYINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TINYINT"

	// $ANTLR start "KW_SMALLINT"
	public final void mKW_SMALLINT() throws RecognitionException {
		try {
			int _type = KW_SMALLINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2204:12: ( 'SMALLINT' )
			// Hive.g:2204:14: 'SMALLINT'
			{
			match("SMALLINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SMALLINT"

	// $ANTLR start "KW_INT"
	public final void mKW_INT() throws RecognitionException {
		try {
			int _type = KW_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2205:7: ( 'INT' )
			// Hive.g:2205:9: 'INT'
			{
			match("INT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INT"

	// $ANTLR start "KW_BIGINT"
	public final void mKW_BIGINT() throws RecognitionException {
		try {
			int _type = KW_BIGINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2206:10: ( 'BIGINT' )
			// Hive.g:2206:12: 'BIGINT'
			{
			match("BIGINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BIGINT"

	// $ANTLR start "KW_FLOAT"
	public final void mKW_FLOAT() throws RecognitionException {
		try {
			int _type = KW_FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2207:9: ( 'FLOAT' )
			// Hive.g:2207:11: 'FLOAT'
			{
			match("FLOAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FLOAT"

	// $ANTLR start "KW_DOUBLE"
	public final void mKW_DOUBLE() throws RecognitionException {
		try {
			int _type = KW_DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2208:10: ( 'DOUBLE' )
			// Hive.g:2208:12: 'DOUBLE'
			{
			match("DOUBLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DOUBLE"

	// $ANTLR start "KW_DATE"
	public final void mKW_DATE() throws RecognitionException {
		try {
			int _type = KW_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2209:8: ( 'DATE' )
			// Hive.g:2209:10: 'DATE'
			{
			match("DATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATE"

	// $ANTLR start "KW_DATETIME"
	public final void mKW_DATETIME() throws RecognitionException {
		try {
			int _type = KW_DATETIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2210:12: ( 'DATETIME' )
			// Hive.g:2210:14: 'DATETIME'
			{
			match("DATETIME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATETIME"

	// $ANTLR start "KW_TIMESTAMP"
	public final void mKW_TIMESTAMP() throws RecognitionException {
		try {
			int _type = KW_TIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2211:13: ( 'TIMESTAMP' )
			// Hive.g:2211:15: 'TIMESTAMP'
			{
			match("TIMESTAMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TIMESTAMP"

	// $ANTLR start "KW_STRING"
	public final void mKW_STRING() throws RecognitionException {
		try {
			int _type = KW_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2212:10: ( 'STRING' )
			// Hive.g:2212:12: 'STRING'
			{
			match("STRING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STRING"

	// $ANTLR start "KW_ARRAY"
	public final void mKW_ARRAY() throws RecognitionException {
		try {
			int _type = KW_ARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2213:9: ( 'ARRAY' )
			// Hive.g:2213:11: 'ARRAY'
			{
			match("ARRAY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ARRAY"

	// $ANTLR start "KW_STRUCT"
	public final void mKW_STRUCT() throws RecognitionException {
		try {
			int _type = KW_STRUCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2214:10: ( 'STRUCT' )
			// Hive.g:2214:12: 'STRUCT'
			{
			match("STRUCT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STRUCT"

	// $ANTLR start "KW_MAP"
	public final void mKW_MAP() throws RecognitionException {
		try {
			int _type = KW_MAP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2215:7: ( 'MAP' )
			// Hive.g:2215:9: 'MAP'
			{
			match("MAP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MAP"

	// $ANTLR start "KW_UNIONTYPE"
	public final void mKW_UNIONTYPE() throws RecognitionException {
		try {
			int _type = KW_UNIONTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2216:13: ( 'UNIONTYPE' )
			// Hive.g:2216:15: 'UNIONTYPE'
			{
			match("UNIONTYPE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNIONTYPE"

	// $ANTLR start "KW_REDUCE"
	public final void mKW_REDUCE() throws RecognitionException {
		try {
			int _type = KW_REDUCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2217:10: ( 'REDUCE' )
			// Hive.g:2217:12: 'REDUCE'
			{
			match("REDUCE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REDUCE"

	// $ANTLR start "KW_PARTITIONED"
	public final void mKW_PARTITIONED() throws RecognitionException {
		try {
			int _type = KW_PARTITIONED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2218:15: ( 'PARTITIONED' )
			// Hive.g:2218:17: 'PARTITIONED'
			{
			match("PARTITIONED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITIONED"

	// $ANTLR start "KW_CLUSTERED"
	public final void mKW_CLUSTERED() throws RecognitionException {
		try {
			int _type = KW_CLUSTERED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2219:13: ( 'CLUSTERED' )
			// Hive.g:2219:15: 'CLUSTERED'
			{
			match("CLUSTERED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTERED"

	// $ANTLR start "KW_SORTED"
	public final void mKW_SORTED() throws RecognitionException {
		try {
			int _type = KW_SORTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2220:10: ( 'SORTED' )
			// Hive.g:2220:12: 'SORTED'
			{
			match("SORTED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SORTED"

	// $ANTLR start "KW_INTO"
	public final void mKW_INTO() throws RecognitionException {
		try {
			int _type = KW_INTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2221:8: ( 'INTO' )
			// Hive.g:2221:10: 'INTO'
			{
			match("INTO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INTO"

	// $ANTLR start "KW_BUCKETS"
	public final void mKW_BUCKETS() throws RecognitionException {
		try {
			int _type = KW_BUCKETS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2222:11: ( 'BUCKETS' )
			// Hive.g:2222:13: 'BUCKETS'
			{
			match("BUCKETS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BUCKETS"

	// $ANTLR start "KW_ROW"
	public final void mKW_ROW() throws RecognitionException {
		try {
			int _type = KW_ROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2223:7: ( 'ROW' )
			// Hive.g:2223:9: 'ROW'
			{
			match("ROW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROW"

	// $ANTLR start "KW_FORMAT"
	public final void mKW_FORMAT() throws RecognitionException {
		try {
			int _type = KW_FORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2224:10: ( 'FORMAT' )
			// Hive.g:2224:12: 'FORMAT'
			{
			match("FORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FORMAT"

	// $ANTLR start "KW_DELIMITED"
	public final void mKW_DELIMITED() throws RecognitionException {
		try {
			int _type = KW_DELIMITED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2225:13: ( 'DELIMITED' )
			// Hive.g:2225:15: 'DELIMITED'
			{
			match("DELIMITED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DELIMITED"

	// $ANTLR start "KW_FIELDS"
	public final void mKW_FIELDS() throws RecognitionException {
		try {
			int _type = KW_FIELDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2226:10: ( 'FIELDS' )
			// Hive.g:2226:12: 'FIELDS'
			{
			match("FIELDS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FIELDS"

	// $ANTLR start "KW_TERMINATED"
	public final void mKW_TERMINATED() throws RecognitionException {
		try {
			int _type = KW_TERMINATED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2227:14: ( 'TERMINATED' )
			// Hive.g:2227:16: 'TERMINATED'
			{
			match("TERMINATED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TERMINATED"

	// $ANTLR start "KW_ESCAPED"
	public final void mKW_ESCAPED() throws RecognitionException {
		try {
			int _type = KW_ESCAPED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2228:11: ( 'ESCAPED' )
			// Hive.g:2228:13: 'ESCAPED'
			{
			match("ESCAPED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ESCAPED"

	// $ANTLR start "KW_COLLECTION"
	public final void mKW_COLLECTION() throws RecognitionException {
		try {
			int _type = KW_COLLECTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2229:14: ( 'COLLECTION' )
			// Hive.g:2229:16: 'COLLECTION'
			{
			match("COLLECTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLLECTION"

	// $ANTLR start "KW_ITEMS"
	public final void mKW_ITEMS() throws RecognitionException {
		try {
			int _type = KW_ITEMS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2230:9: ( 'ITEMS' )
			// Hive.g:2230:11: 'ITEMS'
			{
			match("ITEMS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ITEMS"

	// $ANTLR start "KW_KEYS"
	public final void mKW_KEYS() throws RecognitionException {
		try {
			int _type = KW_KEYS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2231:8: ( 'KEYS' )
			// Hive.g:2231:10: 'KEYS'
			{
			match("KEYS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KEYS"

	// $ANTLR start "KW_KEY_TYPE"
	public final void mKW_KEY_TYPE() throws RecognitionException {
		try {
			int _type = KW_KEY_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2232:12: ( '$KEY$' )
			// Hive.g:2232:14: '$KEY$'
			{
			match("$KEY$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KEY_TYPE"

	// $ANTLR start "KW_LINES"
	public final void mKW_LINES() throws RecognitionException {
		try {
			int _type = KW_LINES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2233:9: ( 'LINES' )
			// Hive.g:2233:11: 'LINES'
			{
			match("LINES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LINES"

	// $ANTLR start "KW_STORED"
	public final void mKW_STORED() throws RecognitionException {
		try {
			int _type = KW_STORED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2234:10: ( 'STORED' )
			// Hive.g:2234:12: 'STORED'
			{
			match("STORED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STORED"

	// $ANTLR start "KW_FILEFORMAT"
	public final void mKW_FILEFORMAT() throws RecognitionException {
		try {
			int _type = KW_FILEFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2235:14: ( 'FILEFORMAT' )
			// Hive.g:2235:16: 'FILEFORMAT'
			{
			match("FILEFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FILEFORMAT"

	// $ANTLR start "KW_SEQUENCEFILE"
	public final void mKW_SEQUENCEFILE() throws RecognitionException {
		try {
			int _type = KW_SEQUENCEFILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2236:16: ( 'SEQUENCEFILE' )
			// Hive.g:2236:18: 'SEQUENCEFILE'
			{
			match("SEQUENCEFILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SEQUENCEFILE"

	// $ANTLR start "KW_TEXTFILE"
	public final void mKW_TEXTFILE() throws RecognitionException {
		try {
			int _type = KW_TEXTFILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2237:12: ( 'TEXTFILE' )
			// Hive.g:2237:14: 'TEXTFILE'
			{
			match("TEXTFILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TEXTFILE"

	// $ANTLR start "KW_RCFILE"
	public final void mKW_RCFILE() throws RecognitionException {
		try {
			int _type = KW_RCFILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2238:10: ( 'RCFILE' )
			// Hive.g:2238:12: 'RCFILE'
			{
			match("RCFILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RCFILE"

	// $ANTLR start "KW_INPUTFORMAT"
	public final void mKW_INPUTFORMAT() throws RecognitionException {
		try {
			int _type = KW_INPUTFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2239:15: ( 'INPUTFORMAT' )
			// Hive.g:2239:17: 'INPUTFORMAT'
			{
			match("INPUTFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPUTFORMAT"

	// $ANTLR start "KW_OUTPUTFORMAT"
	public final void mKW_OUTPUTFORMAT() throws RecognitionException {
		try {
			int _type = KW_OUTPUTFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2240:16: ( 'OUTPUTFORMAT' )
			// Hive.g:2240:18: 'OUTPUTFORMAT'
			{
			match("OUTPUTFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTPUTFORMAT"

	// $ANTLR start "KW_INPUTDRIVER"
	public final void mKW_INPUTDRIVER() throws RecognitionException {
		try {
			int _type = KW_INPUTDRIVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2241:15: ( 'INPUTDRIVER' )
			// Hive.g:2241:17: 'INPUTDRIVER'
			{
			match("INPUTDRIVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPUTDRIVER"

	// $ANTLR start "KW_OUTPUTDRIVER"
	public final void mKW_OUTPUTDRIVER() throws RecognitionException {
		try {
			int _type = KW_OUTPUTDRIVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2242:16: ( 'OUTPUTDRIVER' )
			// Hive.g:2242:18: 'OUTPUTDRIVER'
			{
			match("OUTPUTDRIVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTPUTDRIVER"

	// $ANTLR start "KW_OFFLINE"
	public final void mKW_OFFLINE() throws RecognitionException {
		try {
			int _type = KW_OFFLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2243:11: ( 'OFFLINE' )
			// Hive.g:2243:13: 'OFFLINE'
			{
			match("OFFLINE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OFFLINE"

	// $ANTLR start "KW_ENABLE"
	public final void mKW_ENABLE() throws RecognitionException {
		try {
			int _type = KW_ENABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2244:10: ( 'ENABLE' )
			// Hive.g:2244:12: 'ENABLE'
			{
			match("ENABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ENABLE"

	// $ANTLR start "KW_DISABLE"
	public final void mKW_DISABLE() throws RecognitionException {
		try {
			int _type = KW_DISABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2245:11: ( 'DISABLE' )
			// Hive.g:2245:13: 'DISABLE'
			{
			match("DISABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISABLE"

	// $ANTLR start "KW_READONLY"
	public final void mKW_READONLY() throws RecognitionException {
		try {
			int _type = KW_READONLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2246:12: ( 'READONLY' )
			// Hive.g:2246:14: 'READONLY'
			{
			match("READONLY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_READONLY"

	// $ANTLR start "KW_NO_DROP"
	public final void mKW_NO_DROP() throws RecognitionException {
		try {
			int _type = KW_NO_DROP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2247:11: ( 'NO_DROP' )
			// Hive.g:2247:13: 'NO_DROP'
			{
			match("NO_DROP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NO_DROP"

	// $ANTLR start "KW_LOCATION"
	public final void mKW_LOCATION() throws RecognitionException {
		try {
			int _type = KW_LOCATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2248:12: ( 'LOCATION' )
			// Hive.g:2248:14: 'LOCATION'
			{
			match("LOCATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCATION"

	// $ANTLR start "KW_TABLESAMPLE"
	public final void mKW_TABLESAMPLE() throws RecognitionException {
		try {
			int _type = KW_TABLESAMPLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2249:15: ( 'TABLESAMPLE' )
			// Hive.g:2249:17: 'TABLESAMPLE'
			{
			match("TABLESAMPLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLESAMPLE"

	// $ANTLR start "KW_BUCKET"
	public final void mKW_BUCKET() throws RecognitionException {
		try {
			int _type = KW_BUCKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2250:10: ( 'BUCKET' )
			// Hive.g:2250:12: 'BUCKET'
			{
			match("BUCKET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BUCKET"

	// $ANTLR start "KW_OUT"
	public final void mKW_OUT() throws RecognitionException {
		try {
			int _type = KW_OUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2251:7: ( 'OUT' )
			// Hive.g:2251:9: 'OUT'
			{
			match("OUT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUT"

	// $ANTLR start "KW_OF"
	public final void mKW_OF() throws RecognitionException {
		try {
			int _type = KW_OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2252:6: ( 'OF' )
			// Hive.g:2252:8: 'OF'
			{
			match("OF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OF"

	// $ANTLR start "KW_PERCENT"
	public final void mKW_PERCENT() throws RecognitionException {
		try {
			int _type = KW_PERCENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2253:11: ( 'PERCENT' )
			// Hive.g:2253:13: 'PERCENT'
			{
			match("PERCENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PERCENT"

	// $ANTLR start "KW_CAST"
	public final void mKW_CAST() throws RecognitionException {
		try {
			int _type = KW_CAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2254:8: ( 'CAST' )
			// Hive.g:2254:10: 'CAST'
			{
			match("CAST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CAST"

	// $ANTLR start "KW_ADD"
	public final void mKW_ADD() throws RecognitionException {
		try {
			int _type = KW_ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2255:7: ( 'ADD' )
			// Hive.g:2255:9: 'ADD'
			{
			match("ADD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ADD"

	// $ANTLR start "KW_REPLACE"
	public final void mKW_REPLACE() throws RecognitionException {
		try {
			int _type = KW_REPLACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2256:11: ( 'REPLACE' )
			// Hive.g:2256:13: 'REPLACE'
			{
			match("REPLACE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPLACE"

	// $ANTLR start "KW_COLUMNS"
	public final void mKW_COLUMNS() throws RecognitionException {
		try {
			int _type = KW_COLUMNS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2257:11: ( 'COLUMNS' )
			// Hive.g:2257:13: 'COLUMNS'
			{
			match("COLUMNS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLUMNS"

	// $ANTLR start "KW_RLIKE"
	public final void mKW_RLIKE() throws RecognitionException {
		try {
			int _type = KW_RLIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2258:9: ( 'RLIKE' )
			// Hive.g:2258:11: 'RLIKE'
			{
			match("RLIKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RLIKE"

	// $ANTLR start "KW_REGEXP"
	public final void mKW_REGEXP() throws RecognitionException {
		try {
			int _type = KW_REGEXP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2259:10: ( 'REGEXP' )
			// Hive.g:2259:12: 'REGEXP'
			{
			match("REGEXP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REGEXP"

	// $ANTLR start "KW_TEMPORARY"
	public final void mKW_TEMPORARY() throws RecognitionException {
		try {
			int _type = KW_TEMPORARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2260:13: ( 'TEMPORARY' )
			// Hive.g:2260:15: 'TEMPORARY'
			{
			match("TEMPORARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TEMPORARY"

	// $ANTLR start "KW_FUNCTION"
	public final void mKW_FUNCTION() throws RecognitionException {
		try {
			int _type = KW_FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2261:12: ( 'FUNCTION' )
			// Hive.g:2261:14: 'FUNCTION'
			{
			match("FUNCTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FUNCTION"

	// $ANTLR start "KW_EXPLAIN"
	public final void mKW_EXPLAIN() throws RecognitionException {
		try {
			int _type = KW_EXPLAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2262:11: ( 'EXPLAIN' )
			// Hive.g:2262:13: 'EXPLAIN'
			{
			match("EXPLAIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXPLAIN"

	// $ANTLR start "KW_EXTENDED"
	public final void mKW_EXTENDED() throws RecognitionException {
		try {
			int _type = KW_EXTENDED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2263:12: ( 'EXTENDED' )
			// Hive.g:2263:14: 'EXTENDED'
			{
			match("EXTENDED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXTENDED"

	// $ANTLR start "KW_FORMATTED"
	public final void mKW_FORMATTED() throws RecognitionException {
		try {
			int _type = KW_FORMATTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2264:13: ( 'FORMATTED' )
			// Hive.g:2264:15: 'FORMATTED'
			{
			match("FORMATTED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FORMATTED"

	// $ANTLR start "KW_SERDE"
	public final void mKW_SERDE() throws RecognitionException {
		try {
			int _type = KW_SERDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2265:9: ( 'SERDE' )
			// Hive.g:2265:11: 'SERDE'
			{
			match("SERDE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SERDE"

	// $ANTLR start "KW_WITH"
	public final void mKW_WITH() throws RecognitionException {
		try {
			int _type = KW_WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2266:8: ( 'WITH' )
			// Hive.g:2266:10: 'WITH'
			{
			match("WITH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WITH"

	// $ANTLR start "KW_DEFERRED"
	public final void mKW_DEFERRED() throws RecognitionException {
		try {
			int _type = KW_DEFERRED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2267:12: ( 'DEFERRED' )
			// Hive.g:2267:14: 'DEFERRED'
			{
			match("DEFERRED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEFERRED"

	// $ANTLR start "KW_SERDEPROPERTIES"
	public final void mKW_SERDEPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_SERDEPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2268:19: ( 'SERDEPROPERTIES' )
			// Hive.g:2268:21: 'SERDEPROPERTIES'
			{
			match("SERDEPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SERDEPROPERTIES"

	// $ANTLR start "KW_DBPROPERTIES"
	public final void mKW_DBPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_DBPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2269:16: ( 'DBPROPERTIES' )
			// Hive.g:2269:18: 'DBPROPERTIES'
			{
			match("DBPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DBPROPERTIES"

	// $ANTLR start "KW_LIMIT"
	public final void mKW_LIMIT() throws RecognitionException {
		try {
			int _type = KW_LIMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2270:9: ( 'LIMIT' )
			// Hive.g:2270:11: 'LIMIT'
			{
			match("LIMIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LIMIT"

	// $ANTLR start "KW_SET"
	public final void mKW_SET() throws RecognitionException {
		try {
			int _type = KW_SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2271:7: ( 'SET' )
			// Hive.g:2271:9: 'SET'
			{
			match("SET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SET"

	// $ANTLR start "KW_TBLPROPERTIES"
	public final void mKW_TBLPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_TBLPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2272:17: ( 'TBLPROPERTIES' )
			// Hive.g:2272:19: 'TBLPROPERTIES'
			{
			match("TBLPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TBLPROPERTIES"

	// $ANTLR start "KW_IDXPROPERTIES"
	public final void mKW_IDXPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_IDXPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2273:17: ( 'IDXPROPERTIES' )
			// Hive.g:2273:19: 'IDXPROPERTIES'
			{
			match("IDXPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IDXPROPERTIES"

	// $ANTLR start "KW_VALUE_TYPE"
	public final void mKW_VALUE_TYPE() throws RecognitionException {
		try {
			int _type = KW_VALUE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2274:14: ( '$VALUE$' )
			// Hive.g:2274:16: '$VALUE$'
			{
			match("$VALUE$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VALUE_TYPE"

	// $ANTLR start "KW_ELEM_TYPE"
	public final void mKW_ELEM_TYPE() throws RecognitionException {
		try {
			int _type = KW_ELEM_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2275:13: ( '$ELEM$' )
			// Hive.g:2275:15: '$ELEM$'
			{
			match("$ELEM$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ELEM_TYPE"

	// $ANTLR start "KW_CASE"
	public final void mKW_CASE() throws RecognitionException {
		try {
			int _type = KW_CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2276:8: ( 'CASE' )
			// Hive.g:2276:10: 'CASE'
			{
			match("CASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CASE"

	// $ANTLR start "KW_WHEN"
	public final void mKW_WHEN() throws RecognitionException {
		try {
			int _type = KW_WHEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2277:8: ( 'WHEN' )
			// Hive.g:2277:10: 'WHEN'
			{
			match("WHEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHEN"

	// $ANTLR start "KW_THEN"
	public final void mKW_THEN() throws RecognitionException {
		try {
			int _type = KW_THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2278:8: ( 'THEN' )
			// Hive.g:2278:10: 'THEN'
			{
			match("THEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_THEN"

	// $ANTLR start "KW_ELSE"
	public final void mKW_ELSE() throws RecognitionException {
		try {
			int _type = KW_ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2279:8: ( 'ELSE' )
			// Hive.g:2279:10: 'ELSE'
			{
			match("ELSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ELSE"

	// $ANTLR start "KW_END"
	public final void mKW_END() throws RecognitionException {
		try {
			int _type = KW_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2280:7: ( 'END' )
			// Hive.g:2280:9: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_END"

	// $ANTLR start "KW_MAPJOIN"
	public final void mKW_MAPJOIN() throws RecognitionException {
		try {
			int _type = KW_MAPJOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2281:11: ( 'MAPJOIN' )
			// Hive.g:2281:13: 'MAPJOIN'
			{
			match("MAPJOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MAPJOIN"

	// $ANTLR start "KW_STREAMTABLE"
	public final void mKW_STREAMTABLE() throws RecognitionException {
		try {
			int _type = KW_STREAMTABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2282:15: ( 'STREAMTABLE' )
			// Hive.g:2282:17: 'STREAMTABLE'
			{
			match("STREAMTABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STREAMTABLE"

	// $ANTLR start "KW_HOLD_DDLTIME"
	public final void mKW_HOLD_DDLTIME() throws RecognitionException {
		try {
			int _type = KW_HOLD_DDLTIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2283:16: ( 'HOLD_DDLTIME' )
			// Hive.g:2283:18: 'HOLD_DDLTIME'
			{
			match("HOLD_DDLTIME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_HOLD_DDLTIME"

	// $ANTLR start "KW_CLUSTERSTATUS"
	public final void mKW_CLUSTERSTATUS() throws RecognitionException {
		try {
			int _type = KW_CLUSTERSTATUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2284:17: ( 'CLUSTERSTATUS' )
			// Hive.g:2284:19: 'CLUSTERSTATUS'
			{
			match("CLUSTERSTATUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTERSTATUS"

	// $ANTLR start "KW_UTC"
	public final void mKW_UTC() throws RecognitionException {
		try {
			int _type = KW_UTC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2285:7: ( 'UTC' )
			// Hive.g:2285:9: 'UTC'
			{
			match("UTC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UTC"

	// $ANTLR start "KW_UTCTIMESTAMP"
	public final void mKW_UTCTIMESTAMP() throws RecognitionException {
		try {
			int _type = KW_UTCTIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2286:16: ( 'UTC_TMESTAMP' )
			// Hive.g:2286:18: 'UTC_TMESTAMP'
			{
			match("UTC_TMESTAMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UTCTIMESTAMP"

	// $ANTLR start "KW_LONG"
	public final void mKW_LONG() throws RecognitionException {
		try {
			int _type = KW_LONG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2287:8: ( 'LONG' )
			// Hive.g:2287:10: 'LONG'
			{
			match("LONG"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LONG"

	// $ANTLR start "KW_DELETE"
	public final void mKW_DELETE() throws RecognitionException {
		try {
			int _type = KW_DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2288:10: ( 'DELETE' )
			// Hive.g:2288:12: 'DELETE'
			{
			match("DELETE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DELETE"

	// $ANTLR start "KW_PLUS"
	public final void mKW_PLUS() throws RecognitionException {
		try {
			int _type = KW_PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2289:8: ( 'PLUS' )
			// Hive.g:2289:10: 'PLUS'
			{
			match("PLUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PLUS"

	// $ANTLR start "KW_MINUS"
	public final void mKW_MINUS() throws RecognitionException {
		try {
			int _type = KW_MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2290:9: ( 'MINUS' )
			// Hive.g:2290:11: 'MINUS'
			{
			match("MINUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MINUS"

	// $ANTLR start "KW_FETCH"
	public final void mKW_FETCH() throws RecognitionException {
		try {
			int _type = KW_FETCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2291:9: ( 'FETCH' )
			// Hive.g:2291:11: 'FETCH'
			{
			match("FETCH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FETCH"

	// $ANTLR start "KW_INTERSECT"
	public final void mKW_INTERSECT() throws RecognitionException {
		try {
			int _type = KW_INTERSECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2292:13: ( 'INTERSECT' )
			// Hive.g:2292:15: 'INTERSECT'
			{
			match("INTERSECT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INTERSECT"

	// $ANTLR start "KW_VIEW"
	public final void mKW_VIEW() throws RecognitionException {
		try {
			int _type = KW_VIEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2293:8: ( 'VIEW' )
			// Hive.g:2293:10: 'VIEW'
			{
			match("VIEW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VIEW"

	// $ANTLR start "KW_IN"
	public final void mKW_IN() throws RecognitionException {
		try {
			int _type = KW_IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2294:6: ( 'IN' )
			// Hive.g:2294:8: 'IN'
			{
			match("IN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IN"

	// $ANTLR start "KW_DATABASE"
	public final void mKW_DATABASE() throws RecognitionException {
		try {
			int _type = KW_DATABASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2295:12: ( 'DATABASE' )
			// Hive.g:2295:14: 'DATABASE'
			{
			match("DATABASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATABASE"

	// $ANTLR start "KW_DATABASES"
	public final void mKW_DATABASES() throws RecognitionException {
		try {
			int _type = KW_DATABASES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2296:13: ( 'DATABASES' )
			// Hive.g:2296:15: 'DATABASES'
			{
			match("DATABASES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATABASES"

	// $ANTLR start "KW_MATERIALIZED"
	public final void mKW_MATERIALIZED() throws RecognitionException {
		try {
			int _type = KW_MATERIALIZED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2297:16: ( 'MATERIALIZED' )
			// Hive.g:2297:18: 'MATERIALIZED'
			{
			match("MATERIALIZED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MATERIALIZED"

	// $ANTLR start "KW_SCHEMA"
	public final void mKW_SCHEMA() throws RecognitionException {
		try {
			int _type = KW_SCHEMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2298:10: ( 'SCHEMA' )
			// Hive.g:2298:12: 'SCHEMA'
			{
			match("SCHEMA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SCHEMA"

	// $ANTLR start "KW_SCHEMAS"
	public final void mKW_SCHEMAS() throws RecognitionException {
		try {
			int _type = KW_SCHEMAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2299:11: ( 'SCHEMAS' )
			// Hive.g:2299:13: 'SCHEMAS'
			{
			match("SCHEMAS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SCHEMAS"

	// $ANTLR start "KW_GRANT"
	public final void mKW_GRANT() throws RecognitionException {
		try {
			int _type = KW_GRANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2300:9: ( 'GRANT' )
			// Hive.g:2300:11: 'GRANT'
			{
			match("GRANT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_GRANT"

	// $ANTLR start "KW_REVOKE"
	public final void mKW_REVOKE() throws RecognitionException {
		try {
			int _type = KW_REVOKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2301:10: ( 'REVOKE' )
			// Hive.g:2301:12: 'REVOKE'
			{
			match("REVOKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REVOKE"

	// $ANTLR start "KW_SSL"
	public final void mKW_SSL() throws RecognitionException {
		try {
			int _type = KW_SSL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2302:7: ( 'SSL' )
			// Hive.g:2302:9: 'SSL'
			{
			match("SSL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SSL"

	// $ANTLR start "KW_UNDO"
	public final void mKW_UNDO() throws RecognitionException {
		try {
			int _type = KW_UNDO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2303:8: ( 'UNDO' )
			// Hive.g:2303:10: 'UNDO'
			{
			match("UNDO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNDO"

	// $ANTLR start "KW_LOCK"
	public final void mKW_LOCK() throws RecognitionException {
		try {
			int _type = KW_LOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2304:8: ( 'LOCK' )
			// Hive.g:2304:10: 'LOCK'
			{
			match("LOCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCK"

	// $ANTLR start "KW_LOCKS"
	public final void mKW_LOCKS() throws RecognitionException {
		try {
			int _type = KW_LOCKS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2305:9: ( 'LOCKS' )
			// Hive.g:2305:11: 'LOCKS'
			{
			match("LOCKS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCKS"

	// $ANTLR start "KW_UNLOCK"
	public final void mKW_UNLOCK() throws RecognitionException {
		try {
			int _type = KW_UNLOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2306:10: ( 'UNLOCK' )
			// Hive.g:2306:12: 'UNLOCK'
			{
			match("UNLOCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNLOCK"

	// $ANTLR start "KW_SHARED"
	public final void mKW_SHARED() throws RecognitionException {
		try {
			int _type = KW_SHARED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2307:10: ( 'SHARED' )
			// Hive.g:2307:12: 'SHARED'
			{
			match("SHARED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHARED"

	// $ANTLR start "KW_EXCLUSIVE"
	public final void mKW_EXCLUSIVE() throws RecognitionException {
		try {
			int _type = KW_EXCLUSIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2308:13: ( 'EXCLUSIVE' )
			// Hive.g:2308:15: 'EXCLUSIVE'
			{
			match("EXCLUSIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXCLUSIVE"

	// $ANTLR start "KW_PROCEDURE"
	public final void mKW_PROCEDURE() throws RecognitionException {
		try {
			int _type = KW_PROCEDURE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2309:13: ( 'PROCEDURE' )
			// Hive.g:2309:15: 'PROCEDURE'
			{
			match("PROCEDURE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PROCEDURE"

	// $ANTLR start "KW_UNSIGNED"
	public final void mKW_UNSIGNED() throws RecognitionException {
		try {
			int _type = KW_UNSIGNED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2310:12: ( 'UNSIGNED' )
			// Hive.g:2310:14: 'UNSIGNED'
			{
			match("UNSIGNED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNSIGNED"

	// $ANTLR start "KW_WHILE"
	public final void mKW_WHILE() throws RecognitionException {
		try {
			int _type = KW_WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2311:9: ( 'WHILE' )
			// Hive.g:2311:11: 'WHILE'
			{
			match("WHILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHILE"

	// $ANTLR start "KW_READ"
	public final void mKW_READ() throws RecognitionException {
		try {
			int _type = KW_READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2312:8: ( 'READ' )
			// Hive.g:2312:10: 'READ'
			{
			match("READ"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_READ"

	// $ANTLR start "KW_READS"
	public final void mKW_READS() throws RecognitionException {
		try {
			int _type = KW_READS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2313:9: ( 'READS' )
			// Hive.g:2313:11: 'READS'
			{
			match("READS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_READS"

	// $ANTLR start "KW_PURGE"
	public final void mKW_PURGE() throws RecognitionException {
		try {
			int _type = KW_PURGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2314:9: ( 'PURGE' )
			// Hive.g:2314:11: 'PURGE'
			{
			match("PURGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PURGE"

	// $ANTLR start "KW_RANGE"
	public final void mKW_RANGE() throws RecognitionException {
		try {
			int _type = KW_RANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2315:9: ( 'RANGE' )
			// Hive.g:2315:11: 'RANGE'
			{
			match("RANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RANGE"

	// $ANTLR start "KW_ANALYZE"
	public final void mKW_ANALYZE() throws RecognitionException {
		try {
			int _type = KW_ANALYZE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2316:11: ( 'ANALYZE' )
			// Hive.g:2316:13: 'ANALYZE'
			{
			match("ANALYZE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ANALYZE"

	// $ANTLR start "KW_BEFORE"
	public final void mKW_BEFORE() throws RecognitionException {
		try {
			int _type = KW_BEFORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2317:10: ( 'BEFORE' )
			// Hive.g:2317:12: 'BEFORE'
			{
			match("BEFORE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BEFORE"

	// $ANTLR start "KW_BETWEEN"
	public final void mKW_BETWEEN() throws RecognitionException {
		try {
			int _type = KW_BETWEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2318:11: ( 'BETWEEN' )
			// Hive.g:2318:13: 'BETWEEN'
			{
			match("BETWEEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BETWEEN"

	// $ANTLR start "KW_BOTH"
	public final void mKW_BOTH() throws RecognitionException {
		try {
			int _type = KW_BOTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2319:8: ( 'BOTH' )
			// Hive.g:2319:10: 'BOTH'
			{
			match("BOTH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BOTH"

	// $ANTLR start "KW_BINARY"
	public final void mKW_BINARY() throws RecognitionException {
		try {
			int _type = KW_BINARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2320:10: ( 'BINARY' )
			// Hive.g:2320:12: 'BINARY'
			{
			match("BINARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BINARY"

	// $ANTLR start "KW_CROSS"
	public final void mKW_CROSS() throws RecognitionException {
		try {
			int _type = KW_CROSS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2321:9: ( 'CROSS' )
			// Hive.g:2321:11: 'CROSS'
			{
			match("CROSS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CROSS"

	// $ANTLR start "KW_CONTINUE"
	public final void mKW_CONTINUE() throws RecognitionException {
		try {
			int _type = KW_CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2322:12: ( 'CONTINUE' )
			// Hive.g:2322:14: 'CONTINUE'
			{
			match("CONTINUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONTINUE"

	// $ANTLR start "KW_CURSOR"
	public final void mKW_CURSOR() throws RecognitionException {
		try {
			int _type = KW_CURSOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2323:10: ( 'CURSOR' )
			// Hive.g:2323:12: 'CURSOR'
			{
			match("CURSOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURSOR"

	// $ANTLR start "KW_TRIGGER"
	public final void mKW_TRIGGER() throws RecognitionException {
		try {
			int _type = KW_TRIGGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2324:11: ( 'TRIGGER' )
			// Hive.g:2324:13: 'TRIGGER'
			{
			match("TRIGGER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRIGGER"

	// $ANTLR start "KW_RECORDREADER"
	public final void mKW_RECORDREADER() throws RecognitionException {
		try {
			int _type = KW_RECORDREADER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2325:16: ( 'RECORDREADER' )
			// Hive.g:2325:18: 'RECORDREADER'
			{
			match("RECORDREADER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RECORDREADER"

	// $ANTLR start "KW_RECORDWRITER"
	public final void mKW_RECORDWRITER() throws RecognitionException {
		try {
			int _type = KW_RECORDWRITER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2326:16: ( 'RECORDWRITER' )
			// Hive.g:2326:18: 'RECORDWRITER'
			{
			match("RECORDWRITER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RECORDWRITER"

	// $ANTLR start "KW_SEMI"
	public final void mKW_SEMI() throws RecognitionException {
		try {
			int _type = KW_SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2327:8: ( 'SEMI' )
			// Hive.g:2327:10: 'SEMI'
			{
			match("SEMI"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SEMI"

	// $ANTLR start "KW_LATERAL"
	public final void mKW_LATERAL() throws RecognitionException {
		try {
			int _type = KW_LATERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2328:11: ( 'LATERAL' )
			// Hive.g:2328:13: 'LATERAL'
			{
			match("LATERAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LATERAL"

	// $ANTLR start "KW_TOUCH"
	public final void mKW_TOUCH() throws RecognitionException {
		try {
			int _type = KW_TOUCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2329:9: ( 'TOUCH' )
			// Hive.g:2329:11: 'TOUCH'
			{
			match("TOUCH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TOUCH"

	// $ANTLR start "KW_ARCHIVE"
	public final void mKW_ARCHIVE() throws RecognitionException {
		try {
			int _type = KW_ARCHIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2330:11: ( 'ARCHIVE' )
			// Hive.g:2330:13: 'ARCHIVE'
			{
			match("ARCHIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ARCHIVE"

	// $ANTLR start "KW_UNARCHIVE"
	public final void mKW_UNARCHIVE() throws RecognitionException {
		try {
			int _type = KW_UNARCHIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2331:13: ( 'UNARCHIVE' )
			// Hive.g:2331:15: 'UNARCHIVE'
			{
			match("UNARCHIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNARCHIVE"

	// $ANTLR start "KW_COMPUTE"
	public final void mKW_COMPUTE() throws RecognitionException {
		try {
			int _type = KW_COMPUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2332:11: ( 'COMPUTE' )
			// Hive.g:2332:13: 'COMPUTE'
			{
			match("COMPUTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMPUTE"

	// $ANTLR start "KW_STATISTICS"
	public final void mKW_STATISTICS() throws RecognitionException {
		try {
			int _type = KW_STATISTICS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2333:14: ( 'STATISTICS' )
			// Hive.g:2333:16: 'STATISTICS'
			{
			match("STATISTICS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STATISTICS"

	// $ANTLR start "KW_USE"
	public final void mKW_USE() throws RecognitionException {
		try {
			int _type = KW_USE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2334:7: ( 'USE' )
			// Hive.g:2334:9: 'USE'
			{
			match("USE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_USE"

	// $ANTLR start "KW_OPTION"
	public final void mKW_OPTION() throws RecognitionException {
		try {
			int _type = KW_OPTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2335:10: ( 'OPTION' )
			// Hive.g:2335:12: 'OPTION'
			{
			match("OPTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OPTION"

	// $ANTLR start "KW_CONCATENATE"
	public final void mKW_CONCATENATE() throws RecognitionException {
		try {
			int _type = KW_CONCATENATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2336:15: ( 'CONCATENATE' )
			// Hive.g:2336:17: 'CONCATENATE'
			{
			match("CONCATENATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONCATENATE"

	// $ANTLR start "KW_SHOW_DATABASE"
	public final void mKW_SHOW_DATABASE() throws RecognitionException {
		try {
			int _type = KW_SHOW_DATABASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2337:17: ( 'SHOW_DATABASE' )
			// Hive.g:2337:19: 'SHOW_DATABASE'
			{
			match("SHOW_DATABASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHOW_DATABASE"

	// $ANTLR start "KW_UPDATE"
	public final void mKW_UPDATE() throws RecognitionException {
		try {
			int _type = KW_UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2338:10: ( 'UPDATE' )
			// Hive.g:2338:12: 'UPDATE'
			{
			match("UPDATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UPDATE"

	// $ANTLR start "KW_RESTRICT"
	public final void mKW_RESTRICT() throws RecognitionException {
		try {
			int _type = KW_RESTRICT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2339:12: ( 'RESTRICT' )
			// Hive.g:2339:14: 'RESTRICT'
			{
			match("RESTRICT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RESTRICT"

	// $ANTLR start "KW_CASCADE"
	public final void mKW_CASCADE() throws RecognitionException {
		try {
			int _type = KW_CASCADE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2340:11: ( 'CASCADE' )
			// Hive.g:2340:13: 'CASCADE'
			{
			match("CASCADE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CASCADE"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2346:5: ( '.' )
			// Hive.g:2346:7: '.'
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
	// $ANTLR end "DOT"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2347:7: ( ':' )
			// Hive.g:2347:9: ':'
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
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2348:7: ( ',' )
			// Hive.g:2348:9: ','
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
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2349:11: ( ';' )
			// Hive.g:2349:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2351:8: ( '(' )
			// Hive.g:2351:10: '('
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
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2352:8: ( ')' )
			// Hive.g:2352:10: ')'
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
	// $ANTLR end "RPAREN"

	// $ANTLR start "LSQUARE"
	public final void mLSQUARE() throws RecognitionException {
		try {
			int _type = LSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2353:9: ( '[' )
			// Hive.g:2353:11: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSQUARE"

	// $ANTLR start "RSQUARE"
	public final void mRSQUARE() throws RecognitionException {
		try {
			int _type = RSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2354:9: ( ']' )
			// Hive.g:2354:11: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSQUARE"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2355:8: ( '{' )
			// Hive.g:2355:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2356:8: ( '}' )
			// Hive.g:2356:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2358:7: ( '=' | '==' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='=') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='=') ) {
					alt2=2;
				}

				else {
					alt2=1;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Hive.g:2358:9: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// Hive.g:2358:15: '=='
					{
					match("=="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "NOTEQUAL"
	public final void mNOTEQUAL() throws RecognitionException {
		try {
			int _type = NOTEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2359:10: ( '<>' | '!=' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='<') ) {
				alt3=1;
			}
			else if ( (LA3_0=='!') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// Hive.g:2359:12: '<>'
					{
					match("<>"); 

					}
					break;
				case 2 :
					// Hive.g:2359:19: '!='
					{
					match("!="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTEQUAL"

	// $ANTLR start "LESSTHANOREQUALTO"
	public final void mLESSTHANOREQUALTO() throws RecognitionException {
		try {
			int _type = LESSTHANOREQUALTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2360:19: ( '<=' )
			// Hive.g:2360:21: '<='
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
	// $ANTLR end "LESSTHANOREQUALTO"

	// $ANTLR start "LESSTHAN"
	public final void mLESSTHAN() throws RecognitionException {
		try {
			int _type = LESSTHAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2361:10: ( '<' )
			// Hive.g:2361:12: '<'
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
	// $ANTLR end "LESSTHAN"

	// $ANTLR start "GREATERTHANOREQUALTO"
	public final void mGREATERTHANOREQUALTO() throws RecognitionException {
		try {
			int _type = GREATERTHANOREQUALTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2362:22: ( '>=' )
			// Hive.g:2362:24: '>='
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
	// $ANTLR end "GREATERTHANOREQUALTO"

	// $ANTLR start "GREATERTHAN"
	public final void mGREATERTHAN() throws RecognitionException {
		try {
			int _type = GREATERTHAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2363:13: ( '>' )
			// Hive.g:2363:15: '>'
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
	// $ANTLR end "GREATERTHAN"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2365:8: ( '/' )
			// Hive.g:2365:10: '/'
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
	// $ANTLR end "DIVIDE"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2366:6: ( '+' )
			// Hive.g:2366:8: '+'
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
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2367:7: ( '-' )
			// Hive.g:2367:9: '-'
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
	// $ANTLR end "MINUS"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2368:6: ( '*' )
			// Hive.g:2368:8: '*'
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
	// $ANTLR end "STAR"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2369:5: ( '%' )
			// Hive.g:2369:7: '%'
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
	// $ANTLR end "MOD"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2370:5: ( 'DIV' )
			// Hive.g:2370:7: 'DIV'
			{
			match("DIV"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "AMPERSAND"
	public final void mAMPERSAND() throws RecognitionException {
		try {
			int _type = AMPERSAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2372:11: ( '&' )
			// Hive.g:2372:13: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AMPERSAND"

	// $ANTLR start "TILDE"
	public final void mTILDE() throws RecognitionException {
		try {
			int _type = TILDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2373:7: ( '~' )
			// Hive.g:2373:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TILDE"

	// $ANTLR start "BITWISEOR"
	public final void mBITWISEOR() throws RecognitionException {
		try {
			int _type = BITWISEOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2374:11: ( '|' )
			// Hive.g:2374:13: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISEOR"

	// $ANTLR start "BITWISEXOR"
	public final void mBITWISEXOR() throws RecognitionException {
		try {
			int _type = BITWISEXOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2375:12: ( '^' )
			// Hive.g:2375:14: '^'
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
	// $ANTLR end "BITWISEXOR"

	// $ANTLR start "QUESTION"
	public final void mQUESTION() throws RecognitionException {
		try {
			int _type = QUESTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2376:10: ( '?' )
			// Hive.g:2376:12: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION"

	// $ANTLR start "DOLLAR"
	public final void mDOLLAR() throws RecognitionException {
		try {
			int _type = DOLLAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2377:8: ( '$' )
			// Hive.g:2377:10: '$'
			{
			match('$'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOLLAR"

	// $ANTLR start "Letter"
	public final void mLetter() throws RecognitionException {
		try {
			// Hive.g:2383:5: ( 'a' .. 'z' | 'A' .. 'Z' )
			// Hive.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "Letter"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// Hive.g:2388:5: ( 'a' .. 'f' | 'A' .. 'F' )
			// Hive.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
	// $ANTLR end "HexDigit"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// Hive.g:2393:5: ( '0' .. '9' )
			// Hive.g:
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
	// $ANTLR end "Digit"

	// $ANTLR start "Exponent"
	public final void mExponent() throws RecognitionException {
		try {
			// Hive.g:2399:5: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+ )
			// Hive.g:2400:5: ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Hive.g:2400:17: ( PLUS | MINUS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='+'||LA4_0=='-') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Hive.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// Hive.g:2400:33: ( Digit )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Hive.g:
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Exponent"

	// $ANTLR start "RegexComponent"
	public final void mRegexComponent() throws RecognitionException {
		try {
			// Hive.g:2405:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | PLUS | STAR | QUESTION | MINUS | DOT | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | BITWISEXOR | BITWISEOR | DOLLAR )
			// Hive.g:
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
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
	// $ANTLR end "RegexComponent"

	// $ANTLR start "StringLiteral"
	public final void mStringLiteral() throws RecognitionException {
		try {
			int _type = StringLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2411:5: ( ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+ )
			// Hive.g:2412:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
			{
			// Hive.g:2412:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='\'') ) {
					alt8=1;
				}
				else if ( (LA8_0=='\"') ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// Hive.g:2412:7: '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\''
					{
					match('\''); 
					// Hive.g:2412:12: (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )*
					loop6:
					while (true) {
						int alt6=3;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '\u0000' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}
						else if ( (LA6_0=='\\') ) {
							alt6=2;
						}

						switch (alt6) {
						case 1 :
							// Hive.g:2412:14: ~ ( '\\'' | '\\\\' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
							// Hive.g:2412:29: ( '\\\\' . )
							{
							// Hive.g:2412:29: ( '\\\\' . )
							// Hive.g:2412:30: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}

							}
							break;

						default :
							break loop6;
						}
					}

					match('\''); 
					}
					break;
				case 2 :
					// Hive.g:2413:7: '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"'
					{
					match('\"'); 
					// Hive.g:2413:12: (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )*
					loop7:
					while (true) {
						int alt7=3;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}
						else if ( (LA7_0=='\\') ) {
							alt7=2;
						}

						switch (alt7) {
						case 1 :
							// Hive.g:2413:14: ~ ( '\\\"' | '\\\\' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
							// Hive.g:2413:29: ( '\\\\' . )
							{
							// Hive.g:2413:29: ( '\\\\' . )
							// Hive.g:2413:30: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}

							}
							break;

						default :
							break loop7;
						}
					}

					match('\"'); 
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "StringLiteral"

	// $ANTLR start "CharSetLiteral"
	public final void mCharSetLiteral() throws RecognitionException {
		try {
			int _type = CharSetLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2418:5: ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\"'||LA10_0=='\'') ) {
				alt10=1;
			}
			else if ( (LA10_0=='0') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// Hive.g:2419:5: StringLiteral
					{
					mStringLiteral(); 

					}
					break;
				case 2 :
					// Hive.g:2420:7: '0' 'X' ( HexDigit | Digit )+
					{
					match('0'); 
					match('X'); 
					// Hive.g:2420:15: ( HexDigit | Digit )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'F')||(LA9_0 >= 'a' && LA9_0 <= 'f')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// Hive.g:
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
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CharSetLiteral"

	// $ANTLR start "BigintLiteral"
	public final void mBigintLiteral() throws RecognitionException {
		try {
			int _type = BigintLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2424:5: ( ( Digit )+ 'L' )
			// Hive.g:2425:5: ( Digit )+ 'L'
			{
			// Hive.g:2425:5: ( Digit )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// Hive.g:
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
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			match('L'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BigintLiteral"

	// $ANTLR start "SmallintLiteral"
	public final void mSmallintLiteral() throws RecognitionException {
		try {
			int _type = SmallintLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2429:5: ( ( Digit )+ 'S' )
			// Hive.g:2430:5: ( Digit )+ 'S'
			{
			// Hive.g:2430:5: ( Digit )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Hive.g:
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
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			match('S'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SmallintLiteral"

	// $ANTLR start "TinyintLiteral"
	public final void mTinyintLiteral() throws RecognitionException {
		try {
			int _type = TinyintLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2434:5: ( ( Digit )+ 'Y' )
			// Hive.g:2435:5: ( Digit )+ 'Y'
			{
			// Hive.g:2435:5: ( Digit )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// Hive.g:
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
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			match('Y'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TinyintLiteral"

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2439:5: ( ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )? )
			// Hive.g:2440:5: ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )?
			{
			// Hive.g:2440:5: ( Digit )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Hive.g:
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
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			// Hive.g:2440:14: ( DOT ( Digit )* ( Exponent )? | Exponent )?
			int alt17=3;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='.') ) {
				alt17=1;
			}
			else if ( (LA17_0=='E'||LA17_0=='e') ) {
				alt17=2;
			}
			switch (alt17) {
				case 1 :
					// Hive.g:2440:16: DOT ( Digit )* ( Exponent )?
					{
					mDOT(); 

					// Hive.g:2440:20: ( Digit )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// Hive.g:
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
							break loop15;
						}
					}

					// Hive.g:2440:29: ( Exponent )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0=='E'||LA16_0=='e') ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// Hive.g:2440:30: Exponent
							{
							mExponent(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// Hive.g:2440:43: Exponent
					{
					mExponent(); 

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
	// $ANTLR end "Number"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2444:5: ( ( Letter | Digit ) ( Letter | Digit | '_' )* | '`' ( RegexComponent )+ '`' )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( ((LA20_0 >= '0' && LA20_0 <= '9')||(LA20_0 >= 'A' && LA20_0 <= 'Z')||(LA20_0 >= 'a' && LA20_0 <= 'z')) ) {
				alt20=1;
			}
			else if ( (LA20_0=='`') ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// Hive.g:2445:5: ( Letter | Digit ) ( Letter | Digit | '_' )*
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// Hive.g:2445:22: ( Letter | Digit | '_' )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( ((LA18_0 >= '0' && LA18_0 <= '9')||(LA18_0 >= 'A' && LA18_0 <= 'Z')||LA18_0=='_'||(LA18_0 >= 'a' && LA18_0 <= 'z')) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// Hive.g:
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
							break loop18;
						}
					}

					}
					break;
				case 2 :
					// Hive.g:2446:7: '`' ( RegexComponent )+ '`'
					{
					match('`'); 
					// Hive.g:2446:11: ( RegexComponent )+
					int cnt19=0;
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0=='$'||(LA19_0 >= '(' && LA19_0 <= '+')||(LA19_0 >= '-' && LA19_0 <= '.')||(LA19_0 >= '0' && LA19_0 <= '9')||LA19_0=='?'||(LA19_0 >= 'A' && LA19_0 <= '[')||(LA19_0 >= ']' && LA19_0 <= '_')||(LA19_0 >= 'a' && LA19_0 <= '}')) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// Hive.g:
							{
							if ( input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
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
							if ( cnt19 >= 1 ) break loop19;
							EarlyExitException eee = new EarlyExitException(19, input);
							throw eee;
						}
						cnt19++;
					}

					match('`'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "CharSetName"
	public final void mCharSetName() throws RecognitionException {
		try {
			int _type = CharSetName;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2450:5: ( '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+ )
			// Hive.g:2451:5: '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+
			{
			match('_'); 
			// Hive.g:2451:9: ( Letter | Digit | '_' | '-' | '.' | ':' )+
			int cnt21=0;
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= '-' && LA21_0 <= '.')||(LA21_0 >= '0' && LA21_0 <= ':')||(LA21_0 >= 'A' && LA21_0 <= 'Z')||LA21_0=='_'||(LA21_0 >= 'a' && LA21_0 <= 'z')) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// Hive.g:
					{
					if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					if ( cnt21 >= 1 ) break loop21;
					EarlyExitException eee = new EarlyExitException(21, input);
					throw eee;
				}
				cnt21++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CharSetName"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2454:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
			// Hive.g:2454:8: ( ' ' | '\\r' | '\\t' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hive.g:2458:3: ( '--' (~ ( '\\n' | '\\r' ) )* )
			// Hive.g:2458:5: '--' (~ ( '\\n' | '\\r' ) )*
			{
			match("--"); 

			// Hive.g:2458:10: (~ ( '\\n' | '\\r' ) )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= '\u0000' && LA22_0 <= '\t')||(LA22_0 >= '\u000B' && LA22_0 <= '\f')||(LA22_0 >= '\u000E' && LA22_0 <= '\uFFFF')) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// Hive.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
					break loop22;
				}
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// Hive.g:1:8: ( KW_TRUE | KW_FALSE | KW_ALL | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_STRING | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_COLUMNS | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_EXPLAIN | KW_EXTENDED | KW_FORMATTED | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | BigintLiteral | SmallintLiteral | TinyintLiteral | Number | Identifier | CharSetName | WS | COMMENT )
		int alt23=245;
		alt23 = dfa23.predict(input);
		switch (alt23) {
			case 1 :
				// Hive.g:1:10: KW_TRUE
				{
				mKW_TRUE(); 

				}
				break;
			case 2 :
				// Hive.g:1:18: KW_FALSE
				{
				mKW_FALSE(); 

				}
				break;
			case 3 :
				// Hive.g:1:27: KW_ALL
				{
				mKW_ALL(); 

				}
				break;
			case 4 :
				// Hive.g:1:34: KW_AND
				{
				mKW_AND(); 

				}
				break;
			case 5 :
				// Hive.g:1:41: KW_OR
				{
				mKW_OR(); 

				}
				break;
			case 6 :
				// Hive.g:1:47: KW_NOT
				{
				mKW_NOT(); 

				}
				break;
			case 7 :
				// Hive.g:1:54: KW_LIKE
				{
				mKW_LIKE(); 

				}
				break;
			case 8 :
				// Hive.g:1:62: KW_IF
				{
				mKW_IF(); 

				}
				break;
			case 9 :
				// Hive.g:1:68: KW_EXISTS
				{
				mKW_EXISTS(); 

				}
				break;
			case 10 :
				// Hive.g:1:78: KW_ASC
				{
				mKW_ASC(); 

				}
				break;
			case 11 :
				// Hive.g:1:85: KW_DESC
				{
				mKW_DESC(); 

				}
				break;
			case 12 :
				// Hive.g:1:93: KW_ORDER
				{
				mKW_ORDER(); 

				}
				break;
			case 13 :
				// Hive.g:1:102: KW_GROUP
				{
				mKW_GROUP(); 

				}
				break;
			case 14 :
				// Hive.g:1:111: KW_BY
				{
				mKW_BY(); 

				}
				break;
			case 15 :
				// Hive.g:1:117: KW_HAVING
				{
				mKW_HAVING(); 

				}
				break;
			case 16 :
				// Hive.g:1:127: KW_WHERE
				{
				mKW_WHERE(); 

				}
				break;
			case 17 :
				// Hive.g:1:136: KW_FROM
				{
				mKW_FROM(); 

				}
				break;
			case 18 :
				// Hive.g:1:144: KW_AS
				{
				mKW_AS(); 

				}
				break;
			case 19 :
				// Hive.g:1:150: KW_SELECT
				{
				mKW_SELECT(); 

				}
				break;
			case 20 :
				// Hive.g:1:160: KW_DISTINCT
				{
				mKW_DISTINCT(); 

				}
				break;
			case 21 :
				// Hive.g:1:172: KW_INSERT
				{
				mKW_INSERT(); 

				}
				break;
			case 22 :
				// Hive.g:1:182: KW_OVERWRITE
				{
				mKW_OVERWRITE(); 

				}
				break;
			case 23 :
				// Hive.g:1:195: KW_OUTER
				{
				mKW_OUTER(); 

				}
				break;
			case 24 :
				// Hive.g:1:204: KW_UNIQUEJOIN
				{
				mKW_UNIQUEJOIN(); 

				}
				break;
			case 25 :
				// Hive.g:1:218: KW_PRESERVE
				{
				mKW_PRESERVE(); 

				}
				break;
			case 26 :
				// Hive.g:1:230: KW_JOIN
				{
				mKW_JOIN(); 

				}
				break;
			case 27 :
				// Hive.g:1:238: KW_LEFT
				{
				mKW_LEFT(); 

				}
				break;
			case 28 :
				// Hive.g:1:246: KW_RIGHT
				{
				mKW_RIGHT(); 

				}
				break;
			case 29 :
				// Hive.g:1:255: KW_FULL
				{
				mKW_FULL(); 

				}
				break;
			case 30 :
				// Hive.g:1:263: KW_ON
				{
				mKW_ON(); 

				}
				break;
			case 31 :
				// Hive.g:1:269: KW_PARTITION
				{
				mKW_PARTITION(); 

				}
				break;
			case 32 :
				// Hive.g:1:282: KW_PARTITIONS
				{
				mKW_PARTITIONS(); 

				}
				break;
			case 33 :
				// Hive.g:1:296: KW_TABLE
				{
				mKW_TABLE(); 

				}
				break;
			case 34 :
				// Hive.g:1:305: KW_TABLES
				{
				mKW_TABLES(); 

				}
				break;
			case 35 :
				// Hive.g:1:315: KW_INDEX
				{
				mKW_INDEX(); 

				}
				break;
			case 36 :
				// Hive.g:1:324: KW_INDEXES
				{
				mKW_INDEXES(); 

				}
				break;
			case 37 :
				// Hive.g:1:335: KW_REBUILD
				{
				mKW_REBUILD(); 

				}
				break;
			case 38 :
				// Hive.g:1:346: KW_FUNCTIONS
				{
				mKW_FUNCTIONS(); 

				}
				break;
			case 39 :
				// Hive.g:1:359: KW_SHOW
				{
				mKW_SHOW(); 

				}
				break;
			case 40 :
				// Hive.g:1:367: KW_MSCK
				{
				mKW_MSCK(); 

				}
				break;
			case 41 :
				// Hive.g:1:375: KW_REPAIR
				{
				mKW_REPAIR(); 

				}
				break;
			case 42 :
				// Hive.g:1:385: KW_DIRECTORY
				{
				mKW_DIRECTORY(); 

				}
				break;
			case 43 :
				// Hive.g:1:398: KW_LOCAL
				{
				mKW_LOCAL(); 

				}
				break;
			case 44 :
				// Hive.g:1:407: KW_TRANSFORM
				{
				mKW_TRANSFORM(); 

				}
				break;
			case 45 :
				// Hive.g:1:420: KW_USING
				{
				mKW_USING(); 

				}
				break;
			case 46 :
				// Hive.g:1:429: KW_CLUSTER
				{
				mKW_CLUSTER(); 

				}
				break;
			case 47 :
				// Hive.g:1:440: KW_DISTRIBUTE
				{
				mKW_DISTRIBUTE(); 

				}
				break;
			case 48 :
				// Hive.g:1:454: KW_SORT
				{
				mKW_SORT(); 

				}
				break;
			case 49 :
				// Hive.g:1:462: KW_UNION
				{
				mKW_UNION(); 

				}
				break;
			case 50 :
				// Hive.g:1:471: KW_LOAD
				{
				mKW_LOAD(); 

				}
				break;
			case 51 :
				// Hive.g:1:479: KW_EXPORT
				{
				mKW_EXPORT(); 

				}
				break;
			case 52 :
				// Hive.g:1:489: KW_IMPORT
				{
				mKW_IMPORT(); 

				}
				break;
			case 53 :
				// Hive.g:1:499: KW_DATA
				{
				mKW_DATA(); 

				}
				break;
			case 54 :
				// Hive.g:1:507: KW_INPATH
				{
				mKW_INPATH(); 

				}
				break;
			case 55 :
				// Hive.g:1:517: KW_IS
				{
				mKW_IS(); 

				}
				break;
			case 56 :
				// Hive.g:1:523: KW_NULL
				{
				mKW_NULL(); 

				}
				break;
			case 57 :
				// Hive.g:1:531: KW_CREATE
				{
				mKW_CREATE(); 

				}
				break;
			case 58 :
				// Hive.g:1:541: KW_EXTERNAL
				{
				mKW_EXTERNAL(); 

				}
				break;
			case 59 :
				// Hive.g:1:553: KW_ALTER
				{
				mKW_ALTER(); 

				}
				break;
			case 60 :
				// Hive.g:1:562: KW_CHANGE
				{
				mKW_CHANGE(); 

				}
				break;
			case 61 :
				// Hive.g:1:572: KW_COLUMN
				{
				mKW_COLUMN(); 

				}
				break;
			case 62 :
				// Hive.g:1:582: KW_FIRST
				{
				mKW_FIRST(); 

				}
				break;
			case 63 :
				// Hive.g:1:591: KW_AFTER
				{
				mKW_AFTER(); 

				}
				break;
			case 64 :
				// Hive.g:1:600: KW_DESCRIBE
				{
				mKW_DESCRIBE(); 

				}
				break;
			case 65 :
				// Hive.g:1:612: KW_DROP
				{
				mKW_DROP(); 

				}
				break;
			case 66 :
				// Hive.g:1:620: KW_RENAME
				{
				mKW_RENAME(); 

				}
				break;
			case 67 :
				// Hive.g:1:630: KW_TO
				{
				mKW_TO(); 

				}
				break;
			case 68 :
				// Hive.g:1:636: KW_COMMENT
				{
				mKW_COMMENT(); 

				}
				break;
			case 69 :
				// Hive.g:1:647: KW_BOOLEAN
				{
				mKW_BOOLEAN(); 

				}
				break;
			case 70 :
				// Hive.g:1:658: KW_TINYINT
				{
				mKW_TINYINT(); 

				}
				break;
			case 71 :
				// Hive.g:1:669: KW_SMALLINT
				{
				mKW_SMALLINT(); 

				}
				break;
			case 72 :
				// Hive.g:1:681: KW_INT
				{
				mKW_INT(); 

				}
				break;
			case 73 :
				// Hive.g:1:688: KW_BIGINT
				{
				mKW_BIGINT(); 

				}
				break;
			case 74 :
				// Hive.g:1:698: KW_FLOAT
				{
				mKW_FLOAT(); 

				}
				break;
			case 75 :
				// Hive.g:1:707: KW_DOUBLE
				{
				mKW_DOUBLE(); 

				}
				break;
			case 76 :
				// Hive.g:1:717: KW_DATE
				{
				mKW_DATE(); 

				}
				break;
			case 77 :
				// Hive.g:1:725: KW_DATETIME
				{
				mKW_DATETIME(); 

				}
				break;
			case 78 :
				// Hive.g:1:737: KW_TIMESTAMP
				{
				mKW_TIMESTAMP(); 

				}
				break;
			case 79 :
				// Hive.g:1:750: KW_STRING
				{
				mKW_STRING(); 

				}
				break;
			case 80 :
				// Hive.g:1:760: KW_ARRAY
				{
				mKW_ARRAY(); 

				}
				break;
			case 81 :
				// Hive.g:1:769: KW_STRUCT
				{
				mKW_STRUCT(); 

				}
				break;
			case 82 :
				// Hive.g:1:779: KW_MAP
				{
				mKW_MAP(); 

				}
				break;
			case 83 :
				// Hive.g:1:786: KW_UNIONTYPE
				{
				mKW_UNIONTYPE(); 

				}
				break;
			case 84 :
				// Hive.g:1:799: KW_REDUCE
				{
				mKW_REDUCE(); 

				}
				break;
			case 85 :
				// Hive.g:1:809: KW_PARTITIONED
				{
				mKW_PARTITIONED(); 

				}
				break;
			case 86 :
				// Hive.g:1:824: KW_CLUSTERED
				{
				mKW_CLUSTERED(); 

				}
				break;
			case 87 :
				// Hive.g:1:837: KW_SORTED
				{
				mKW_SORTED(); 

				}
				break;
			case 88 :
				// Hive.g:1:847: KW_INTO
				{
				mKW_INTO(); 

				}
				break;
			case 89 :
				// Hive.g:1:855: KW_BUCKETS
				{
				mKW_BUCKETS(); 

				}
				break;
			case 90 :
				// Hive.g:1:866: KW_ROW
				{
				mKW_ROW(); 

				}
				break;
			case 91 :
				// Hive.g:1:873: KW_FORMAT
				{
				mKW_FORMAT(); 

				}
				break;
			case 92 :
				// Hive.g:1:883: KW_DELIMITED
				{
				mKW_DELIMITED(); 

				}
				break;
			case 93 :
				// Hive.g:1:896: KW_FIELDS
				{
				mKW_FIELDS(); 

				}
				break;
			case 94 :
				// Hive.g:1:906: KW_TERMINATED
				{
				mKW_TERMINATED(); 

				}
				break;
			case 95 :
				// Hive.g:1:920: KW_ESCAPED
				{
				mKW_ESCAPED(); 

				}
				break;
			case 96 :
				// Hive.g:1:931: KW_COLLECTION
				{
				mKW_COLLECTION(); 

				}
				break;
			case 97 :
				// Hive.g:1:945: KW_ITEMS
				{
				mKW_ITEMS(); 

				}
				break;
			case 98 :
				// Hive.g:1:954: KW_KEYS
				{
				mKW_KEYS(); 

				}
				break;
			case 99 :
				// Hive.g:1:962: KW_KEY_TYPE
				{
				mKW_KEY_TYPE(); 

				}
				break;
			case 100 :
				// Hive.g:1:974: KW_LINES
				{
				mKW_LINES(); 

				}
				break;
			case 101 :
				// Hive.g:1:983: KW_STORED
				{
				mKW_STORED(); 

				}
				break;
			case 102 :
				// Hive.g:1:993: KW_FILEFORMAT
				{
				mKW_FILEFORMAT(); 

				}
				break;
			case 103 :
				// Hive.g:1:1007: KW_SEQUENCEFILE
				{
				mKW_SEQUENCEFILE(); 

				}
				break;
			case 104 :
				// Hive.g:1:1023: KW_TEXTFILE
				{
				mKW_TEXTFILE(); 

				}
				break;
			case 105 :
				// Hive.g:1:1035: KW_RCFILE
				{
				mKW_RCFILE(); 

				}
				break;
			case 106 :
				// Hive.g:1:1045: KW_INPUTFORMAT
				{
				mKW_INPUTFORMAT(); 

				}
				break;
			case 107 :
				// Hive.g:1:1060: KW_OUTPUTFORMAT
				{
				mKW_OUTPUTFORMAT(); 

				}
				break;
			case 108 :
				// Hive.g:1:1076: KW_INPUTDRIVER
				{
				mKW_INPUTDRIVER(); 

				}
				break;
			case 109 :
				// Hive.g:1:1091: KW_OUTPUTDRIVER
				{
				mKW_OUTPUTDRIVER(); 

				}
				break;
			case 110 :
				// Hive.g:1:1107: KW_OFFLINE
				{
				mKW_OFFLINE(); 

				}
				break;
			case 111 :
				// Hive.g:1:1118: KW_ENABLE
				{
				mKW_ENABLE(); 

				}
				break;
			case 112 :
				// Hive.g:1:1128: KW_DISABLE
				{
				mKW_DISABLE(); 

				}
				break;
			case 113 :
				// Hive.g:1:1139: KW_READONLY
				{
				mKW_READONLY(); 

				}
				break;
			case 114 :
				// Hive.g:1:1151: KW_NO_DROP
				{
				mKW_NO_DROP(); 

				}
				break;
			case 115 :
				// Hive.g:1:1162: KW_LOCATION
				{
				mKW_LOCATION(); 

				}
				break;
			case 116 :
				// Hive.g:1:1174: KW_TABLESAMPLE
				{
				mKW_TABLESAMPLE(); 

				}
				break;
			case 117 :
				// Hive.g:1:1189: KW_BUCKET
				{
				mKW_BUCKET(); 

				}
				break;
			case 118 :
				// Hive.g:1:1199: KW_OUT
				{
				mKW_OUT(); 

				}
				break;
			case 119 :
				// Hive.g:1:1206: KW_OF
				{
				mKW_OF(); 

				}
				break;
			case 120 :
				// Hive.g:1:1212: KW_PERCENT
				{
				mKW_PERCENT(); 

				}
				break;
			case 121 :
				// Hive.g:1:1223: KW_CAST
				{
				mKW_CAST(); 

				}
				break;
			case 122 :
				// Hive.g:1:1231: KW_ADD
				{
				mKW_ADD(); 

				}
				break;
			case 123 :
				// Hive.g:1:1238: KW_REPLACE
				{
				mKW_REPLACE(); 

				}
				break;
			case 124 :
				// Hive.g:1:1249: KW_COLUMNS
				{
				mKW_COLUMNS(); 

				}
				break;
			case 125 :
				// Hive.g:1:1260: KW_RLIKE
				{
				mKW_RLIKE(); 

				}
				break;
			case 126 :
				// Hive.g:1:1269: KW_REGEXP
				{
				mKW_REGEXP(); 

				}
				break;
			case 127 :
				// Hive.g:1:1279: KW_TEMPORARY
				{
				mKW_TEMPORARY(); 

				}
				break;
			case 128 :
				// Hive.g:1:1292: KW_FUNCTION
				{
				mKW_FUNCTION(); 

				}
				break;
			case 129 :
				// Hive.g:1:1304: KW_EXPLAIN
				{
				mKW_EXPLAIN(); 

				}
				break;
			case 130 :
				// Hive.g:1:1315: KW_EXTENDED
				{
				mKW_EXTENDED(); 

				}
				break;
			case 131 :
				// Hive.g:1:1327: KW_FORMATTED
				{
				mKW_FORMATTED(); 

				}
				break;
			case 132 :
				// Hive.g:1:1340: KW_SERDE
				{
				mKW_SERDE(); 

				}
				break;
			case 133 :
				// Hive.g:1:1349: KW_WITH
				{
				mKW_WITH(); 

				}
				break;
			case 134 :
				// Hive.g:1:1357: KW_DEFERRED
				{
				mKW_DEFERRED(); 

				}
				break;
			case 135 :
				// Hive.g:1:1369: KW_SERDEPROPERTIES
				{
				mKW_SERDEPROPERTIES(); 

				}
				break;
			case 136 :
				// Hive.g:1:1388: KW_DBPROPERTIES
				{
				mKW_DBPROPERTIES(); 

				}
				break;
			case 137 :
				// Hive.g:1:1404: KW_LIMIT
				{
				mKW_LIMIT(); 

				}
				break;
			case 138 :
				// Hive.g:1:1413: KW_SET
				{
				mKW_SET(); 

				}
				break;
			case 139 :
				// Hive.g:1:1420: KW_TBLPROPERTIES
				{
				mKW_TBLPROPERTIES(); 

				}
				break;
			case 140 :
				// Hive.g:1:1437: KW_IDXPROPERTIES
				{
				mKW_IDXPROPERTIES(); 

				}
				break;
			case 141 :
				// Hive.g:1:1454: KW_VALUE_TYPE
				{
				mKW_VALUE_TYPE(); 

				}
				break;
			case 142 :
				// Hive.g:1:1468: KW_ELEM_TYPE
				{
				mKW_ELEM_TYPE(); 

				}
				break;
			case 143 :
				// Hive.g:1:1481: KW_CASE
				{
				mKW_CASE(); 

				}
				break;
			case 144 :
				// Hive.g:1:1489: KW_WHEN
				{
				mKW_WHEN(); 

				}
				break;
			case 145 :
				// Hive.g:1:1497: KW_THEN
				{
				mKW_THEN(); 

				}
				break;
			case 146 :
				// Hive.g:1:1505: KW_ELSE
				{
				mKW_ELSE(); 

				}
				break;
			case 147 :
				// Hive.g:1:1513: KW_END
				{
				mKW_END(); 

				}
				break;
			case 148 :
				// Hive.g:1:1520: KW_MAPJOIN
				{
				mKW_MAPJOIN(); 

				}
				break;
			case 149 :
				// Hive.g:1:1531: KW_STREAMTABLE
				{
				mKW_STREAMTABLE(); 

				}
				break;
			case 150 :
				// Hive.g:1:1546: KW_HOLD_DDLTIME
				{
				mKW_HOLD_DDLTIME(); 

				}
				break;
			case 151 :
				// Hive.g:1:1562: KW_CLUSTERSTATUS
				{
				mKW_CLUSTERSTATUS(); 

				}
				break;
			case 152 :
				// Hive.g:1:1579: KW_UTC
				{
				mKW_UTC(); 

				}
				break;
			case 153 :
				// Hive.g:1:1586: KW_UTCTIMESTAMP
				{
				mKW_UTCTIMESTAMP(); 

				}
				break;
			case 154 :
				// Hive.g:1:1602: KW_LONG
				{
				mKW_LONG(); 

				}
				break;
			case 155 :
				// Hive.g:1:1610: KW_DELETE
				{
				mKW_DELETE(); 

				}
				break;
			case 156 :
				// Hive.g:1:1620: KW_PLUS
				{
				mKW_PLUS(); 

				}
				break;
			case 157 :
				// Hive.g:1:1628: KW_MINUS
				{
				mKW_MINUS(); 

				}
				break;
			case 158 :
				// Hive.g:1:1637: KW_FETCH
				{
				mKW_FETCH(); 

				}
				break;
			case 159 :
				// Hive.g:1:1646: KW_INTERSECT
				{
				mKW_INTERSECT(); 

				}
				break;
			case 160 :
				// Hive.g:1:1659: KW_VIEW
				{
				mKW_VIEW(); 

				}
				break;
			case 161 :
				// Hive.g:1:1667: KW_IN
				{
				mKW_IN(); 

				}
				break;
			case 162 :
				// Hive.g:1:1673: KW_DATABASE
				{
				mKW_DATABASE(); 

				}
				break;
			case 163 :
				// Hive.g:1:1685: KW_DATABASES
				{
				mKW_DATABASES(); 

				}
				break;
			case 164 :
				// Hive.g:1:1698: KW_MATERIALIZED
				{
				mKW_MATERIALIZED(); 

				}
				break;
			case 165 :
				// Hive.g:1:1714: KW_SCHEMA
				{
				mKW_SCHEMA(); 

				}
				break;
			case 166 :
				// Hive.g:1:1724: KW_SCHEMAS
				{
				mKW_SCHEMAS(); 

				}
				break;
			case 167 :
				// Hive.g:1:1735: KW_GRANT
				{
				mKW_GRANT(); 

				}
				break;
			case 168 :
				// Hive.g:1:1744: KW_REVOKE
				{
				mKW_REVOKE(); 

				}
				break;
			case 169 :
				// Hive.g:1:1754: KW_SSL
				{
				mKW_SSL(); 

				}
				break;
			case 170 :
				// Hive.g:1:1761: KW_UNDO
				{
				mKW_UNDO(); 

				}
				break;
			case 171 :
				// Hive.g:1:1769: KW_LOCK
				{
				mKW_LOCK(); 

				}
				break;
			case 172 :
				// Hive.g:1:1777: KW_LOCKS
				{
				mKW_LOCKS(); 

				}
				break;
			case 173 :
				// Hive.g:1:1786: KW_UNLOCK
				{
				mKW_UNLOCK(); 

				}
				break;
			case 174 :
				// Hive.g:1:1796: KW_SHARED
				{
				mKW_SHARED(); 

				}
				break;
			case 175 :
				// Hive.g:1:1806: KW_EXCLUSIVE
				{
				mKW_EXCLUSIVE(); 

				}
				break;
			case 176 :
				// Hive.g:1:1819: KW_PROCEDURE
				{
				mKW_PROCEDURE(); 

				}
				break;
			case 177 :
				// Hive.g:1:1832: KW_UNSIGNED
				{
				mKW_UNSIGNED(); 

				}
				break;
			case 178 :
				// Hive.g:1:1844: KW_WHILE
				{
				mKW_WHILE(); 

				}
				break;
			case 179 :
				// Hive.g:1:1853: KW_READ
				{
				mKW_READ(); 

				}
				break;
			case 180 :
				// Hive.g:1:1861: KW_READS
				{
				mKW_READS(); 

				}
				break;
			case 181 :
				// Hive.g:1:1870: KW_PURGE
				{
				mKW_PURGE(); 

				}
				break;
			case 182 :
				// Hive.g:1:1879: KW_RANGE
				{
				mKW_RANGE(); 

				}
				break;
			case 183 :
				// Hive.g:1:1888: KW_ANALYZE
				{
				mKW_ANALYZE(); 

				}
				break;
			case 184 :
				// Hive.g:1:1899: KW_BEFORE
				{
				mKW_BEFORE(); 

				}
				break;
			case 185 :
				// Hive.g:1:1909: KW_BETWEEN
				{
				mKW_BETWEEN(); 

				}
				break;
			case 186 :
				// Hive.g:1:1920: KW_BOTH
				{
				mKW_BOTH(); 

				}
				break;
			case 187 :
				// Hive.g:1:1928: KW_BINARY
				{
				mKW_BINARY(); 

				}
				break;
			case 188 :
				// Hive.g:1:1938: KW_CROSS
				{
				mKW_CROSS(); 

				}
				break;
			case 189 :
				// Hive.g:1:1947: KW_CONTINUE
				{
				mKW_CONTINUE(); 

				}
				break;
			case 190 :
				// Hive.g:1:1959: KW_CURSOR
				{
				mKW_CURSOR(); 

				}
				break;
			case 191 :
				// Hive.g:1:1969: KW_TRIGGER
				{
				mKW_TRIGGER(); 

				}
				break;
			case 192 :
				// Hive.g:1:1980: KW_RECORDREADER
				{
				mKW_RECORDREADER(); 

				}
				break;
			case 193 :
				// Hive.g:1:1996: KW_RECORDWRITER
				{
				mKW_RECORDWRITER(); 

				}
				break;
			case 194 :
				// Hive.g:1:2012: KW_SEMI
				{
				mKW_SEMI(); 

				}
				break;
			case 195 :
				// Hive.g:1:2020: KW_LATERAL
				{
				mKW_LATERAL(); 

				}
				break;
			case 196 :
				// Hive.g:1:2031: KW_TOUCH
				{
				mKW_TOUCH(); 

				}
				break;
			case 197 :
				// Hive.g:1:2040: KW_ARCHIVE
				{
				mKW_ARCHIVE(); 

				}
				break;
			case 198 :
				// Hive.g:1:2051: KW_UNARCHIVE
				{
				mKW_UNARCHIVE(); 

				}
				break;
			case 199 :
				// Hive.g:1:2064: KW_COMPUTE
				{
				mKW_COMPUTE(); 

				}
				break;
			case 200 :
				// Hive.g:1:2075: KW_STATISTICS
				{
				mKW_STATISTICS(); 

				}
				break;
			case 201 :
				// Hive.g:1:2089: KW_USE
				{
				mKW_USE(); 

				}
				break;
			case 202 :
				// Hive.g:1:2096: KW_OPTION
				{
				mKW_OPTION(); 

				}
				break;
			case 203 :
				// Hive.g:1:2106: KW_CONCATENATE
				{
				mKW_CONCATENATE(); 

				}
				break;
			case 204 :
				// Hive.g:1:2121: KW_SHOW_DATABASE
				{
				mKW_SHOW_DATABASE(); 

				}
				break;
			case 205 :
				// Hive.g:1:2138: KW_UPDATE
				{
				mKW_UPDATE(); 

				}
				break;
			case 206 :
				// Hive.g:1:2148: KW_RESTRICT
				{
				mKW_RESTRICT(); 

				}
				break;
			case 207 :
				// Hive.g:1:2160: KW_CASCADE
				{
				mKW_CASCADE(); 

				}
				break;
			case 208 :
				// Hive.g:1:2171: DOT
				{
				mDOT(); 

				}
				break;
			case 209 :
				// Hive.g:1:2175: COLON
				{
				mCOLON(); 

				}
				break;
			case 210 :
				// Hive.g:1:2181: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 211 :
				// Hive.g:1:2187: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 212 :
				// Hive.g:1:2197: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 213 :
				// Hive.g:1:2204: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 214 :
				// Hive.g:1:2211: LSQUARE
				{
				mLSQUARE(); 

				}
				break;
			case 215 :
				// Hive.g:1:2219: RSQUARE
				{
				mRSQUARE(); 

				}
				break;
			case 216 :
				// Hive.g:1:2227: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 217 :
				// Hive.g:1:2234: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 218 :
				// Hive.g:1:2241: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 219 :
				// Hive.g:1:2247: NOTEQUAL
				{
				mNOTEQUAL(); 

				}
				break;
			case 220 :
				// Hive.g:1:2256: LESSTHANOREQUALTO
				{
				mLESSTHANOREQUALTO(); 

				}
				break;
			case 221 :
				// Hive.g:1:2274: LESSTHAN
				{
				mLESSTHAN(); 

				}
				break;
			case 222 :
				// Hive.g:1:2283: GREATERTHANOREQUALTO
				{
				mGREATERTHANOREQUALTO(); 

				}
				break;
			case 223 :
				// Hive.g:1:2304: GREATERTHAN
				{
				mGREATERTHAN(); 

				}
				break;
			case 224 :
				// Hive.g:1:2316: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 225 :
				// Hive.g:1:2323: PLUS
				{
				mPLUS(); 

				}
				break;
			case 226 :
				// Hive.g:1:2328: MINUS
				{
				mMINUS(); 

				}
				break;
			case 227 :
				// Hive.g:1:2334: STAR
				{
				mSTAR(); 

				}
				break;
			case 228 :
				// Hive.g:1:2339: MOD
				{
				mMOD(); 

				}
				break;
			case 229 :
				// Hive.g:1:2343: DIV
				{
				mDIV(); 

				}
				break;
			case 230 :
				// Hive.g:1:2347: AMPERSAND
				{
				mAMPERSAND(); 

				}
				break;
			case 231 :
				// Hive.g:1:2357: TILDE
				{
				mTILDE(); 

				}
				break;
			case 232 :
				// Hive.g:1:2363: BITWISEOR
				{
				mBITWISEOR(); 

				}
				break;
			case 233 :
				// Hive.g:1:2373: BITWISEXOR
				{
				mBITWISEXOR(); 

				}
				break;
			case 234 :
				// Hive.g:1:2384: QUESTION
				{
				mQUESTION(); 

				}
				break;
			case 235 :
				// Hive.g:1:2393: DOLLAR
				{
				mDOLLAR(); 

				}
				break;
			case 236 :
				// Hive.g:1:2400: StringLiteral
				{
				mStringLiteral(); 

				}
				break;
			case 237 :
				// Hive.g:1:2414: CharSetLiteral
				{
				mCharSetLiteral(); 

				}
				break;
			case 238 :
				// Hive.g:1:2429: BigintLiteral
				{
				mBigintLiteral(); 

				}
				break;
			case 239 :
				// Hive.g:1:2443: SmallintLiteral
				{
				mSmallintLiteral(); 

				}
				break;
			case 240 :
				// Hive.g:1:2459: TinyintLiteral
				{
				mTinyintLiteral(); 

				}
				break;
			case 241 :
				// Hive.g:1:2474: Number
				{
				mNumber(); 

				}
				break;
			case 242 :
				// Hive.g:1:2481: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 243 :
				// Hive.g:1:2492: CharSetName
				{
				mCharSetName(); 

				}
				break;
			case 244 :
				// Hive.g:1:2504: WS
				{
				mWS(); 

				}
				break;
			case 245 :
				// Hive.g:1:2507: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA23 dfa23 = new DFA23(this);
	static final String DFA23_eotS =
		"\1\uffff\5\64\1\124\20\64\1\u0097\1\64\13\uffff\1\u009a\1\u009c\2\uffff"+
		"\1\u009e\11\uffff\2\u00aa\3\uffff\2\64\1\u00b1\15\64\1\u00c8\3\64\1\u00ce"+
		"\2\64\1\u00d1\1\u00d3\3\64\2\uffff\4\64\1\u00e0\1\u00e5\1\64\1\u00e7\15"+
		"\64\1\u00fe\51\64\4\uffff\1\64\10\uffff\1\u0147\2\uffff\1\u0147\1\64\1"+
		"\u014a\1\u00aa\1\u014b\1\u014c\1\uffff\6\64\1\uffff\21\64\1\u0164\1\64"+
		"\1\u0166\1\64\1\u0168\1\uffff\3\64\1\u016c\1\64\1\uffff\1\64\1\u0171\1"+
		"\uffff\1\64\1\uffff\1\64\1\124\12\64\1\uffff\3\64\1\u0185\1\uffff\1\64"+
		"\1\uffff\10\64\1\u0190\6\64\1\u0199\6\64\1\uffff\17\64\1\u01b1\11\64\1"+
		"\u01bd\6\64\1\u01c5\1\u01c7\22\64\1\u01db\4\64\1\u01e1\15\64\3\uffff\1"+
		"\u01f4\3\uffff\1\u00aa\1\u01f5\12\64\1\u0200\1\64\1\u0202\1\u0203\7\64"+
		"\1\uffff\1\64\1\uffff\1\64\1\uffff\3\64\1\uffff\4\64\1\uffff\3\64\1\u0217"+
		"\1\u0218\2\64\1\u021b\1\64\1\u021f\1\u0220\1\u0221\5\64\1\u0227\1\64\1"+
		"\uffff\12\64\1\uffff\1\u0234\1\u0236\6\64\1\uffff\1\u023f\1\u0241\1\u0242"+
		"\5\64\1\u0248\10\64\1\u0251\1\64\1\u0253\3\64\1\uffff\1\u0257\1\u0259"+
		"\1\64\1\u025c\7\64\1\uffff\2\64\1\u0266\4\64\1\uffff\1\64\1\uffff\5\64"+
		"\1\u0271\1\64\1\u0273\6\64\1\u027c\4\64\1\uffff\3\64\1\u0284\1\64\1\uffff"+
		"\14\64\1\u0292\1\u0293\2\64\1\u0296\1\u0297\2\uffff\2\64\1\u029b\1\u029c"+
		"\6\64\1\uffff\1\u02a3\2\uffff\1\64\1\u02a5\2\64\1\u02a8\1\64\1\u02aa\1"+
		"\u02ab\1\64\1\u02ad\1\u02ae\1\64\1\u02b0\1\64\1\u02b2\4\64\2\uffff\1\u02b7"+
		"\1\u02b8\1\uffff\1\u02b9\1\64\1\u02bb\3\uffff\2\64\1\u02bf\2\64\1\uffff"+
		"\2\64\1\u02c5\11\64\1\uffff\1\64\1\uffff\10\64\1\uffff\1\64\2\uffff\2"+
		"\64\1\u02db\1\u02dc\1\64\1\uffff\7\64\1\u02e5\1\uffff\1\u02e6\1\uffff"+
		"\2\64\1\u02ea\1\uffff\1\64\1\uffff\2\64\1\uffff\10\64\1\u02f7\1\uffff"+
		"\3\64\1\u02fb\6\64\1\uffff\1\u0302\1\uffff\1\u0303\6\64\1\u030a\1\uffff"+
		"\5\64\1\u0310\1\u0311\1\uffff\2\64\1\u0314\2\64\1\u0317\7\64\2\uffff\2"+
		"\64\2\uffff\2\64\1\u0324\2\uffff\6\64\1\uffff\1\64\1\uffff\1\u032c\1\64"+
		"\1\uffff\1\u032f\2\uffff\1\64\2\uffff\1\64\1\uffff\1\64\1\uffff\2\64\1"+
		"\u0336\1\64\3\uffff\1\64\1\uffff\1\64\1\u033a\1\64\1\uffff\1\u033c\3\64"+
		"\1\u0340\1\uffff\1\64\1\u0342\1\u0343\5\64\1\u0349\2\64\1\u034c\7\64\1"+
		"\u0354\1\64\2\uffff\1\64\1\u0357\1\u0358\1\u035a\1\u035b\1\64\1\u035d"+
		"\1\64\2\uffff\1\u035f\2\64\1\uffff\1\64\1\u0363\1\u0364\1\64\1\u0366\1"+
		"\u0367\1\64\1\u0369\1\64\1\u036c\2\64\1\uffff\1\u036f\2\64\1\uffff\1\64"+
		"\1\u0373\4\64\2\uffff\1\64\1\u0379\1\64\1\u037b\1\u037c\1\64\1\uffff\1"+
		"\u037e\1\u037f\2\64\1\u0383\2\uffff\2\64\1\uffff\1\64\1\u0387\1\uffff"+
		"\1\u0388\1\u038a\6\64\1\u0391\1\64\1\u0393\1\64\1\uffff\1\u0395\6\64\1"+
		"\uffff\2\64\1\uffff\1\u039e\1\u039f\3\64\1\u03a3\1\uffff\1\u03a4\1\64"+
		"\1\u03a6\1\uffff\1\u03a7\1\uffff\3\64\1\uffff\1\64\2\uffff\1\u03ac\3\64"+
		"\1\u03b0\1\uffff\2\64\1\uffff\3\64\1\u03b6\3\64\1\uffff\1\64\1\u03bb\2"+
		"\uffff\1\u03bc\2\uffff\1\u03bd\1\uffff\1\64\1\uffff\3\64\2\uffff\1\64"+
		"\2\uffff\1\64\1\uffff\1\64\1\u03c5\1\uffff\2\64\1\uffff\3\64\1\uffff\3"+
		"\64\1\u03ce\1\u03cf\1\uffff\1\u03d0\2\uffff\1\64\2\uffff\3\64\1\uffff"+
		"\1\u03d5\1\64\1\u03d9\2\uffff\1\u03da\1\uffff\1\64\1\u03dc\1\u03dd\2\64"+
		"\1\u03e0\1\uffff\1\64\1\uffff\1\64\1\uffff\2\64\1\u03e5\2\64\1\u03e9\2"+
		"\64\2\uffff\3\64\2\uffff\1\u03ef\2\uffff\4\64\1\uffff\1\u03f4\1\u03f5"+
		"\1\64\1\uffff\1\u03f7\1\64\1\u03f9\1\u03fa\1\64\1\uffff\1\64\1\u03fe\1"+
		"\u03ff\1\64\3\uffff\4\64\1\u0405\2\64\1\uffff\2\64\1\u040a\2\64\1\u040d"+
		"\2\64\3\uffff\1\u0410\2\64\1\u0413\1\uffff\3\64\2\uffff\1\64\2\uffff\1"+
		"\u0418\1\64\1\uffff\1\u041a\1\64\1\u041c\1\64\1\uffff\1\u041e\1\64\1\u0420"+
		"\1\uffff\1\64\1\u0422\1\u0423\2\64\1\uffff\2\64\1\u0428\1\64\2\uffff\1"+
		"\u042a\1\uffff\1\u042b\2\uffff\1\64\1\u042d\1\u042e\2\uffff\5\64\1\uffff"+
		"\3\64\1\u0437\1\uffff\1\u0438\1\64\1\uffff\1\u043a\1\u043d\1\uffff\2\64"+
		"\1\uffff\1\64\1\u0441\2\64\1\uffff\1\64\1\uffff\1\64\1\uffff\1\u0446\1"+
		"\uffff\1\64\1\uffff\1\u0448\2\uffff\4\64\1\uffff\1\64\2\uffff\1\u044e"+
		"\2\uffff\6\64\1\u0455\1\u0456\2\uffff\1\64\1\uffff\1\u0458\1\64\1\uffff"+
		"\3\64\1\uffff\1\64\1\u045e\1\64\1\u0460\1\uffff\1\64\1\uffff\2\64\1\u0464"+
		"\1\u0465\1\64\1\uffff\5\64\1\u046c\2\uffff\1\64\1\uffff\1\u046e\4\64\1"+
		"\uffff\1\u0473\1\uffff\1\64\1\u0475\1\u0476\2\uffff\1\64\1\u0478\1\u0479"+
		"\1\u047a\2\64\1\uffff\1\u047d\1\uffff\1\u047e\1\u047f\1\u0480\1\64\1\uffff"+
		"\1\u0482\2\uffff\1\u0483\3\uffff\1\64\1\u0485\4\uffff\1\u0486\2\uffff"+
		"\1\64\2\uffff\1\u0488\1\uffff";
	static final String DFA23_eofS =
		"\u0489\uffff";
	static final String DFA23_minS =
		"\1\11\2\101\1\104\1\106\1\117\1\75\1\101\1\104\1\114\1\101\1\122\1\105"+
		"\1\101\1\110\1\103\1\116\1\101\1\117\3\101\2\105\1\111\13\uffff\2\75\2"+
		"\uffff\1\55\7\uffff\2\0\2\60\3\uffff\1\101\1\102\1\60\2\115\1\114\1\105"+
		"\1\114\1\117\1\114\1\105\1\117\1\122\1\124\1\114\1\101\1\60\1\124\1\103"+
		"\1\104\1\60\1\105\1\124\2\60\2\124\1\114\2\uffff\1\113\1\106\1\101\1\124"+
		"\2\60\1\120\1\60\1\105\1\130\2\103\1\101\1\123\1\106\1\122\1\124\1\117"+
		"\1\125\1\120\1\101\1\60\1\117\1\107\1\103\1\106\1\126\1\114\1\105\1\124"+
		"\1\114\1\101\1\122\2\101\1\110\1\114\1\101\1\105\1\103\1\104\1\105\2\122"+
		"\1\125\1\122\1\111\1\107\1\101\1\127\1\106\1\111\1\116\1\103\1\120\1\116"+
		"\1\125\1\105\1\101\1\114\1\123\1\122\1\131\4\uffff\1\105\6\uffff\2\0\1"+
		"\42\2\0\1\42\5\60\1\uffff\1\53\1\105\1\116\1\107\1\114\1\103\1\uffff\1"+
		"\131\1\105\1\115\1\124\2\120\1\116\1\123\1\115\1\114\1\103\1\123\1\114"+
		"\1\105\1\101\1\115\1\103\1\60\1\105\1\60\1\114\1\60\1\uffff\1\105\1\101"+
		"\1\110\1\60\1\105\1\uffff\1\122\1\60\1\uffff\1\114\1\uffff\1\111\1\60"+
		"\1\104\1\114\2\105\1\111\1\124\1\101\1\104\1\107\1\105\1\uffff\2\105\1"+
		"\101\1\60\1\uffff\1\117\1\uffff\1\115\1\120\1\123\1\114\1\105\1\114\1"+
		"\101\1\102\1\60\1\105\1\103\2\105\1\101\1\105\1\60\1\101\1\120\1\102\1"+
		"\122\1\125\1\116\1\uffff\1\114\1\110\1\111\1\101\1\113\1\117\1\127\1\111"+
		"\1\104\1\116\1\114\1\110\1\105\1\125\1\104\1\60\1\111\1\127\1\122\1\124"+
		"\1\114\1\105\1\122\1\124\1\105\1\60\3\117\1\111\1\122\1\116\2\60\1\101"+
		"\1\123\1\103\1\124\1\103\1\123\1\107\1\116\1\110\1\125\2\101\1\125\1\104"+
		"\1\105\2\117\1\124\1\60\1\111\1\113\1\107\1\113\1\60\1\105\1\125\1\123"+
		"\1\101\1\123\1\116\1\114\1\115\2\103\2\123\1\127\1\0\1\uffff\1\0\1\60"+
		"\3\uffff\2\60\1\123\1\107\1\105\1\110\1\111\1\123\1\111\1\106\1\117\1"+
		"\122\1\60\1\105\2\60\2\124\1\104\1\106\1\124\1\101\1\110\1\uffff\1\122"+
		"\1\uffff\1\131\1\uffff\1\122\1\131\1\111\1\uffff\1\122\1\127\1\122\1\125"+
		"\1\uffff\1\111\1\117\1\122\2\60\1\123\1\124\1\60\1\114\3\60\2\122\1\130"+
		"\2\124\1\60\1\122\1\uffff\1\122\1\123\1\122\1\124\1\122\1\101\1\116\1"+
		"\125\1\120\1\114\1\uffff\2\60\1\115\1\124\1\122\1\111\1\102\1\103\1\uffff"+
		"\3\60\1\114\1\117\1\120\1\124\1\105\1\60\1\116\1\122\1\105\1\122\1\105"+
		"\1\116\1\137\1\105\1\60\1\105\1\60\1\103\2\105\1\uffff\2\60\1\105\1\60"+
		"\1\114\1\116\1\103\1\101\1\105\1\111\1\115\1\uffff\1\125\1\116\1\60\1"+
		"\103\1\107\1\103\1\107\1\uffff\1\124\1\uffff\1\124\2\105\1\111\1\105\1"+
		"\60\1\105\1\60\1\124\2\111\1\101\1\115\1\103\1\60\1\130\1\113\2\122\1"+
		"\uffff\1\114\2\105\1\60\1\117\1\uffff\1\122\1\123\2\124\1\123\1\107\1"+
		"\115\2\105\1\125\1\111\1\101\2\60\1\101\1\117\2\60\2\uffff\1\106\1\105"+
		"\2\60\1\116\1\124\1\116\1\111\1\122\1\117\1\uffff\1\60\2\uffff\1\111\1"+
		"\60\1\123\1\117\1\60\1\124\2\60\1\132\2\60\1\126\1\60\1\122\1\60\1\124"+
		"\2\116\1\117\2\uffff\2\60\1\uffff\1\60\1\111\1\60\3\uffff\1\101\1\124"+
		"\1\60\1\110\1\104\1\uffff\1\123\1\124\1\60\1\117\1\123\1\124\1\111\1\116"+
		"\1\104\1\123\2\105\1\uffff\1\111\1\uffff\1\111\1\105\1\122\1\116\1\111"+
		"\1\114\1\124\1\101\1\uffff\1\111\2\uffff\1\105\1\120\2\60\1\101\1\uffff"+
		"\1\124\1\131\1\124\2\105\1\107\1\104\1\60\1\uffff\1\60\1\uffff\1\124\1"+
		"\116\1\60\1\uffff\1\104\1\uffff\2\104\1\uffff\1\111\1\107\1\124\1\115"+
		"\1\104\1\123\1\101\1\105\1\60\1\uffff\1\113\1\116\1\110\1\60\1\115\1\105"+
		"\1\122\1\104\1\124\1\116\1\uffff\1\60\1\uffff\1\60\1\114\1\122\1\103\2"+
		"\105\1\116\1\60\1\uffff\1\120\1\105\1\104\1\111\1\105\2\60\1\uffff\2\111"+
		"\1\60\2\105\1\60\1\105\1\116\1\103\1\116\1\124\1\116\1\124\2\uffff\1\104"+
		"\1\122\2\uffff\1\117\1\122\1\60\2\uffff\1\124\2\101\1\114\1\101\1\120"+
		"\1\uffff\1\117\1\uffff\1\60\1\122\1\uffff\1\60\2\uffff\1\105\2\uffff\1"+
		"\105\1\uffff\1\111\1\uffff\1\104\1\105\1\60\1\120\3\uffff\1\117\1\uffff"+
		"\1\114\1\60\1\123\1\uffff\1\60\1\117\1\122\1\105\1\60\1\uffff\1\120\2"+
		"\60\1\116\1\101\1\105\1\111\1\104\1\60\1\102\1\124\1\60\1\105\1\103\1"+
		"\102\1\105\1\117\1\123\1\115\1\60\1\105\2\uffff\1\116\4\60\1\116\1\60"+
		"\1\104\2\uffff\1\60\1\103\1\122\1\uffff\1\101\2\60\1\116\2\60\1\124\1"+
		"\60\1\124\1\60\1\112\1\131\1\uffff\1\60\1\105\1\111\1\uffff\1\105\1\60"+
		"\1\126\1\125\1\111\1\124\2\uffff\1\104\1\60\1\105\2\60\1\114\1\uffff\2"+
		"\60\1\122\1\103\1\60\2\uffff\1\116\1\101\1\uffff\1\122\1\60\1\uffff\2"+
		"\60\2\124\1\105\1\125\2\105\1\60\1\122\1\60\1\115\1\uffff\1\60\1\115\1"+
		"\124\1\105\1\122\1\105\1\116\1\uffff\1\115\1\105\1\uffff\2\60\1\124\1"+
		"\117\1\122\1\60\1\uffff\1\60\1\116\1\60\1\uffff\1\60\1\uffff\1\122\1\111"+
		"\1\103\1\uffff\1\105\2\uffff\1\60\1\114\1\104\1\126\1\60\1\uffff\2\105"+
		"\1\uffff\1\104\1\124\1\125\1\60\1\122\2\105\1\uffff\1\122\1\60\2\uffff"+
		"\1\60\2\uffff\1\60\1\uffff\1\114\1\uffff\1\105\1\117\1\124\2\uffff\1\124"+
		"\2\uffff\1\101\1\uffff\1\111\1\60\1\uffff\1\117\1\120\1\uffff\1\104\1"+
		"\126\1\123\1\uffff\1\105\1\122\1\117\2\60\1\uffff\1\60\2\uffff\1\131\2"+
		"\uffff\1\105\1\122\1\124\1\uffff\1\60\1\114\1\60\2\uffff\1\60\1\uffff"+
		"\1\111\2\60\1\105\1\116\1\60\1\uffff\1\115\1\uffff\1\120\1\uffff\1\120"+
		"\1\105\1\60\1\131\1\122\1\60\1\101\1\104\2\uffff\1\105\1\122\1\111\2\uffff"+
		"\1\60\2\uffff\1\115\1\126\1\124\1\122\1\uffff\2\60\1\105\1\uffff\1\60"+
		"\1\104\2\60\1\124\1\uffff\1\131\2\60\1\124\3\uffff\1\124\1\106\1\120\1"+
		"\101\1\60\1\102\1\103\1\uffff\1\111\1\105\1\60\1\105\1\124\1\60\1\105"+
		"\1\116\3\uffff\1\60\1\101\1\111\1\60\1\uffff\1\111\1\104\1\124\2\uffff"+
		"\1\117\2\uffff\1\60\1\101\1\uffff\1\60\1\114\1\60\1\104\1\uffff\1\60\1"+
		"\124\1\60\1\uffff\1\124\2\60\1\115\1\126\1\uffff\1\101\1\105\1\60\1\124"+
		"\2\uffff\1\60\1\uffff\1\60\2\uffff\1\105\2\60\2\uffff\3\111\1\105\1\102"+
		"\1\uffff\1\114\1\123\1\116\1\60\1\uffff\1\60\1\101\1\uffff\2\60\1\uffff"+
		"\1\104\1\124\1\uffff\1\132\1\60\1\101\1\116\1\uffff\1\124\1\uffff\1\105"+
		"\1\uffff\1\60\1\uffff\1\111\1\uffff\1\60\2\uffff\1\101\1\105\1\124\1\122"+
		"\1\uffff\1\111\2\uffff\1\60\2\uffff\1\105\1\115\1\114\1\122\1\101\1\105"+
		"\2\60\2\uffff\1\115\1\uffff\1\60\1\104\1\uffff\3\105\1\uffff\1\124\1\60"+
		"\1\105\1\60\1\uffff\1\105\1\uffff\1\124\1\122\2\60\1\105\1\uffff\1\123"+
		"\2\105\1\124\1\123\1\60\2\uffff\1\120\1\uffff\1\60\2\122\1\104\1\125\1"+
		"\uffff\1\60\1\uffff\1\123\2\60\2\uffff\1\123\3\60\1\111\1\105\1\uffff"+
		"\1\60\1\uffff\3\60\1\123\1\uffff\1\60\2\uffff\1\60\3\uffff\1\105\1\60"+
		"\4\uffff\1\60\2\uffff\1\123\2\uffff\1\60\1\uffff";
	static final String DFA23_maxS =
		"\1\176\1\122\1\125\1\123\1\126\1\125\1\75\1\117\1\124\1\130\2\122\1\131"+
		"\1\117\1\111\2\124\1\125\2\117\1\123\1\125\1\105\1\126\1\111\13\uffff"+
		"\1\76\1\75\2\uffff\1\55\7\uffff\2\uffff\2\172\3\uffff\1\125\1\102\1\172"+
		"\1\116\1\130\1\114\1\105\1\114\1\117\1\116\1\122\1\117\1\122\2\124\1\104"+
		"\1\172\1\124\1\122\1\104\1\172\1\105\1\124\2\172\1\124\1\137\1\114\2\uffff"+
		"\1\116\1\106\1\116\1\124\2\172\1\120\1\172\1\105\1\130\1\124\1\103\1\104"+
		"\2\123\1\126\1\124\1\117\1\125\1\120\1\117\1\172\1\124\1\116\1\103\1\124"+
		"\1\126\1\114\1\111\2\124\1\117\1\122\1\101\1\122\1\110\1\114\1\123\1\111"+
		"\1\103\1\104\1\117\2\122\1\125\1\122\1\111\1\107\1\126\1\127\1\106\1\111"+
		"\1\116\1\103\1\124\1\116\1\125\1\117\1\101\1\116\1\123\1\122\1\131\4\uffff"+
		"\1\105\6\uffff\2\uffff\1\47\2\uffff\1\47\1\146\4\172\1\uffff\1\71\1\105"+
		"\1\116\1\107\1\114\1\103\1\uffff\1\131\1\105\1\115\1\124\2\120\1\116\1"+
		"\123\1\115\1\114\1\103\1\123\1\114\1\105\1\101\1\115\1\103\1\172\1\105"+
		"\1\172\1\114\1\172\1\uffff\1\105\1\101\1\110\1\172\1\105\1\uffff\1\122"+
		"\1\172\1\uffff\1\114\1\uffff\1\111\1\172\1\104\1\114\2\105\1\111\1\124"+
		"\1\113\1\104\1\107\1\105\1\uffff\2\105\1\125\1\172\1\uffff\1\117\1\uffff"+
		"\1\115\1\120\1\123\1\117\1\105\1\114\1\101\1\102\1\172\1\105\1\103\1\111"+
		"\1\105\1\124\1\105\1\172\1\105\1\120\1\102\1\122\1\125\1\116\1\uffff\1"+
		"\114\1\110\1\111\1\101\1\113\1\117\1\127\1\111\1\104\1\122\1\114\1\110"+
		"\1\105\1\125\1\104\1\172\1\111\1\127\1\122\1\124\1\114\1\125\1\122\1\124"+
		"\1\105\1\172\1\121\2\117\1\111\1\122\1\116\2\172\1\101\1\123\1\103\1\124"+
		"\1\103\1\123\1\107\1\116\1\110\1\125\1\114\1\101\1\125\1\104\1\105\2\117"+
		"\1\124\1\172\1\111\1\113\1\107\1\113\1\172\1\105\1\125\1\123\1\101\1\123"+
		"\1\116\1\125\1\120\2\124\2\123\1\127\1\uffff\1\uffff\1\uffff\1\172\3\uffff"+
		"\2\172\1\123\1\107\1\105\1\110\1\111\1\123\1\111\1\106\1\117\1\122\1\172"+
		"\1\105\2\172\2\124\1\104\1\106\1\124\1\101\1\110\1\uffff\1\122\1\uffff"+
		"\1\131\1\uffff\1\122\1\131\1\111\1\uffff\1\122\1\127\1\122\1\125\1\uffff"+
		"\1\111\1\117\1\122\2\172\1\123\1\124\1\172\1\124\3\172\2\122\1\130\2\124"+
		"\1\172\1\122\1\uffff\1\122\1\123\1\122\1\124\1\122\1\101\1\122\1\125\1"+
		"\120\1\114\1\uffff\2\172\1\115\1\124\2\122\1\102\1\103\1\uffff\3\172\1"+
		"\114\1\117\1\120\1\124\1\105\1\172\1\116\1\122\1\105\1\122\1\105\1\116"+
		"\1\137\1\105\1\172\1\105\1\172\1\103\2\105\1\uffff\2\172\1\105\1\172\1"+
		"\114\1\116\1\103\1\101\1\105\1\111\1\115\1\uffff\1\125\1\116\1\172\1\103"+
		"\1\107\1\103\1\107\1\uffff\1\124\1\uffff\1\124\2\105\1\111\1\105\1\172"+
		"\1\105\1\172\1\124\2\111\1\101\1\115\1\103\1\172\1\130\1\113\2\122\1\uffff"+
		"\1\114\2\105\1\172\1\117\1\uffff\1\122\1\123\2\124\1\123\1\107\1\115\2"+
		"\105\1\125\1\111\1\101\2\172\1\101\1\117\2\172\2\uffff\1\106\1\105\2\172"+
		"\1\116\1\124\1\116\1\111\1\122\1\117\1\uffff\1\172\2\uffff\1\111\1\172"+
		"\1\123\1\117\1\172\1\124\2\172\1\132\2\172\1\126\1\172\1\122\1\172\1\124"+
		"\2\116\1\117\2\uffff\2\172\1\uffff\1\172\1\111\1\172\3\uffff\1\101\1\124"+
		"\1\172\1\110\1\106\1\uffff\1\123\1\124\1\172\1\117\1\123\1\124\1\111\1"+
		"\116\1\104\1\123\2\105\1\uffff\1\111\1\uffff\1\111\1\105\1\122\1\116\1"+
		"\111\1\114\1\124\1\101\1\uffff\1\111\2\uffff\1\105\1\120\2\172\1\101\1"+
		"\uffff\1\124\1\131\1\124\2\105\1\107\1\104\1\172\1\uffff\1\172\1\uffff"+
		"\1\124\1\116\1\172\1\uffff\1\104\1\uffff\2\104\1\uffff\1\111\1\107\1\124"+
		"\1\115\1\104\1\123\1\101\1\105\1\172\1\uffff\1\113\1\116\1\110\1\172\1"+
		"\115\1\105\1\122\1\104\1\124\1\116\1\uffff\1\172\1\uffff\1\172\1\114\1"+
		"\122\1\103\2\105\1\116\1\172\1\uffff\1\120\1\105\1\104\1\111\1\105\2\172"+
		"\1\uffff\2\111\1\172\2\105\1\172\1\105\1\116\1\103\1\116\1\124\1\116\1"+
		"\124\2\uffff\1\104\1\122\2\uffff\1\117\1\122\1\172\2\uffff\1\124\2\101"+
		"\1\114\1\101\1\120\1\uffff\1\117\1\uffff\1\172\1\122\1\uffff\1\172\2\uffff"+
		"\1\105\2\uffff\1\105\1\uffff\1\111\1\uffff\1\106\1\105\1\172\1\120\3\uffff"+
		"\1\117\1\uffff\1\114\1\172\1\123\1\uffff\1\172\1\117\1\122\1\105\1\172"+
		"\1\uffff\1\120\2\172\1\116\1\101\1\105\1\111\1\104\1\172\1\102\1\124\1"+
		"\172\1\105\1\103\1\102\1\105\1\117\1\123\1\115\1\172\1\105\2\uffff\1\116"+
		"\4\172\1\116\1\172\1\104\2\uffff\1\172\1\103\1\122\1\uffff\1\101\2\172"+
		"\1\116\2\172\1\124\1\172\1\124\1\172\1\112\1\131\1\uffff\1\172\1\105\1"+
		"\111\1\uffff\1\105\1\172\1\126\1\125\1\111\1\124\2\uffff\1\104\1\172\1"+
		"\105\2\172\1\114\1\uffff\2\172\1\127\1\103\1\172\2\uffff\1\116\1\101\1"+
		"\uffff\1\122\1\172\1\uffff\2\172\2\124\1\105\1\125\2\105\1\172\1\122\1"+
		"\172\1\115\1\uffff\1\172\1\115\1\124\1\105\1\122\1\105\1\116\1\uffff\1"+
		"\115\1\105\1\uffff\2\172\1\124\1\117\1\122\1\172\1\uffff\1\172\1\116\1"+
		"\172\1\uffff\1\172\1\uffff\1\122\1\111\1\103\1\uffff\1\105\2\uffff\1\172"+
		"\1\114\1\104\1\126\1\172\1\uffff\2\105\1\uffff\1\104\1\124\1\125\1\172"+
		"\1\122\2\105\1\uffff\1\122\1\172\2\uffff\1\172\2\uffff\1\172\1\uffff\1"+
		"\114\1\uffff\1\105\1\117\1\124\2\uffff\1\124\2\uffff\1\101\1\uffff\1\111"+
		"\1\172\1\uffff\1\117\1\120\1\uffff\1\104\1\126\1\123\1\uffff\1\105\1\122"+
		"\1\117\2\172\1\uffff\1\172\2\uffff\1\131\2\uffff\1\105\1\122\1\124\1\uffff"+
		"\1\172\1\114\1\172\2\uffff\1\172\1\uffff\1\111\2\172\1\105\1\116\1\172"+
		"\1\uffff\1\115\1\uffff\1\120\1\uffff\1\120\1\105\1\172\1\131\1\122\1\172"+
		"\1\101\1\104\2\uffff\1\105\1\122\1\111\2\uffff\1\172\2\uffff\1\115\1\126"+
		"\1\124\1\122\1\uffff\2\172\1\105\1\uffff\1\172\1\104\2\172\1\124\1\uffff"+
		"\1\131\2\172\1\124\3\uffff\1\124\1\106\1\120\1\101\1\172\1\102\1\103\1"+
		"\uffff\1\111\1\105\1\172\1\105\1\124\1\172\1\105\1\116\3\uffff\1\172\1"+
		"\101\1\111\1\172\1\uffff\1\111\1\104\1\124\2\uffff\1\117\2\uffff\1\172"+
		"\1\101\1\uffff\1\172\1\114\1\172\1\104\1\uffff\1\172\1\124\1\172\1\uffff"+
		"\1\124\2\172\1\115\1\126\1\uffff\1\101\1\105\1\172\1\124\2\uffff\1\172"+
		"\1\uffff\1\172\2\uffff\1\105\2\172\2\uffff\3\111\1\105\1\102\1\uffff\1"+
		"\114\1\123\1\116\1\172\1\uffff\1\172\1\101\1\uffff\2\172\1\uffff\1\104"+
		"\1\124\1\uffff\1\132\1\172\1\101\1\116\1\uffff\1\124\1\uffff\1\105\1\uffff"+
		"\1\172\1\uffff\1\111\1\uffff\1\172\2\uffff\1\101\1\105\1\124\1\122\1\uffff"+
		"\1\111\2\uffff\1\172\2\uffff\1\105\1\115\1\114\1\122\1\101\1\105\2\172"+
		"\2\uffff\1\115\1\uffff\1\172\1\104\1\uffff\3\105\1\uffff\1\124\1\172\1"+
		"\105\1\172\1\uffff\1\105\1\uffff\1\124\1\122\2\172\1\105\1\uffff\1\123"+
		"\2\105\1\124\1\123\1\172\2\uffff\1\120\1\uffff\1\172\2\122\1\104\1\125"+
		"\1\uffff\1\172\1\uffff\1\123\2\172\2\uffff\1\123\3\172\1\111\1\105\1\uffff"+
		"\1\172\1\uffff\3\172\1\123\1\uffff\1\172\2\uffff\1\172\3\uffff\1\105\1"+
		"\172\4\uffff\1\172\2\uffff\1\123\2\uffff\1\172\1\uffff";
	static final String DFA23_acceptS =
		"\31\uffff\1\u00d0\1\u00d1\1\u00d2\1\u00d3\1\u00d4\1\u00d5\1\u00d6\1\u00d7"+
		"\1\u00d8\1\u00d9\1\u00da\2\uffff\1\u00e0\1\u00e1\1\uffff\1\u00e3\1\u00e4"+
		"\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\4\uffff\1\u00f2\1\u00f3\1\u00f4"+
		"\34\uffff\1\u00db\1\6\77\uffff\1\143\1\u008d\1\u008e\1\u00eb\1\uffff\1"+
		"\u00dc\1\u00dd\1\u00de\1\u00df\1\u00f5\1\u00e2\13\uffff\1\u00f1\6\uffff"+
		"\1\103\26\uffff\1\22\5\uffff\1\5\2\uffff\1\36\1\uffff\1\167\14\uffff\1"+
		"\10\4\uffff\1\u00a1\1\uffff\1\67\26\uffff\1\16\110\uffff\1\u00ec\2\uffff"+
		"\1\u00ee\1\u00ef\1\u00f0\27\uffff\1\3\1\uffff\1\4\1\uffff\1\12\3\uffff"+
		"\1\172\4\uffff\1\166\23\uffff\1\110\12\uffff\1\u0093\10\uffff\1\u00e5"+
		"\27\uffff\1\u008a\13\uffff\1\u00a9\7\uffff\1\u00c9\1\uffff\1\u0098\23"+
		"\uffff\1\132\5\uffff\1\122\22\uffff\1\u00ed\1\1\12\uffff\1\u0091\1\uffff"+
		"\1\21\1\35\23\uffff\1\70\1\7\2\uffff\1\33\3\uffff\1\u00ab\1\62\1\u009a"+
		"\5\uffff\1\130\14\uffff\1\u0092\1\uffff\1\13\10\uffff\1\65\1\uffff\1\114"+
		"\1\101\5\uffff\1\u00ba\10\uffff\1\u0090\1\uffff\1\u0085\3\uffff\1\u00c2"+
		"\1\uffff\1\47\2\uffff\1\60\11\uffff\1\u00aa\12\uffff\1\u009c\1\uffff\1"+
		"\32\10\uffff\1\u00b3\7\uffff\1\50\15\uffff\1\171\1\u008f\2\uffff\1\142"+
		"\1\u00a0\3\uffff\1\41\1\u00c4\6\uffff\1\2\1\uffff\1\76\2\uffff\1\112\1"+
		"\uffff\1\u009e\1\73\1\uffff\1\77\1\120\1\uffff\1\14\1\uffff\1\27\4\uffff"+
		"\1\144\1\u0089\1\53\1\uffff\1\u00ac\3\uffff\1\43\5\uffff\1\141\25\uffff"+
		"\1\15\1\u00a7\10\uffff\1\20\1\u00b2\3\uffff\1\u0084\14\uffff\1\61\3\uffff"+
		"\1\55\6\uffff\1\u00b5\1\34\6\uffff\1\u00b4\5\uffff\1\175\1\u00b6\2\uffff"+
		"\1\u009d\2\uffff\1\u00bc\14\uffff\1\42\7\uffff\1\135\2\uffff\1\133\6\uffff"+
		"\1\u00ca\3\uffff\1\25\1\uffff\1\66\3\uffff\1\64\1\uffff\1\11\1\63\5\uffff"+
		"\1\157\2\uffff\1\u009b\7\uffff\1\113\2\uffff\1\111\1\u00bb\1\uffff\1\165"+
		"\1\u00b8\1\uffff\1\17\1\uffff\1\23\3\uffff\1\u00ae\1\127\1\uffff\1\117"+
		"\1\121\1\uffff\1\145\2\uffff\1\u00a5\2\uffff\1\u00ad\3\uffff\1\u00cd\5"+
		"\uffff\1\51\1\uffff\1\102\1\124\1\uffff\1\176\1\u00a8\3\uffff\1\151\3"+
		"\uffff\1\71\1\74\1\uffff\1\75\6\uffff\1\u00be\1\uffff\1\u00bf\1\uffff"+
		"\1\106\10\uffff\1\u00b7\1\u00c5\3\uffff\1\156\1\162\1\uffff\1\u00c3\1"+
		"\44\4\uffff\1\u0081\3\uffff\1\137\5\uffff\1\160\4\uffff\1\105\1\131\1"+
		"\u00b9\7\uffff\1\u00a6\10\uffff\1\170\1\45\1\173\4\uffff\1\u0094\3\uffff"+
		"\1\56\1\174\1\uffff\1\104\1\u00c7\2\uffff\1\u00cf\4\uffff\1\150\3\uffff"+
		"\1\u0080\5\uffff\1\163\4\uffff\1\72\1\u0082\1\uffff\1\100\1\uffff\1\u0086"+
		"\1\24\3\uffff\1\u00a2\1\115\5\uffff\1\107\4\uffff\1\u00b1\2\uffff\1\31"+
		"\2\uffff\1\161\2\uffff\1\u00ce\4\uffff\1\u00bd\1\uffff\1\54\1\uffff\1"+
		"\116\1\uffff\1\177\1\uffff\1\46\1\uffff\1\u0083\1\26\4\uffff\1\u009f\1"+
		"\uffff\1\u00af\1\134\1\uffff\1\52\1\u00a3\10\uffff\1\123\1\u00c6\1\uffff"+
		"\1\u00b0\2\uffff\1\37\3\uffff\1\126\4\uffff\1\136\1\uffff\1\146\5\uffff"+
		"\1\57\6\uffff\1\u00c8\1\30\1\uffff\1\40\5\uffff\1\140\1\uffff\1\164\3"+
		"\uffff\1\152\1\154\6\uffff\1\u0095\1\uffff\1\125\4\uffff\1\u00cb\1\uffff"+
		"\1\153\1\155\1\uffff\1\u0088\1\u0096\1\147\2\uffff\1\u0099\1\u00c0\1\u00c1"+
		"\1\u00a4\1\uffff\1\u008b\1\u008c\1\uffff\1\u00cc\1\u0097\1\uffff\1\u0087";
	static final String DFA23_specialS =
		"\60\uffff\1\0\1\7\155\uffff\1\6\1\3\1\uffff\1\2\1\4\u00a2\uffff\1\5\1"+
		"\uffff\1\1\u0340\uffff}>";
	static final String[] DFA23_transitionS = {
			"\2\66\2\uffff\1\66\22\uffff\1\66\1\6\1\61\1\uffff\1\27\1\52\1\53\1\60"+
			"\1\35\1\36\1\51\1\47\1\33\1\50\1\31\1\46\1\62\11\63\1\32\1\34\1\44\1"+
			"\43\1\45\1\57\1\uffff\1\3\1\14\1\25\1\12\1\11\1\2\1\13\1\15\1\10\1\22"+
			"\1\26\1\7\1\24\1\5\1\4\1\21\1\64\1\23\1\17\1\1\1\20\1\30\1\16\3\64\1"+
			"\37\1\uffff\1\40\1\56\1\65\33\64\1\41\1\55\1\42\1\54",
			"\1\70\1\74\2\uffff\1\73\2\uffff\1\75\1\72\5\uffff\1\71\2\uffff\1\67",
			"\1\76\3\uffff\1\104\3\uffff\1\101\2\uffff\1\102\2\uffff\1\103\2\uffff"+
			"\1\77\2\uffff\1\100",
			"\1\112\1\uffff\1\110\5\uffff\1\105\1\uffff\1\106\3\uffff\1\111\1\107",
			"\1\117\7\uffff\1\116\1\uffff\1\120\1\uffff\1\113\2\uffff\1\115\1\114",
			"\1\121\5\uffff\1\122",
			"\1\123",
			"\1\130\3\uffff\1\126\3\uffff\1\125\5\uffff\1\127",
			"\1\136\1\uffff\1\131\6\uffff\1\133\1\132\4\uffff\1\134\1\135",
			"\1\142\1\uffff\1\141\4\uffff\1\140\4\uffff\1\137",
			"\1\145\1\150\2\uffff\1\143\3\uffff\1\144\5\uffff\1\147\2\uffff\1\146",
			"\1\151",
			"\1\156\3\uffff\1\154\5\uffff\1\153\5\uffff\1\155\3\uffff\1\152",
			"\1\157\15\uffff\1\160",
			"\1\161\1\162",
			"\1\170\1\uffff\1\163\2\uffff\1\164\4\uffff\1\166\1\uffff\1\165\3\uffff"+
			"\1\171\1\167",
			"\1\172\1\uffff\1\175\2\uffff\1\173\1\174",
			"\1\177\3\uffff\1\u0080\6\uffff\1\u0081\5\uffff\1\176\2\uffff\1\u0082",
			"\1\u0083",
			"\1\u0089\1\uffff\1\u0087\1\uffff\1\u0085\3\uffff\1\u0084\2\uffff\1\u0088"+
			"\2\uffff\1\u0086",
			"\1\u008b\7\uffff\1\u008c\11\uffff\1\u008a",
			"\1\u0091\6\uffff\1\u008f\3\uffff\1\u008d\2\uffff\1\u0090\2\uffff\1\u008e"+
			"\2\uffff\1\u0092",
			"\1\u0093",
			"\1\u0096\5\uffff\1\u0094\12\uffff\1\u0095",
			"\1\u0098",
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
			"\1\u0099\1\123",
			"\1\u009b",
			"",
			"",
			"\1\u009d",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\47\u009f\1\u00a1\64\u009f\1\u00a0\uffa3\u009f",
			"\42\u00a2\1\u00a4\71\u00a2\1\u00a3\uffa3\u00a2",
			"\12\u00a7\7\uffff\4\64\1\u00ab\6\64\1\u00a6\6\64\1\u00a8\4\64\1\u00a5"+
			"\1\u00a9\1\64\4\uffff\1\64\1\uffff\4\64\1\u00ab\25\64",
			"\12\u00a7\7\uffff\4\64\1\u00ab\6\64\1\u00a6\6\64\1\u00a8\5\64\1\u00a9"+
			"\1\64\4\uffff\1\64\1\uffff\4\64\1\u00ab\25\64",
			"",
			"",
			"",
			"\1\u00ad\7\uffff\1\u00ae\13\uffff\1\u00ac",
			"\1\u00af",
			"\12\64\7\uffff\24\64\1\u00b0\5\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00b3\1\u00b2",
			"\1\u00b6\4\uffff\1\u00b4\5\uffff\1\u00b5",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb\1\uffff\1\u00bc",
			"\1\u00be\6\uffff\1\u00bf\5\uffff\1\u00bd",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3\7\uffff\1\u00c4",
			"\1\u00c6\2\uffff\1\u00c5",
			"\12\64\7\uffff\2\64\1\u00c7\27\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00c9",
			"\1\u00cb\16\uffff\1\u00ca",
			"\1\u00cc",
			"\12\64\7\uffff\3\64\1\u00cd\26\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00cf",
			"\1\u00d0",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\5\64\1\u00d2\24\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00d4",
			"\1\u00d5\12\uffff\1\u00d6",
			"\1\u00d7",
			"",
			"",
			"\1\u00d8\1\uffff\1\u00da\1\u00d9",
			"\1\u00db",
			"\1\u00dd\1\uffff\1\u00dc\12\uffff\1\u00de",
			"\1\u00df",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\3\64\1\u00e2\13\64\1\u00e3\2\64\1\u00e1\1\u00e4\6\64"+
			"\4\uffff\1\64\1\uffff\32\64",
			"\1\u00e6",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ed\5\uffff\1\u00ea\6\uffff\1\u00eb\3\uffff\1\u00ec",
			"\1\u00ee",
			"\1\u00ef\2\uffff\1\u00f0",
			"\1\u00f1",
			"\1\u00f4\5\uffff\1\u00f3\6\uffff\1\u00f2",
			"\1\u00f6\1\u00f5\2\uffff\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fd\15\uffff\1\u00fc",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00ff\4\uffff\1\u0100",
			"\1\u0101\6\uffff\1\u0102",
			"\1\u0103",
			"\1\u0104\15\uffff\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108\3\uffff\1\u0109",
			"\1\u010a",
			"\1\u010b\1\u010f\3\uffff\1\u010c\1\u010d\1\uffff\1\u010e",
			"\1\u0111\15\uffff\1\u0110",
			"\1\u0112",
			"\1\u0113",
			"\1\u0116\15\uffff\1\u0115\2\uffff\1\u0114",
			"\1\u0117",
			"\1\u0118",
			"\1\u011d\2\uffff\1\u011a\4\uffff\1\u0119\2\uffff\1\u011b\6\uffff\1\u011c",
			"\1\u011f\3\uffff\1\u011e",
			"\1\u0120",
			"\1\u0121",
			"\1\u0122\11\uffff\1\u0123",
			"\1\u0124",
			"\1\u0125",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012e\1\u012a\1\u0131\1\u012d\2\uffff\1\u012f\6\uffff\1\u012c\1\uffff"+
			"\1\u012b\2\uffff\1\u0132\2\uffff\1\u0130",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\1\u0138\3\uffff\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c\11\uffff\1\u013d",
			"\1\u013e",
			"\1\u013f\1\u0140\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"",
			"",
			"",
			"",
			"\1\u0145",
			"",
			"",
			"",
			"",
			"",
			"",
			"\47\u009f\1\u00a1\64\u009f\1\u00a0\uffa3\u009f",
			"\0\u0146",
			"\1\61\4\uffff\1\60",
			"\42\u00a2\1\u00a4\71\u00a2\1\u00a3\uffa3\u00a2",
			"\0\u0148",
			"\1\61\4\uffff\1\60",
			"\12\u0149\7\uffff\6\u0149\32\uffff\6\u0149",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\u00a7\7\uffff\4\64\1\u00ab\6\64\1\u00a6\6\64\1\u00a8\5\64\1\u00a9"+
			"\1\64\4\uffff\1\64\1\uffff\4\64\1\u00ab\25\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u00aa\1\uffff\1\u00aa\2\uffff\12\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"\1\u0152",
			"",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155",
			"\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\1\u0162",
			"\1\u0163",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0165",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0167",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u016d",
			"",
			"\1\u016e",
			"\12\64\7\uffff\4\64\1\u016f\12\64\1\u0170\12\64\4\uffff\1\64\1\uffff"+
			"\32\64",
			"",
			"\1\u0172",
			"",
			"\1\u0173",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a\11\uffff\1\u017b",
			"\1\u017c",
			"\1\u017d",
			"\1\u017e",
			"",
			"\1\u017f",
			"\1\u0180",
			"\1\u0181\23\uffff\1\u0182",
			"\12\64\7\uffff\4\64\1\u0184\11\64\1\u0183\13\64\4\uffff\1\64\1\uffff"+
			"\32\64",
			"",
			"\1\u0186",
			"",
			"\1\u0187",
			"\1\u0188",
			"\1\u0189",
			"\1\u018b\2\uffff\1\u018a",
			"\1\u018c",
			"\1\u018d",
			"\1\u018e",
			"\1\u018f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0191",
			"\1\u0192",
			"\1\u0194\3\uffff\1\u0193",
			"\1\u0195",
			"\1\u0197\22\uffff\1\u0196",
			"\1\u0198",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u019a\3\uffff\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"\1\u019e",
			"\1\u019f",
			"\1\u01a0",
			"",
			"\1\u01a1",
			"\1\u01a2",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"\1\u01a6",
			"\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01ab\3\uffff\1\u01aa",
			"\1\u01ac",
			"\1\u01ad",
			"\1\u01ae",
			"\1\u01af",
			"\1\u01b0",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01b2",
			"\1\u01b3",
			"\1\u01b4",
			"\1\u01b5",
			"\1\u01b6",
			"\1\u01b9\3\uffff\1\u01b7\13\uffff\1\u01b8",
			"\1\u01ba",
			"\1\u01bb",
			"\1\u01bc",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01bf\1\uffff\1\u01be",
			"\1\u01c0",
			"\1\u01c1",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c4",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\u01c6\1\uffff\32\64",
			"\1\u01c8",
			"\1\u01c9",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u01cc",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"\1\u01d1",
			"\1\u01d2\12\uffff\1\u01d3",
			"\1\u01d4",
			"\1\u01d5",
			"\1\u01d6",
			"\1\u01d7",
			"\1\u01d8",
			"\1\u01d9",
			"\1\u01da",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01dc",
			"\1\u01dd",
			"\1\u01de",
			"\1\u01df",
			"\12\64\7\uffff\11\64\1\u01e0\20\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01e2",
			"\1\u01e3",
			"\1\u01e4",
			"\1\u01e5",
			"\1\u01e6",
			"\1\u01e7",
			"\1\u01e9\10\uffff\1\u01e8",
			"\1\u01ea\2\uffff\1\u01eb",
			"\1\u01ed\20\uffff\1\u01ec",
			"\1\u01f0\1\uffff\1\u01ef\16\uffff\1\u01ee",
			"\1\u01f1",
			"\1\u01f2",
			"\1\u01f3",
			"\47\u009f\1\u00a1\64\u009f\1\u00a0\uffa3\u009f",
			"",
			"\42\u00a2\1\u00a4\71\u00a2\1\u00a3\uffa3\u00a2",
			"\12\u0149\7\uffff\6\u0149\24\64\4\uffff\1\64\1\uffff\6\u0149\24\64",
			"",
			"",
			"",
			"\12\u014d\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01f6",
			"\1\u01f7",
			"\1\u01f8",
			"\1\u01f9",
			"\1\u01fa",
			"\1\u01fb",
			"\1\u01fc",
			"\1\u01fd",
			"\1\u01fe",
			"\1\u01ff",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0201",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0204",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a",
			"",
			"\1\u020b",
			"",
			"\1\u020c",
			"",
			"\1\u020d",
			"\1\u020e",
			"\1\u020f",
			"",
			"\1\u0210",
			"\1\u0211",
			"\1\u0212",
			"\1\u0213",
			"",
			"\1\u0214",
			"\1\u0215",
			"\1\u0216",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0219",
			"\1\u021a",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u021c\7\uffff\1\u021d",
			"\12\64\7\uffff\22\64\1\u021e\7\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0222",
			"\1\u0223",
			"\1\u0224",
			"\1\u0225",
			"\1\u0226",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0228",
			"",
			"\1\u0229",
			"\1\u022a",
			"\1\u022b",
			"\1\u022c",
			"\1\u022d",
			"\1\u022e",
			"\1\u0230\3\uffff\1\u022f",
			"\1\u0231",
			"\1\u0232",
			"\1\u0233",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\21\64\1\u0235\10\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0237",
			"\1\u0238",
			"\1\u0239",
			"\1\u023a\10\uffff\1\u023b",
			"\1\u023c",
			"\1\u023d",
			"",
			"\12\64\7\uffff\1\64\1\u023e\30\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\23\64\1\u0240\6\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0243",
			"\1\u0244",
			"\1\u0245",
			"\1\u0246",
			"\1\u0247",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0249",
			"\1\u024a",
			"\1\u024b",
			"\1\u024c",
			"\1\u024d",
			"\1\u024e",
			"\1\u024f",
			"\1\u0250",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0252",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0254",
			"\1\u0255",
			"\1\u0256",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\u0258\1\uffff\32\64",
			"\1\u025a",
			"\12\64\7\uffff\4\64\1\u025b\25\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u025d",
			"\1\u025e",
			"\1\u025f",
			"\1\u0260",
			"\1\u0261",
			"\1\u0262",
			"\1\u0263",
			"",
			"\1\u0264",
			"\1\u0265",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0267",
			"\1\u0268",
			"\1\u0269",
			"\1\u026a",
			"",
			"\1\u026b",
			"",
			"\1\u026c",
			"\1\u026d",
			"\1\u026e",
			"\1\u026f",
			"\1\u0270",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0272",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0274",
			"\1\u0275",
			"\1\u0276",
			"\1\u0277",
			"\1\u0278",
			"\1\u0279",
			"\12\64\7\uffff\16\64\1\u027a\3\64\1\u027b\7\64\4\uffff\1\64\1\uffff"+
			"\32\64",
			"\1\u027d",
			"\1\u027e",
			"\1\u027f",
			"\1\u0280",
			"",
			"\1\u0281",
			"\1\u0282",
			"\1\u0283",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0285",
			"",
			"\1\u0286",
			"\1\u0287",
			"\1\u0288",
			"\1\u0289",
			"\1\u028a",
			"\1\u028b",
			"\1\u028c",
			"\1\u028d",
			"\1\u028e",
			"\1\u028f",
			"\1\u0290",
			"\1\u0291",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0294",
			"\1\u0295",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u0298",
			"\1\u0299",
			"\12\64\7\uffff\22\64\1\u029a\7\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u029d",
			"\1\u029e",
			"\1\u029f",
			"\1\u02a0",
			"\1\u02a1",
			"\1\u02a2",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u02a4",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02a6",
			"\1\u02a7",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02a9",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02ac",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02af",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02b1",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02b3",
			"\1\u02b4",
			"\1\u02b5",
			"\1\u02b6",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02ba",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"\1\u02bc",
			"\1\u02bd",
			"\12\64\7\uffff\4\64\1\u02be\25\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02c0",
			"\1\u02c2\1\uffff\1\u02c1",
			"",
			"\1\u02c3",
			"\1\u02c4",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02c6",
			"\1\u02c7",
			"\1\u02c8",
			"\1\u02c9",
			"\1\u02ca",
			"\1\u02cb",
			"\1\u02cc",
			"\1\u02cd",
			"\1\u02ce",
			"",
			"\1\u02cf",
			"",
			"\1\u02d0",
			"\1\u02d1",
			"\1\u02d2",
			"\1\u02d3",
			"\1\u02d4",
			"\1\u02d5",
			"\1\u02d6",
			"\1\u02d7",
			"",
			"\1\u02d8",
			"",
			"",
			"\1\u02d9",
			"\1\u02da",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02dd",
			"",
			"\1\u02de",
			"\1\u02df",
			"\1\u02e0",
			"\1\u02e1",
			"\1\u02e2",
			"\1\u02e3",
			"\1\u02e4",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u02e7",
			"\1\u02e8",
			"\12\64\7\uffff\17\64\1\u02e9\12\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u02eb",
			"",
			"\1\u02ec",
			"\1\u02ed",
			"",
			"\1\u02ee",
			"\1\u02ef",
			"\1\u02f0",
			"\1\u02f1",
			"\1\u02f2",
			"\1\u02f3",
			"\1\u02f4",
			"\1\u02f5",
			"\12\64\7\uffff\23\64\1\u02f6\6\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u02f8",
			"\1\u02f9",
			"\1\u02fa",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02fc",
			"\1\u02fd",
			"\1\u02fe",
			"\1\u02ff",
			"\1\u0300",
			"\1\u0301",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0304",
			"\1\u0305",
			"\1\u0306",
			"\1\u0307",
			"\1\u0308",
			"\1\u0309",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u030b",
			"\1\u030c",
			"\1\u030d",
			"\1\u030e",
			"\1\u030f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0312",
			"\1\u0313",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0315",
			"\1\u0316",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0318",
			"\1\u0319",
			"\1\u031a",
			"\1\u031b",
			"\1\u031c",
			"\1\u031d",
			"\1\u031e",
			"",
			"",
			"\1\u031f",
			"\1\u0320",
			"",
			"",
			"\1\u0321",
			"\1\u0322",
			"\12\64\7\uffff\1\u0323\31\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u0325",
			"\1\u0326",
			"\1\u0327",
			"\1\u0328",
			"\1\u0329",
			"\1\u032a",
			"",
			"\1\u032b",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u032d",
			"",
			"\12\64\7\uffff\23\64\1\u032e\6\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u0330",
			"",
			"",
			"\1\u0331",
			"",
			"\1\u0332",
			"",
			"\1\u0334\1\uffff\1\u0333",
			"\1\u0335",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0337",
			"",
			"",
			"",
			"\1\u0338",
			"",
			"\1\u0339",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u033b",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u033d",
			"\1\u033e",
			"\1\u033f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0341",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0344",
			"\1\u0345",
			"\1\u0346",
			"\1\u0347",
			"\1\u0348",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u034a",
			"\1\u034b",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u034d",
			"\1\u034e",
			"\1\u034f",
			"\1\u0350",
			"\1\u0351",
			"\1\u0352",
			"\1\u0353",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0355",
			"",
			"",
			"\1\u0356",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\22\64\1\u0359\7\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u035c",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u035e",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0360",
			"\1\u0361",
			"",
			"\1\u0362",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0365",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0368",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u036a",
			"\12\64\7\uffff\22\64\1\u036b\7\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u036d",
			"\1\u036e",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0370",
			"\1\u0371",
			"",
			"\1\u0372",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0374",
			"\1\u0375",
			"\1\u0376",
			"\1\u0377",
			"",
			"",
			"\1\u0378",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u037a",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u037d",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0380\4\uffff\1\u0381",
			"\1\u0382",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u0384",
			"\1\u0385",
			"",
			"\1\u0386",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\22\64\1\u0389\7\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u038b",
			"\1\u038c",
			"\1\u038d",
			"\1\u038e",
			"\1\u038f",
			"\1\u0390",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0392",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0394",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0396",
			"\1\u0397",
			"\1\u0398",
			"\1\u0399",
			"\1\u039a",
			"\1\u039b",
			"",
			"\1\u039c",
			"\1\u039d",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03a0",
			"\1\u03a1",
			"\1\u03a2",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03a5",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u03a8",
			"\1\u03a9",
			"\1\u03aa",
			"",
			"\1\u03ab",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03ad",
			"\1\u03ae",
			"\1\u03af",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u03b1",
			"\1\u03b2",
			"",
			"\1\u03b3",
			"\1\u03b4",
			"\1\u03b5",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03b7",
			"\1\u03b8",
			"\1\u03b9",
			"",
			"\1\u03ba",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u03be",
			"",
			"\1\u03bf",
			"\1\u03c0",
			"\1\u03c1",
			"",
			"",
			"\1\u03c2",
			"",
			"",
			"\1\u03c3",
			"",
			"\1\u03c4",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u03c6",
			"\1\u03c7",
			"",
			"\1\u03c8",
			"\1\u03c9",
			"\1\u03ca",
			"",
			"\1\u03cb",
			"\1\u03cc",
			"\1\u03cd",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u03d1",
			"",
			"",
			"\1\u03d2",
			"\1\u03d3",
			"\1\u03d4",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03d6",
			"\12\64\7\uffff\4\64\1\u03d7\15\64\1\u03d8\7\64\4\uffff\1\64\1\uffff"+
			"\32\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u03db",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03de",
			"\1\u03df",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u03e1",
			"",
			"\1\u03e2",
			"",
			"\1\u03e3",
			"\1\u03e4",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03e6",
			"\1\u03e7",
			"\12\64\7\uffff\22\64\1\u03e8\7\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03ea",
			"\1\u03eb",
			"",
			"",
			"\1\u03ec",
			"\1\u03ed",
			"\1\u03ee",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u03f0",
			"\1\u03f1",
			"\1\u03f2",
			"\1\u03f3",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03f6",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03f8",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03fb",
			"",
			"\1\u03fc",
			"\12\64\7\uffff\22\64\1\u03fd\7\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0400",
			"",
			"",
			"",
			"\1\u0401",
			"\1\u0402",
			"\1\u0403",
			"\1\u0404",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0406",
			"\1\u0407",
			"",
			"\1\u0408",
			"\1\u0409",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u040b",
			"\1\u040c",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u040e",
			"\1\u040f",
			"",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0411",
			"\1\u0412",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0414",
			"\1\u0415",
			"\1\u0416",
			"",
			"",
			"\1\u0417",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0419",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u041b",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u041d",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u041f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0421",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0424",
			"\1\u0425",
			"",
			"\1\u0426",
			"\1\u0427",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0429",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u042c",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u042f",
			"\1\u0430",
			"\1\u0431",
			"\1\u0432",
			"\1\u0433",
			"",
			"\1\u0434",
			"\1\u0435",
			"\1\u0436",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0439",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\4\64\1\u043c\15\64\1\u043b\7\64\4\uffff\1\64\1\uffff"+
			"\32\64",
			"",
			"\1\u043e",
			"\1\u043f",
			"",
			"\1\u0440",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0442",
			"\1\u0443",
			"",
			"\1\u0444",
			"",
			"\1\u0445",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0447",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u0449",
			"\1\u044a",
			"\1\u044b",
			"\1\u044c",
			"",
			"\1\u044d",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u044f",
			"\1\u0450",
			"\1\u0451",
			"\1\u0452",
			"\1\u0453",
			"\1\u0454",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u0457",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0459",
			"",
			"\1\u045a",
			"\1\u045b",
			"\1\u045c",
			"",
			"\1\u045d",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u045f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0461",
			"",
			"\1\u0462",
			"\1\u0463",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0466",
			"",
			"\1\u0467",
			"\1\u0468",
			"\1\u0469",
			"\1\u046a",
			"\1\u046b",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u046d",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u046f",
			"\1\u0470",
			"\1\u0471",
			"\1\u0472",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0474",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u0477",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u047b",
			"\1\u047c",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0481",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"\1\u0484",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u0487",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			""
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( KW_TRUE | KW_FALSE | KW_ALL | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_STRING | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_COLUMNS | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_EXPLAIN | KW_EXTENDED | KW_FORMATTED | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | BigintLiteral | SmallintLiteral | TinyintLiteral | Number | Identifier | CharSetName | WS | COMMENT );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA23_48 = input.LA(1);
						s = -1;
						if ( ((LA23_48 >= '\u0000' && LA23_48 <= '&')||(LA23_48 >= '(' && LA23_48 <= '[')||(LA23_48 >= ']' && LA23_48 <= '\uFFFF')) ) {s = 159;}
						else if ( (LA23_48=='\\') ) {s = 160;}
						else if ( (LA23_48=='\'') ) {s = 161;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA23_328 = input.LA(1);
						s = -1;
						if ( (LA23_328=='\"') ) {s = 164;}
						else if ( ((LA23_328 >= '\u0000' && LA23_328 <= '!')||(LA23_328 >= '#' && LA23_328 <= '[')||(LA23_328 >= ']' && LA23_328 <= '\uFFFF')) ) {s = 162;}
						else if ( (LA23_328=='\\') ) {s = 163;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA23_162 = input.LA(1);
						s = -1;
						if ( (LA23_162=='\"') ) {s = 164;}
						else if ( ((LA23_162 >= '\u0000' && LA23_162 <= '!')||(LA23_162 >= '#' && LA23_162 <= '[')||(LA23_162 >= ']' && LA23_162 <= '\uFFFF')) ) {s = 162;}
						else if ( (LA23_162=='\\') ) {s = 163;}
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA23_160 = input.LA(1);
						s = -1;
						if ( ((LA23_160 >= '\u0000' && LA23_160 <= '\uFFFF')) ) {s = 326;}
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA23_163 = input.LA(1);
						s = -1;
						if ( ((LA23_163 >= '\u0000' && LA23_163 <= '\uFFFF')) ) {s = 328;}
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA23_326 = input.LA(1);
						s = -1;
						if ( (LA23_326=='\'') ) {s = 161;}
						else if ( ((LA23_326 >= '\u0000' && LA23_326 <= '&')||(LA23_326 >= '(' && LA23_326 <= '[')||(LA23_326 >= ']' && LA23_326 <= '\uFFFF')) ) {s = 159;}
						else if ( (LA23_326=='\\') ) {s = 160;}
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA23_159 = input.LA(1);
						s = -1;
						if ( (LA23_159=='\'') ) {s = 161;}
						else if ( ((LA23_159 >= '\u0000' && LA23_159 <= '&')||(LA23_159 >= '(' && LA23_159 <= '[')||(LA23_159 >= ']' && LA23_159 <= '\uFFFF')) ) {s = 159;}
						else if ( (LA23_159=='\\') ) {s = 160;}
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA23_49 = input.LA(1);
						s = -1;
						if ( ((LA23_49 >= '\u0000' && LA23_49 <= '!')||(LA23_49 >= '#' && LA23_49 <= '[')||(LA23_49 >= ']' && LA23_49 <= '\uFFFF')) ) {s = 162;}
						else if ( (LA23_49=='\\') ) {s = 163;}
						else if ( (LA23_49=='\"') ) {s = 164;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 23, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
