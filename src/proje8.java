import java.util.Scanner;

public class proje8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Fibonacci serisini kaça kadar sıralamak istersiniz?: ");
        int sinir = scanner.nextInt();


        System.out.println("Fibonacci Serisi:");
        for (int i = 0; i < sinir; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}