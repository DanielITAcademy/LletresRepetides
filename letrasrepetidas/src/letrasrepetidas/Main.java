/* -------------REPEAT LETTERS-----------
Exercici:
L’exercici consisteix en mostrar per consola quantes vegades apareix cada lletra del teu nom i cognoms amb diferents variants (fases).
STAGE 1
●	Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra.
●	Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres.

 */

package letrasrepetidas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*char [] name=new char[6];
		name[0]= 'd';
		name[1]= 'a';
		name[2]= 'n';
		name[3]= 'i';
		name[4]= 'e';
		name[5]= 'l';*/
		//System.out.println("One position is one letter" + name[2]);
		char [] name = {'d','a','n','i','e','l'};
		for(int i=0; i<name.length ; i++) {
		
			System.out.println(name[i]);
		
	}

}
}
