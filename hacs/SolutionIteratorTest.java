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
class SolutionIteratorTest {
    
    SolutionIterator solutionIterator = new SolutionIterator(new SolutionList());
    
    @Test
    void moveToHead() {
        solutionIterator.moveToHead();
        assertEquals(-1, solutionIterator.currentSolutionNumber);
    }
    
    @Test
    void hasNext() {
        solutionIterator.currentSolutionNumber = 100;
        assertEquals(false, solutionIterator.hasNext());
    }
    
    @Test
    void next() {
        assertEquals(null, solutionIterator.next());
    }
    
    @Test
    void testNext() {
        assertEquals(null, solutionIterator.next("aaditya"));
    }
}