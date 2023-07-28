public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        SingletonExample instance1=SingletonExample.getInstance();
        SingletonExample instance2=SingletonExample.getInstance();

        System.out.println("Instance1=="+instance1.hashCode());
        System.out.println("Instance1=="+instance2.hashCode());


    }
}