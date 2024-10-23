package CalcolaArea;

public class Triangolo extends Forma{

    Triangolo (double base, double altezza){
        super(base, altezza, Forme.triangolo);
    }

    @Override
    public void calcolaArea(){
        System.out.println("L'area del triangolo è:" +(getBase()*getAltezza())/2);
    }
}
