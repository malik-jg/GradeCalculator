/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malikjg.gradecalculatorapp;

/**
 *
 * @author milky
 */
public class Utils {
    
    public static String numberToLetterGrade(double number){
        if(number < 60){
            return "F";
        }
        if(number < 64){
            return "D-";
        }
        if(number < 67){
            return "D";
        }
        if(number < 70){
            return "D+";
        }
        if(number < 74){
            return "C-";
        }
        if(number < 77){
            return "C";
        }
        if(number < 80){
            return "C+";
        }
        if(number < 84){
            return "B-";
        }
        if(number < 87){
            return "B";
        }
        if(number < 90){
            return "B+";
        }
        if(number < 94){
            return "A-";
        }
        return "A";
    }
    public static double letterGradeToGPA(String grade){
        if(grade.equals("A")){
            return 4.00;
        }
        if(grade.equals("A-")){
            return 3.70;
        }
        if(grade.equals("B+")){
            return 3.30;
        }
        if(grade.equals("B")){
            return 3.70;
        }
        if(grade.equals("B-")){
            return 2.70;
        }
        if(grade.equals("C+")){
            return 2.30;
        }
        if(grade.equals("C")){
            return 2.00;
        }
        if(grade.equals("C-")){
            return 1.70;
        }
        if(grade.equals("D+")){
            return 1.30;
        }
        if(grade.equals("D")){
            return 1.00;
        }
        if(grade.equals("D-")){
            return 0.70;
        }
        if(grade.equals("F")){
            return 0.00;
        }
        return 4.00;
    }
}
