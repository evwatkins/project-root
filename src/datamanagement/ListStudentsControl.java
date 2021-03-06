package datamanagement;

/**
 * Author: Evan Watkins
 * Student Number: 11537439
 * Class: ITC515
 * Assessment: Assignment 2
 * Description: This class controls a list of students by student code.
 */
public class ListStudentsControl {
  
  
  
  /** 
   * Declare class variables.
   */
  private StudentManager studentManager;

  
  
  /**
   * Constructor of the class ListStudentsControl.
   */ 
  public ListStudentsControl() {
    studentManager = StudentManager.getInstance();
  }
  
  

  /**
   * Method call from studentManager.java and student.java.
   * 
   * @param lister: The list of students retrieved.
   * @param code: locate student by looking up unit code.
   */  
  public void listStudents (IStudentLister lister, String code) {
    lister.clearStudents();
    
    StudentMap student = studentManager.findStudentsByUnit (code);
    
    for (Integer number : student.keySet())
      lister.addStudent(student.get (number));
  }
}
