package observer;

public class KoreanSubscriber implements Subscriber{
    private String name;
    private int value;
    private LandCh landCh; // Aggregation (has-a)

    public KoreanSubscriber(String name, LandCh landCh) {
        this.name = name;
        this.landCh = landCh;
        landCh.registerSubscriber(this);
    }

    @Override
    //public void update(int value) {
    public void update() {  // pull
        this.value = landCh.getPrice();  // pull
        System.out.println(name + "님 가격이 " + value + "원으로 변경되었습니다");
    }
}
