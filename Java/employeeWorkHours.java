import java.util.Scanner;
import java.util.Arrays;

public class employeeWorkHours
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("Would you like to have a predefined set of 8 employees' work hours? [y/n]: ");
        String preset = input.nextLine();

        int[][] workHours;
        if (preset.equalsIgnoreCase("y")) {
            int[][] workHoursPreset = { {2,6,5,4,3,2,3},
                                        {2,7,9,6,5,5,4},
                                        {6,4,2,3,4,7,5},
                                        {5,4,3,2,6,8,6},
                                        {8,6,9,5,6,8,9},
                                        {11,12,7,4,14,5,5},
                                        {4,7,5,4,8,9,8} 
                                       };

            workHours = workHoursPreset;
        } 
        else {
            System.out.print("How many employees? ");
            int employeeCount = input.nextInt();

            workHours = new int[employeeCount][7];

            for (int i = 0; i < workHours.length; i++) {
                for (int j = 0; j < workHours[i].length; j++) {
                    System.out.printf("Enter number of work hours for Employee %d in day %d: ", i + 1, j + 1);
                    workHours[i][j] = input.nextInt();
                }
            }
        }

        int hourSum = 0;

        for (int i = 0; i < workHours.length; i++) {

            System.out.printf("Employee %d total hours: ", i + 1);

            for (int j = 0; j < workHours[i].length; j++) {
                hourSum += workHours[i][j];
            }
            System.out.printf("%d\n", hourSum);

            Arrays.sort(workHours[i]);
            System.out.print("[ ");
            for (int k = workHours[i].length - 1; k >= 0; k--) {
                System.out.printf("%d ", workHours[i][k]);
            }
            System.out.printf("]\n");
        }
    }
}
