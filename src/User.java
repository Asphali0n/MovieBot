public class User {

    private String name;
    private int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getters

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }


    // Setters

    public void getName(String new_name){
        this.name = new_name;
    }

    public void getAge(int new_age){
        this.age = new_age;
    }
}
