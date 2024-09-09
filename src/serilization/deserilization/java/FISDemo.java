package serilization.deserilization.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FISDemo {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("src/abc.txt");
		FileOutputStream fot=new FileOutputStream("src/sk.txt");
		fot.write(12);
		int data;
//		int data=fis.read();
//		int data1=fis.read();
//		int data2=fis.read();
		while((data=fis.read())!=-1) {
			System.out.println(data);
		}
		fot.flush();
		fot.close();
		System.out.println((char)data);
		fis.close();
		
	}
	
             
}
