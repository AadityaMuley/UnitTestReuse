package hacs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Title:        HACS
 * Description:  SER515 : Unit Test and Reuse
 *
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 * @version 1.0
 */
class SolutionTest {
    
    Solution solution = new Solution();
    
    @Test
    void testToString() {
        String test = solution.toString();
        assertNotEquals(null, test);
    }
    
    @Test
    void getGradeString() {
        String test = solution.getGradeString();
        assertNotEquals(null, test);
    }
    
    @Test
    void getGradeInt() {
        Object test = solution.getGradeInt();
        assertNotEquals(null, test);
    }
    
    @Test
    void setReported() {
        solution.setReported(true);
        assertEquals(true, solution.reported);
    }
    
    @Test
    void isReported() {
        solution.setReported(true);
        assertEquals(true, solution.isReported());
    }
}