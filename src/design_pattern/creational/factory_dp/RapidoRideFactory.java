package design_pattern.creational.factory_dp;

public class RapidoRideFactory {
    private RapidoRideFactory() {
    }

    public static RapidoRide getInstance(String type) {
        return switch (type) {
            case "bike" -> new BikeRide();
            case "cab" -> new CabRide();
            case "auto" -> new AutoRide();
            default -> null;
        };
    }
}
