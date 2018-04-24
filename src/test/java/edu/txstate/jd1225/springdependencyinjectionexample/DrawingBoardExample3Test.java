package edu.txstate.jd1225.springdependencyinjectionexample;

import org.junit.Test;
import org.springframework.test.context.ActiveProfiles;

//@ActiveProfiles("development")
public class DrawingBoardExample3Test {

    @Test
    public void printResults() {


        DrawingBoardExample3 board3 = new DrawingBoardExample3();
        board3.printResults();
    }
}