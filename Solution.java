
public class Solution {
    public static void main(String[] args) {
        int eRP = 64; // Replace this with the actual ERP value

        char erg = calculateERG(eRP);
        System.out.println("Employee Rating Grade (ERG): " + erg);
    }

    public static char calculateERG(int eRP) {
        char erg;
        if (eRP >= 30 && eRP <= 50) {
            erg = 'D';
        } else if (eRP >= 51 && eRP <= 60) {
            erg = 'C';
        } else if (eRP >= 61 && eRP <= 80) {
            erg = 'B';
        } else if (eRP >= 81 && eRP <= 100) {
            erg = 'A';
        } else {
            erg = 'X'; // Handle invalid ERP values
        }
        return erg;
    }
}
