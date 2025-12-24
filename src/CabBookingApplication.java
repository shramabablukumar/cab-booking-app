import Model.Location;
import services.RideService;

public class CabBookingApplication {

    public static void main(String[] args) {

        RideService service = new RideService();

        // Onboard users
        service.addUser("Abhishek", "M", 23);
        service.addUser("Rahul", "M", 29);
        service.addUser("Nandini", "F", 22);

        // Onboard drivers
        service.addDriver("Driver1", "Swift", "KA-01-12345", new Location(10, 1));
        service.addDriver("Driver2", "Swift", "KA-01-12345", new Location(11, 10));
        service.addDriver("Driver3", "Swift", "KA-01-12345", new Location(5, 3));

        // Test cases
        service.findRide("Abhishek", new Location(0, 0), new Location(20, 1));

        service.findRide("Rahul", new Location(10, 0), new Location(15, 3));
        service.chooseRide("Rahul", "Driver1");

        service.findRide("Nandini", new Location(15, 6), new Location(20, 4));
    }
}
