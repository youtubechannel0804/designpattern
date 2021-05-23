package singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton(){

    }

    public static ThreadSafeSingleton getInstance(){
        if(instance == null)
            return instance = new ThreadSafeSingleton();
        return instance;
    }
    /*
    both instace print same object refrence and both are equal while comparing.
     */
    public static void main(String[] args) {
        ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
        System.out.println(instance1);

        ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();
        System.out.println(instance2);

        System.out.println(instance1 == instance2);
    }
}
