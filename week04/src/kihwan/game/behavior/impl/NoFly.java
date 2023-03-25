package game.behavior.impl;

import game.behavior.Fly;

public class NoFly implements Fly {
    @Override
    public void fly() {
        System.out.println("날 수 없어요!");
    }
}
