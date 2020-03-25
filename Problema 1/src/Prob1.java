/* Sa se implementeze o functie care primeste ca paremetru tipul de drum pe care se afla: 
 * Zona Rezidentiala - 30; Oras - 50; Drum Express - 100; Autostrada - 130. Daca parametrul nu este cunoscut - 0.
 * Fucntia se va testa intr-un program de tip main pentru a verifica ca toate cazurile sunt implementate corect. Rezultatul 
 * pentru fiecare apelare se va afisa in consola.
 * Se va implementa functia in 3 formate diferite: if else; if () {} else{ if () {}}; switch)
 */

public class Prob1 {

	public static void main(String[] args) {
		System.out.println("Caz If/Else simplu: ");
		
		System.out.println( getMaxSpeedByIfElse("Zona rezidentiala"));
		System.out.println( getMaxSpeedByIfElse("Oras"));
		System.out.println( getMaxSpeedByIfElse("Drum Express"));
		System.out.println( getMaxSpeedByIfElse("Autostrada"));
		System.out.println( getMaxSpeedByIfElse("Drum National"));
		
		System.out.println("Caz If/Else complicat: ");
		
		System.out.println( getMaxSpeedByIfElseComplex("Zona rezidentiala"));
		System.out.println( getMaxSpeedByIfElseComplex("Oras"));
		System.out.println( getMaxSpeedByIfElseComplex("Drum Express"));
		System.out.println( getMaxSpeedByIfElseComplex("Autostrada"));
		System.out.println( getMaxSpeedByIfElse("Drum National"));
		
		System.out.println("Cas switch: ");
		
		System.out.println( getMaxSpeedBySwitch("Zona rezidentiala"));
		System.out.println( getMaxSpeedBySwitch("Oras"));
		System.out.println( getMaxSpeedBySwitch("Drum Express"));
		System.out.println( getMaxSpeedBySwitch("Autostrada"));
		System.out.println( getMaxSpeedByIfElse("Drum National"));
	}

	public static int getMaxSpeedByIfElse(String roadType) {
		if (roadType == "Zona rezidentiala") {
			return 30;
			
		}else if(roadType == "Oras") {
			return 50;
			
		}else if (roadType == "Drum Express") {
			return 100;
			
		}else if (roadType == "Autostrada") {
			return 130;
			
		}else 
			return 0; 
	}
	
	public static int getMaxSpeedByIfElseComplex(String roadType) { 
		if (roadType == "Zona rezidentiala") {
			return 30;
			
		}else {
			if(roadType == "Oras") {
				return 50;
				
			}else {
				if(roadType == "Drum Express") {
					return 100;
					
			}else {
				if(roadType == "Autostrada") {
					return 130;
					
				}else 
					return 0;
						
					}
				}
			}
		}

	public static int getMaxSpeedBySwitch(String roadType) {
		

		switch (roadType) {
		case "Zona rezidentiala":
			return 30;		
		case "Oras": 
			return 50;
		case "Drum Express": 
			return 100;
		case "Autostrada": 
			return 130;
		default:
			return 0;
			
		}
		
		
	}
	
}