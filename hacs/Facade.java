package hacs;

import java.io.*;

/**
 * Title:        HACS
 * Description:  SER515 : Unit Test and Reuse
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 * @version 1.0
 */

public class Facade {
	public int userType;
	private Course seletedCourse = null;
	private int courseLevel = 0;
	ClassCourseList classCourseList;
	Person person;

	public Facade() {
	}

	static public boolean login(UserInfoItem userInfoItem) {
		Login login = new Login();
		login.setModal(true);
		login.show();
		userInfoItem.strUserName = login.GetUserName();
		userInfoItem.UserType = login.GetUserType();
		return login.isExit();
	}

/////////////////////////
//functions for CourseMenu
	/*
	 * When click the add button of the CourseMenu , call this function this
	 * function will new an assignment fill the required infomation this function
	 * will call InstructorAssignmentMenu or StudentAssignmentMenu according to the
	 * type of the user it will not update the course menu. the coursemenu need to
	 * refreshed outside the function
	 */

	void addAssignment(Course course) {
		AssignmentMenu assignmentMenu;
		if (person.type == 0)/// student
		{
			assignmentMenu = new StudentAssignmentMenu();
		} else {
			assignmentMenu = new InstructorAssignmentMenu();
		}
		Assignment assignment = new Assignment();
		assignmentMenu.ShowMenu(assignment, person);
		course.addAssignment(assignment);
	}

	/*
	 * When click the view button of the CourseMenu , call this function and pass
	 * the pointer of the Assignment and the person pointer to this function this
	 * function will new an assignment fill the required infomation this function
	 * will call InstructorAssignmentMenu or StudentAssignmentMenu according to the
	 * type of the user
	 */
	void viewAssignment(Assignment assignment) {
		AssignmentMenu assignmentMenu;
		if (person.type == 0)/// student
		{
			assignmentMenu = new StudentAssignmentMenu();
		} else {
			assignmentMenu = new InstructorAssignmentMenu();
		}

		assignmentMenu.ShowMenu(assignment, person);
	}

//functions for InstructorAssignmentMenu
	/*
	 * this function will grade the give Solution: theSolution this function calls
	 */

	void gradeSolution(Solution solution) {
		SolutionMenu solutionMenu = new SolutionMenu();
		solutionMenu.showMenu(solution);
	}

	void reportSolutions(Assignment assignment) {
		Solution solution;
		SolutionIterator solutionIterator;
		solutionIterator = assignment.getSolutionIterator();
		solution = (Solution) solutionIterator.next();
		while (solution != null) {
			solution.setReported(true);
			solution = (Solution) solutionIterator.next();
		}
	}
////////////////////

//functions for StudentAssignmentMenu
	void submitSolution(Assignment assignment, Solution solution) {
		assignment.addSolution(solution);
	}

//////////
	void remind() {
		Reminder reminder = new Reminder();
		reminder.showReminder(person.getCourseList());
	}

	void createUser(UserInfoItem userInfoItem) {
		if (userInfoItem.UserType == UserInfoItem.USER_TYPE.Student) /// student
		{
			person = new Student();
		} else /// instructor
		{
			person = new Instructor();
		}
		person.userName = userInfoItem.strUserName;
	}

	/*
	 * create a course list and intitialize it with the file CourseInfo.txt
	 */
	void createCourseList() {
		classCourseList = new ClassCourseList();
		classCourseList.initializeFromFile("./hacs/CourseInfo.txt");
	}

	/*
	 * call this function after create user, create courselist read the
	 * UserCourse.txt file match the coursename with theCouresList attach the
	 * Matched course object to the new create user Facade.thePerson.CourseList
	 */
	void attachCourseToUser() {
		BufferedReader file;
		try {
			file = new BufferedReader(new FileReader("./hacs/UserCourse.txt"));
			String aline, strUserName, strCourseName;
			while ((aline = file.readLine()) != null) // not the EOF
			{
				strUserName = getUserName(aline);
				strCourseName = getCourseName(aline);
				if (strUserName.compareTo(person.userName) == 0) /// the UserName mateches
				{
					seletedCourse = findCourseByCourseName(strCourseName);
					if (seletedCourse != null) /// Find the Course in the CourseList--->attach
					{
						person.addCourse(seletedCourse);
					}
				}
			}
		} catch (Exception ee) {
			;
		}
	}

	/*
	 * get the user name from aline UserName:CourseName
	 */
	private String getUserName(String aline) {
		int sep = aline.lastIndexOf(':');
		return aline.substring(0, sep);
	}

	/*
	 * get the CourseName from aline UserName:CourseName
	 */
	private String getCourseName(String aline) {
		int sep = aline.lastIndexOf(':');
		return aline.substring(sep + 1, aline.length());
	}

	/*
	 * show the course selection dlg, show the course attatched to theperson and
	 * return the selected course and assign the course to the class member
	 * theSelecteCourse, the Course Level to CourseLevel CourseLeve=0 High,
	 * CourseLeve=1 Low
	 */
	public boolean selectCourse() {
		CourseSelectDlg courseSelectDlg = new CourseSelectDlg();
		seletedCourse = courseSelectDlg.ShowDlg(person.classCourseList);
		person.currentCourse = seletedCourse;
		courseLevel = courseSelectDlg.nCourseLevel;
		return courseSelectDlg.isLogout();
	}

	/*
	 * call the thePerson.CreateCourseMenu according to the really object(student or
	 * instructor) and the nCourseLevel it will call different menu creater and show
	 * the menu;
	 */

	public boolean courseOperation() {
		person.createCourseMenu(seletedCourse, courseLevel);
		return person.showMenu();//// 0: logout 1 select an other course
	}

	/*
	 * find the course in theCourseList that matches strCourseName 1 create a
	 * CourseIterator for the List 2 Find the Course with the Iterator return the
	 * pointer of the Course if not fine, return null;
	 */
	private Course findCourseByCourseName(String strCourseName) {
		CourseIterator Iterator = new CourseIterator(classCourseList);
		return (Course) Iterator.next(strCourseName);
	}

}