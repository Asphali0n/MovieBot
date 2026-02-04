import java.util.ArrayList;

public class GestionReservations {

    private ArrayList<Reservation> listeReservations;

    public GestionReservations() {
        this.listeReservations = new ArrayList<>();
    }

    public void addReservation(Reservation r) {
        this.listeReservations.add(r);
        System.out.println("Réservation enregistrée.");
    }

    public void afficherReservations() {
        if (this.listeReservations.isEmpty()) {
            System.out.println("Aucune réservation pour le moment.");
        } else {
            System.out.println("\n--- Liste des réservations ---");
            for (Reservation r : listeReservations) {
                r.Afficher();
            }
        }
    }
}