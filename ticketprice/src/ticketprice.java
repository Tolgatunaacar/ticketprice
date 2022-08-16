import java.util.Scanner;

public class ticketprice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mesafe;
        System.out.println("Mesafe giriniz(km):");
        mesafe = input.nextInt();
        System.out.println("Yaşınızı girin:");
        int yas = input.nextInt();
        System.out.println("1.gidiş"+"2.gidiş-geliş");
        int yon = input.nextInt();

        double fiyat = mesafe*(0.10);

        if (yas < 12){
            fiyat = fiyat - (fiyat*0.5);
        } else if (yas >=12 && yas<24) {
            fiyat = fiyat - (fiyat*0.1);
        } else if (yas >= 65){
            fiyat = fiyat - (fiyat*0.3);
        } else {
            System.out.println("Yaş indiriminiz bulunmamaktadır.");
        }

        switch (yon){
            case 1 :
                System.out.println("Bilet fiyatınız:"+fiyat);
                break;
            case 2 :
                fiyat = 2*(fiyat - (fiyat*0.2));
                System.out.println("Bilet fiyatınız:"+fiyat);
                break;
            default:
                System.out.println("Geçersiz veri girildi:");
        }

    }
}
