// Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen

package letrasrepetidas;

//import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class LevelThree {
	
    public static void main(String... agrs) {
    	HashMap<Character,Integer> nameMap = new HashMap<Character,Integer>();
    	
        List<Character> name = new ArrayList<Character>();
    	name.add('D');
		name.add('a');
		name.add('n');
		name.add('i');
		name.add('l');
		name.add('l');
        Set<Character> letters = new HashSet<Character>(name);
        for (Character key : letters) {
          //  System.out.println(key + " : " + Collections.frequency(name, key));
        	nameMap.put(key,Collections.frequency(name, key));
        }
        System.out.println(nameMap);
    }
	
}

		
	/*static int[]list;
		static boolean numero(int num) {
			for (int i = 0; i < list.length; i++) {
				if(list[i]==num) {
					return false;
				}
			}
			return true;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		string name ="DANIELFERNANDEZ";
		// Create Map
		HashMap<Character,Integer> nameMap = new HashMap<Character,Integer>();
		
		
		(char [] array = {'d','a','n','i','e','l',' ','f','e','r','n','a','n','d','e','z'};
			list=new int[array.length];
		for(int i=0;i<array.length; i++) {
			int count=0;
			for(int j=0;j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;
					if(numero(array[i])) {
						list[i]=array[i];
						
					}
				}
				
			}
		if(list[i] !=0) {
			System.out.println(list[i]+ "it was repeated: " + count);
		}
	}
}
}
	
		
		
		/*
		nameMap.put('d',0);
		nameMap.put('a',1);
		nameMap.put('n',2);
		nameMap.put('i',3);
		nameMap.put('e',4);
		nameMap.put('l',5);
		nameMap.put(' ',6);
		nameMap.put('f',7);
		nameMap.put('e',8);
		nameMap.put('r',9);
		nameMap.put('n',10);
		nameMap.put('a',11);
		nameMap.put('n',12);
		nameMap.put('d',13);
		nameMap.put('e',14);		
		nameMap.put('z',15);
			
	 
			}
			
		char first = nameMap[i];
		
		
		
	3Create List
		ArrayList <Character> name=new ArrayList<Character>();
		name.add('D');
		name.add('a');
		name.add('n');
		name.add('i');
		name.add('e');
		name.add('l');
	
		for(int i=0; i<name.length ; i++) {
	
	
             
        }
	        
	  */       


	

