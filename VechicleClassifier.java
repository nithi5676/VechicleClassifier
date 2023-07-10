package vechicleClassifier;

class Vechicle {
    void start() {
        System.out.println("Vechicle started");
    }

    void stop() {
        System.out.println("Vechicle stopped");
    }
}

class Car extends Vechicle {
    @Override
    void start() {
        System.out.println("Car Started");
    }

    @Override
    void stop() {
        System.out.println("Car stopped");
    }

}

class Bike extends Vechicle {
    @Override
    void start() {
        System.out.println("Bike started");
    }

    @Override
    void stop() {
        System.out.println("Bike stopped");
    }
}

public class VechicleClassifier {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        car.start();
        car.stop();
        bike.start();
        bike.stop();
    }
}
