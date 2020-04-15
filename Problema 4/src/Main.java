import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Scanner tastatura;

	public static void main(String[] args) {

		tastatura = new Scanner(System.in);

		//Parcurgere manuala
		String decizie = null;
		boolean input = true;
		while (input) {
			System.out.println("Doriti parcurgere manuala? D/N ");
			decizie = tastatura.nextLine();

			switch (decizie) {
			case "D":
				input = true;
				boolean InputManual = true;
				while (InputManual)

				{
					List<Shape> shapes = new ArrayList<>();
					System.out.println("Tastati 'P' pentru patrat, 'D' pentru dreptunghi, 'C' pentru cerc");
					decizie = tastatura.nextLine();
					switch (decizie) {
					case "P":
						System.out.println("Ati selectat patrat. \n Introduceti culoarea in HEX:");
						decizie = tastatura.nextLine();
						String culoareP = decizie;

						System.out.println("Ati introdus culoarea: " + culoareP + "\r Introduceti valoarea grosimii: ");
						decizie = tastatura.nextLine();
						int grosimeP = Integer.parseInt(decizie);

						System.out.println(
								"Ati introdus grosimea: " + grosimeP + "\n Introduceti valoarea dimensiunii: ");
						decizie = tastatura.nextLine();
						int dimensiuneP = Integer.parseInt(decizie);

						shapes.add(new Patrat(culoareP, grosimeP, dimensiuneP));
						for (Shape s : shapes) {

							System.out.println("Caracteristicile afisarii manuale: ");
							System.out.println();
							System.out.println("Name - " + s.getName());
							System.out.println("Area - " + s.getArea());
							System.out.println("Border width - " + s.getBorderWidth());
							System.out.println("Fill color- " + s.getHexFillColor());
							System.out.println();
							s.Draw();

						}

						return;

					case "D":
						System.out.println("Ati selectat dreptunghi. \n Introduceti culoarea in HEX:");
						decizie = tastatura.nextLine();
						String culoareD = decizie;

						System.out.println("Ati introdus culoarea: " + culoareD + "\r Introduceti valoarea grosimii: ");
						decizie = tastatura.nextLine();
						int grosimeD = Integer.parseInt(decizie);

						System.out.println("Ati introdus grosimea: " + grosimeD + "\n Introduceti valoarea lungimii: ");
						decizie = tastatura.nextLine();
						int lungimeD = Integer.parseInt(decizie);

						System.out
								.println("Ati introdus lungimea: " + lungimeD + "\n Introduceti valoarea inaltimii: ");
						decizie = tastatura.nextLine();
						int inaltimeD = Integer.parseInt(decizie);

						shapes.add(new Dreptunghi(culoareD, grosimeD, lungimeD, inaltimeD));
						for (Shape s : shapes) {

							System.out.println("Caracteristicile afisarii manuale: ");
							System.out.println();
							System.out.println("Name - " + s.getName());
							System.out.println("Area - " + s.getArea());
							System.out.println("Border width - " + s.getBorderWidth());
							System.out.println("Fill color- " + s.getHexFillColor());
							System.out.println();
							s.Draw();

						}
						return;
					case "C":
						System.out.println("Ati selectat cerc. \n Introduceti culoarea in HEX:");
						decizie = tastatura.nextLine();
						String culoareC = decizie;

						System.out.println("Ati introdus culoarea: " + culoareC + "\r Introduceti valoarea grosimii: ");
						decizie = tastatura.nextLine();
						int grosimeC = Integer.parseInt(decizie);

						System.out.println("Ati introdus grosimea: " + grosimeC + "\n Introduceti valoarea razei: ");
						decizie = tastatura.nextLine();
						int razaC = Integer.parseInt(decizie);

						shapes.add(new Cerc(culoareC, grosimeC, razaC));
						for (Shape s : shapes) {

							System.out.println("Caracteristicile afisarii manuale: ");
							System.out.println();
							System.out.println("Name - " + s.getName());
							System.out.println("Area - " + s.getArea());
							System.out.println("Border width - " + s.getBorderWidth());
							System.out.println("Fill color- " + s.getHexFillColor());
							System.out.println();
							s.Draw();

						}

						return;

					}
				}
				break;
			case "N":
				input = false;

				break;
			default:
				throw new IllegalArgumentException("Unknown answer");
			}

		}
		//Parcurgere automata
		List<Shape> shapes = new ArrayList<>();
		// Patrat - Culoare, Grosime, Dimensiune
		shapes.add(new Patrat("#21241B", 5, 8));
		// Dreptunghi - Culoare, Grosime, Latime, Inaltime
		shapes.add(new Dreptunghi("#f5f6f5", 2, 2, 8));
		// Cerc - Culoare, Grosime, Raza
		shapes.add(new Cerc("#f5f6f5", 2, 7));

		for (Shape s : shapes) {

			System.out.println("\n Ati selectat NU. Se face afisare automata. ");
			System.out.println();
			System.out.println("Caracteristici: ");
			System.out.println();
			System.out.println("Name - " + s.getName());

			System.out.println("Area - " + s.getArea());

			System.out.println("Border width - " + s.getBorderWidth());

			System.out.println("Fill color- " + s.getHexFillColor());
			System.out.println();
			s.Draw();

		}

	}

}