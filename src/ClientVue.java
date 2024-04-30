import entities.Client;

/**
 * ClientVue
 */
import java.util.Scanner;
public class ClientVue {

    public Client saisiClient(Scanner scanner){
        Client client=new Client();
        scanner.nextLine();
        do {
            System.out.println("entrer le nom Complet du client");
            client.setNomComplet(scanner.nextLine());
            
        } while (client.getNomComplet().isEmpty() );
        do {
            System.out.println("enter son numero de telephone");
            client.setTelephone(scanner.nextInt());
        } while (client.getTelephone()<=0);
        return client;
        
    }
    public void listerClient(Client[] tabCl){
        for (int i = 0; i < tabCl.length; i++){
            if (tabCl[i] != null){
                System.out.println(tabCl[i]);
            }
        }   
    }
    public int demanderNumero(Scanner scanner){
        System.out.println("Veullez entrer le numero du client");
        return scanner.nextInt();
    }


}