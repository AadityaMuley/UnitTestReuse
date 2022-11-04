package hacs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
class ClassCourseListTest extends ArrayList<Course> {
    
    ClassCourseList classCourseList = new ClassCourseList();
    @Test
    void initializeFromFile() {
        classCourseList.initializeFromFile("./hacs/CourseInfo.txt");
        assertEquals(true, classCourseList.courseInfoSet);
    }
    
    @Test
    void findCourseByCourseName() {
        Course course = new Course("SER515", 0);
//        course.CourseName = "SER515";
        assertEquals(0, course.courseName.compareTo("SER515"));
    }
}