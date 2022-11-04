package hacs;

import java.util.*;

/**
 * Title:        HACS
 * Description:  SER515 : Unit Test and Reuse
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 * @version 1.0
 */

abstract public class Person {
	int type = 0; // type=0 : student, type=1 instructor
	String userName;
	ClassCourseList classCourseList;
	CourseMenu courseMenu;
	Course currentCourse;
	Assignment currentAssignment;

	public Person() {
		classCourseList = new ClassCourseList();
	}

	abstract public CourseMenu createCourseMenu(Course theCourse, int theLevel);

	public void showAddButton() {
		courseMenu.ShowAddButtons();
	}

	public void showViewButtons() {
		courseMenu.ShowViewButtons();
	}

	public void showComboxes() {
		courseMenu.ShowComboxes();
	}

	public void showRadios() {
		courseMenu.ShowRadios();
	}

	public void show() {
		courseMenu.show();
	}

	public boolean ifLogout() {
		return courseMenu.ifLogout();
	}

	// show the assignment list
	public boolean showMenu() {
		// create a iterator for the assignment list
//    Iterator iterator=new ListIterator(CurrentCourse.AssList );
		Iterator iterator = currentCourse.assignmentList.iterator();
		courseMenu.theCourse = currentCourse;
		Assignment assignment;
		while (iterator.hasNext()) {
			assignment = (Assignment) iterator.next();
			courseMenu.AssignmentCombox.addItem(assignment);
		}
		return false;
	}

	public ClassCourseList getCourseList() {
		return classCourseList;
	}

	public void addCourse(Course theCourse) {
		classCourseList.add(theCourse);
	}
}