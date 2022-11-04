package hacs;

import java.util.ArrayList;
import java.io.*;

/**
 * Title:        HACS
 * Description:  SER515 : Unit Test and Reuse
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 * @version 1.0
 */

public class ClassCourseList extends ArrayList<Course> {
	
	boolean courseInfoSet = false;

	public ClassCourseList() {
	}

	//// initialize the list by reading from the file.
	void initializeFromFile(String fileName) {
		try {
			BufferedReader file;
			String courseName = null;
			file = new BufferedReader(new FileReader("./hacs/CourseInfo.txt"));
			while ((courseName = file.readLine()) != null) {
				Course course = new Course(courseName, 0);
//      course.CourseName= courseName;
				add(course);
			}
			courseInfoSet = true;
		} catch (Exception ee) {
			;
		}
	}

	Course findCourseByCourseName(String courseName) {
		int courseCount = size();
		for (int i = 0; i < courseCount; i++) {
			Course course = (Course) get(i);
			if (course.courseName.compareTo(courseName) == 0)
				return course;
		}
		return null;
	}

}