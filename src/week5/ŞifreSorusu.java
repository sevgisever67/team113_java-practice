package week5;

import java.util.Scanner;

public class ŞifreSorusu {
    public static void main(String[] args) {
        /*
    Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
    kontrol edin ve sifredeki hatalari yazdirin.
    Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        sifre girdiginde "Sifreniz Kabul edilmistir" yazdirin.
        - Sifre kucuk harf icermelidir
        - Sifre buyuk harf icermelidir
        - Sifre ozel karakter icermelidir
        - Sifre en az 8 karakter olmalidir.
 */

        Scanner scan=new Scanner(System.in);
        int sayaç=0;
        String şifre="";

        do {
            System.out.println("şifrenizi giriniz");
            şifre=scan.nextLine();


                if (!(şifre.matches(".*[A-Z].*"))){
                    sayaç++;
                    System.out.println("şifre büyük harf içermelidir");
                }
                if (!(şifre.matches(".*[a-z].*"))){
                    System.out.println("şifre küçük harf içermeli");
                    sayaç++;
                }
                if (!(şifre.matches(".*[!,@#€$%^&*()_+\\-=/;.>?{}].*"))){
                    System.out.println("şifre özel karakter içermeli");
                    sayaç++;
                }
                if (şifre.length()<8){
                    sayaç++;
                    System.out.println("şifre en az 8 karakter olmalı");
                }
            if (sayaç==0){
                System.out.println("şifreniz başarıyla kaydedildi");
                break;
            }

        }while (sayaç==0);
        System.out.println("Sifreniz Kabul edilmistir.");



    }
}
