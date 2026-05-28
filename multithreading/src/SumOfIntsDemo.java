public class SumOfIntsDemo {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long result = 0;
        for(long i=0;i<=Integer.MAX_VALUE; i++){
            result = result + i;
        }
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken without threads - "+ (endTime-startTime));
    }
}
