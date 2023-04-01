package observer;

import java.util.ArrayList;
import java.util.List;

public class LandCh implements Subject{
    private int price;
    private List<Subscriber> subscribers;

    public LandCh() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void registerSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void removeSubscriber(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void notifySubscriber() {
        for(Subscriber subscriber : subscribers)
            subscriber.update(price);
        //subscribers.forEach(s -> s.update(price));
    }

    public void setPrice(int price) {
        this.price = price;
        notifySubscriber();
    }
}
