package ro.dp.sub1;

import java.util.ArrayList;

public class Magazin extends AMagazin{

     Magazin(IPodea podea, float suprafata, int nrIntrari, String denumire) {

        super(podea, suprafata, nrIntrari, denumire);
    }
//nu trb sa permit crearea de obiecte de tip magazin decat prin builder
    //odata construit obiectul nu trebuie modificat
    @Override
    public void descriere() {
        System.out.println(this);

    }

    @Override
    public float calculGradIncendiu() {
        int gradIncendiu=0;
        if(this.podea!=null && this.podea.getDuritate()<2){
            gradIncendiu=10;
        }
        if(listaDecoratiuni!=null){
        for(IDecoratiuni d:listaDecoratiuni){
            if(d.getMaterial()==ETipMaterial.LEMN){
                gradIncendiu++;
            }
        }
        }
        return gradIncendiu;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "podea=" + podea +
                ", listaDecoratiuni=" + listaDecoratiuni +
                ", suprafata=" + suprafata +
                ", nrIntrari=" + nrIntrari +
                ", denumire='" + denumire + '\'' +
                '}';
    }

    @Override
    void addDecoratiune(IDecoratiuni m) throws ExceptieDecoratiune {
         if(this.listaDecoratiuni==null){
             this.listaDecoratiuni=new ArrayList<>();
         }
         this.listaDecoratiuni.add(m);

    }



}
