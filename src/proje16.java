import java.util.Scanner;

public class proje16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Metni giriniz: ");
        String metin = scanner.nextLine();

        int karakterSayisi = metin.length();

        System.out.println("Girilen metnin karakter sayısı: " + karakterSayisi);

        scanner.close();
    }
}
