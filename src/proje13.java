import java.util.Scanner;

public class proje13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("1. kenar uzunluğunu girin: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("2. kenar uzunluğunu girin: ");
        double kenar2 = scanner.nextDouble();

        System.out.print("3. kenar uzunluğunu girin: ");
        double kenar3 = scanner.nextDouble();


        boolean ucgenMi = belirleUcgen(kenar1, kenar2, kenar3);


        if (ucgenMi) {
            System.out.println("Bu kenar uzunluklarıyla bir üçgen oluşturulabilir.");
        } else {
            System.out.println("Bu kenar uzunluklarıyla bir üçgen oluşturulamaz.");
        }
    }

    private static boolean belirleUcgen(double kenar1, double kenar2, double kenar3) {

        return (kenar1 + kenar2 > kenar3) && (kenar1 + kenar3 > kenar2) && (kenar2 + kenar3 > kenar1);
    }
}