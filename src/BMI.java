import java.util.Arrays;
import java.util.Scanner;

public class BMI {
    // Task 18
    public static void main (String[] args) {
        int i;
        Scanner scanner18 = new Scanner(System.in);
        float[] weight = new float[3];
        float[] height = new float[3];
        float[] BMI = new float[3];
        // Weight input
        for (i=0; i<=2; i++) {
            System.out.print("Enter your weight in KG please: ");
            weight[i] = scanner18.nextFloat();
            while (weight[i] < 15 || weight[i] > 180) {
                System.out.println("Error the weight you enter must be between 15 and 180 kg");
                weight[i] = scanner18.nextFloat();
            }

            // Height input
            System.out.print("\nEnter your height in meters please: ");
            height[i] = scanner18.nextFloat();
            while (height[i] < 0.25 || height[i] > 2.5) {
                System.out.println("Error the weight you enter must be between 0.25 and 2.5 m");
                height[i] = scanner18.nextFloat();
            }

            BMI[i] =weight[i] / (height[i] * height[i]);
            System.out.print("Your BMI " + BMI[i]);
            // Conclusion
            if (BMI[i] < 18.5) {
                System.out.println("\nUnderweight");
            } else if (BMI[i] > 18.5 && BMI[i] < 24.9) {
                System.out.print("\nNormal");
            } else if (BMI[i] > 25.0 && BMI[i] < 29.9) {
                System.out.print("\nOverweight");
            } else if (BMI[i] > 29.9) {
                System.out.print("\nObese");
            }
        }

     // Task 20
        System.out.println("Array of BMI");
        for (int j = 0; j < BMI.length; j++) {
        System.out.println(BMI[j]);
    }
    // Task 20.1
    float min = BMI[0];
        for (int k = 0; k < BMI.length; k++){
        if (BMI[k] < min)
            min = BMI[k];
    }
        System.out.println("Smallest BMI in given array: " + min);
    // Task 20.2
    float max = BMI[0];
        for (int z = 0; z < BMI.length; z++){
        if (BMI[z] > max)
            max = BMI[z];
    }
        System.out.println("Biggest BMI in given array: " + max);
    // Task 20.3
    float avg = (BMI[0]+BMI[1]+BMI[2])/3;
        System.out.println("Average BMI in given array: " + avg);
    // Task 20.4
        Arrays.sort(BMI);
        System.out.println("Median BMI in given array: " + BMI[1]);
    }
}