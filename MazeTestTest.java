package Projects;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class MazeTestTest {
    @Test
    public void test_1(){
        String [][] array = {{"0110", "1010", "1010", "1000"},
                {"1010", "1000", "1001", "0101"},
                {"1100", "0011", "0101", "0110"},
                {"0101", "1101", "0110", "1001"},
                {"0110", "0011", "1110", "0010"}};
        Assertions.assertTrue(MazeTest.leftGate(array, 0, 0, 0) + MazeTest.rightGate(array, 0, array[0].length, 0)
                + MazeTest.topGate(array, 0, 0, 0) + MazeTest.bottomGate(array, array.length - 1, 0, 0) >= 2);
    }
}