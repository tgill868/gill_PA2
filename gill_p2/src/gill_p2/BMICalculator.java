package gill_p2;
import java.util.Scanner;

public class BMICalculator {

	int weight;
	int height;
	int BMI;
	String units;
	String bmiCat;



			public void readUserData() {
			readMeasurementData();
			}
			
			private void readMeasurementData() {
			readUnitType();
			}
			
			private void readUnitType() {
				Scanner readUser1 = new Scanner(System.in);
				System.out.println("Enter units: ");
				units= readUser1.nextLine();
				if(units.equals("Imperial")) {
					readImperialData();
				}
				else if(units.equals("Metric")) {
					readMetricData();
				}else {
					readUnitType();
				}
				}
				
			
			
			private void readMetricData() {
				Scanner readUser2 = new Scanner(System.in);
				System.out.println("Enter weight (kg): ");
				weight= readUser2.nextInt();
				System.out.println("Enter height (meters^2): ");
				height= readUser2.nextInt();
				setWeight();
				setHeight();
			}
			
			private void readImperialData() {
				Scanner readUser3 = new Scanner(System.in);
				System.out.println("Enter weight (lbs): ");
				weight= readUser3.nextInt();
				System.out.println("Enter height (inches): ");
				height= readUser3.nextInt();
			}
			
			public void calculateBmi() {
				if (units.equals("Imperial")) {
					BMI= (703*weight)/(height*height);
				}
				
				if (units.equals("Metric")) {
					BMI= weight/(height*height);
				}
				calculateBmiCategory(BMI);
			
			}
				
				private  String calculateBmiCategory(int BMI) {
					if (BMI<=18.5){
						bmiCat="Underweight";
						}
					if (BMI<=24.9 && BMI>18.5) {
						bmiCat="Normal weight";
					}
					if (BMI<=29.9 && BMI>25) {
						bmiCat="Overweight";
					}
					if (BMI>30) {
						bmiCat="Obese";
					}
					return bmiCat;
			}
			
			public void displayBmi(){
				System.out.printf("Your BMI= %d and your classification is %s",BMI,bmiCat);
			}
			public void getWeight(int weight) {
				this.weight=weight;
			}
			private int setWeight() {
				return this.weight;
			}
			public void getHeight(int height) {
				this.height=height;
			}
			private int setHeight() {
				return this.height;
			}
			public void getBmi() {
				this.BMI=BMI;
			}
			public void getUnits(String units) {
				this.units=units;
				setUnits();
			}
			private String setUnits() {
				return this.units;
			}
			
	}

