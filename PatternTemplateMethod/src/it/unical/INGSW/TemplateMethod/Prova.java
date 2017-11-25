package it.unical.INGSW.TemplateMethod;

public class Prova {
	
	
	public static void main(String[] args) {
		
		
		AbstractClass prova = new TreColorabilita(0, 2);
		
		
		System.out.println(prova.TemplateMethod_Solve());
	}
	

}
