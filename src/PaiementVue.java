
import entities.Paiement;
import java.util.Scanner;

public class PaiementVue {
    public Paiement saisiePaiement(Scanner scanner){
        Paiement paie = new Paiement();
        scanner.nextLine();
        do {
            System.out.println("Montant du paiement:");
            paie.setMontant(scanner.nextDouble());
        } while (paie.getMontant() < 0);
        return paie;
    }
}
