public class GroupTest implements Runnable {
    private Group instance;
    private String name;

    public GroupTest(String name) {
        this.name = name;
        this.instance = null;
    }

    @Override
    public void run() {
        System.out.println(name);
        instance = Group.getInstance();
    }

    public Group getInstance() {
        return instance;
    }
}

