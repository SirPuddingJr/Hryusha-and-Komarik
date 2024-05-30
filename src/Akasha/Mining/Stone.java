package Akasha.Mining;

public class Stone extends Mining {

    public  Stone (){
        physDef = 0.5;
        capacity = 1500;
    }

    @Override
    public String toString() {
        return "Stone{" +
                "capacity=" + capacity +
                '}';
    }
}
