```mermaid
classDiagram
    Subject --> "*" Subscriber : Association
    LandCh ..|> Subject : Realization
    KoreanSubscriber ..|> Subscriber : Realization
    KoreanSubscriber o-- LandCh : Aggregation

    class Subject {
        <<interface>>
        + registerSubscriber(s: Subscriber): void
        + removeSubscriber(s: Subscriber): void
        + notifySubscriber(): void
    }

    class Subscriber {
        <<interface>>
        + update(value: int): void
    }
    note for Subscriber "Observer Interface"
    
    class LandCh {
        - price: int
        - subscribers: List~Subscriber~
        + registerSubscriber(s: Subscriber): void
        + removeSubscriber(s: Subscriber): void
        + notifySubscriber(): void
        + setPrice(price: int): void
    }
    
    class KoreanSubscriber {
        - name: String
        - value: int
        - landCh: LandCh
        + update(value: int): void
    }
```