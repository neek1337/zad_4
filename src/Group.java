public class Group {

    private static volatile Group instance;

    public static Group getInstance() {

        synchronized (Group.class) {
            if (instance == null) {
                instance = new Group();
            }

        }
        return instance;
    }
}


