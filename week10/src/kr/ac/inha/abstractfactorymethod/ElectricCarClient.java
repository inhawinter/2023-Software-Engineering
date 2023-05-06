package kr.ac.inha.abstractfactorymethod;

interface CarFactory {
    ElectricMotor createMotor();
    public Battery createBattery();
}

class TeslaFactory implements CarFactory {
    public ElectricMotor createMotor() {
        return new TeslaMotor();
    }

    public Battery createBattery() {
        return new TeslaBattery();
    }
}

class HyundaiFactory implements CarFactory {
    public ElectricMotor createMotor() {
        return new HyundaiMotor();
    }

    public Battery createBattery() {
        return new HyundaiBattery();
    }
}


interface ElectricMotor {
    void start();
}

class TeslaMotor implements ElectricMotor {
    public void start() {
        System.out.println("테슬라 모터 구동 시작");
    }
}

class HyundaiMotor implements ElectricMotor {
    public void start() {
        System.out.println("현대차 모터 구동 시작");
    }
}

interface Battery {
    int getRange();
}

class TeslaBattery implements Battery {
    public int getRange() {
        return 500;
    }
}

class HyundaiBattery implements Battery {
    public int getRange() {
        return 400;
    }
}

public class ElectricCarClient {
    public static void main(String[] args) {
        CarFactory factory1 = new TeslaFactory();
        ElectricMotor motor1 = factory1.createMotor();
        Battery battery1 = factory1.createBattery();

        motor1.start();
        System.out.println("테슬라 배터리 1회 충전 거리 : " + battery1.getRange() + "km");

        CarFactory factory2 = new HyundaiFactory();
        ElectricMotor motor2 = factory2.createMotor();
        Battery battery2 = factory2.createBattery();

        motor2.start();
        System.out.println("현대차 배터리 1회 충전 거리 : " + battery2.getRange() + "km");
    }
}