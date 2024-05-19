package myDocument;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		DocumentAll();
	}
	
	private static Application documentApplication;
	private static void DocumentAll()
	{
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Document type: ");
        String documentType = scanner.nextLine().toUpperCase();
		
        
        if (documentType.equals("TEXT")) {
            
        	documentApplication = new textApplication();
        	documentApplication.newDocument();
        } else if (documentType.equals("CSV")) {
        	
        	documentApplication = new csvApplication();
        	documentApplication.newDocument();
        } 
         else {
            System.out.println("Unsupported file type. No matching logic found.");
        }
		
	}
}

