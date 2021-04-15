package recursivePascal;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many rows of this glorious triangle would you like to generate? ");
        int rows = sc.nextInt();
        System.out.printf("\nGot it! %d rows coming up!\n\n", rows);

        Pascal triangle = new Pascal(rows);
        System.out.println(triangle);
    }
}
