package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void finalValueAfterOperationsTest(){

        String[] result = {"--X","X++","X++"} ;
        int ex = 1;

        Assertions.
                assertEquals(ex,solution.finalValueAfterOperations(result));
    }

}