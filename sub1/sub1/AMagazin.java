package ro.dp.sub1;

import java.util.ArrayList;
import java.util.List;

public abstract class AMagazin {
	protected IPodea podea;
	protected List<IDecoratiuni> listaDecoratiuni = null;
	protected float suprafata;
	protected int nrIntrari;
	protected String denumire;
	
	public AMagazin(IPodea podea, 
			float suprafata, int nrIntrari,
			String denumire) {
		super();
		this.podea = podea;
		this.suprafata = suprafata;
		this.nrIntrari = nrIntrari;
		this.denumire = denumire;
	}
	
	public abstract void descriere();
	public abstract float calculGradIncendiu();
	 abstract void addDecoratiune(IDecoratiuni m) throws ExceptieDecoratiune;
}
