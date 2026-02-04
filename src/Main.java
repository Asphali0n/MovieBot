import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner for inputs

        // List of movies
        ArrayList<Movie> liste_films = new ArrayList<>();

        Movie m1 = new Movie("Avatar 2", 12.50, 50);
        m1.addSeance("14:00");
        m1.addSeance("18:00");
        m1.addSeance("21:00");
        liste_films.add(m1);

        Movie m2 = new Movie("Titanic", 10.00, 100);
        m2.addSeance("10:00");
        m2.addSeance("15:30");
        liste_films.add(m2);

        Movie m3 = new Movie("Tenet", 8.50, 70);
        m3.addSeance("20:00");
        m3.addSeance("22:30");
        liste_films.add(m3);

        Movie m4 = new Movie("Inception", 9.00, 60);
        m4.addSeance("14:00");
        m4.addSeance("17:00");
        liste_films.add(m4);

        Movie m5 = new Movie("Interstellar", 11.00, 85);
        m5.addSeance("16:00");
        m5.addSeance("20:00");
        liste_films.add(m5);

        // Reservations
        GestionReservations listeReservations = new GestionReservations();

        // Get user's name
        System.out.printf(
                "Bonjour, bienvenue dans notre cinéma ! \nJe suis MovieBot, votre assistant de réservation. \nS'il-vous-plaît, indiquez-moi votre nom : ");
        String username = sc.nextLine();
        User currentUser = new User(username, 0);
        System.out.printf("\nBienvenue %s !\nChoisissez une option pour commencer : ", username);

        boolean quit = false;

        while (quit == false) {
            // Print menu
            System.out.println("\n|---------------- MENU ----------------|");
            System.out.println("| (0) Quitter                          |");
            System.out.println("| (1) Voir les Films                   |");
            System.out.println("| (2) Faire une réservation            |");
            System.out.println("| (3) Voir mes réservations            |");
            System.out.println("|--------------------------------------|\n");

            int choice = sc.nextInt();
            sc.nextLine();

            System.out.println("\n\n");

            switch (choice) {

                // User wants to leave
                case 0:
                    System.out.printf("Au revoir %s ! Ce fut un plaisir !", username);
                    quit = true;
                    break;

                // Menu to see available movies
                case 1:
                    System.out.println("\n------- Films disponibles -------");
                    for (Movie m : liste_films) {
                        System.out.printf("   Titre : %s (%.2f €)\n", m.getTitle(), m.getPrice());
                        System.out.println("   Places restantes : " + m.getPlaces());
                        System.out.println("   Séances : " + m.getSeances());
                        System.out.println("---------------------------------");
                    }
                    break;

                // Menu to book a movie
                case 2:
                    Movie chosen_movie = null;

                    // Search for movie
                    while (chosen_movie == null) {
                        System.out.print("Choisissez votre film : ");
                        String recherche = sc.nextLine().toLowerCase();
                        for (Movie m : liste_films) {
                            if (m.getTitle().toLowerCase().contains(recherche)) {
                                chosen_movie = m;
                                break;
                            } else {
                                System.out.println("Film Introuvable.");
                            }
                        }
                    }

                    if (chosen_movie != null) {
                        System.out.println("Film choisi : " + chosen_movie.getTitle());

                        // Choose seance
                        System.out.println("Séances disponibles :");
                        ArrayList<String> h = chosen_movie.getSeances();
                        for (int i = 0; i < h.size(); i++) {
                            System.out.printf("séance %d : %s\n", i, h.get(i));
                        }

                        int chosen_seance = -1;
                        while (chosen_seance < 0 || chosen_seance >= h.size()) {
                            System.out.print("Choisissez le numéro de la séance : ");
                            chosen_seance = sc.nextInt();
                        }
                        sc.nextLine();

                        String horaire = h.get(chosen_seance);

                        // Choose tarif
                        String tarif = "";
                        while (!tarif.equals("normal") && !tarif.equals("reduit")) {
                            System.out.print("Tarif 'normal' ou 'reduit' ? ");
                            tarif = sc.nextLine().toLowerCase();
                        }
                        double price = chosen_movie.getPrice();
                        if (tarif.equals("reduit")) {
                            price = price / 2;
                        }

                        // Choose place number
                        System.out.print("Combien de places ? ");
                        int nbPlaces = sc.nextInt();
                        sc.nextLine();

                        // Check if enough places left
                        if (nbPlaces <= chosen_movie.getPlaces()) {
                            double total = price * nbPlaces;

                            // Create reservation
                            Reservation res = new Reservation(currentUser, chosen_movie, horaire, total);
                            listeReservations.addReservation(res);

                            // Update places on the movie
                            chosen_movie.removePlaces(nbPlaces);

                            System.out.printf("Prix total : %.2f €\n", total);
                        } else {
                            System.out.printf("Pas assez de places disponibles, il n'en reste que %d\n",
                                    chosen_movie.getPlaces());
                        }

                    }
                    break;

                // Print reservations
                case 3:
                    listeReservations.afficherReservations();
                    break;

                default:
                    System.out.println("Choix incorrect.");
            }

        }
        sc.close();
    }

}
