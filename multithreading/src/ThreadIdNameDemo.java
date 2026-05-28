public class ThreadIdNameDemo {

    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        t3.setName("customthread");

        System.out.println("Thread 1 ID is :" + t1.getId()+", name : "+t1.getName());
        System.out.println("Thread 1 ID is :" + t2.threadId()+", name : "+t2.getName());
        System.out.println("Thread 1 ID is :" + t3.threadId()+", name : "+t3.getName());
    }
}
