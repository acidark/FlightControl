package FlightControl;

import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUI;
import FlightControl.ui.UserInterface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        FlightControl flight = new FlightControl();
        UserInterface user = new TextUI(scanner, flight);
        user.start();
    }
}
