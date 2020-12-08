public class ReadInventory extends Thread {
    public void run() {
        System.out.println("Print zoo inventory:");
    }
    public static void main(String[] args){
        (new ReadInventory()).start();
    }
}