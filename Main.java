import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vol v = new Vol("AH-1004", new ArrayList<>());
        try{
            Billet b1 = new Billet("Économique", 120);
            b1.reductionPourcentage(10);
            Billet b2 = new Billet("Business", 500);
            b2.reduction(50);
            Billet b3 = new Billet("Première", 900);
            v.ajouterBillet(b1);
            v.ajouterBillet(b2);
            v.ajouterBillet(b3);
            v.afficherBillets();
        }catch(PrixInvalideException | ReductionInvalideException e){
            System.err.println("matmenyekch " + e.getMessage());
        }
    }
}
