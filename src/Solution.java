public class Solution {
    public static void main(String[] args) throws InterruptedException {
        GroupTest groupTest1 = new GroupTest("1");
        GroupTest groupTest2 = new GroupTest("2");
        Thread p1 = new Thread(groupTest1);
        Thread p2 = new Thread(groupTest2);

        p1.start();
        p2.start();

        p1.join();
        p2.join();

        System.out.println(groupTest1.getInstance() == groupTest2.getInstance());


    }

}
