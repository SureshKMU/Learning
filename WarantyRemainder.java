import java.util.Scanner;
import java.io.*;
import java.time.*;
public class WarantyRemainder {
	public static void main(String[] args) {
		System.out.println("Press 1 to insert & 2 to retrive");
		Scanner input=new Scanner(System.in);
		int in1=input.nextInt();
		if(in1==1) {
			System.out.println("Enter ur name:");
			Scanner input1=new Scanner(System.in);
			String name=input1.nextLine();
			System.out.println(name);
			System.out.println("Enter the purchase date in the format of yyyy-mm-dd:");
			String date=input1.nextLine();
			LocalDate newdate=LocalDate.parse(date);
			System.out.println("Enter the waranty in months:");
			int waranty=input1.nextInt();
			LocalDate Expiry=newdate.plusMonths(waranty);
			System.out.println("Your Waranty Expires on: " +Expiry);
			System.out.println("Name:"+name+","+"Purchase Date:"+date+","+"Expiry Date:"+Expiry);
			String path="C:\\Users\\kisho\\OneDrive\\Desktop\\File\\";
			String completePath=path+name+".txt";
			System.out.println(completePath);
			try {
				File newfile=new File(completePath);
				boolean exist=newfile.exists();
				if(exist==false) {
					newfile.createNewFile();
					FileWriter writer=new FileWriter(newfile);
					writer.write("Name:"+name+","+"Purchase Date:"+date+","+"Expiry Date:"+Expiry);
					writer.flush();
					writer.close();	
				}
				else {
					FileWriter writer =new FileWriter(newfile,true);
					writer.append("\n"+"Name:"+name+","+"Purchase Date:"+date+","+"Expiry Date:"+Expiry);
					writer.flush();
					writer.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		else {
			System.out.println("Enter ur name:");
			Scanner input2=new Scanner(System.in);
			String name=input2.nextLine();
			String path="C:\\Users\\kisho\\OneDrive\\Desktop\\File\\";
			String completePath=path+name+".txt";
			File readfile=new File(completePath);
			try {
				Scanner reader=new Scanner(readfile);
				while(reader.hasNextLine()) {
					String content=reader.nextLine();
					System.out.println(content);
				}
				reader.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
