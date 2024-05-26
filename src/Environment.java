import java.util.concurrent.ThreadLocalRandom;

public class Environment {

  private static int number;



    public static int TimeToThink (){
             for (int i = 0; i < 1; i++){
                 number = ThreadLocalRandom.current().nextInt(1,11);
             }

        return number;

    }



}
