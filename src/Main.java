import java.util.Scanner;

public class Main {

    public static void menu(String[] options){
        for (int i = 0; i < options.length; i++){
            System.out.println(options[i]);
        }
        System.out.print("Choose action : ");
    }


    public static void main(String[] args) {
        System.out.print("""
            Washing Machine
                -------
                |_____|
                | ( ) |
                |_____|
                """);
        String[] options = {
                "1.Power On 1",
                "2.Power off 2",
                "3.Select Wash Cycle 3",
                "4.Current Cycle 4",
                "5.Start Wash 5",
                "6.Stop Wash 6",
                "7.Exit 7",
        };

        Scanner scanner = new Scanner(System.in);

        int option;
        String selectedCycle = "";
        WashingMachine newWashingMachine = new WashingMachine();
        while (true){
            menu(options);
            option = scanner.nextInt();

            switch (option){
                case 1:
                    newWashingMachine.powerOn();
                    break;
                case 2:
                    newWashingMachine.powerOff();
                    break;
                case 3:
                    String[] cycleOptions = {
                            "1.Quick 1",
                            "2.Normal 2",
                            "3.Delicate 3",
                            "4.Return to Main Menu 4",
                    };
                    menu(cycleOptions);
                    int selectedCycleNumber = scanner.nextInt();
                    switch (selectedCycleNumber) {
                        case 1:
                            selectedCycle =  "Quick";
                            break;
                        case 2:
                            selectedCycle =  "Normal";
                            break;
                        case 3:
                            selectedCycle =  "Delicate";
                            break;
                        case 4:
                            // Return to Main Menu
                            continue;
                    }

                    newWashingMachine.selectCycle(selectedCycle);
                    break;
                case 4:
                    System.out.print("Current Cycle is: ");
                    System.out.println(newWashingMachine.getCurrentCycle());
                    break;
                case 5:
                    newWashingMachine.start();
                    break;
                case 6:
                    newWashingMachine.stop();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}