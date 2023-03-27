package week5;

public class Do_WhileLoop {
    public static void main(String[] args) {

       // 'k' harfinden 't' harfine kadar harfleri yazdirin.
        char ilkHarf='k';
        do {
            System.out.print(ilkHarf+"");
            ilkHarf++;
        }while (ilkHarf!='t');

    }
}
