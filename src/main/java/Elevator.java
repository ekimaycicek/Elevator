import java.util.Scanner;

public class Elevator {
    private static int numberOfFloors = 5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("welcome to the elevator");
        System.out.println("<3 <3 <3 <3");
        System.out.println("Please enter your floor (0 - " + (numberOfFloors - 1) + "): ");
        int yourFloor = input.nextInt();

        if (yourFloor < 0 || yourFloor >= numberOfFloors) {
            System.out.println("wrong login");

            return;
        }








        System.out.println("Which floor do you want to go to? (0 - " + (numberOfFloors - 1) + "): ");
        int floorToGo = input.nextInt();

        if (floorToGo < 0 || floorToGo >= numberOfFloors) {
            System.out.println("wrong login");

            return;
        }

        if (yourFloor == floorToGo) {
            System.out.println("You are already this big");

            return;
        }

        System.out.println("Elevator " + yourFloor + ". on the floor.");

        if (yourFloor < floorToGo) {
            System.out.println("we go up...");

            for (int groundFloor = yourFloor + 1; groundFloor <= floorToGo; groundFloor++) {
                System.out.println("Elevator " + groundFloor + ". came to the floor.");
            }
        } else {
            System.out.println("we are going down...");

            for (int groundFloor = yourFloor - 1; groundFloor >= floorToGo; groundFloor--) {
                System.out.println("Elevator " + groundFloor + ". came to the floor.");
            }
        }

        System.out.println("You have reached the target floor");


    }
}


