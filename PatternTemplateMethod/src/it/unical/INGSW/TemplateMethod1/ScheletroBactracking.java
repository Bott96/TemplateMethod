package it.unical.INGSW.TemplateMethod1;

public abstract class ScheletroBactracking {

	public final int MIN, MAX;

	public ScheletroBactracking(int _min, int _max) {
		MIN = _min;
		MAX = _max;

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
				removeSolution();

			}
			x++;

		}
		return false;

	}

	abstract boolean canAdd(int x);

	abstract boolean isComplete();

	abstract void addSolution(int x);

	abstract void removeSolution();
}
