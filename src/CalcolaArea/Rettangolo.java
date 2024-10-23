package CalcolaArea;

public class Rettangolo extends Forma{

    Rettangolo (double base, double altezza){
        super(base, altezza, Forme.rettangolo);
    }

    @Override
    public void calcolaArea(){
        System.out.println("L'area del rettangolo è: " +(getBase()*getAltezza()));
    }

}
