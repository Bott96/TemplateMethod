package it.unical.INGSW.TemplateMethod;

import java.util.ArrayList;

public class TreColorabilita extends AbstractClass {

	Graph mioGrafo;

	public TreColorabilita(int minRangeSolution, int maxRangeSolution) {
		super(minRangeSolution, maxRangeSolution);

		mioGrafo = new Graph(10);

		this.sol = new ArrayList<Integer>();

	}

	@Override
	boolean canAdd(int x) {

		int size = sol.size();

		for (int i = 1; i <= mioGrafo.getN(); i++) {
			size++;
			if (size < mioGrafo.getN() && mioGrafo.isConnected(i, size) && (sol.get(i) == x))
				return false;
		}
		return true;

	}

	@Override
	boolean isComplete() {
		return sol.size() == mioGrafo.getN();
	}

	@Override
	void addSolution(int x) {

		sol.add(x);

	}

	@Override
	void removeSolution() {
		sol.remove(sol.size() - 1);

	}

}
