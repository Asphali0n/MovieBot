public class Reservation {

    private User user;
    private Movie movie;
    private double total_price;
    private String seance;

    public Reservation(User user, Movie movie, String seance, double total_price) {
        this.user = user;
        this.movie = movie;
        this.total_price = total_price;
        this.seance = seance;
    }

    // Getters
    public User getUser() {
        return this.user;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public String getSeance() {
        return this.seance;
    }

    public double getTotal_price() {
        return this.total_price;
    }

    // Setters
    public void setUser(User new_user) {
        this.user = new_user;
    }

    public void setMovie(Movie new_movie) {
        this.movie = new_movie;
    }

    public void setSeance(String new_seance) {
        this.seance = new_seance;
    }

    public void setTotal_price(double new_price) {
        this.total_price = new_price;
    }

    // Methods
    public void Afficher() {
        System.out.println("|------------- Réservation -------------|");
        System.out.printf("|Utilisateur : %s\n", this.user.getName());
        System.out.printf("|Film : %s\n", this.movie.getTitle());
        System.out.printf("|Seance : %s\n", this.seance);
        System.out.printf("|Prix : %f\n", this.total_price);
        System.out.printf("|----------------------------------------|\n");
    }
}
