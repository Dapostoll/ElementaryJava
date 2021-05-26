package homeWork.lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car porsche911 = new Car(4, 2, "Porsche", 10000, "Sportcar");
        Car cybertruck = new Car(4, 4, "Tesla", 0, "Offroad pickup");
        Car m6 = new Car(4, 4, "BMW", 5000, "Sportcar");
        Car[] cars = {porsche911, cybertruck, m6};
        System.out.println(Arrays.toString(cars));
        System.out.println("ComparatorByDoors");
        Arrays.sort(cars, new ComparatorByDoors());
        for (Car tmp : cars) {
            System.out.println(tmp);
        }
        System.out.println("ComaratorByCarBrand");
        Arrays.sort(cars, new ComaratorByCarBrand());
        for (Car tmp : cars) {
            System.out.println(tmp);
        }
        System.out.println("ComparatoprByMileage");
        Arrays.sort(cars, new ComparatoprByMileage());
        for (Car tmp : cars) {
            System.out.println(tmp);
        }
        System.out.println("ComparableByMileage");
        Arrays.sort(cars);
        for (Car tmp : cars)
            System.out.println(tmp);
    }
}
