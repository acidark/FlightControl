package FlightControl.domain;

public class Flight {
    private Airplane airplane;
    private Place fromWhere;
    private Place toWhere;

    public Flight(Airplane airplane,Place fromWhere,Place toWhere){
        this.airplane = airplane;
        this.fromWhere=fromWhere;
        this.toWhere=toWhere;
    }
    public String toString(){
        return this.airplane+" ("+this.fromWhere+"-"+this.toWhere+")";
    }
}
