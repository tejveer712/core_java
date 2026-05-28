public class HelloThread1 implements Runnable{

    @Override
    public void run(){
        System.out.println("Hello from HelloThread class"+
                "which implements Runnable");
    }
}
