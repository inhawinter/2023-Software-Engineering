package kr.ac.inha.singleton;

class Trainer implements Runnable {
    private PokemonCenter center;
    private String trainerName;
    private int numCatches;

    public Trainer(String trainerName, int numCatches) {
        this.trainerName = trainerName;
        this.numCatches = numCatches;
    }

    public void run() {
        center = PokemonCenter.getCenter();
        int catches = 0;
        while (catches < numCatches) {
            Pokemon pokemon = center.getPokemon();
            if (pokemon != null) {
                pokemon.catchPokemon(trainerName);
                catches++;
            }
        }
    }
}
