package myPack;

import java.util.Scanner;

public class Email {
public static boolean timer() {
	for(int i=0; i<=5; i++) {
		try {
			System.out.println("Creating account please wait...");
		Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	return true;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username="";
		
		System.out.println("Enter your first name");
		String firstname = sc.next();
		if (firstname.isEmpty()) {
			System.out.println("Names cannot be empty");
		} else {
			System.out.println("Enter your last name");
			String lastname = sc.next();

			if (lastname.isEmpty()) {
				System.out.println("Names cannot be empty");
			} else {
				System.out.println("Enter your username");
				 username = sc.next();

				if (username.isEmpty()) {
					System.out.println("Username cannot be empty");
				} else {
					System.out.println("Enter your password");
					int password = sc.nextInt();
					System.out.println("Enter your password to conform");
					int conformpassword = sc.nextInt();
					if (password == conformpassword) {
						timer();
						System.out.println("Account created successfully");
						System.out.println(username+"@gmail.com");
					}
					else {
						System.out.println("Password not matched or invalid");
					}
				}
			}
		}
		
	}

}
