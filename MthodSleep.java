public class MthodSleep {

    static void sleepMethod() throws InterruptedException{
        Thread.sleep(1000);
    }

    public static void main(String[] args) {

        System.out.println("Start");
        try {
            sleepMethod();
        } catch (Exception e) {
            // System.out.println(e.toString());
            e.printStackTrace();
        }
        finally{
            System.out.println("COde run");
        }
    }
    
}
