import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Hrusha {


    private String name;
    private CopyOnWriteArrayList <Integer> list;


    public Hrusha(String name) {
        this.name = name;
        this.list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 150; i++) {
            list.add(ThreadLocalRandom.current().nextInt(0, 121));

        }
    }

 /*   public CopyOnWriteArrayList <Integer> sharedPreferences(CopyOnWriteArrayList<Integer> list){

        if (list == null) {
            for (int i = 0; i < 3; i++) {
                list.add(ThreadLocalRandom.current().nextInt(0, 121));

            }
        }

        return list;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CopyOnWriteArrayList getList() {
        return  list;
    }

    public void setList(CopyOnWriteArrayList list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Hrusha{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
