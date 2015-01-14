/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fullhouse;

/**
 *
 * @author antonioym
 */
public class Berekeningen {
    
  public  double huurpercentage = 25;
  public  double prijzenpercentage = 75;
  public  double prijzenUitslagberekening;
  public  double totaleKosten;
  public  double inschrijvingsGeld;

  
  
    int l_huur;
    int l_max_aant_pers;
    int l_aant_tafels;
    int locatieNr;
    String l_naam;

    public Berekeningen(double prijzenUitslagberekening, double totaleKosten, double inschrijvingsGeld, int l_huur, int l_max_aant_pers, int l_aant_tafels, int locatieNr, String l_naam) {
        this.prijzenUitslagberekening = prijzenUitslagberekening;
        this.totaleKosten = totaleKosten;
        this.inschrijvingsGeld = inschrijvingsGeld;
        this.l_huur = l_huur;
        this.l_max_aant_pers = l_max_aant_pers;
        this.l_aant_tafels = l_aant_tafels;
        this.locatieNr = locatieNr;
        this.l_naam = l_naam;
    }


    
    public double prijzenBerekeningtotaal(int l_huur,double prijzenpercentage , int huurpercentage)
    {   
        
        return prijzenUitslagberekening = l_huur * prijzenpercentage / huurpercentage;
        
    }
    public double totaalKostenBerekening(int l_huur, double prijzenUitslagberekening)
    {
        return totaleKosten = l_huur + prijzenUitslagberekening;
    }
    
    public double inschrijvingsGeldBerekening(double totaleKosten, int l_max_aant_pers)
    {
        return inschrijvingsGeld = totaleKosten / l_max_aant_pers;
    }
}
