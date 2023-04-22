package test;

import com.mycompany.backtracking.NQueens;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.Assert.assertEquals;

public class NQueensTest {

    @Test
    public void testNQueens() {
        int n = 4; // number of queens
        NQueens problem = new NQueens(n);
        assertTrue(problem.solve());
        assertEquals(1, problem.getBoard()[0][1]);
        assertEquals(1, problem.getBoard()[1][3]);
        assertEquals(1, problem.getBoard()[2][0]);
        assertEquals(1, problem.getBoard()[3][2]);
    }
}
