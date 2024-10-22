package CalcolaArea;

public class Main {
    public static void main(String[] args) {
        Forma forma1 = new Forma();
        Rettangolo rettangolo1 = new Rettangolo();
        Triangolo triangolo1 = new Triangolo();

        rettangolo1.setBase(5.3);
        rettangolo1.setAltezza(6.9);
        triangolo1.setAltezza(3.3);
        triangolo1.setBase(7.7);

        forma1.calcolaArea();
        rettangolo1.calcolaArea();
        triangolo1.calcolaArea();
    }
}