package ru.skillbox;


public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor){
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor(){
        return currentFloor;
    }

    private void moveDown(){
        currentFloor = (currentFloor > minFloor) ? currentFloor - 1 : currentFloor;
    }

    private void moveUp(){
        currentFloor = (currentFloor < maxFloor) ? currentFloor + 1 : currentFloor;
    }

    public void move(int floor){
        if(floor >= minFloor && floor <= maxFloor){
            while(currentFloor != floor){
                if (currentFloor > floor){
                    moveDown();
                    System.out.println(currentFloor);
                } else {
                    moveUp();
                    System.out.println(currentFloor);
                }
            }
        } else {
            System.out.println("Ошибка");
        }
    }
}
