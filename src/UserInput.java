import java.util.Scanner;

public class UserInput {
    public UserInput() {

    }

    public String getInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public int checkInput (String input) {
            int zahl = Integer.parseInt(input.replaceAll("[^0-9]", ""));

            return zahl;
        }
}
