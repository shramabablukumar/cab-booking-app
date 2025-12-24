package Model;

public class Driver {
    private String name;
    private Vechicle vechicle;
    private Location location;
    private boolean available;
    public Driver(String name,Vechicle vechicle,Location location){
        this.name =name;
        this.vechicle =vechicle;
        this.location =location;
        this.available= true;

    }
    public String getName(){
        return name;
    }
    public Location getLocation(){
        return location;

    }
    public boolean isAvailable(){
        return  available;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }
}
