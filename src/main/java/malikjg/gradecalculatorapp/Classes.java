/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malikjg.gradecalculatorapp;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author milky
 */
public class Classes {
    private String className;
    private double grade;
    private String letterGrade;
    private List<Assignment> assignments;
    public Classes(String className, double grade, String letterGrade){
        this.className = className;
        this.grade = grade;
        this.letterGrade = letterGrade;
        assignments = new LinkedList<Assignment>();
    }
    public String getClassName(){
        return this.className;
    }
    public double getGrade(){
        return this.grade;
    }
    public String getLetterGrade(){
        return this.letterGrade;
    }
    public List<Assignment> getAssignments(){
        return this.assignments;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
    public void setLetterGrade(String letterGrade){
        this.letterGrade = letterGrade;
    }
    public void addAssignment(Assignment assignment){
        this.assignments.add(assignment);
    }
    public void removeAssignment(Assignment assignment){
        this.assignments.remove(assignment);
    }
}
