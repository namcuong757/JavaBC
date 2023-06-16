package coreJava3;
import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String info[] = new String[4];
		int subject[] = new int[6];
		String sub[] = {"Java", "python","web", "c", "cpp", "springBoot"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scanner.nextLine();
		System.out.println("Enter your studentID:");
		String id = scanner.nextLine();
		System.out.println("Enter your major:");
		String major = scanner.nextLine();
		System.out.println("Enter your current sem:");
		String sem = scanner.nextLine();
		info[0] = name;
		info[1] = id;
		info[2] = major;
		info[3] = sem;
		System.out.println("Enter your Java score:");
		int java = scanner.nextInt();
		System.out.println("Enter your python score:");
		int python = scanner.nextInt();
		System.out.println("Enter your web score:");
		int web = scanner.nextInt();
		System.out.println("Enter your c score:");
		int c = scanner.nextInt();
		System.out.println("Enter your cpp score:");
		int cpp = scanner.nextInt();
		System.out.println("Enter your springBoot score:");
		int springBoot = scanner.nextInt();
		subject[0] = java;
		subject[1] = python;
		subject[2] = web;
		subject[3] = c;
		subject[4] = cpp;
		subject[5] = springBoot;
		
		int total_grade = 0;
		for(int i = 0; i < 6; i++)
		{
			total_grade += subject[i];
		}
		int average = 0;
		average = total_grade / 6;
		String grade_letter = "";
		if(average >= 90) grade_letter = "A++";
		else if(average >=80) grade_letter = "A+";
		else if(average >=70) grade_letter = "B++";
		else if(average >=60) grade_letter = "B+";
		else if(average >=50) grade_letter = "C";
		else if(average < 50) grade_letter = "E";
		
		System.out.println("=======================================");
		System.out.println("-------Report Card-------");
		for(int i = 0; i < 4; i++)
		{
			System.out.print(info[i] + "\t");
		}
		System.out.println("\n=======================================");
		for(int i = 0; i < 6; i++)
		{
			System.out.println(sub[i] + "\t\t" + subject[i]);
		}
		System.out.println("=======================================");
		System.out.println("Total: " + total_grade + "\tAverage: " + average + "\tGrade: " + grade_letter);
	}	

}
