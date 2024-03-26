package ro.dp.sub1;

import java.util.ArrayList;
import java.util.List;

public class BuilderMagazin implements IBuilder{
    //ori retinem ob pe care l construim gen un ob de tip magazin
    //ori retinem datele necesare construirii ob
    private IPodea podea;
    private List<IDecoratiuni> listaDecoratiuni = null;
    private float suprafata;
    private int nrIntrari;
    private String denumire;

    //in constructor trimitem zona obligatorie
    public BuilderMagazin(float suprafata, int nrIntrari, String denumire) {
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.denumire = denumire;
        this.listaDecoratiuni=new ArrayList<>();
    }
    //setteri pt zona optionala
    public BuilderMagazin setPodea(IPodea podea) {
        this.podea = podea;
        return this;
    }

    public BuilderMagazin setDecoratiunie(IDecoratiuni decoratiune){
        this.listaDecoratiuni.add(decoratiune);
        return this;
    }

    @Override
    public Magazin build() throws ExceptieDecoratiune {
        if(this.suprafata/100 >this.nrIntrari){
            return null;
        }
        if(this.podea==null){
            this.podea=new PodeaCiment();
        }
        if(this.podea.getDuritate()<2){
            for(IDecoratiuni d:listaDecoratiuni){
                if(d.getMaterial()==ETipMaterial.STICLA){
                    return null;
                }
            }
        }
        Magazin m=new Magazin(this.podea,this.suprafata,this.nrIntrari,this.denumire);
        for(IDecoratiuni d:listaDecoratiuni){
            try {
                m.addDecoratiune(d);
            } catch (ExceptieDecoratiune e) {
                return null;
            }
        }
        return m;
    }



}
