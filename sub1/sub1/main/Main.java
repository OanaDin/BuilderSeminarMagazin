package ro.dp.sub1.main;

import ro.dp.sub1.*;

public class Main {
    public static void main(String[] args) throws ExceptieDecoratiune {
        //Magazin magazin=new Magazin();
        BuilderMagazin builder =new BuilderMagazin(250,3,"Zara");
        Magazin m=builder.build();


        m.descriere();

        Magazin m2=builder.setDecoratiunie(new Decoratiune(ETipMaterial.LEMN,"candelabru")).setPodea(new PodeaLemn(1)).build();
        m2.descriere();
    }
}
