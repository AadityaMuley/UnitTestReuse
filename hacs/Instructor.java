package hacs;

/**
 * Title:        HACS
 * Description:  SER515 : Unit Test and Reuse
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 * @version 1.0
 */

public class Instructor extends Person {
	public Instructor() {
		type = 1;// type=1 :instructor
	}

	public CourseMenu createCourseMenu(Course course, int level) {
		if (level == 0)/// 0: Highlevel defined in CourseSeletDlg.
		{
			courseMenu = new HighLevelCourseMenu();
		} else/// 1: LowLevel
		{
			courseMenu = new HighLevelCourseMenu();
		}
		return courseMenu;
	}

	public boolean showMenu() {
		super.showMenu();
		showAddButton();
		showViewButtons();
		showComboxes();
		showRadios();
		show();
		return ifLogout();
	}
}