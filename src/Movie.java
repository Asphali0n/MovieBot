import java.util.ArrayList;

public class Movie {

    // Attributs
    private String title;
    private double price;
    private ArrayList<String> seances;
    private int places;

    // Constructors
    public Movie(String title, double price, int places) {
        this.title = title;
        this.price = price;
        this.places = places;
        this.seances = new ArrayList<>();
    }

    // Methodes

    public void addSeance(String time) {
        this.seances.add(time);
    }

    public void removePlaces(int nombre) {
        if (this.places >= nombre) {
            this.places -= nombre;
        }
    }

    // Getters

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    public ArrayList<String> getSeances() {
        return seances;
    }

    public int getPlaces() {
        return places;
    }

    // Setters

    public void setTitle(String new_title) {
        this.title = new_title;
    }

    public void setPrice(int new_price) {
        this.price = new_price;
    }

}