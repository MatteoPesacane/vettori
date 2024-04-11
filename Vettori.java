
public class Vettori {

	public static void main(String[] args) {
		
		int[] numeri = { 1, 5, 4, 7, 8, 6, 9, 8};
		int i;
		int somma = 0;
		
		//stampo l'array grazie ad un for
		for(i = 0;  i < numeri.length;  i++) {
			somma = somma + numeri[i];
			System.out.print(numeri[i] + " ");
		}
		System.out.println(); //serve per mandare a capo
		System.out.println(somma + " Questa è la somma dei numeri nell'array");
		
		System.out.println(somma / numeri.length + " Media dei numeri presenti nell'array");  
	}

}
