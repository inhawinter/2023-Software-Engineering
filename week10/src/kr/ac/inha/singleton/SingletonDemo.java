package kr.ac.inha.singleton;

class Singleton{
    private static Singleton singleton = new Singleton();
    //public Singleton() {
    private Singleton(){
        System.out.println("Only One!");
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println(Singleton.getSingleton());
        Singleton s3 = Singleton.getSingleton();
        Singleton s4 = Singleton.getSingleton();
        System.out.println(s3);
        System.out.println(s4);

//        Singleton s1 = new Singleton();
//        Singleton s2 = new Singleton();
//        System.out.println(s1);
//        System.out.println(s2);
    }
}
