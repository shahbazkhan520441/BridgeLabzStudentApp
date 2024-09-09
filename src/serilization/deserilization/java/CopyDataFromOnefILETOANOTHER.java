package serilization.deserilization.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyDataFromOnefILETOANOTHER {
	
	public static void main(String[] args) throws IOException {
		Scanner sdc=new Scanner(System.in);
		System.err.println("enter the soucre from the file should be copyed ");
		String file1=sdc.nextLine();
		System.out.println("enter the destination of file where it sould be copyed ");
		String file2=sdc.nextLine();
		FileInputStream fis=new FileInputStream("src/"+file1);
		FileOutputStream fot=new FileOutputStream("src/"+file2);
		
		int data;
		
		while((data=fis.read())!=-1) {
			
			fot.write(data);
			
		}
		fis.close();
		fot.flush();
		fot.close();
		System.out.println("data copied succesfully");
	}

}
