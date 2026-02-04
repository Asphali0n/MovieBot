public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // Setters

    public void setName(String new_name) {
        this.name = new_name;
    }

    public void setAge(int new_age) {
        this.age = new_age;
    }
}
