import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        System.out.println("Main Menu" +
                "--------------------------------------------\n" +
                "1. Find and reserve a room\n" +
                "2. See my reservations\n"+
                "3. Create an account\n"+
                "4. Admin\n"+
                "5. Exit\n"+
                "");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        switch (userInput){
            case "1":

        }
    }
}
