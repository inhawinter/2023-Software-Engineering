package kr.ac.inha.singleton;

import java.util.Random;

class Pokemon {
    private String name;
    private boolean available = true;

    public Pokemon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean isAvailable() {
        return available;
    }
    public void catchPokemon(String trainerName) {
        try {
            Thread.sleep(new Random().nextInt(100));
            System.out.println(trainerName + " caught " + name + " (" + this + ")");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setAvailable(true);
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}

