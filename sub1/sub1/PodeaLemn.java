package ro.dp.sub1;

public class PodeaLemn implements IPodea{
    int duritateLemn;

    public PodeaLemn(int duritateLemn) {
        this.duritateLemn = duritateLemn;
    }

    @Override
    public float getDuritate() {
        return this.duritateLemn;
    }

    @Override
    public void curata() {

    }
}
