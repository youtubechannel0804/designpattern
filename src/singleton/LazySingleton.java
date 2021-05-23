package singleton;

public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(instance == null)
            return instance = new LazySingleton();
        return instance;
    }
    /*
    both instace print same object refrence and both are equal while comparing.
     */
    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getInstance();
        System.out.println(instance1);

        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(instance2);

        System.out.println(instance1 == instance2);
    }
}
