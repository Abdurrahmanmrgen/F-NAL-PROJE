import java.util.Scanner;

public class proje18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Hesap bakiyenizi girin: ");
        double bakiye = scanner.nextDouble();

        // Ana döngü
        while (true) {
            System.out.println("\n1. Para Çekme");
            System.out.println("2. Para Yatırma");
            System.out.println("3. Bakiye Sorgulama");
            System.out.println("4. Çıkış");
            System.out.print("Yapmak istediğiniz işlemi seçin (1-4): ");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    paraCekme(bakiye);
                    break;
                case 2:
                    paraYatirma(bakiye);
                    break;
                case 3:
                    bakiyeSorgulama(bakiye);
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor. İyi günler!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }
    }

    private static void paraCekme(double bakiye) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Çekmek istediğiniz tutarı girin: ");
        double cekilecekMiktar = scanner.nextDouble();

        if (cekilecekMiktar > bakiye) {
            System.out.println("Yetersiz bakiye. İşlem gerçekleştirilemedi.");
        } else {
            bakiye -= cekilecekMiktar;
            System.out.println("Para çekme işlemi başarılı. Yeni bakiye: " + bakiye);
        }
    }

    private static void paraYatirma(double bakiye) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yatırmak istediğiniz tutarı girin: ");
        double yatirilanMiktar = scanner.nextDouble();

        bakiye += yatirilanMiktar;
        System.out.println("Para yatırma işlemi başarılı. Yeni bakiye: " + bakiye);
    }

    private static void bakiyeSorgulama(double bakiye) {
        System.out.println("Güncel bakiyeniz: " + bakiye);
    }
}