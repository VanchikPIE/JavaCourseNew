import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork_masiv {
    public static void main(String[] args) {
        int [] message = new int[5];
        float[] message1 = new float[5];
        boolean[] message2 = new boolean[5];
        double[] message4 = new double[5];
        long[] message5 =  new long[5];
        String[] message6 = new String[5];
        message6[0] = "hello";
        System.out.println(message4.length);
        System.out.println();


        int[][] mass = new int[5][5];
        System.out.println(Arrays.toString(message4));
        System.out.println(message4);
        int a = Arrays.binarySearch(message4,3);
        System.out.println(a);


    }
}
