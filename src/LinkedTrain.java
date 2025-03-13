/*
 * Created on 2026-03-19
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

// TODO - TASK 2
public class LinkedTrain {

    // TODO: define useful attributes

    // Default constructor
    public LinkedTrain() {
        // Can be left empty!
    }

    // TODO: implement isEmpty()

    // TODO: implement size()

    // TODO: implement addFirst
    // Adds a new node at the start of the list
    public void addFirst(String data) {

    }

    // TODO: implement add
    // Adds a new node at the end of the list
    public void add(String data) {

    }

    // TODO: implement removeFirst
    // Removes the first node, returns false if the list is empty
    public boolean removeFirst() {
        return false;
    }

    // TODO: implement removeLast
    // Removes the last node, returns false if the list is empty
    public boolean removeLast() {
        return false;
    }

    /*
     * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * ! NO NEED TO TOUCH THE LINES BELOW !
     * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     */

    // Returns the TrainCar at index, or null if the index is invalid
    public TrainCar get(int index) {
        if (index < 0) {
            return null;
        }
        Node current = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null) {
                    return null;
                }
                current = current.getNext();
            }
            return current.getData();
        }
        return null;
    }

    @Override
    public String toString() {
        String output = "";
        Node current = head;
        while (current != null) {
            output += "[" + current.getData() + "]";
            current = current.getNext();
        }
        return output;
    }

    public void print() {
        System.out.println(this.toString());
    }
}
