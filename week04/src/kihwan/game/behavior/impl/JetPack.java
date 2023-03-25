package game.behavior.impl;

import game.behavior.Fly;

public class JetPack implements Fly {
    @Override
    public void fly() {
        System.out.println("제트팩을 사용해 날아갑니다!");
    }
}
