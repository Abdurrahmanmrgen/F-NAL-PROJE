import java.util.Random;
import java.util.Scanner;

public class proje1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minSayi = 1;
        int maxSayi = 100;
        int tahminLimiti = 10;
        int rastgeleSayi = random.nextInt(maxSayi - minSayi + 1) + minSayi;

        System.out.println("1 ile 100 arasında bir sayı tahmin et.");

        for (int tahminSayisi = 1; tahminSayisi <= tahminLimiti; tahminSayisi++) {
            System.out.print("Tahmininizi girin: ");
            int kullaniciTahmini = scanner.nextInt();

            if (kullaniciTahmini == rastgeleSayi) {
                System.out.println("Tebrikler! Doğru tahmin ettiniz. Sayı: " + rastgeleSayi);
                break;
            } else {
                if (kullaniciTahmini < rastgeleSayi) {
                    System.out.println("Daha büyük bir sayı girin.");
                } else {
                    System.out.println("Daha küçük bir sayı girin.");
                }

                int kalanTahmin = tahminLimiti - tahminSayisi;
                System.out.println("Kalan tahmin hakkınız: " + kalanTahmin);
            }

            if (tahminSayisi == tahminLimiti) {
                System.out.println("Tahmin hakkınız kalmadı. Doğru sayı: " + rastgeleSayi);
            }
        }
    }
}

