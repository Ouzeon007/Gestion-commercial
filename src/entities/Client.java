package entities;

public class Client {
    private int id;
    private String nomComplet;
    private int telephone;
    private static int nbrClient;
    private final int N=10;
    private Commande[] tabCommande=new Commande[N];

    
    public Commande[] getTabCommande() {
        return tabCommande;
    }
    public Client(String nomComplet, int telephone) {
        nbrClient++;
        id=nbrClient;
        this.nomComplet = nomComplet;
        this.telephone = telephone;
    }
    public Client() {
        nbrClient++;
        id=nbrClient;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if (id>0) {
            this.id = id; 
        }
        
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        if (!nomComplet.isEmpty()) {
            this.nomComplet = nomComplet;
        }
        
    }
    public int getTelephone() {
        return telephone;
    }
    public void setTelephone(int telephone) {
        if (telephone>0) {
            
        }
        this.telephone = telephone;
    }
    public int getNbrClient() {
        return nbrClient;
    }
    public void setNbrClient(int nbrClient) {
        this.nbrClient = nbrClient;
    }
    @Override
    public String toString() {
        return "Client [id=" + id + ", nomComplet=" + nomComplet + ", telephone=" + telephone + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Client other = (Client) obj;
        if (id != other.id)
            return false;
        if (nomComplet == null) {
            if (other.nomComplet != null)
                return false;
        } else if (!nomComplet.equals(other.nomComplet))
            return false;
        if (telephone != other.telephone)
            return false;
        if (nbrClient != other.nbrClient)
            return false;
        return true;
    }
}
