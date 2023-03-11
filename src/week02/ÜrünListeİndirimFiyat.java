package week02;

import java.util.Scanner;

public class ÜrünListeİndirimFiyat {
    public static void main(String[] args) {
        //kulanıcıdan aldığı ürün adedini ve liste fiyatını isteyin
        //müşteri kartı varsa :
          //10 üründen fazla alırsa %20,10 üründen az alırsa %15 indirim
        //Müşteri kartı yoksa:
          //10 üründen fazla alırsa %15, 10 üründen eksik alırsa %10 indirim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen aildığınız ürün adedi , liste fiyatını giriniz");
        int ürünAdedi= scan.nextInt();
        double listeFiyatı= scan.nextDouble();
        System.out.println("Müşteri kartınız var mı (E/H )");
        char müşteriKartıVarMı=scan.next().toLowerCase().charAt(0);

        if (müşteriKartıVarMı=='e') {
            if (ürünAdedi>10){
                System.out.println("indirimli toplam fiyat : " +( ürünAdedi*0.8));
            } else if (ürünAdedi<=10&&ürünAdedi>0){
                System.out.println("indirimli toplam fiyat : "+ (ürünAdedi*0.85));
            }else {
                System.out.println("yanlış ürün adedi giriş");
            }

        } else if (müşteriKartıVarMı=='h') {
            if (ürünAdedi>10){
                System.out.println("indirimli toplam fiyat : "+( ürünAdedi*0.85));

            } else if (ürünAdedi<=10){
                System.out.println("indirimli toplam fiyat : "+( ürünAdedi* 0.9));

            }
            System.out.println("yanlıs ürün adedi girişi");

        }else {
            System.out.println("yanlış giriş");
        }

    }
}
