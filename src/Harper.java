public class Harper extends Dog {
    public Harper() {
        super();
    }
    public Harper(String color, String breed, int age) {
        super(color, breed, age);
    }

    public Harper(int age, String breed, String color){
        super(color, breed, age);
    }

    public String bark(){
        return "Woof!";
    }

}
