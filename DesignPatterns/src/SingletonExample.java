public class SingletonExample {
    private SingletonExample(){
    }

    public static SingletonExample instance = null;

    public static SingletonExample getInstance(){

        if(instance==null){
            synchronized (SingletonExample.class) {
                instance = new SingletonExample();
            }
        }
    return instance;
    }

}
