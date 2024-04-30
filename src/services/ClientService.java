package services;

import entities.Client;

public class ClientService {
    private final int N = 10;
    private Client[] tabClient = new Client[N];
    private int n;

    public Client[] listerClient(){
        return tabClient;
    }

    public void addClient(Client cl){
        if (n<N) {
            tabClient[n++]=cl;
        }
    }
    public Client getClientByNumero(int numero){
        for (int i = 0; i < tabClient.length; i++) {
            if (tabClient[i]!=null) {
                if (tabClient[i].getTelephone()==numero) {
                    return tabClient[i];
                }
            }
        }
        return null;
    }
    
}
