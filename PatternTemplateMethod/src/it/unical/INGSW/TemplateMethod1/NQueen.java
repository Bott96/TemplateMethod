package it.unical.INGSW.TemplateMethod1;

import java.util.Vector;

class Soluzione {

	public Vector<Integer> valore;
	public int UtlimaValida;

	Soluzione() {
		valore = new Vector<>();
		for (int i = 0; i < NQueen.NQueen; i++) {
			valore.addElement(0);
		}
		UtlimaValida = 0;
	}

}

public class NQueen extends ScheletroBactracking {

	public static int NQueen;
	public static Soluzione sol;

	public NQueen(int _min, int _max) {
		super(_min, _max);
		NQueen = MAX;
		sol = new Soluzione();

	}

	@Override
	boolean canAdd(int x) {

		System.out.println("Entro"+x);

		int cRow = sol.UtlimaValida + 1;
		int cCol = x;

		for (int pRow = 1; pRow < cRow; pRow++) {
			int pCol = sol.valore.get(pRow);

			if (cCol == pCol || 
			(cRow - pRow) == Math.abs(cCol - pCol))
				return false;
		}
		return true;
	}

	@Override
	boolean isComplete() {

		System.out.println(sol.valore);

		return (sol.UtlimaValida == NQueen - 1);
	}

	@Override
	void addSolution(int x) {

			sol.UtlimaValida++;
			sol.valore.set(sol.UtlimaValida, x);
		
	}

	@Override
	void removeSolution(int x) {
		sol.UtlimaValida--;
		x--;
	}

	public static void main(String[] args) {

		ScheletroBactracking nQueen = new NQueen(0, 8);

		if (!nQueen.TemplateMethod_Solve())
			System.out.println(sol.valore);
		else
			System.out.println("non va");

	}

}
