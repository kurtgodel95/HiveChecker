
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.apache.hadoop.hive.ql.parse.ParseDriver;
import org.apache.hadoop.hive.ql.parse.ParseException;


public class Main {
  public static void main(String[] args) throws Exception{
    CharStream cs = new ANTLRUpperCaseFileStream("/home/psatish/code/foo.sql");
    ParseDriver parseDriver = new ParseDriver();
    //.HiveParserX lexer = new ParseDriver.HiveLexerX(cs);
    ParseDriver.HiveLexerX lexer = parseDriver.new HiveLexerX(cs);

    CommonTokenStream tokens = new CommonTokenStream();
    tokens.setTokenSource(lexer);

    ParseDriver.HiveParserX parser = parseDriver.new HiveParserX(tokens);
    try{
      parser.statement();
    }catch (RecognitionException e) {
      throw new ParseException(parser.getErrors());
    }
    System.out.println("Parse Completed: Syntax OK");
  }
}