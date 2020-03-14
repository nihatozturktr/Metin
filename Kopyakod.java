package repl_it;

import java.util.Scanner;

public class Kopyakod {

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//        System.out.println("Split:");
//        String splitOrNot = scan.next();
//        System.out.println("Number of people:");
//        int numberOfPeople = scan.nextInt();
//        System.out.println("Check amount:");
//        double checkAmount = scan.nextDouble();
//        System.out.println("Service Quality:");
//        String serviceQuality = scan.next();
//        scan.close();
//        Main a = new Main();
//        a.tipCalculater("Yes", 4, 476.0, "excellent");
//    }
    public void tipCalculater(String splitOrNot, int numberOfPeople, double checkAmount, String serviceQuality) {
        if (splitOrNot.equalsIgnoreCase("Yes")) {
            serviceQuality.toLowerCase();
            switch (serviceQuality) {
            case "poor":
                System.out.println("Number of people entered: " + numberOfPeople);
                System.out.println("Total to pay " +( checkAmount + checkAmount * 0.5));
                System.out.println("Total tip: " + checkAmount * 0.5);
                System.out.println("Total per person: " + (checkAmount + checkAmount * 0.5 )/ numberOfPeople);
                System.out.println("Tip per person: " + checkAmount * 0.5 / numberOfPeople);
                break;
            case "fair":
                System.out.println("Number of people entered: " + numberOfPeople);
                System.out.println("Total to pay " +( checkAmount + checkAmount * 0.10));
                System.out.println("Total tip: " + checkAmount * 0.10);
                System.out.println("Total per person: " +( checkAmount + checkAmount * 0.10) / numberOfPeople);
                System.out.println("Tip per person: " + checkAmount * 0.10 / numberOfPeople);
                break;
            case "good":
                System.out.println("Number of people entered: " + numberOfPeople);
                System.out.println("Total to pay " + (checkAmount + checkAmount * 0.15));
                System.out.println("Total tip: " + checkAmount * 0.15);
                System.out.println("Total per person: " +( checkAmount + checkAmount * 0.15 / numberOfPeople));
                System.out.println("Tip per person: " + checkAmount * 0.15 / numberOfPeople);
                break;
            case "great":
                System.out.println("Number of people entered: " + numberOfPeople);
                System.out.println("Total to pay " + (checkAmount + checkAmount * 0.20));
                System.out.println("Total tip: " + checkAmount * 0.20);
                System.out.println("Total per person: " +( checkAmount + checkAmount * 0.20) / numberOfPeople);
                System.out.println("Tip per person: " + checkAmount * 0.20 / numberOfPeople);
                break;
            case "excellent":
                System.out.println("Number of people entered: " + numberOfPeople);
                System.out.println("Total to pay " + (checkAmount + checkAmount * 0.25));
                System.out.println("Total tip: " + checkAmount * 0.25);
                System.out.println("Total per person: " + (checkAmount + checkAmount * 0.25 )/ numberOfPeople);
                System.out.println("Tip per person: " + checkAmount * 0.25 / numberOfPeople);
                break;
            default:
                break;
            }
        } else {
            System.out.println("Number of people entered: " + numberOfPeople);
            System.out.println("Total to pay " + checkAmount + checkAmount * 0.25);
        }

		}
	}

