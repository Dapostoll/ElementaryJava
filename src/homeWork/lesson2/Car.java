package homeWork.lesson2;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    int wheels;
    int doors;
    String carBrand;
    int mileage;
    String carType;

    public Car(int wheels, int doors, String carBrand, int mileage, String carType) {
        this.wheels = wheels;
        this.doors = doors;
        this.carBrand = carBrand;
        this.mileage = mileage;
        this.carType = carType;
    }
    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", doors=" + doors +
                ", carBrand='" + carBrand + '\'' +
                ", mileage=" + mileage +
                ", carType='" + carType + '\'' +
                '}';
    }
    @Override
    public int compareTo(Car o) {
        int tmp = this.mileage - (o).mileage;
        if (tmp == 0) {
            return this.mileage - (o).mileage;
        } else {
            return tmp;
        }
    }
}
class ComparatorByDoors implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Car) o1).doors - ((Car) o2).doors;
    }
}
class ComaratorByCarBrand implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Car) o1).carBrand.compareTo(((Car) o2).carBrand);
    }
}
class ComparatoprByMileage implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Car) o1).mileage - ((Car) o2).mileage;
    }
}



