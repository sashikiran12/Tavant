package day5;

public class Factorial {
	public int calculateFactorial(int number) {
		int fact =1;
		for(int i = number;i>0;i--) {
			fact*=i;
		}
		return fact;
	}
}
