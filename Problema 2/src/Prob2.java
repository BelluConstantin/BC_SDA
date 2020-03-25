/* Se da un sir de valori reale care cuprind temperaturile mai multor pacienti. Se vrea impartirea temperaturilor in doua colectii (normale si anormale).
 * Una cu temperaturi mai mici de 37.0 si altele mai mari de 37.
 * Sa se printeze in consola cele doua siruri rezultate
 * Bonus: in sirul afisat final, afisati "id - temperatura"
 * ID-ul este reprezentat de indexul din sir-ul initial
 */
public class Prob2 {

	public static void main(String[] args) {
		double[] Temperaturi = {36.6, 37.1, 37.4, 37, 36.9, 38};
		for (int i = 0; i< Temperaturi.length; i++) {
			if( Temperaturi[i] >= 37)
				System.out.println(i + " - Temperatura normala");
			else 
				System.out.println(i + " - Temperatura anormala");
		}
	}

}
