package it.polito.tdp.extflightdelays.model;

public class TestModel {

	public static void main(String[] args) {
		
		Model model = new Model();
		
		model.creaGrafo(400);
		
		if(model.testConnessione(11, 30))
			System.out.println("Connessione tra 11 e 30 attiva");
		else
			System.out.println("Connessione tra 11 e 30 NON attiva");

		
		System.out.println(model.trovaPercorso(11, 297));

	}

	
	
}
