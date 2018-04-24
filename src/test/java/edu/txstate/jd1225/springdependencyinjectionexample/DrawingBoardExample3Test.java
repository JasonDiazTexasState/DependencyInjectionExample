package edu.txstate.jd1225.springdependencyinjectionexample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/developmentContext.xml")
public class DrawingBoardExample3Test {

    @Inject
    private DrawingBoardExample3 board3;

    @Test
    public void printResults() {
        Assert.assertEquals("Circle", board3.printResults());
    }
}