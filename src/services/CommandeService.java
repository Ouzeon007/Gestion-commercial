package services;

import entities.Commande;

public class CommandeService {
    private final int N = 10;
    private Commande[] tabCommande = new Commande[N];
    private int n;
    public void enregistrerCommande(Commande commande){
        if ( n < N ) {
            tabCommande[n++] = commande;
        }
    }
    public Commande[] listerCommande(){
        return tabCommande;
    }
    
    public Commande getCommandeById(int id){
        for (int i = 0; i < tabCommande.length; i++) {
            if (tabCommande[i]!=null) {
                if (tabCommande[i].getId()==id) {
                    return tabCommande[i];
                }
            }
        }
        return null;
    }
}
