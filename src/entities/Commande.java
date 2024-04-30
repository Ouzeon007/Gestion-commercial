package entities;

import enums.Etat;

public class Commande {
    private int id;
    private Etat etat;
    private Client client;
    private static int nbrCom;
    private final int N=10;
    private Paiement[] tabPaiement = new Paiement[N];
    
    public Paiement[] getTabPaiement() {
        return tabPaiement;
    }
    public Commande(Client client) {
        nbrCom++;
        id=nbrCom;
        this.etat = Etat.impaye;
        this.client = client;
    }
    public Commande() {
        nbrCom++;
        id=nbrCom;
        this.etat = Etat.impaye;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Etat getEtat() {
        return etat;
    }
    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public int getNbrCom() {
        return nbrCom;
    }
    public void setNbrCom(int nbrCom) {
        this.nbrCom = nbrCom;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    @Override
    public String toString() {
        return "Commande [id=" + id + ", etat=" + etat + ", client=" + client + "]";
    }

    
}
