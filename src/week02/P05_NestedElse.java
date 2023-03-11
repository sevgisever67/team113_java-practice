package week02;

import java.util.Scanner;

public class P05_NestedElse {
    public static void main(String[] args) {

          /*
          1- Kullanıcnın EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
             Olamıyorsa kaç prim günü eksiği olduğunu yazdırın
             KURALLAR
               :1999 yılı 9.aydan önce işe girmek.
               : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
               : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
           */
        Scanner scan = new Scanner(System.in);

    /*    System.out.println("işe giriş yılınızı ve ayınızı giriniz");
            double giris= scan.nextDouble();
            if (giris>1999.09){
                System.out.println("eYT kanun düzenlemesine tabi değilsiniz");
            } else {
                System.out.println("Lütfen cinsiyetinizi giriniz");
                char cinsiyet=scan.next().charAt(0);
                Character.toLowerCase(cinsiyet);
                System.out.println("lütfen pirim günsayınızı girin");
                int pirimGün= scan.nextInt();
                System.out.println("Lütfen hizmet sürenizi yıl olarak giriniz");
                int yıl=scan.nextInt();

                if (cinsiyet=='e'){
                    if (pirimGün>=5500&&yıl>=25){
                        System.out.println("Tebrikler Eyt Yürürlüğe girdiği zaman emekli olabilirsiniz");
                    } else if (pirimGün<5500&&yıl>=25) {
                        System.out.println( "Kanun yürürlüğe girdiğinde" +(5500-pirimGün )+"gün pirimşartını tamamlamanız gerekiyor");
                    } else if (pirimGün>=5500&&yıl<25) {
                        System.out.println("Kanun yürürlüğe girdiğinde" +(25-yıl )+"gün pirimşartını tamamlamanız gerekiyor");

                    }
                }   if (cinsiyet=='k'){
                    if (pirimGün>=5000&&yıl>=20){
                        System.out.println("Tebrikler Eyt Yürürlüğe girdiği zaman emekli olabilirsiniz");
                    } else if (pirimGün<5000&&yıl>=20) {
                        System.out.println( "Kanun yürürlüğe girdiğinde" +(5000-pirimGün )+"gün pirimşartını tamamlamanız gerekiyor");
                    } else if (pirimGün>=5500&&yıl<25) {
                        System.out.println("Kanun yürürlüğe girdiğinde" +(20-yıl )+"gün pirimşartını tamamlamanız gerekiyor");

                    }
                }else System.out.println("Yanlış cinsiyet girişi");

            }
*/

                   /*
                   2-Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
                   arti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
                   20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
                   alirsa %15, yoksa %10 indirim yapin
                     */
        System.out.println("ürün adedinizi ve liste fiyatını giriniz");
        int ürünAdet= scan.nextInt();
        double listeFiyatı= scan.nextDouble();
        System.out.println("müşteri kartınız var mı giriniz (e/h)");
        char müşteriKartı=scan.next().charAt(0);
        Character.toLowerCase(müşteriKartı);


        if (müşteriKartı=='e'){

        } else if (müşteriKartı=='h') {

        }else {
            System.out.println();
        }


    }
}
