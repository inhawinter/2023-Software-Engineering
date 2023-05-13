package kr.ac.inha.singleton;

public class PokemonGame {
    private static final int TRAINER_NUM = 10;
    private static final int CATCHES_PER_TRAINER = 2;

    public static void main(String[] args) {
        Trainer[] trainers = new Trainer[TRAINER_NUM];
        Thread[] threads = new Thread[TRAINER_NUM];

        for (int i = 0; i < TRAINER_NUM; i++) {
            trainers[i] = new Trainer("Trainer " + (i + 1), CATCHES_PER_TRAINER);
            threads[i] = new Thread(trainers[i]);
            threads[i].start();
        }
    }
}
