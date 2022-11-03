package hacs;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Title:        HACS
 * Description:  SER515 : Unit Test and Reuse
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 * @version 1.0
 */
class AssignmentTest {
    
    Assignment assignment = new Assignment();
    @Test
    void setDueDate() {
        Date date = new Date();
        assignment.setDueDate(date);
        assertEquals(date, assignment.date);
    }
    
    @Test
    void setAssignmentSpecs() {
        String test = "Test Specs";
        assignment.setAssignmentSpecs(test);
        assertEquals(test, assignment.assignmentSpecs);
    }
    
    @Test
    void isOverDue() {
        assertEquals(true, assignment.isOverDue());
    }
    
    @Test
    void addSolution() {
        Solution testSolution = new Solution();
        assignment.addSolution(testSolution);
        assertEquals(true, assignment.solutionList.contains(testSolution));
    }
    
    @Test
    void submitSolution() {
    }
    
    @Test
    void getSolutionList() {
    }
    
    @Test
    void getSugSolution() {
        assertNotEquals(new Solution(), assignment.getSugSolution());
    }
    
    @Test
    void getSolutionIterator() {
        assertNotEquals(new SolutionIterator(), assignment.getSolutionIterator());
    }
    
    @Test
    void testToString() {
        assertEquals(assignment.assignmentName, assignment.toString());
    }
    
    @Test
    void getDueDateString() {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        assertEquals(dateFormat.format(assignment.date), assignment.getDueDateString());
    }
    
    @Test
    void accept() {
    }
}