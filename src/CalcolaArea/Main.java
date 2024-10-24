package CalcolaArea;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(15.0, 3.5);
        Triangolo triangolo1 = new Triangolo(8.0, 2.5);

        rettangolo1.calcolaArea();
        System.out.println();
        triangolo1.calcolaArea();
    }
}