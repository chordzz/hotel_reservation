import java.util.Scanner;

public class AdminMenu {
    public static void main() {
        System.out.println("Admin Menu" +
                "---------------------------------------\n" +
                "1. See all Customers\n" +
                "2. See all Rooms\n"+
                "3. See all Reservations\n"+
                "4. Add a Room\n"+
                "5. Back to Main Menu\n"+
                "");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        switch (userInput){
            case "1":

        }
    }
}
