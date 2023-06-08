package kr.ac.inha.adapter;

public class Agumon implements Digimon{
    @Override
    public void attackEnemy() {
        System.out.println("Agumon attacks the enemy!");
    }

    @Override
    public void protectMaster() {
        System.out.println("Agumon protects its master!");
    }
}
