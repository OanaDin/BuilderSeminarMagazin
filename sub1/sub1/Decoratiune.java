package ro.dp.sub1;

public class Decoratiune implements IDecoratiuni {
    ETipMaterial tipMaterial;
    String denumire;
    public Decoratiune(ETipMaterial tipMaterial,String denumire) {
        this.tipMaterial = tipMaterial;
        this.denumire=denumire;
    }

    @Override
    public void curata() {

    }

    @Override
    public ETipMaterial getMaterial() {
        return null;
    }

}


