import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class proje20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Doğum gününü (GG/AA/YYYY) şeklinde giriniz: ");
        String dogumGunStr = scanner.nextLine();


        String gun = bulDogumGun(dogumGunStr);


        if (gun != null) {
            System.out.println("Doğum günün " + gun + " günü!");
        } else {
            System.out.println("Geçersiz tarih formatı!");
        }
    }

    private static String bulDogumGun(String dogumGunStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {

            Date dogumGun = dateFormat.parse(dogumGunStr);


            SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
            String gun = dayFormat.format(dogumGun);

            return gun;
        } catch (ParseException e) {

            return null;
        }
    }
}