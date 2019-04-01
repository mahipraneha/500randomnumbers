package exam;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class NthValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random num=new Random();
		Set<Integer> random500=new TreeSet<Integer>();
		
		
		while(random500.size()!=500){
			int a=num.nextInt(900)+100;
			random500.add(a);
		}	
		
		
		System.out.println(random500);
		System.out.println(random500.size());
		
		System.out.println("the smallest number: ----------");
		
		Scanner userInput=new Scanner(System.in);
		int userValue=userInput.nextInt();
		
		Object[] randomNumbersArray=random500.toArray();
		
		System.out.println(randomNumbersArray[userValue-1]);
		
		
	
	}

}
