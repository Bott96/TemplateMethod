package it.unical.INGSW.TemplateMethod;

import java.util.List;

public abstract class AbstractClass {

	List<Integer> sol;
	private final int MIN, MAX;

	public AbstractClass(Object data_Structure_For_Result, Object initial_data_Structure, int minRangeSolution,
			int maxRangeSolution) {
		MIN = minRangeSolution;
		MAX = maxRangeSolution;
		// this.sol = data_structure_for_result;

	}

	public AbstractClass(int minRangeSolution, int maxRangeSolution) {
		MIN = minRangeSolution;
		MAX = maxRangeSolution;
	}

	public final boolean TemplateMethod_Solve() {

		int x = MIN;
		while (x < MAX) {
			if (canAdd(x)) {
				addSolution(x);
				if (isComplete())
					return true;
				else if (TemplateMethod_Solve()) {
					return true;
				}

			} else
				x++;

		}
		return false;

	}

	abstract boolean canAdd(int x);

	abstract boolean isComplete();

	abstract void addSolution(int x);

	abstract void removeSolution();

}
