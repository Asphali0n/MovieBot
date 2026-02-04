public class Reservation {

    private User user;
    private Movie movie;
    private double total_price;
    private int seance;

    public Reservation(User user, Movie movie, int seance, double total_price) {
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

    public int getSeance() {
        return this.seance;
    }

    public double getTotal_price() {
        return this.total_price;
    }

    // Setters
    public void setTitle(User new_user) {
        this.user = new_user;
    }

    public void setMovie(Movie new_movie) {
        this.movie = new_movie;
    }

    public void setSeance(int new_seance) {
        this.seance = new_seance;
    }

    public void setTotal_price(double new_price) {
        this.total_price = new_price;
    }

    // Methods
    public void Afficher() {

    }
}
