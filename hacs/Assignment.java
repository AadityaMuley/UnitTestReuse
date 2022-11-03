package hacs;

/**
 * Title:        HACS
 * Description:  SER515 : Unit Test and Reuse
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 * @version 1.0
 */

import java.util.*;
import java.text.DateFormat;

public class Assignment {

  protected String assignmentName;
  protected String assignmentFileName;
  protected Date date =new Date();
  protected String assignmentSpecs;
  protected SolutionList solutionList =new SolutionList();
  protected Solution solution =new Solution();



  public Assignment() {
  }

  public void setDueDate(Date date){
    this.date = date;
  }

  public void setAssignmentSpecs(String assignmentSpecs){
    this.assignmentSpecs = assignmentSpecs;
  }

  public boolean isOverDue(){
    Date today;
    today = new Date();
    if (today.after(this.date)) {
      return true;
    }
    else {
      return false;
    }
  }

  public Solution addSolution(){
    Solution solution1 = new Solution();
    return solution1;
  }
  

  ////add the solution2 to the Solutionlist
  public void addSolution(Solution solution2)
  {
    solutionList.add(solution2);
  }

  public void submitSolution(){
  }

  public void getSolutionList(){
  }

  /* return the solution of the give name
  */
  public Solution getSolution(String studentName)
  {
    SolutionIterator solutionIterator=(SolutionIterator) solutionList.iterator();
    return (Solution)solutionIterator.next(studentName);
  }

  public Solution getSugSolution(){
    return solution;
  }

  public SolutionIterator getSolutionIterator()
  {
    SolutionIterator solutionIterator=new SolutionIterator(solutionList);
    return solutionIterator;
  }

  public String toString()
  {
    return assignmentName;
  }

  public String getDueDateString()
  {
    DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.SHORT);
    return  dateFormat.format(date);
  }

  public void accept(NodeVisitor nodeVisitor)
  {
    nodeVisitor.visitAssignment(this);
  }
}