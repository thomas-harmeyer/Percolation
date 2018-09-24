
public class Percolate {
	private boolean change = false;
	private int[][] field;

	public Percolate(int[][] fieldX) {
		field = fieldX;
		for (int i = 0; i < field.length; i++) {
			if (field[i][0] == 0) {
				field[i][0] = 2;
			}
		}
		change = true;
		while (change == true) {
			change = false;
			for (int y = 0; y < field.length; y++) {
				for (int x = 0; x < field.length; x++) {
					if (field[x][y] == 2) {
						if ((y < field.length - 1)) {
							if (field[x][y + 1] == 0) {
								field[x][y + 1] = 2;
								change = true;
							}
						}
						if ((x < field.length - 1)) {
							if (field[x + 1][y] == 0) {
								field[x + 1][y] = 2;
								change = true;
							}
						}
						if ((y > 0)) {
							if (field[x][y - 1] == 0) {
								field[x][y - 1] = 2;
								change = true;
							}
						}
						if ((x > 0)) {
							if (field[x - 1][y] == 0) {
								field[x - 1][y] = 2;
								change = true;
							}
						}
					}
				}
			}
		}
	}

	public int[][] getGrid() {
		return field;
	}
}