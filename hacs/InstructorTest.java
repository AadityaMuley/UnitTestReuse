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
class InstructorTest {
    
    Instructor instructor = new Instructor();
    
    @Test
    void createCourseMenu() {
        CourseMenu courseMenu = instructor.createCourseMenu(new Course("SER515", 0), 0);
        assertNotEquals(null, courseMenu);
    }
}