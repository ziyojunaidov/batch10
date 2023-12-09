package Inheritance.example9;

public class Aircraft extends Transport{

    private int capacity;

    public Aircraft(String name, int speed, int capacity) {
        super(name, speed);
        this.capacity = capacity;
    }
    public Aircraft(){
        super();
        this.capacity = 1;
    }
    public void move(){
        System.out.println("Aircraft " + getName() + " with " +
                getCapacity() + " passenger is flying with speed " + getSpeed() + " km/h");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
