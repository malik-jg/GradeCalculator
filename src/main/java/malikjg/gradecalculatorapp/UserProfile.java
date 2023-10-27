/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malikjg.gradecalculatorapp;
import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author milky
 */
public class UserProfile {
    private String userName;
    private List<Classes> classes;
    private List<String> classesNames;
    private double GPA;
    public UserProfile(String userName){
        this.userName = userName;
        classes = new LinkedList<Classes>();
        classesNames = new LinkedList<String>();
        this.GPA = 0;
    }
    public String getUserName(){
        return this.userName;
    }
    public List<Classes> getClasses(){
        return this.classes;
    }
    public List<String> getClassesNames(){
        return this.classesNames;
    }
    public Classes getSpecificClass(String name){
        for(Classes c: this.getClasses()){
            if(c.getClassName().equals(name)){
                return c;
            }
        }
        return null;
    }
    public double getGPA(){
        return this.GPA;
    }
    public void addClass(Classes c){
        this.classes.add(c);
        this.classesNames.add(c.getClassName());
    }
    public void removeClass(Classes c){
        this.classes.remove(c);
        this.classesNames.remove(c.getClassName());
    }
    public void setGPA(double GPA){
        this.GPA = GPA;
    }
}
