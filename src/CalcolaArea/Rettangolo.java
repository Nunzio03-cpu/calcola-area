package CalcolaArea;

public class Rettangolo extends Forma{

    private double base;
    private double altezza;

    Rettangolo (double base, double altezza){
        super(base, altezza);
    }

    @Override
    public void calcolaArea(){
        System.out.println("L'area del rettangolo è: " +(getBase()*getAltezza()));
    }

}
