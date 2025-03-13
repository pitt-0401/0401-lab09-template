/*
 * Created on 2026-03-19
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

// NO NEED TO TOUCH THIS FILE
public class TrainCar {

    private final String cargo;
    private final String[] trainCarString = { " _________", " |       |", " |       |", "-|_______|", "   o   o  " };

    public TrainCar(String cargo) {
        this.cargo = cargo;
        if (cargo.equalsIgnoreCase("person") || cargo.equalsIgnoreCase("people")) {
            trainCarString[1] = " | o/\\o/ |";
            trainCarString[2] = " |/|  |  |";
            trainCarString[3] = "-|/\\__/\\_|";
        } else if (cargo.equalsIgnoreCase("potatoes")) {
            trainCarString[1] = " |ooooooo|";
            trainCarString[2] = " |ooooooo|";
        } else {
            System.out.println("Unknown cargo, adding an empty car: " + cargo);
        }
    }

    public String getCargo() {
        return cargo;
    }

    public String[] getTrainCarString() {
        return trainCarString;
    }

    @Override
    public String toString() {
        return cargo;
    }
}
