package kr.ac.inha.adapter;

public class Pikachu implements Pokemon{
    @Override
    public void attack() {
        System.out.println("Pikachu attacks!");
    }

    @Override
    public void defend() {
        System.out.println("Pikachu defends!");
    }
}
