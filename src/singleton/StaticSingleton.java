package singleton;
/*
Static way of loading singleton
 */
public class StaticSingleton {

    private static StaticSingleton instance = new StaticSingleton();

    private StaticSingleton(){

    }

    public static StaticSingleton getInstance(){
        return instance;
    }
/*
both instace print same object refrence and both are equal while comparing.
 */
    public static void main(String[] args) {
        StaticSingleton instance1 = StaticSingleton.getInstance();
        System.out.println(instance1);

        StaticSingleton instance2 = StaticSingleton.getInstance();
        System.out.println(instance2);

        System.out.println(instance1 == instance2);
    }
}
