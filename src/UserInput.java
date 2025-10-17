import java.util.Scanner;

public class UserInput {
    public UserInput() {

    }

    public String getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        return input.nextLine();
    }

    public int checkInput (String input) {
        String clearedInput = input.replaceAll("[^0-9]", "");
        int zahl;
        if (clearedInput.isEmpty()){
            zahl = -1;
        } else {
            zahl = Integer.parseInt(clearedInput);
        }
            return zahl;
        }
}
