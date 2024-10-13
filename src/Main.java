
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hi, this is Harper!");
        Dog harper1 = new Harper();
        System.out.println(harper1.getBreed());
        Dog harper2 = new Harper("white", "Cava-Shit", 1);
        System.out.println(harper2.getBreed());
        Dog harper3 = new Harper(2, "laboradog", "brown");
        System.out.println(harper3.getAge());
        // Downcasting harper2 to actualHarper to access bark.
        if (harper2 instanceof Dog){
            Harper actualHarper = (Harper) harper2;
            System.out.println(actualHarper.bark());
        }



    }
}