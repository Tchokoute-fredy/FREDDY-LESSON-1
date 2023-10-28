/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson1;

/**
 *
 * @author jtcho
 */
public class date {
    int day, month, year;
    public date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getmonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public String monthChar(){
        if (getmonth()==1){
            return "January";
        }else if (getmonth()==2){
           return "Febuary";
        }else if (getmonth()==3){
            return "march";
        }else if(get month ()==4){
            return"april";
            else if} 
            return"december";
        }
        
        
        
    }
}
