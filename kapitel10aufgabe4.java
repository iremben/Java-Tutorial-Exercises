import java.util.Scanner;

public class kapitel10aufgabe4 {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("geben sie spannung ein: ");
        int u = sc.nextInt();
        System.out.println("geben sie widerstand ein: ");
        int r = sc.nextInt();
        double i = (u+0.0)/r;

        System.out.println("stromstärke ist: " + i);


    }
}
