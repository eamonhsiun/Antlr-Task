package com.xl.interpreter;

import com.xl.interpreter.calculator.CalculatorLexer;
import com.xl.interpreter.calculator.CalculatorParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Created by Eamon on 2016/10/5.
 */
public class CalculatorTest {

    public static void main(String[] args) {
        ANTLRInputStream in = new ANTLRInputStream("(a+b)");

        CalculatorLexer lexer = new CalculatorLexer(in);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CalculatorParser parser = new CalculatorParser(tokens);
        parser.prog();
    }


}
