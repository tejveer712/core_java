import java.util.Random;

public class VirtualThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        Runnable runnable = () -> {
            double result = random.nextDouble(1000)*random.nextDouble(1000);
            System.out.println(result);
        };


        // Normal threads (time taken 4692)

//        for (int i=0; i<5000;i++){
//            Thread thread = new Thread(runnable);
//            thread.start();
//            thread.join();
//        }

        //Virtual threads

        for (int i=0; i<500000;i++){
//            Thread.startVirtualThread(runnable).join(); // Time taken - 681
            Thread.ofVirtual().start(runnable).join();    // Time taken - 654
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken - "+ (endTime-startTime));
    }
}
