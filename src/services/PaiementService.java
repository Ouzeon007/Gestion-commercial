package services;

import entities.Paiement;

public class PaiementService {
    private final int N = 10;
    private Paiement[] tabPaiement = new Paiement[N];
    private int n;
    public void enregistrerPaiement(Paiement paiement){
        if ( n < N ) {
            tabPaiement[n++] = paiement;
        }
    }
}
