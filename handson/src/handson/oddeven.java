package handson;

import java.util.Arrays;
import java.util.Scanner;
public class oddeven{

		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter size of array");
			int n=sc.nextInt();
			
			int[] mainarr=new int[n];
			System.out.println("enter elements");
			
			for(int i=0;i<n;i++) {
				
				mainarr[i]=sc.nextInt();
			}
		oddeven obj=new oddeven();
			obj.evenodd(mainarr,n);
			
		}
		
		
		
		public void evenodd(int[] mainarr,int n ) {
			System.out.println("startss");
			
			int j=0;
			int k=0;
			int count1=0;
			int count2=0;
			for(int i=0;i<n;i++) {
				if(mainarr[i]%2==0) {
					count1++;
						
					}
				else {
					count2++;
					
				}
			}
			int[] oddarr=new int[count2];
			int[] evenarr=new int[count1];
			for(int t=0;t<n;t++) {
				if(mainarr[t]%2==0) {
						 evenarr[j]=mainarr[t];
						j++;
					}
				else {
					oddarr[k]=mainarr[t];
					k++;
					
				}
			}
			System.out.println("even array:");
			for(int m=0;m<evenarr.length;m++) {
				System.out.print(evenarr[m]+" ");	
			}
			System.out.println("");
			System.out.println("odd array:");
			for(int m=0;m<oddarr.length;m++) {
				System.out.print(oddarr[m]+" ");	
			}
			//to new array put even then append odd
			int[] mergearr=new int[n];
			//if(newarr.length<=n && newarr.length>=oddarr.length && newarr.length>=evenarr.length) {
			
			
			
			for(int p=0;p<mergearr.length;p++) {
			
			}
				
			}
		}
		
	}
	
////////////////////////////////////
	package testques;

	import java.util.Scanner;

	public class Arrayques {

		public static void calculate() {
		  
		 Scanner sc = new Scanner(System.in); 
		 int[] a = new int[10];

		 System.out.println("Enter the array elements : "); 
		 for (int i = 0; i <a.length; i++) 
		 { a[i] = sc.nextInt(); } 
		 int j=0,k=0; 
		 int[] even =new int[10];
		 int[] odd =new int[10]; 
		 for (int i = 0; i < a.length; i++) 
		 { 
			 if(a[i]%2==0) 
			 {
			 even[j]=a[i]; 
			 j++; } 
		 else { odd[k]=a[i]; k++; } }
		System.out.println("Even Array Elements : "); for(int i=0;i<j;i++) {
		 System.out.println(even[i]); } System.out.println("Odd Array Elements : ");
		 for(int i=0;i<k;i++) { System.out.println(odd[i]); } int pos=a.length; int
		 d[]=new int[pos]; System.out.println("Merged Array");
		 
		 for(int i=0;i<j;i++) { d[i]=even[i]; } int m=j; int p=0; for(int
		 i=m;i<a.length;i++) { p=i-j; d[i]=odd[p];
		 
		 }
		 
		 for(int i=0;i<d.length;i++) { System.out.print(d[i]); System.out.print(" ");
		 
		 }
		 
		 
		 }