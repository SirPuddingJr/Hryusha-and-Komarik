import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class TheThoughtProcess {

    private static int number;

    private static CopyOnWriteArrayList<Integer> test;
    private static CopyOnWriteArrayList<Integer> theMind = new CopyOnWriteArrayList<>();
    private static CopyOnWriteArrayList<Integer> theSubconscious = new CopyOnWriteArrayList<>();
    private static CopyOnWriteArrayList<Integer> bufferTheSubconscious = new CopyOnWriteArrayList<>();

    private static CopyOnWriteArrayList<Integer> thoughtsInThePresent = new CopyOnWriteArrayList<>();


    public static int TimeToThink() {
        for (int i = 0; i < 1; i++) {
            number = ThreadLocalRandom.current().nextInt(1, 11);
        }

        return number;

    }


    public static int ThoughtsOutLoud(CopyOnWriteArrayList<Integer> list) {


     /*         if (!list.equals(null)) {
        for (int i = 0; i < 3; i++) {
           list.add(ThreadLocalRandom.current().nextInt(0, 121));

        }
    }*/


        for (int i = 0; i < TimeToThink(); i++) {
        theMind.add(ThreadLocalRandom.current().nextInt(0, 1211));
       //     System.out.println("theMind: " + theMind);
    }

        for (int i = 0; i < TimeToThink(); i++) {
        bufferTheSubconscious.add(list.get(ThreadLocalRandom.current().nextInt(list.size())));
       //     System.out.println("bufferTheSubconscious: " + bufferTheSubconscious);
    }
        Collections.sort(theMind);
        Collections.reverse(theMind);
        Collections.sort(bufferTheSubconscious);
        Collections.reverse(bufferTheSubconscious);
        thoughtsInThePresent.add(theMind.get(0));
        thoughtsInThePresent.add(bufferTheSubconscious.get(0));
        list.add(theMind.get(0));
        list.add(bufferTheSubconscious.get(0));
    // list.add(ThoughtsInThePresent.get(ThreadLocalRandom.current().nextInt(ThoughtsInThePresent.size())));

        theMind.clear();
        bufferTheSubconscious.clear();


      int otvet =  thoughtsInThePresent.get(ThreadLocalRandom.current().nextInt(thoughtsInThePresent.size()));
     //   System.out.println("Otvet: " + otvet);
        thoughtsInThePresent.clear();

        return otvet;
    }



  /*    if (list == null) {
        for (int i = 0; i < 100; i++) {
            theSubconscious.add(ThreadLocalRandom.current().nextInt(0, 121));
        }
    }


        for (int i = 0; i < TimeToThink(); i++) {
        theMind.add(ThreadLocalRandom.current().nextInt(0, 121));
    }

        for (int i = 0; i < TimeToThink(); i++) {
        bufferTheSubconscious.add(list.get(ThreadLocalRandom.current().nextInt(list.size())));

    }
        Collections.sort(theMind);
        Collections.reverse(theMind);
        Collections.sort(bufferTheSubconscious);
        Collections.reverse(bufferTheSubconscious);
        ThoughtsInThePresent.add(theMind.get(0));
        ThoughtsInThePresent.add(bufferTheSubconscious.get(0));
        list.addAll(ThoughtsInThePresent);


        return list;*/


}
