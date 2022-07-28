package FlightControl.domain;

public class Place {
    private String place;

    public Place(String where){
        this.place=where;
    }

    public String getPlace(){
        return this.place;
    }

    public String toString(){
        return this.place;
    }
}
