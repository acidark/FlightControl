package FlightControl.logic;
//package FlightControl.domain;
import FlightControl.domain.Place;
import FlightControl.domain.Flight;
import FlightControl.domain.*;
import java.util.Collection;

import java.util.ArrayList;
import java.util.HashMap;

public class FlightControl {
    private HashMap<String,Flight> flights;
    private HashMap<String,Airplane> airplanes;
    private HashMap<String, Place> places;

    public FlightControl(){
        this.flights=new HashMap<>();
        this.airplanes=new HashMap<>();
        this.places=new HashMap<>();
    }

    public void addAirplane(String id, int cap){
        //airplanes.putIfAbsent(airplane.getID(), airplane);
        Airplane airplane = new Airplane(id, cap);
        airplanes.putIfAbsent(id, airplane);
    }
    public void addFlight(Airplane airplane,String fromWhere,String toWhere){
        Place fromWheree = new Place(fromWhere);
        Place toWheree = new Place(toWhere);
        Flight newFlight = new Flight(airplane, fromWheree, toWheree);
        flights.putIfAbsent(newFlight.toString(), newFlight);
    }

    public Airplane getAirplane(String id){
        return this.airplanes.get(id);
    }
    public Collection<Airplane> getAirplanes(){
        return this.airplanes.values();
    }
    public Collection<Flight> getFlights(){
        return this.flights.values();
    }


}
