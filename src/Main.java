import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("barsik",6.5f,"white");

        barsik.sayMiay();
        barsik.run();

        System.out.println(barsik.getName());

        System.out.println(barsik.rename("Adolf"));


    }



}