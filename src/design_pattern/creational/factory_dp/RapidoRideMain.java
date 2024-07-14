package design_pattern.creational.factory_dp;

public class RapidoRideMain {
    public static void main(String[] args) {
        RapidoRide rr = RapidoRideFactory.getInstance("bike");
        if(rr != null)
            rr.ride();
    }
}
