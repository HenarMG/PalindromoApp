package mainApp;

public class AppMethods {

	public static int esPalin (String palabra) {

		palabra=palabra.toLowerCase();
		int inicio =0;
		int fin = palabra.length() -1;
		
		if (palabra == null || palabra.isEmpty()) {
			return -1; 
			//there is no word
		} else {
 
		while (inicio < fin) {
			
				if (palabra.charAt(inicio)!=palabra.charAt(fin)) {
				return 0; 
				//no palindrome
			} 
			inicio ++;
			fin--;
		}
		return 1; 
		//is palindrome
		}
	}
}

