/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgenerator;

import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author porte
 */
public class CardGenerator {

    public CardGenerator() {

    }

    public static void main(String[] args) {
        String name = "Josh";

        Wedding w = new Wedding();
        Birthday b = new Birthday();
        Christmas c = new Christmas();

        System.out.println(w.getTo() + name);
        System.out.println(w.getSalutation());
        System.out.println(w.getVerse());
        System.out.println(w.getEnding());
        System.out.println(name);

        System.out.println(c.getTo() + name);
        System.out.println(c.getSalutation());
        System.out.println(c.getVerse());
        System.out.println(c.getEnding());
        System.out.println(name);

        System.out.println(b.getTo() + name);
        System.out.println(b.getSalutation());
        System.out.println(b.getVerse());
        System.out.println(b.getEnding());
        System.out.println(name);

    }

}
