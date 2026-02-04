import java.util.HashMap;

public class Movie {

    // Attributs
    private String title;
    private int price;
    private HashMap<String,Integer> seances;

    // Constructeurs
    public Movie(String title, int price, String[] seances, int nb_places) {
        this.title = title;
        this.price = price;
        this.seances = seances;
        this.nb_places = nb_places;
    }

    // Getters

    public String getTitle(){
        return this.title;
    }

    public int getPrice(){
        return this.price;
    }

    public String[] getSeances(){
        return this.seances;
    }

    public int nb_places getNb_places(){
        return this.nb_places;
    }


    // Setters

    public void setTitle(String new_title){
        this.title = new_title;
    }

}