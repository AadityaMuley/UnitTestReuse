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

public class Course {
  String courseName;
  public ArrayList<Assignment> assignmentList=new ArrayList<Assignment>();
  int numOfAssignments;
  int courseLevel;


  public Course(String courseName, int level) {
    this.courseName = courseName;

   //0 HighLeve presentation    1  LowLevel Experiment
    this.courseLevel = level;
   // this.AssList = NULL;
    this.numOfAssignments = 0;
  }
  
  public void addAssignment(Assignment newAssignment)
  {
    assignmentList.add(newAssignment);
  }
  
  public String toString()
  {
    return courseName;
  }
  
  void accept(NodeVisitor visitor)
  {
    visitor.visitCourse(this);
  }

}