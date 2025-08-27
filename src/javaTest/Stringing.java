package javaTest;

import java.util.Scanner;

public class Stringing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// String array print check 
		Integer in[] = new Integer[5];
		Scanner sc2 = new Scanner(System.in);
		for(int i =0;i<=4;i++)
		{
			in[i]=sc2.nextInt();
		}
		for(Integer inn :in)
		{
			System.out.println(inn);
		}
		  String s1[] = new String[5];
		  s1[0] = "harsh1"; 
		  s1[1] = "harsh2";
          s1[2] = "harsh3";
		  s1[3] = "harsh4"; 
		  s1[4] = "harsh5";
		  System.out.println("The Prin comesout to be :"+"\n"
		  +s1[0]+"\n"+s1[1]+"\n"+s1[2]+"\n"+s1[3]+"\n"+s1[4]+"\n");
		 
		
		
		  String s2[] = new String[5]; 
		  System.out.println("Enter the String values");
	  Scanner sc = new Scanner(System.in);
	  for(int i =0;i<=4;i++)
		  { 
			  s2[i] = sc.nextLine(); 
			  } 
		  for(String s3 : s2)
		  { 
		  System.out.println(s3); 
	      }
		 
	
		  
		  String s4[] = {"Ram","raj","ramesh","jhg","jhg"};
		  for(int i =0;i<=4;i++)
		  {
			  System.out.println(s4[i]) ;
		  }
		 

          }}
