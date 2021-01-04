package directory.functions.user;

import java.util.Scanner;
import directory.functions.user.Search;
import java.util.ArrayList;
import directory.data.Person;
import directory.fileIO.*;

public class Edit{
	public static void run(){
		ArrayList<Person> allPeople = Reader.readCsvFile();
		Scanner keyboard = new Scanner(System.in);

		Search.run();

		System.out.println("chose an data to edit:");
		int n = Integer.valueOf(keyboard.nextLine());

		System.out.println("enter new data(name,birthDay,phoneNumber,Email):");
		String data[] = keyboard.nextLine().split(",");
		Person temp = new Person();
		if(temp.setName(data[0]) &&
				temp.setBirthDay(data[1]) &&
				temp.setPhoneNumber(data[2]) && 
				temp.setEMail(data[3])){
			allPeople.set(n, temp);
				}

		Writer.saveCsvFile(allPeople);
	}
}
