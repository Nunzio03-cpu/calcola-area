package CalcolaArea;

public class Main {
    public static void main(String[] args) {
        Forma rettangolo = new Rettangolo(3.3, 6.2);
        Forma triangolo = new Triangolo(5.7, 8.5);

        System.out.println("La forma è: " +rettangolo.getLaMiaForma());
        rettangolo.calcolaArea();

        System.out.println("La forma è: " +triangolo.getLaMiaForma());
        triangolo.calcolaArea();


    }
}