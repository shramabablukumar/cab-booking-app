package Model;

public class Location {
    private int x;
    private int y;
    public Location(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int Distance(Location other){
        return  Math.abs(this.x -other.x) + Math.abs(this.y-other.y);
    }


}
