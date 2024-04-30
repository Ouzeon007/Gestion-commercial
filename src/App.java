
import entities.Client;
import entities.Commande;
import entities.Paiement;
import enums.Etat;
import services.ClientService;
import services.CommandeService;
import services.PaiementService;

import java.util.Scanner;

public class App {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int choix;
        ClientVue clientVue = new ClientVue();
        ClientService clientService = new ClientService();
        CommandeVue commandeVue = new CommandeVue();
        CommandeService commandeService = new CommandeService();
        PaiementVue paiementVue =new PaiementVue();
        PaiementService paiementService = new PaiementService();
        do {
            choix=Menu();
            switch (choix) {
                case 1 ->{
                    Client client=clientVue.saisiClient(scanner);
                    clientService.addClient(client);
                }
                case 2 ->{
                    clientVue.listerClient(clientService.listerClient());
                }
                case 3->{
                    Client cl = clientService.getClientByNumero(clientVue.demanderNumero(scanner));
                    if ( cl == null ) {
                        System.out.println("Ce client n'existe pas");
                    } else {
                        Commande commande = commandeVue.createCommande(scanner);
                        commande.setClient(cl);
                        commandeService.enregistrerCommande(commande);
                    }
                }
                case 4->{
                    commandeVue.listerCommande(commandeService.listerCommande());
                }
                case 5->{
                    Commande commande=commandeService.getCommandeById(commandeVue.demanderIdCommande(scanner));
                    if (commande==null) {
                        System.out.println("Cette commande n'existe pas");
                        
                    }else{
                        Paiement pai =paiementVue.saisiePaiement(scanner);
                        pai.setCommande(commande);
                        paiementService.enregistrerPaiement(pai);
                        commande.setEtat(Etat.paye);
                    }
                }
                case 6->{
                    commandeVue.listerCommandePaye(commandeService.listerCommande());
                    commandeVue.listerCommandeImpaye(commandeService.listerCommande());
                }
            }
                
                    
                
            }while (choix!=7);
    }
    public static int Menu(){
        System.out.println("-------------------------------------------");
        System.out.println("1- Ajouter un Client");
        System.out.println("2- Lister tous les clients");
        System.out.println("3- Enregistrer une commande pour un client");
        System.out.println("4- Lister toutes les Commandes");
        System.out.println("5- Enregistrer un Paiement");
        System.out.println("6- Lister les Commandes Par Etat");
        System.out.println("7- Quitter");
        System.out.println("-------------------------------------------");
        System.out.println("Veuiller faire votre choix");
        return scanner.nextInt();
    }


}
