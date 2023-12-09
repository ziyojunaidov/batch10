package interfaces.example3;

public class AirCraft implements Flyable,Rideable{

    private String name;
    private int passengers;
    private int distance;

    public AirCraft(String name, int passengers, int distance) {
        this.name = name;
        this.passengers = passengers;
        this.distance = distance;
    }
    public AirCraft(){
        this.name = "No name";
        this.passengers = 0;
        this.distance = 0;
    }

    public void fly() {
        System.out.println("Aircraft " + name + " with capacity "
                + passengers + " passengers " + " flying distance " + distance + " km");
    }


    public void ride() {
        System.out.println("Aircraft " + name +
                " with capacity " + passengers + " passengers " + " riding on ground");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
