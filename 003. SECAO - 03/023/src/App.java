import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, X;

        A = sc.nextInt();
        B = sc.nextInt();

        X = A + B;

        System.out.println("X = " + X);

        sc.close();
    }
}