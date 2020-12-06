/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgenerator;

/**
 *
 * @author porte
 */
import java.util.Random;
import java.util.*;
public class Wedding {
     String To[] = {"Dear: ","To: ", "Hello: "};
     String Ending[] ={"Kind Regards,", "Love,", "Lots of Love", "All the best,", "Sincerly Yours,"};
     String Salutation[] = {"Best wishes!", "Wishing you lots of love and happiness"};
     String Verse[] = {"Lorem Ipsum 1","Lorem Ipsum 2", "Lorem Ipsum 3"};
     String Text;
     
    public Wedding(){
    
    Text="";
}

    public String getVerse() {
        int randomNum = (int) Math.floor(Math.random() * Verse.length);
        return Verse[randomNum];
    }

    public void setVerse(String[] Verse) {
        this.Verse = Verse;
    }

     public String getTo(){
        int randomNum = (int) Math.floor(Math.random() * To.length) ;
        Text = To[randomNum];

        
        return Text;
    }

    public String getEnding() {
        int randomNum = (int) Math.floor(Math.random() * Ending.length) ;
        
        return Ending[randomNum];// this returns a single part of the array
    }

    public String getSalutation() {
        int randomNum = (int) Math.floor(Math.random() * Salutation.length) ;
        
        return Salutation[randomNum];
        
    }

    public void setTo(String[] To) {
        this.To = To;
    }

    public void setEnding(String[] Ending) {
        this.Ending = Ending;
    }

    public void setSalutation(String[] Salutation) {
        this.Salutation = Salutation;
    }
     
}
