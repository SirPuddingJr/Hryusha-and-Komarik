import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Akasha {
    public static void main(String[] args) throws InterruptedException {

        CopyOnWriteArrayList<Integer> hrusha = new CopyOnWriteArrayList<>();
        hrusha.add(97);
        hrusha.add(44);
        hrusha.add(78);


        Random r = new Random();

        System.out.println("Хрюша: " + hrusha.get(ThreadLocalRandom.current().nextInt(hrusha.size())));

        Hrusha hru = new Hrusha("Хрюша");

        int count = 0;

        while (true) {

            TimeUnit.MILLISECONDS.sleep(2);

            // System.out.println("Хрю: " + hru.getList());

            //  System.out.println("Тест думалки: " + TheThoughtProcess.ThoughtsOutLoud(hru.getList()));
            System.out.println();

            //  Collections.shuffle(hru.getList(), new Random());

            //    System.out.println("Хрю: " + hru.getList());

            System.out.println();

            int komarik = TheThoughtProcess.ThoughtsOutLoud(hru.getList());

            System.out.println("Хрюша перед ИФом: " + komarik);
            System.out.println();
            System.out.println(count++);
            System.out.println();

            if (komarik == 120) {


                Komarik marik = new Komarik("Жорик");
                System.out.println("Хрюша придумала комарика - " + marik.getName());
                //int mar = TheThoughtProcess.ThoughtsOutLoud(marik.getList());
                System.out.println("Комарик придумывает апельсин: " + marik.getName());
                while (true) {

                    switch (ThreadLocalRandom.current().nextInt(0, 6)) {
                        case 1:
                            System.out.println(marik.getName() + ": Хмммм можееет");
                            break;
                        case 2:
                            System.out.println(marik.getName() + ": А вот это интересно");
                            break;
                        case 3:
                            System.out.println(marik.getName() + ":Ага а если вот так");
                            break;
                        case 4:
                            System.out.println(marik.getName() + ": Это похоже на...");
                            break;
                        case 5:
                            System.out.println(marik.getName() + ": Ух что то голова разболелась");
                            break;
                        case 0:
                            System.out.println(marik.getName() + ": Надо зубы почистить");
                            break;
                    }
                    System.out.println();
                 //   System.out.println("Я во втором вайл: " + marik);
                    System.out.println();
                    int mar = TheThoughtProcess.ThoughtsOutLoud(marik.getList());
                    if (mar == 98) {
                        System.out.println("Жорик придумал апельсин !!!");
                        break;
                    }
                    TimeUnit.SECONDS.sleep(3);
                }
            }
        }
        //  System.out.println("Хрююююю: " + hru.getList(ThreadLocalRandom.current().nextInt(hru.)));
        // int index = ThreadLocalRandom.current().nextInt(hru);
       /* int index2 = r.nextInt(hru.getList().size());
        System.out.println(index2);
        System.out.println("Фунтик: " + komarik);*/
        // int index3 = komarik.getList(ThreadLocalRandom.current().nextInt(komarik.getList().size()));


        // System.out.println(hru.getList(ThreadLocalRandom.current().nextInt()));





  /*     Hrusha hru = new Hrusha("Хрюша");
      while (true) {
          TheThoughtProcess.ThoughtsOutLoud(hru.getList());
          System.out.println(hru);
          TimeUnit.SECONDS.sleep(2);
          int komarik = hru.getList(r.nextInt(hrusha.size()));
         // int komarik = hru.getList(ThreadLocalRandom.current().nextInt(hru.getList().size()));
          System.out.println("Даю лист" + hru.getList() );
          System.out.println("Size" + komarik);
          System.out.println("Size Hrusa" + );
      }*/


       /* while (true) {
            System.out.println(hrusha);
            System.out.println("++++++++++++++++++++++");
            TheThoughtProcess.ThoughtsOutLoud(hrusha);
            System.out.println(hrusha);
            TimeUnit.MILLISECONDS.sleep(2000);
            int hru = hrusha.get(ThreadLocalRandom.current().nextInt(hrusha.size()));
            System.out.println(hru);
            System.out.println("Size Hrusa" + hrusha.size());
            if (hru == 97) {
                System.out.println("Хрюша придумала Комарика");
            }
        }*/
    }
}
