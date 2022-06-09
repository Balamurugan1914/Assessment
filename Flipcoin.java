package Assesment;
import java.util.*;
public class Flipcoin {
	
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("flip ur coin");
		
		 int coin = sc.nextInt();
		 for(int i=0;i<coin;i++) {
		if(Math.random()>0.5) {
			System.out.println("heads");
		}else {
			System.out.println("tails");
		}
		
		
	}

	
	}
}
