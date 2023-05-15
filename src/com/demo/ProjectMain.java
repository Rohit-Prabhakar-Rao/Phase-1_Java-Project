package com.demo;
import java.io.IOException;
import java.util.Scanner;

public class ProjectMain {
	
		public static void main(String[] args) throws IOException {
			Scanner sc = new Scanner(System.in);
			FileOperations fop = new FileOperations();
			
			while(true) {
				System.out.println("1.Retrieving all file names in an ascending order\n2.Business-level operations\n3.Exit from the application");
				System.out.println();
				System.out.println("Enter Your Choice : ");
				int choice1 = sc.nextInt();
				System.out.println();
				
				switch(choice1) {
					case 1:{
						fop.viewAllFiles();
						break;
					}
					case 2:{
						System.out.println("1.add a file to the application\n2.delete a file from the application\n3.Search file from the application\n4.Exit");
						System.out.println();
						System.out.println("Enter your choice : ");
						int choice2 = sc.nextInt();
						sc.nextLine();
						switch(choice2) {
							case 1:{
								System.out.println("Enter File Name: ");
								String fileName = sc.next();
								sc.nextLine();
								System.out.println("Enter content of file: ");
								String content = sc.nextLine();
								fop.addNewFile(fileName, content);
								break;
							}
							case 2:{
								System.out.println("Enter the file name to delete: ");
								String fname = sc.next();
								fop.deleteFile(fname);
								break;
							}
							case 3:{
								System.out.println("Enter File Name to search: ");
								String fname = sc.next();
								fop.searchFile(fname);
								break;
							}
							case 4:break;
							default:System.out.println("Invalid Choice!!!");
						}
						break;
					}
					case 3:{
						System.out.println("\nThank you for using the Application!");
						System.exit(0);
					}
					default:System.out.println("Please Enter Correct Choice\n");
					break;
				}
			}	
		}
}
