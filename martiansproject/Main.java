import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Random random = new Random();
		
		int[] cargo = new int [8];
		int boxKg1 = random.nextInt(710) + 1;
		int boxKg2 = random.nextInt(713 - boxKg1) + 1;
		int boxKg3 = 713 - (boxKg1 + boxKg2);
		int foundCargo = 0;
		int boxKm1 = 0;
		int boxKm2 = 0;
		int boxKm3 = 0;
		
		System.out.println("Enter the location (km) ");
		
		while (foundCargo != 713) {
			while (true) {
				boxKm1 = random.nextInt(8);
				boxKm2 = random.nextInt(8);
				boxKm3 = random.nextInt(8);
				if (boxKm1 != boxKm2 && boxKm2 != boxKm3 && boxKm1 != boxKm3) {
        		    break;
        		}
			}
    		cargo[boxKm1] = boxKg1;
    		cargo[boxKm2] = boxKg2;
    		cargo[boxKm3] = boxKg3;
    		System.out.print("Box locations array (hint): ");
    		for (int i = 0; i < cargo.length; i++) {
    		    System.out.print(cargo[i] + " ");
    		}
    		System.out.print("\n");
    		int a = scanner.nextInt();
    		foundCargo += cargo[a];
    		int b = scanner.nextInt();
    		foundCargo += cargo[b];
    		int c = scanner.nextInt();
    		foundCargo += cargo[c];
    		if (foundCargo != 713) {
    		    System.out.println("You did not find the cargo. Enter locations again.");
				foundCargo = 0;
    		}
    		cargo[boxKm1] = 0;
    		cargo[boxKm2] = 0;
    		cargo[boxKm3] = 0;
		}
		System.out.print("You found all the cargo.");
	}
}