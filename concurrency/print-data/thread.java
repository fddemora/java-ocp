public class thread {
    public static void main(String[] args){
        System.out.println("begin");
        (new ReadInventory()).start();
        (new Thread(new PrintData())).start();
        (new ReadInventory()).start();
        System.out.println("end");
    }
}