import java.util.Scanner; //to use scanners
import java.lang.Math; //to do math

class Main {
  //method that displays the BMI categort chart 
  static void displayBMIChart(){
    System.out.println("BMI Categories:");
    System.out.println("Underweight = <18.5");
    System.out.println("Normal weight = 18.5–24.9");
    System.out.println("Overweight = 25.0–29.9");
    System.out.println("Obesity = BMI of 30.0 or greater");
  }
  
  //main method
  public static void main(String[] args) {
    //define scanner
    Scanner sc = new Scanner(System.in);
    //prompted to enter height in inches
    System.out.print("Please enter your height in inches: ");
    double height = sc.nextDouble(); //reads height in inches
    //input validation for height, quits if height is less than or equal to 0
    if(height <= 0){
      System.out.println("Invalid Height");
      System.out.println("Quitting");
    }
    else{
      System.out.print("Please enter your weight in pounds: "); //user enters in weight(lbs)
      double weight = sc.nextDouble(); //read weight in pounds
      //input validation for weight, quits if weight is less or equal to 0
      if(weight <= 0){
        System.out.println("Invalid Weight");
        System.out.println("Quitting");
      }
      else{ //if passed both input validations
        System.out.println();
        //calculating the BMI using formula (weight / height^2)*703
        double result = (weight / (Math.pow(height, 2))) * 703;
        System.out.print("Your BMI is ");
        //formats output to one decimal point
        System.out.println(String.format("%.1f", result)); 
        System.out.println(); //line for formatting
        //calls the displayBMIChart
        displayBMIChart();
        System.out.println();
        //outputs the category based on user's BMI
        if(result < 18.5){ //underweight
          System.out.println("Based on your Body Mass Index, you are underweight.");
        }
        else if(result <= 18.5 || result <= 24.9){ //normal weight
          System.out.println("Based on your Body Mass Index, you are normal Weight.");
        }
        else if(result <= 25.0 || result <= 29.9){ //overweight
          System.out.println("Based on your Body Mass Index, you are overweight.");
        }
        else{ //obese
          System.out.println("Based on your Body Mass Index, you are obese.");
        }
      }
    }
  }
}
