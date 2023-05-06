package kr.ac.inha.singleton;

class Singleton{
    public Singleton() {
        System.out.println("Only One!");
    }

}
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = new Singleton();
        Singleton s2 = new Singleton();
        System.out.println(s1);
        System.out.println(s2);
    }
}
