package com.main;

import com.parser.IOTParser;

import src.com.lexer.IOTPoliciesLexer;
import src.com.lexer.IOTPoliciesParser;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.time.StopWatch;

public class Main
{
  public static void main(String[] args) throws IOException, InterruptedException {
    InputStream is = System.in;
    is = new FileInputStream("test.txt");
    
    StopWatch watchBuildTree = new StopWatch();
    StopWatch watchParserTree = new StopWatch();
    watchBuildTree.start();
    
    ANTLRInputStream input = new ANTLRInputStream(is);
    IOTPoliciesLexer lexer = new IOTPoliciesLexer((CharStream)input);
    CommonTokenStream tokens = new CommonTokenStream((TokenSource)lexer);
    IOTPoliciesParser parser = new IOTPoliciesParser((TokenStream)tokens);
    
    IOTPoliciesParser.PoliciesContext policiesContext = parser.policies();
    
    watchBuildTree.stop();
    
    IOTParser translator = new IOTParser();
    
    watchParserTree.start();
    
    translator.visit((ParseTree)policiesContext);
    
    watchParserTree.stop();
    
    String myFileName = "results.txt";

    Writer output = new BufferedWriter(new FileWriter(myFileName, true));
    Double buildTime = Double.valueOf(watchBuildTree.getTime() / 1000.0D);
    Double parserTime = Double.valueOf(watchParserTree.getTime() / 1000.0D);
    Double totalTime = Double.valueOf(buildTime.doubleValue() + parserTime.doubleValue());
    
    output.append(buildTime + "\t" + parserTime + "\t" + totalTime + "\n");
    output.close();
  }
}
