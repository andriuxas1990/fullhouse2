/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fullhouse;

/**
 *
 * @author Karen
 */
public class Speler {
    int spelernr;
    String s_naam;
    int s_ranking;

    public Speler(int spelernr, String s_naam, int s_ranking) {
        this.spelernr = spelernr;
        this.s_naam = s_naam;
        this.s_ranking = s_ranking;
    }

    @Override
    public String toString() {
        return spelernr + "--" + s_naam + "--" + s_ranking;
    }
    
    
} 
