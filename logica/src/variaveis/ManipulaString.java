package variaveis;

public class ManipulaString {
	public static void main(String[] args) {
		
		/*
		 * churros => vari?vel
		 * churros() => fun??o
		 * Abc.churros() => m?todo
		 * Churros => classe
		 */
		
		String email = "AlvomCOMBR@hotmail.COM";
		System.out.println("Original: " + email);
		System.out.println("Min?sculo: " + email.toLowerCase());
		System.out.println("Mai?sculo: " + email.toUpperCase());
		System.out.println("Qtde caracteres: " + email.length());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posi??o do arroba: " + email.indexOf("@"));
		System.out.println("Do 3? at? o 5? " + email.substring(2,5));
		System.out.println("Primeita metade com arroba " + email.substring(0, email.length()/2)); // com @
		System.out.println("Primeita metade sem arroba " + email.substring(0, email.indexOf("@")).toLowerCase()); // sem @
		System.out.println("Segunda metade " + email.substring(email.indexOf("@")+1).toLowerCase());
		System.out.println("Primeiro caracter: " + email.charAt(0));
		System.out.println("A"=="B"); //errado
		System.out.println("? igual? " + email.equals("AlvomCOMBR@hotmail.COM"));
	    		
	}

}
