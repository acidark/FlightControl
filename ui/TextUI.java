package FlightControl.ui;
import java.util.Scanner;

import FlightControl.domain.*;
import FlightControl.logic.FlightControl;

public class TextUI implements UserInterface{
    private FlightControl flightControl;
    private Scanner scanner;

    public TextUI(Scanner scanner,FlightControl flightControl){
        this.scanner=scanner;
        this.flightControl=flightControl;
    }
    public void start(){
        
        //while(true)
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();

    }

    public void startAssetControl(){
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        while(true){
            System.out.println("Choose and action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");
            String choice = scanner.nextLine();
            if(choice.equals("1")){
                addAirplane();
            } else if (choice.equals("2")){
                addFlight();
            } else if(choice.equals("x")){
                break;
            }
        } System.out.println();
    }
    public void startFlightControl(){
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();
        while(true){
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String choice = scanner.nextLine();
            if(choice.equals("1")){
                printAirplanes();
            } else if (choice.equals("2")){
                printFlights();
            } else if (choice.equals("3")){
                printAirplaneDetails();
            } else if (choice.equals("x")){
                break;
            }System.out.println();
        }
    }

    public void printAirplaneDetails(){
        System.out.print("Give the airplane id: ");
        System.out.println(this.flightControl.getAirplane(scanner.nextLine()));
    }
    public void printFlights(){
        this.flightControl.getFlights().stream().forEach(s->System.out.println(s));
    }

    public void printAirplanes(){
        this.flightControl.getAirplanes().stream().forEach(s->System.out.println(s));

    }
    public void addAirplane(){
        System.out.print("Give the airplane id: ");
        String ID = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int cap = Integer.valueOf(scanner.nextLine());
        this.flightControl.addAirplane(ID, cap);
    }

    public void addFlight(){
        System.out.print("Give the airplane id: ");
        //String id = scanner.nextLine();
        Airplane airplane = getAirplane(scanner.nextLine());
        System.out.print("Give the departure airport id: ");
        String departure = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String arrive = scanner.nextLine();
        this.flightControl.addFlight(airplane, departure, arrive);
    }

    public Airplane getAirplane(String id){
        return this.flightControl.getAirplane(id);
    }
}
