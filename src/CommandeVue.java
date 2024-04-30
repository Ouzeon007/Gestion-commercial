import entities.Commande;
import enums.Etat;

import java.util.Scanner;

public class CommandeVue {
    public  Commande createCommande(Scanner scanner){
        Commande com=new Commande();

        // System.out.println("Total de la commande:");
        // com.setTotal(scanner.nextDouble());
        return com;
    }
    public void listerCommande(Commande[] tabCom){
        for (int i = 0; i < tabCom.length; i++){
            if (tabCom[i] != null){
                System.out.println(tabCom[i]);
            }
        }
    }
    public int demanderIdCommande(Scanner scanner){
        System.out.println("Veullez entrer l'id de la commande");
        return scanner.nextInt();
    }
    public void listerCommandePaye(Commande[] tabCom){
        System.out.println("A-Paye");
        for (int i = 0; i < tabCom.length; i++) {
            if (tabCom[i]!=null) {
                if (tabCom[i].getEtat()==Etat.paye) {
                    
                    System.out.println(tabCom[i]);
                }
            
            }
        }
    }
    public void listerCommandeImpaye(Commande[] tabCom){
        System.out.println("B-Impaye");
        for (int i = 0; i < tabCom.length; i++) {
            if (tabCom[i]!=null) {
                if (tabCom[i].getEtat()==Etat.impaye) {
                    System.out.println(tabCom[i]);
                }
            }
        }
    }

    
}
