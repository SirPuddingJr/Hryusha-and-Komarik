package Akasha.Mining;

import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Mining {

    final int MIN_CAPA = 0;
    int capacity;
    double physDef;
    static double  phyAttack;

    double sum;

    public Mining (){

    }

 public void   physicalAtack (Mining m, CopyOnWriteArrayList<Double> arrayList){
        double attackScore = phyAttack * (1 - m.physDef);
        if (m.capacity - attackScore < MIN_CAPA){
            m.capacity = 0;
        }else {
            m.capacity -= attackScore;

            if (arrayList == null) {
                arrayList.add(attackScore);
            }else {
                for (Double d: arrayList){
                  arrayList.add(sum += d);
                }
            }
        }


 }


}
