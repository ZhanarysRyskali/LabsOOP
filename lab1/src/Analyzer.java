import java.util.Scanner;

public class Analyzer {
    Scanner scanner = new Scanner(System.in);
    Data data = new Data();
    String input;
    public void adding() {
        while (true) {
            System.out.print("Enter number (Q to quit): ");
            input = scanner.nextLine();
            if (input.equals("Q")) {
                break;
            }
            try {
                double value = Double.parseDouble(input);
                data.add_value(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        }
    }
    public void printAverage(){
        System.out.println(data.get_Average());
    }
    public void printLargest(){
        System.out.println(data.getLargest());
    }
}
