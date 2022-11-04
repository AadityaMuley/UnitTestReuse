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
class CourseIteratorTest {
    
    CourseIterator courseIterator = new CourseIterator(new ClassCourseList());
    
    @Test
    void hasNext() {
        assertEquals(false, courseIterator.hasNext());
    }
    
    @Test
    void next() {
        Object ob = courseIterator.next();
        assertEquals(null, ob);
    }
    
    
    @Test
    void testNext() {
        Object ob = courseIterator.next("SER515");
        assertEquals(null, ob);
    }
}