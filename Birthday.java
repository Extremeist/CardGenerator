/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgenerator;

import java.util.Random;
import java.util.*;

/**
 *
 * @author porte
 */

public class Birthday {
    private String To[] = {"Dear:", "To:", "Hi:", "Greetings:",};
    private String Salutation[] = {"I hope you get to do something fun to celebrate!","You deserve everything happy. Wishing you that all year long!","Warmest wishes for a happy birthday"};
    private String Verse[] = {"May today be the best day,","Many joyful happy wishes","There's a special kind of magic,"};
    private String Ending[] = {"Warmly,","Love,","With love,","Lots of love,"};

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
