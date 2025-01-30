// Write a program that inputs two values: weight and height.
// Then it computetes the BMI (Body mass index)
//
// If you're using the English system, the BMI formual is: 
//
//Weight in pounds (lbs) divided by height in inches (in) squared and multiplied by a conversion of 703 (weight (lbs) / [height (in).squared] x 703).
// 
// Therefore, to calculate BMI, take the weight (lbs) and divide it by height (in).
// Take the result of that calculation and divide it by height again. Then, multiply that number by 703. Round to the second decimal place.
//
// As example of calculating body mass index using BMI formula: Weight = 150 lbs,
// height = 5'5" (65 inches)
//
// BMI Calculation [150 / (65).squared] * = 24.96

// Sample: Enter the weight (in pounds) 210 
//         Enter the weight (in inches) 70 
// Your BMI is 30
// Thick Physique
//
// Ex2 weight 100
// Height 60
//  Thin physique
//

import java.text.DecimalFormat;
import java.util.Scanner;

public class BodyMassIndex {
  public static void main(String[] args) {

    int weightInPounds, heightInInches;
    double bodyMassIndex;

    DecimalFormat df = new DecimalFormat(".#");
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter height: ");
    heightInInches = scan.nextInt();

    System.out.print("Enter weight: ");
    weightInPounds = scan.nextInt();

    bodyMassIndex = (weightInPounds / Math.pow(heightInInches, 2)) * 703;
    System.out.println("Your BMI is " + df.format(bodyMassIndex));

    String physiqueType = getPhysiqueType(bodyMassIndex);
    System.out.println("You are " + physiqueType);

  }

  public static String getPhysiqueType(double bmi) {
    if (bmi > 30) {
      return "Obese";
    } else if (bmi >= 25 && bmi <= 29.9)
      return "Overweight";
    else if (bmi <= 24.9 || bmi >= 18.5)
      return "Normal";
    else
      return "Underweight";
  }
}
