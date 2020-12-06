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

public class Christmas {

    private String To[] = {"Dear:", "To:", "Hi:", "Greetings:",};
    private String Salutation[] = {"Merry Christmas & Happy New Year!","Wishing you a Merry Christmas!","Unwrap yourself a joyful Christmas!"};
    private String Verse[] = {"The holidays are upon us,","Many years we have shared,","To my friend and all her family,"};
    private String Ending[] = {"Blessings,","Christmas blessings,","Season's Greetings,","Happy Holidays,"};

    public String getTo() {
        int randomNum = (int) Math.floor(Math.random() * Verse.length);
        return To[randomNum];
    }

    public void setTo(String[] To) {
        this.To = To;
    }

    public String getSalutation() {
        int randomNum = (int) Math.floor(Math.random() * Salutation.length);

        return Salutation[randomNum];
    }

    public void setSalutation(String[] Salutation) {
        this.Salutation = Salutation;
    }

    public String getVerse() {
        int randomNum = (int) Math.floor(Math.random() * Verse.length);
        return Verse[randomNum];
    }

    public void setVerse(String[] Verse) {
        this.Verse = Verse;
    }

    public String getEnding() {
        int randomNum = (int) Math.floor(Math.random() * Ending.length);

        return Ending[randomNum];
    }

    public void setEnding(String[] Ending) {
        this.Ending = Ending;
    }

}
