package edu.txstate.jd1225.springdependencyinjectionexample;

import edu.txstate.jd1225.springdependencyinjectionexample.shapes.Shape;
import edu.txstate.jd1225.springdependencyinjectionexample.shapes.ShapeFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@Profile({"production"})
public class Application {

	public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"developmentContext.xml"});

		try {

			Shape shape = ShapeFactory.getShape("EquilateralTriangle", 100);

			DrawingBoardExample1 board1 = new DrawingBoardExample1();
			DrawingBoardExample2 board2 = new DrawingBoardExample2(shape);
			DrawingBoardExample3 board3 = context.getBean(DrawingBoardExample3.class);

			board1.printResults();
			board2.printResults();
			board3.printResults();
		} catch (Shape.ShapeException e) {
			e.printStackTrace();
		}

	}
}
