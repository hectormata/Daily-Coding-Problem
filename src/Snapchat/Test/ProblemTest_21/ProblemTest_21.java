package Snapchat.Test.ProblemTest_21;

import Snapchat.Main.Problem_21.Problem_21;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest_21 {

    @Test
    public void checkRooms() {

        int expected = 2;
        int actual = Problem_21.getRequiredRoomsAmount(new Util_Files.Interval[] {
                new Util_Files.Interval(30, 75),
                new Util_Files.Interval(0, 50),
                new Util_Files.Interval(60, 150)
        });

        assertEquals(expected, actual);
    }
}
