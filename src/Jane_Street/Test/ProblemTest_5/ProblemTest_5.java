package Jane_Street.Test.ProblemTest_5;

import Jane_Street.Main.Problem_5.Car;
import Jane_Street.Main.Problem_5.Cdr;
import Jane_Street.Main.Problem_5.Cons;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest_5 {

    private static Cons<Object> consInt;

    @Test
    public void checkCar() {

        int expected = 3;
        Car<Object> car = new Car<Object>();
        consInt = new Cons<Object>(3, 4);

        assertEquals(expected, car.car(consInt));
    }

    @Test
    public void checkCdr() {

        int expected = 4;
        Cdr<Object> cdr = new Cdr<Object>();
        consInt = new Cons<Object>(3, 4);

        assertEquals(expected, cdr.cdr(consInt));
    }
}
