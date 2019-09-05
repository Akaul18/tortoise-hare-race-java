
/**
 *
 * @author Ankur
 */
import java.security.SecureRandom;

public class Race extends Thread{
    
    @Override
    public void run(){
        SecureRandom randomNumbers = new SecureRandom();
//        int maxPos;
        int count = 0;
        Tortoise tort = new Tortoise();
        Hare hare = new Hare();

        tort.setPosition(1);
        hare.setPosition(1);
//        System.out.println("TH");
        while((tort.getPosition() <=70 && hare.getPosition() <=70))
                {
                    int random = randomNumbers.nextInt(11);
                    
                    for (int i = 1; i <= 78; i++) {
                        if (i == tort.getPosition()){
                            System.out.print("T");
                        }
                        else if(i == hare.getPosition()){
                            System.out.print("H");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                    switch(random){
                        case 1:
                            tort.fastPlod();
                            hare.bigHop();
                            break;
                        case 2:
                            tort.fastPlod();
                            hare.bigHop();
                            break;
                        case 3:
                            tort.fastPlod();
                            hare.smallHop();
                            break;

                        case 4:
                            tort.fastPlod();
                            hare.smallHop();
                            break;
                        case 5:
                            tort.fastPlod();
                            hare.smallHop();
                            break;
                        case 6:
                            tort.slip();
                            hare.bigSlip();
                            break;
                        case 7:
                            tort.slip();
                            hare.smallSlip();
                            break;
                        case 8:
                            tort.slowPlod();
                            hare.smallSlip();
                            break;

                        case 9:
                            tort.slowPlod();
                            hare.sleep();
                            break;
                        case 10:
                            tort.slowPlod();
                            hare.sleep();
                            break;
                    }
                    if(tort.getPosition() == hare.getPosition())
                    {
                        System.out.println("OUCH!!!!!!");
                    }
                    try{
                        Thread.sleep(1000);
                        count++;
//                        System.out.println(tort.getPosition());
//                        System.out.println(hare.getPosition());
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
        System.out.println("TIME ELAPSED: "+ count);
//         System.out.println(tort.getPosition());
//        System.out.println(hare.getPosition());
        if(tort.getPosition() >= 70)
        {
            System.out.println("TORTOISE WINS!!!YAYY!!!");
        }else if(hare.getPosition() >= 70){
            System.out.println("HARE WINS!!!Yuch!!!");
        }
        else{
            System.out.println("It's a tie!!!");
        }
    }   
            
    public static void main(String[] args) {
        Race obj1 = new Race();
        System.out.println("BANG!!!!!\nAnd they're off!!!!!");
        obj1.start();
        
    }
    
}