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
class CourseTest {
    
    Course course = new Course("SER515", 0);
    @Test
    void addAssignment() {
        Assignment assignment = new Assignment();
        course.addAssignment(assignment);
        assertEquals(true, course.assignmentList.contains(assignment));
    }
    
    @Test
    void testToString() {
        assertEquals("SER515", course.toString());
    }
}