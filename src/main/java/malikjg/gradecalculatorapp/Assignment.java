/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malikjg.gradecalculatorapp;

/**
 *
 * @author milky
 */
public class Assignment{
    private String name;
    private double grade;
    private double weight;
    
    
    public Assignment(String name, double grade, double weight){
        this.name = name;
        this.grade = grade;
        this.weight = weight;
    }
    
    public String getName(){
        return this.name;
    }
    public double getGrade(){
        return this.grade;
    }
    public double getWeight(){
        return this.weight;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
}
