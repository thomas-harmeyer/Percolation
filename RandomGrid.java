import java.util.Random;
import java.util.Scanner;

public class RandomGrid {
	private int[][] field;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		double chance = input.nextDouble();
		RandomGrid randomGrid = new RandomGrid(length,chance);
		System.out.print(randomGrid.toString());
	}

	public RandomGrid(int n, double p) {
		Random ran = new Random();
		this.field = new int[n][n];
		for (int x = 0; x < field.length; x++) {
			for (int y = 0; y < field.length; y++) {
				if (ran.nextDouble() <= p) {
					field[x][y] = 1;
				}
			}
		}
		/*
		 * int [] field0= {1,0,0}; int [] field1= {0,1,0}; int [] field2= {0,1,0};
		 * field[0]=field0; field[1]=field1; field[2]=field2;
		 */
		Percolate Percolate = new Percolate(field);
		Percolate.getGrid();
	}

	public int getValue(int row, int col) {
		return field[row][col];
	}

	public void setValue(int row, int col, int value) {
		field[row][col] = value;
	}

	public int getSize() {
		return field.length;
	}

	public String toString() {
		String toString="";
		for (int y = 0; y < field.length; y++) {
			for (int x = 0; x < field.length; x++) {
				if (field[x][y] == 1) {
					toString+="X ";
				}
				if (field[x][y] == 0) {
					toString+=" ";
				}
				if (field[x][y] == 2) {
					toString+="* ";
				}
			}
			toString+="\n";
		}
		return toString;
	}

}