import java.util.HashMap;

public class Movie {

    // Attributs
    private String title;
    private int price;
    private HashMap<String,Integer> seances;

    // Constructeurs
    public Movie(String title, int price, HashMap<String,Integer> seances, int nb_places) {
        this.title = title;
        this.price = price;
        this.seances = seances;
    }

    // Getters

    public String getTitle(){
        return this.title;
    }

    public int getPrice(){
        return this.price;
    }

    public HashMap<String,Integer> getSeances(){
        return this.seances;
    }


    // Setters

    public void setTitle(String new_title){
        this.title = new_title;
    }

    public void setPrice(int new_price){
        this.price = new_price;
    }

    public void setSeances(HashMap<String,Integer> new_seances){
        this.seances = new_seances;
    }

}