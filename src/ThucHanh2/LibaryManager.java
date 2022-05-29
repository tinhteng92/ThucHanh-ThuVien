package ThucHanh2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class LibaryManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<CallCard> callCards = new ArrayList<>();

    public void menu() {
        System.out.println("---Menu---");
        System.out.println("1. Create student information to borrow books ");
        System.out.println("2. Display the list of students information about borrowing books: ");
        System.out.println("3. delete information of students who have returned books ");
        System.out.println("4. Display the list of students who have not returned their books after due date at the end of the month ");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                showCallCard();
            case 2:
                showMontEndInfo();

            case 3:

            case 4:

            case 5:
                System.exit(0);
        }
    }

    public void creatCallCard() throws ParseException {

        System.out.println("Enter student's name: ");
            String name = scanner.nextLine();
        System.out.println("Enter student's Id: ");
            int Id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter student's date of birth");
            Date dateOfBirth = new SimpleDateFormat("dd/MM//yyyy").parse(scanner.nextLine());
        System.out.println("Enter student's grade: ");
            String grade = scanner.nextLine();
        System.out.println("Enter call Slip: ");
            int callSlip = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter started date: ");
            Date borrowedDate = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        System.out.println("Enter due date: ");
            Date dueDate = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        System.out.println("Enter call number: ");
            int callNumber = Integer.parseInt(scanner.nextLine());

        CallCard callCard = new CallCard(name, Id, dateOfBirth, grade, callSlip, borrowedDate, dueDate, callNumber);
        callCards.add(callCard);
    }

    public void showCallCard() {
        for (int i = 0; i < callCards.size(); i++) {
            System.out.println(callCards.get(i));
        }
    }

}