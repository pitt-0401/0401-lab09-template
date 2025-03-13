/*
 * Created on 2026-03-19
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

// NO NEED TO TOUCH THIS FILE
public class TrainStation {
    public static void main(String[] args) {
        Train train = new Train();
        LinkedTrain cars = train.getTrainCars();
        System.out.println("Empty: " + cars.isEmpty() + ", size: " + cars.size());

        // Optional: Add another type of cargo (see TrainCar)
        train.addTrainCar("potatoes");
        train.addTrainCar("people");
        train.addTrainCar("potatoes");
        cars.addFirst("people");
        System.out.println("Cars: " + cars + ", size: " + cars.size());
        train.printTrain();

        cars.removeFirst();
        cars.removeLast();
        System.out.println("Cars: " + cars + ", size: " + cars.size());
        train.printTrain();
    }
}
