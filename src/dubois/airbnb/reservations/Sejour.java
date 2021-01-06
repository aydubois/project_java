package dubois.airbnb.reservations;

import dubois.airbnb.logements.Logement;
import dubois.airbnb.outils.MaDate;
import java.util.Date;

public class Sejour {
    private Date mDateArrivee;
    private int mNbNuits;
    private Logement mLogement;
    private int mNbVoyageurs;

    public Sejour(Date pDateArrivee,int pNbNuits, Logement pLogement, int pNbVoyageurs){
        mDateArrivee = pDateArrivee;
        mNbNuits = pNbNuits;
        mLogement = pLogement;
        mNbVoyageurs = pNbVoyageurs;
    }

    public void afficher(){
        String dateA = new MaDate("dd/MM/yyyy", mDateArrivee).toString();
        int tarifTotal = mNbNuits * mLogement.getTarifParNuit();

        mLogement.afficher();
        System.out.println("La date d'arrivée est le "+ dateA +" pour "+mNbNuits+ " nuits.");
        System.out.println("Le prix de ce séjour est de "+ tarifTotal+"€.");
    }

}