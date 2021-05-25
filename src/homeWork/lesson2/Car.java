package homeWork.lesson2;

import java.util.Arrays;
import java.util.Comparator;

public class Car implements Comparable  {
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
    public int compareTo(Object o) {
        int tmp = this.mileage - ((Car)o).mileage;
        if (tmp == 0) {
            return this.mileage - ((Car) o).mileage;
        } else {
            return tmp;
        }
    }
//    @Override
//    public int compareTo(Object o) {
//        int tmp = this.doors - ((Car)o).doors;
//        if (tmp == 0) {
//            return this.doors - ((Car) o).doors;
//        } else {
//            return tmp;
//        }
//    }
}
class ComparatorByDoors implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return ((Car) o1).doors - ((Car)o2).doors;
    }
}
class ComaratorByCarBrand implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return ((Car)o1).carBrand.compareTo(((Car) o2).carBrand);
    }
}
class ComparatoprByMileage implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return ((Car)o1).mileage - ((Car)o2).mileage;
    }
//class ComparableByDoors implements  Comparable <Car>{
//    @Override
//    public int compareTo(Car o) {
//        int tmp = this.doors - ((Car)o).doors;
//        if (tmp == 0) {
//            return this.doors - ((Car) o).doors;
//        } else {
//            return tmp;
//        }
//    }
//}
}



