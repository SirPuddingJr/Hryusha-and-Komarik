import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Test {

    public static void main(String[] args) {

        CopyOnWriteArrayList <Integer> theMind = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList <Integer> bufferTheMind = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<Integer> theSubconscious = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<Integer> bufferTheSubconscious = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<Integer> test1 = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<Integer> test2 = new CopyOnWriteArrayList<>();

    //   int aFewThoughts = ThreadLocalRandom.current().nextInt(0, 121);


        {
       for (int i = 0; i < 100; i++){
           theSubconscious.add(ThreadLocalRandom.current().nextInt(0, 121));
       }

        }

        for (int i =0; i < Environment.TimeToThink(); i++){
            theMind.add(ThreadLocalRandom.current().nextInt(0, 121));
        }

        for (int i =0; i < Environment.TimeToThink(); i++){
            bufferTheSubconscious.add(theSubconscious.get(ThreadLocalRandom.current().nextInt(theSubconscious.size())));

        }




        for (Integer a: bufferTheSubconscious){
            System.out.println("Цифры из барабана: "+ a);
        }
        System.out.println("+++++++++++++++++++++++++++");

        for (Integer a: theMind){
            System.out.println("Цифры из рулетки: "+ a);
        }

        System.out.println("+++++++++++++++++++++++++++");
       Collections.sort(theMind);
       Collections.reverse(theMind);
        System.out.println(theMind);
        System.out.println("Добавляю в тест1 наибольшее число из разума: " + test1.add(theMind.get(0)));
        Collections.sort(bufferTheSubconscious);
        Collections.reverse(bufferTheSubconscious);
        System.out.println(bufferTheSubconscious);
        System.out.println("Добавляю в тест1 наибольшее число из подсознания: " + test1.add(bufferTheSubconscious.get(0)));
        System.out.println("Должно быть два числа: " + test1);
        System.out.println(test2.addAll(test1));
        System.out.println(test2);
        test2.clear();
        test1.clear();
        System.out.println(test2);
        System.out.println(test1);



    }
}
