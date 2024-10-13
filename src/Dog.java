public class Dog {
    private String color;
    private String breed;
    private int age;
    // Constructor
    public Dog() {
        this.color = "Unknown";
        this.breed = "Unknown";
        this.age = 0;
    }

    public Dog(String color, String breed, int age) {
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return color + " " + breed + " " + age;
    }
}
