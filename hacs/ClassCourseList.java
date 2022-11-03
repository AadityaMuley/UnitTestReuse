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

	public ClassCourseList() {
	}

	//// initialize the list by reading from the file.
	void InitializeFromFile(String theFileName) {
		try {
			BufferedReader file;
			String strCourseName = null;
			file = new BufferedReader(new FileReader("./hacs/CourseInfo.txt"));
			while ((strCourseName = file.readLine()) != null) {
				Course theCourse;
				theCourse = new Course(strCourseName, 0);
//      theCourse.CourseName= strCourseName;
				add(theCourse);
			}
		} catch (Exception ee) {
			;
		}
	}

	Course FindCourseByCourseName(String CourseName) {
		int nCourseCount = size();
		for (int i = 0; i < nCourseCount; i++) {
			Course theCourse;
			theCourse = (Course) get(i);
			if (theCourse.CourseName.compareTo(CourseName) == 0)
				return theCourse;
		}
		return null;
	}

}