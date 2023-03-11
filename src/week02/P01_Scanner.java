package week02;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
            1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
            sisteme kaydedildiğini aşağıdaki formatta yazdırın.
             *****       KAYIT BAŞARILI      *****
            Adınız: Tarık
            Soyadınız: Yiğit
            Yaşınız:42
            Mail Adresiniz:tarik@yigit.com
            Şifreniz: A2e365
            şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.


        System.out.println("Lütfen Adınızı Giriniz: ");
        String name = scan.nextLine();

        System.out.println("Soyadınızı Giriniz: ");
        String surname = scan.nextLine();

        System.out.println("Lütfen Yaşınızı Giriniz: ");
        int yas = scan.nextInt();

        System.out.println("Lütfen E-Posta adresinizi Giriniz: ");
        String mail = scan.next();

        System.out.println("Şifrenizi Giriniz: ");
        int sifre = scan.nextInt();

        System.out.println("kaydınız başarıyla olusturulmuştur: ");
        System.out.println("name: "+ name +"\nsurname: "+ surname + "\nyas: "+ yas+
                            "\nŞifre: " + sifre  );

        System.out.println("================ Soru Bitti ======================");

        System.out.println("kullanıcı: " +name.charAt(0)+ ", "+ surname.toUpperCase()+ yas);


        System.out.println("==============Soru Bitti================");

        /*
            2- Kullanıcıdan üçgenin kenarını ve o kenarın yüksekliğini girmesini isteyerek
            üçgenin alanını hesaplayıp yazdırın

         */
       /* int a=100, h=120;
        System.out.println("Üçgenin alanı: "+ a*h/2);//

        System.out.println("===============bitti================");*/

        /*
                3-Kullanıcıdan iki sayı alıp üçüncü bir değişken kullanmadan sayı değerlerini
                değiştirin (Swap)
         */

        System.out.println("Lütfen bir sayı giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("Lütfen ikinci sayı giriniz");
        double sayı2= scan.nextDouble();

        System.out.println("1. sayı: "+ sayi1 + "\nsayı 2: " + sayı2);

        sayi1=sayi1+sayı2;
        sayı2=sayi1-sayı2;
        sayi1=sayi1-sayı2;
        System.out.println("1. sayı: " +sayi1+ "2. sayı:  " +sayı2);

    }
}
