package strategy;

public class Wings implements Fly {
    @Override
    public void fly() {
        System.out.println("날개를 사용해 날아갑니다!");
    }
}

