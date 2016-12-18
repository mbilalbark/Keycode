package keykod;

import java.util.Scanner;
import java.util.Random;
public class Eight_Notation {
   public static void main(String[] args){
	
	   
	    String[] alphabet={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","R","S","T","U","V","Y","Z","W","Q","X"};
	    Random r=new Random(); //random sýnýfý
	    int rand=0;
	    String []  key = new String[8];
	    int totalKey=0;
	    int Indis=0;
	    int i=0;
	    Scanner input = new Scanner(System.in);
		int number;
		System.out.println("How many keys do you want ? ");
		number=input.nextInt();
	    while(totalKey<number){
	    	   
	          while(Indis<8)
	          {
	        	 rand =r.nextInt(26);
	        	 key[Indis]=alphabet[rand];
	        	 Indis++;
	          }
	          System.out.printf("Key ");
	          while(i<8)
	          {
	        	  
	        	  System.out.printf(""+key[i]);
	        	  i++;
	          }
	          System.out.printf("\n");
	         if(Indis==8)
	         {
	        	 Indis=0;
	        	 i=0;
	        	
	         }
	        totalKey++;
	    } totalKey=0;
	    
	 
}}
