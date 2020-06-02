import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Problema_1 add = new Problema_1();
		Problema_2 remove = new Problema_2();
		
		
//Adaugarea in array
		int n = 10;
		int ArrayForAdd[];
		int ArrayForRemove[];


		int arr[] = { 12, 25, 47, 58, 47, 7, 96, 14, 3, 9 };


		System.out.println("Problema 1:\n" + Arrays.toString(arr));

		Scanner console = new Scanner(System.in);
		System.out.println("Intoduce pozitia la care se va adauga numarul: ");
		int pos = console.nextInt();


		int x = 100;

		// Apelul metodei ca sa se adauge x in arr 
		ArrayForAdd = add.addX(n, arr, x, pos);


		System.out
				.println("\nCifra " + x + " a fost adaugata pe pozitia " + pos + ".\n" + Arrays.toString(ArrayForAdd));

		Scanner console2 = new Scanner(System.in);
		System.out.println("\nProblema 2:");
		System.out.println("Intoduceti pozitia care va fi stearsa: ");
		int pos2 = console.nextInt();
		
		
//Stergerea din array
		ArrayForRemove = remove.removeX(n, arr, x, pos2);

		System.out.println("\nNumarul de pe pozitia respectiva a fost sters.\n" + Arrays.toString(ArrayForRemove));

		
//Problema 3	
		Problema_3 search = new Problema_3();
		int sortedArray[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
						  
		System.out.println("----------------------------------");
		Scanner userInput = new Scanner(System.in);
				String input = userInput.nextLine();
		System.out.println("Problema 3:\nArray initial:\n" + Arrays.toString(sortedArray) + "\n");
		
		
		

		//Testarea algoritmului in 8 cazuri
		
		int numberToSearch1 = 2;
		System.out.print(" Caz 1 - Test binary search daca numarul " + numberToSearch1
				+ " este in partea stanga a sirului pe o pozitie para \n");

		boolean resultOfBinarySearch1 = search.binarySearch(sortedArray, numberToSearch1);
		if (resultOfBinarySearch1 == true)
			System.out.printf("Numarul cautat exista in sir\n");
		else
			System.out.printf("Numarul cautat nu exista in sir\n");

		int numberToSearch2 = 3;
		System.out.print(" Caz 2 - Test binary search daca numarul " + numberToSearch2
				+ " este in partea stanga a sirului pe o pozitie impara\n");

		boolean resultOfBinarySearch2 = search.binarySearch(sortedArray, numberToSearch2);
		if (resultOfBinarySearch2 == true)
			System.out.printf("Numarul cautat exista in sir\n");
		else
			System.out.printf("Numarul cautat nu exista in sir\n");

		int numberToSearch3 = 6;
		System.out.print(" Caz 3 - Test binary search daca numarul " + numberToSearch3
				+ " este in partea dreapta a sirului pe o pozitie para\n ");

		boolean resultOfBinarySearch3 = search.binarySearch(sortedArray, numberToSearch3);
		if (resultOfBinarySearch3 == true)
			System.out.printf("Numarul cautat exista in sir\n");
		else
			System.out.printf("Numarul cautat nu exista in sir\n");

		int numberToSearch4 = 7;
		System.out.print(" Caz 4 - Test binary search daca numarul " + numberToSearch4
				+ " este in partea dreapta a sirului pe o pozitie impara\n ");

		boolean resultOfBinarySearch4 = search.binarySearch(sortedArray, numberToSearch4);
		if (resultOfBinarySearch4 == true)
			System.out.printf("Numarul cautat exista in sir\n");
		else
			System.out.printf("Numarul cautat nu exista in sir\n");

		int numberToSearch5 = 5;
		System.out
				.print(" Caz 5 - Test binary search daca numarul " + numberToSearch5 + " este in mijlocul sirului\n ");

		boolean resultOfBinarySearch5 = search.binarySearch(sortedArray, numberToSearch5);
		if (resultOfBinarySearch5 == true)
			System.out.printf("Numarul cautat exista in sir\n");
		else
			System.out.printf("Numarul cautat nu exista in sir\n");

		int numberToSearch6 = 0;
		System.out
				.print(" Caz 6 - Test binary search daca numarul " + numberToSearch6 + " este primul numar din sir\n");

		boolean resultOfBinarySearch6 = search.binarySearch(sortedArray, numberToSearch6);
		if (resultOfBinarySearch6 == true)
			System.out.printf("Numarul cautat exista in sir\n");
		else
			System.out.printf("Numarul cautat nu exista in sir\n");

		int numberToSearch7 = 10;
		System.out.print(
				" Caz 7 - Test binary search daca numarul " + numberToSearch7 + " este ultimul numar din sir\n ");

		boolean resultOfBinarySearch7 = search.binarySearch(sortedArray, numberToSearch7);
		if (resultOfBinarySearch7 == true)
			System.out.printf("Numarul cautat exista in sir\n");
		else
			System.out.printf("Numarul cautat nu exista in sir\n");

		int numberToSearch8 = 16;
		System.out.print(" Caz 8 - Test binary search daca numarul " + numberToSearch8 + " nu exista in sir\n  ");

		boolean resultOfBinarySearch8 = search.binarySearch(sortedArray, numberToSearch8);
		if (resultOfBinarySearch8 == true)
			System.out.printf("Numarul cautat exista in sir\n");
		else
			System.out.printf("Numarul cautat nu exista in sir\n");

	}

}