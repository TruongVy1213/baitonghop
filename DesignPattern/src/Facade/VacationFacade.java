package Facade;

public class VacationFacade {
    private static VacationFacade intance = null;

    private VehicleBooking vehicle;
    private HotelBooking hotel;
    private FlightBooking flight;

    private VacationFacade(){
        vehicle = new VehicleBooking();
        hotel = new HotelBooking();
        flight = new FlightBooking();
    }

    public static VacationFacade getIntance(){
        if (intance == null){
            intance = new VacationFacade();
        }
        return intance;
    }

    public void option1(){
        vehicle.bookingCar();
        hotel.standardRoom();
    }

    public void option2(){
        vehicle.bookingCar();
        hotel.luxuryRoom();
        flight.round_trip();
    }

    public void option3(){
        vehicle.bookingMotorbike();
        hotel.standardRoom();
        flight.one_way();
    }
}
