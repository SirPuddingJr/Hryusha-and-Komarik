package Akasha.Mining;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Shmel shmel = new Shmel();
        Stone stone = new Stone();



        while (true){

            if (stone.capacity != 0) {
                shmel.physicalAtack(stone,shmel.getArrayList());
                System.out.println("Капаситор: " + stone);
                System.out.println("++++++++++++++++++++");
                System.out.println("Амбар: " + shmel.getArrayList());
                System.out.println("++++++++++++++++++++");


               /* double sum = 0;
                for(Mining d : shmel.getArrayList()) {
                   shmel.getArrayList().add(d + sum);
                }*/


                double sum = 0;
                for(Double d : shmel.getArrayList())
                    sum += d;

                System.out.println(sum);



                TimeUnit.SECONDS.sleep(2);
            }
        }



    }




}
