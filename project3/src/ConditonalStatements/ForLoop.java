package ConditonalStatements;

import java.util.Scanner;

//Find the Biggest and the biggest number from the user?
public class ForLoop {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
   int temp;
	int [] a= new int[4];
	System.out.println("Enter 4 numbers");
    for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
			}
    
     for(int j=0; j<a.length; j++) {
    	for(int k=j+1; k<a.length; k++) {
    		 if(a[j]>a[k]) {
    			 temp=a[j];
    			 a[j]=a[k];
    			 a[k]=temp;
    			
    		 }
    	
    	}
     }
     System.out.println("Bigggest number is: "+a[a.length-1]);
	}

}
