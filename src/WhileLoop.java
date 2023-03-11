public class WhileLoop {
        /*
    1-While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
      yazdirin.
    2-Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
      bolenleri toplamını bulup bize donduren bir method olusturun.
    3-Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
      olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
      sonuclarini donduren bir method olusturun.
    4-Sisteme bir sayi tanimlayip, kullanicidan sayi isteyerek
      Bu sayi fazla ise Cok soyledin dusur, az ise Dusuk soyledin arttir.
      bilince de tebrik edip durduran bir kod yazalim
         */
    
    public static void main(String[] args) {

        int sayi=10;
        while (sayi<100){
           if (sayi%7==0){
            System.out.print(sayi+" ");}

            sayi++;
        }

    }

}
