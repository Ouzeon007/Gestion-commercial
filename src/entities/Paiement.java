package entities;

/**
 * Paiement
 */
public class Paiement {
    private int id;
    private double montant;
    private Commande commande;
    private static int nbrPaiement;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        if (montant>0) {
            this.montant = montant;
        }
        
    }
    public Commande getCommande() {
        return commande;
    }
    public void setCommande(Commande commande) {
        this.commande = commande;
    }
    public int getNbrPaiement() {
        return nbrPaiement;
    }
    public void setNbrPaiement(int nbrPaiement) {
        this.nbrPaiement = nbrPaiement;
    }
    
}