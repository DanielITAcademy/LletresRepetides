/* FASE 2
●	Canvia la taula per una llista (List<Character>)
●	Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
●	Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’. */


package letrasrepetidas;
import java.util.*;

public class LevelTwo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Character> name=new ArrayList<Character>();
		name.add('D');
		name.add('a');
		name.add('n');
		name.add('i');
		name.add('e');
		name.add('l');
		
		System.out.println(name);
		
		char [] vowel = {'a','e','i','o','u'};
		char [] numbers = {'0','1','2','3','4','5','6','7','8','9'};
		boolean isANumber=false;
		boolean isAVowel= false;

		for (int i = 0; i < name.size(); i++) {
			
			//System.out.println(name.get(i));
			
			for(int j=0; j < numbers.length; j++) {
				
				
				if (numbers[j]==name.get(i)) {
					
					System.out.println("Names of person does not  have numbers!!");
					isANumber=true;
				}		
			}
			
			
			if (isANumber == false) {
				for(int k=0; k < vowel.length; k++) {
					if (vowel[k]==Character.toLowerCase(name.get(i))) {
						
						System.out.println("This is a vowel");
						isAVowel=true;
						
					}
					
				}
				
				if (!isAVowel) {   // if (isAVowel == false)
					System.out.println("This is a consonant");
				}
			}
			
		
			
			isAVowel=false;
			isANumber=false;
		
		}

				
	
	}
}
		



