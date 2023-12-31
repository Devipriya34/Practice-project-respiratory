import java.util.Scanner;

public class MaxEnergySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of chemicals (N)
        int numOfChem = scanner.nextInt();
        
        // Initialize variables to store the maximum and second maximum energies
        int maxEnergy = Integer.MIN_VALUE;
        int secondMaxEnergy = Integer.MIN_VALUE;
        
        // Iterate through the energies and update maxEnergy and secondMaxEnergy
        for (int i = 0; i < numOfChem; i++) {
            int energy = scanner.nextInt();
            
            if (energy > maxEnergy) {
                secondMaxEnergy = maxEnergy;
                maxEnergy = energy;
            } else if (energy > secondMaxEnergy) {
                secondMaxEnergy = energy;
            }
        }
        
        // Calculate and print the sum of energies that produce the maximum energy
        int sumOfMaxEnergies = maxEnergy + secondMaxEnergy;
        System.out.println(sumOfMaxEnergies);
    }
}
