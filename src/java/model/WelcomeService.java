/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.*;
import java.util.*;


/**
 *
 * @author James
 */
public class WelcomeService {

    private String format = "MM/dd/yyyy hh:mm a";
    private SimpleDateFormat sdf = new SimpleDateFormat(format);
    private Calendar cal = Calendar.getInstance();
    private Date date = cal.getTime();
    private String morning = "8/26/2014 00:00AM";
    private String afternoon = "8/26/2014 12:00 PM";
    private String evening = "8/26/2014 6:00 PM";
    private Date afternoon2;
    private Date morning2;
    private Date evening2;
    private String dayMsg;
    private String welMsg = "Good";
    private String name;
    private String morningMsg;
    private String afternoonMsg;
    private String eveningMsg;

    public String Run() {
        WelcomeService welcome = new WelcomeService();
        welcome.TimeOfDay();
        return welcome.GreetingMessage();
    }

    public String TimeOfDay() {
        try {
            sdf.format(date);
            Date morning2 = sdf.parse(morning);
            Date afternoon2 = sdf.parse(afternoon);
            Date evening2 = sdf.parse(evening);
        } catch (ParseException pe) {
        }
        if (date.after(morning2) && date.before(afternoon2)) {
            dayMsg = "Morning";
        } else if (date.after(afternoon2) && date.before(evening2)) {
            dayMsg = "Afternoon";
        } else if (date.after(evening2) && date.before(morning2)) {
            dayMsg = "Evening";
        } else {

        }
        return dayMsg;
    }
    
    public String GreetingMessage(String welMsg){
        name = "James";
        
        welMsg += dayMsg + " " + name + ", Welcome";
        return welMsg;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    //Test block
//    public static void main(String[] args) {
//        WelcomeService welcome = new WelcomeService();
//        
//       
//        welcome.TimeOfDay();
//        System.out.println(welcome.GreetingMessage());
//        
//    }

    private String GreetingMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
