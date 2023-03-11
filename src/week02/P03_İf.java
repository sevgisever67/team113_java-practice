package week02;

import java.util.Scanner;

public class P03_İf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
          - Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
          rnek:  gun=Pazar output = "Hafta sonu"  gun=Sali output = "Hafta ici"
          ** String icin equals method'unusalı kullanin


        System.out.println("Bu Gün Günlerden Ne");
        String gün=scan.nextLine().toLowerCase();


        if (gün.equals("cumartesi")|| gün.equals("pazar")){
            System.out.println("bugün hafta sonu-iyi tatiller");
        }
        if (gün.equals("pazartesi")|| gün.equals("salı")||gün.equals("çarşamba")||
                gün.equals("perşembe")||gün.equals("cumar")) {
            System.out.println("haftaİçi");

        }
        if (!(gün.equals("pazartesi")|| gün.equals("salı")||gün.equals("çarşamba")||
                gün.equals("cumartesi")|| gün.equals("pazar")
                ||gün.equals("perşembe")||gün.equals("cumar"))) {
            System.out.println("yanlış Giriş");
        }


        2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
        Yıl sonu notunu vizeler %40 finaller % 60 olacak şekilde hesaplayıp
        Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler! olduğunu 50'den
        küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız



        System.out.println("Vize  final Notu Gir");
        int vize = scan.nextInt();
        System.out.println("vize 2 not");
        int vize2 = scan.nextInt();
        System.out.println("final notu gir");
        int final1 = scan.nextInt();
        int yılsonuNotu = ((vize2 + vize) / 2 * 40 / 100) + ((final1 * 60) / 100);

        if (yılsonuNotu >= 50) {
            System.out.println("yıl sonu notunuz: "  +yılsonuNotu+  "tebrikler Geçtiniz");
        }
        if (yılsonuNotu < 50) {
            System.out.println("yıl sonu notunuz: "  +yılsonuNotu+"Malesef Kaldınız");
        }


1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
    85-100 -----> AA
    80-85 ------> BA
    75-80 ------> BB
    65-75 ------> CB
    50-65 ------> CC
    50 Altı ise  ------> FF
     */

/*        System.out.print("Lütfen notunuzu Giriniz");
        int sınavNotu= scan.nextInt();


         if (sınavNotu>=100||sınavNotu<0){
            System.out.println("Geçersiz not girişi");
        } else if (sınavNotu<=100 && sınavNotu>=85){
            System.out.println(sınavNotu+"AA");
        } else if (sınavNotu>=80) {
            System.out.println(sınavNotu+ ":"+ "BA");

        } else if (sınavNotu>=75) {
            System.out.println(sınavNotu+": BB");

        } else if (sınavNotu>=65) {
            System.out.println(sınavNotu+ ": CB");

        } else if (sınavNotu>=50) {
            System.out.println(sınavNotu+": CC");

        }else {
            System.out.println(sınavNotu+ ": FF kaldınızzzzzzz" );
        }
*/

        /*
   2- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
      sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
      "istediginiz birim sisteme kayitli degil" yazdirin.
     */
/*        System.out.println("Lütfen Mesafeyi Klometre cinsiyle giriniz");
        double km= scan.nextDouble();
        System.out.println("Lütfen Dönüştürmek İstediğiniz Birimi Gİriniz");
        char birim=scan.next().charAt(0);
        Character.toLowerCase(birim);

        if (birim=='m'){km=km*1000;
            System.out.println(km);
        } else if (birim=='c') {km=km*10000;
            System.out.println(km);

        }else {
            System.out.println("hatalı birim girişi");
        }
*/

     /*
          Soru ) Interview Question
          Kullanicidan artik yil olup olmadigini kontrol
          etmek icin yil girmesini isteyin.
          Kural 1: 4 ile bolunemeyen yillar artik yil
          Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
          Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir

      */
      // System.out.println("lütfen kontrol etmek istediğiniz yılı giriniz");
      // int yıl=scan.nextInt();

      // if (yıl%4==0&&yıl%400==0||yıl%100!=0&&yıl%4==0){
      //     System.out.println("artık yıl");
      // }else {
      //     System.out.println("artık yıl");

        /*
            -Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
            as ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak "Emekli
            labilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.
        */

        System.out.println("yaşını gir");
        int yas= scan.nextInt();
        System.out.println("cinsiyet");
        char cinsiyet=scan.next().charAt(0);
        Character.toLowerCase(cinsiyet);

        if (cinsiyet=='k'&&yas>=60){
            System.out.println("emekli olabilirsin");
        }if (cinsiyet=='k'&&yas<60){
            System.out.println("Emekli olmak için: "+ (60-yas) + "yıl daha çalışmalısın");
        }
        if (cinsiyet=='e'&&yas>=65){
            System.out.println("Emekli olabilirsin");
        }if (cinsiyet=='e'&&yas<65){
            System.out.println("emekli olmak için: " + (65-yas)+ "yıl daha çalışmanız gerekiyor");
        }else {
            System.out.println("hatalı giriş");
        }

/*
        1- Kullanıcnın EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
           Olamıyorsa kaç prim günü eksiği olduğunu yazdırın
             KURALLAR
             : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
             : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
         */
    }


}
