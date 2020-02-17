/* Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.

Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la segona. 
És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà fullName.
FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]*/


package letrasrepetidas;

import java.util.ArrayList;
import java.util.List;

public class LevelFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char [] name = {'d','a','n','i','e','l'};
		//char [] surname = {'f','e','r','n','a','n','d','e','z'};
		
		ArrayList <Character> name=new ArrayList<Character>();
		name.add('D');
		name.add('a');
		name.add('n');
		name.add('i');
		name.add('e');
		name.add('l');
		
		ArrayList <Character> surname=new ArrayList<Character>();
		surname.add('f');
		surname.add('e');
		surname.add('r');
		surname.add('n');
		surname.add('a');
		surname.add('n');
		surname.add('d');
		surname.add('e');
		surname.add('z');
		
		List<Character> fullname = new ArrayList<Character>();
		fullname.addAll(name);
		fullname.add(' ');
		fullname.addAll(surname);
		
		System.out.println(fullname);

	}

}
