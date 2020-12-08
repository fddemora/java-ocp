public class thread {
    public static void main(String[] args){
        System.out.println("begin");
        (new ReadInventory()).start();
        (new Thread(new PrintData())).start();
        (new ReadInventory()).start();
        System.out.println("end");
    }
}

/* 

This program reveals how threads are run unordered.

Output: 

begin
Print zoo inventory:
end
Print zoo inventory:
Printing record: 0
Printing record: 1
Printing record: 2

*/

