package kr.ac.inha.adapter;

public class DigimonAdapter implements Pokemon{
    private Digimon digimon;

    public DigimonAdapter(Digimon digimon) {
        this.digimon = digimon;
    }

    @Override
    public void attack() {
        digimon.attackEnemy();
    }

    @Override
    public void defend() {
        digimon.protectMaster();
    }
}
