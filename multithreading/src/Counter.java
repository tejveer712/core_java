public class Counter {

    private int count = 0;

    public void incrementUnSynchronised(){
        count++;
    }

    public synchronized void incrementSynchronised(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
