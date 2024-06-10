// Base class for the simplest form of transportation
class Bicycle {
    void displayFeatures() {
        System.out.println("Features: Pedals, Manual power");
    }
}

// Inherits from Bicycle and adds an engine
class Motorbike extends Bicycle {
    void displayFeatures() {
        super.displayFeatures(); // Display features of Bicycle
        System.out.println("Added feature by Motorbike: Engine");
    }
}

// Inherits from Motorbike and integrates an electric motor
class ElectricBike extends Motorbike {
    void displayFeatures() {
        super.displayFeatures(); // Display features of Motorbike
        System.out.println("New feature by ElectricBike: Electric motor and battery");
    }
}

// Main class to test the inheritance
class TranspMul {
    public static void main(String args[]) {
        ElectricBike myEbike = new ElectricBike();
        myEbike.displayFeatures(); // Display the cumulative features of the evolution
    }
}