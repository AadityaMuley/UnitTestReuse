package hacs;

import java.util.Iterator;

/**
 * Title:        HACS
 * Description:  SER515 : Unit Test and Reuse
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 * @version 1.0
 */

public class CourseIterator implements Iterator
{
  ClassCourseList classCourseList;
  int currentCourseNumber =-1;


  public CourseIterator()
  {
  }

  public CourseIterator(ClassCourseList courseList)
  {
    classCourseList = courseList;
  }

  public boolean hasNext()
  {
    if (currentCourseNumber >= classCourseList.size()-1)
      return false;
    else
      return true;
  }

  public Object next()
  {
    if (hasNext()==true)
    {
      currentCourseNumber++;
      return classCourseList.get(currentCourseNumber);
    }
    else
    {
      return null;
    }
  }
  public void remove()
  {
    classCourseList.remove(currentCourseNumber);
  }

// the next Course that fits the given courseName
  public Object next(String courseName)
  {
    Course course = (Course)next();
    while(course!=null)
    {
      if(courseName.compareTo(course.toString())==0)
      {
        return course;
      }
      course=(Course)next();
    }
    return null;
  }


}