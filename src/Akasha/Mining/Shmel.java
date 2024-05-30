package Akasha.Mining;

import java.util.concurrent.CopyOnWriteArrayList;

public class Shmel extends Mining{

    private CopyOnWriteArrayList <Double> arrayList;

    public Shmel (){

        phyAttack = 35;
        arrayList = new CopyOnWriteArrayList();

    }

    public CopyOnWriteArrayList<Double> getArrayList() {
        return arrayList;
    }

    public void setArrayList(CopyOnWriteArrayList<Double> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public String toString() {
        return "Shmel{" +
                "arrayList=" + arrayList +
                ", MIN_CAPA=" + MIN_CAPA +
                ", capacity=" + capacity +
                ", physDef=" + physDef +
                ", sum=" + sum +
                '}';
    }
}
