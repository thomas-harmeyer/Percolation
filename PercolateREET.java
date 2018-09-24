public class PercolateREET {
	private int[][] field = new int[0][0];
	private int yes=0;
	public PercolateREET(int[][] field) {
		this.field = field;
	}

	public void PercolateHelp() {
		boolean [] finish=new boolean[field.length];
		for (int y = 0; y < field.length; y++) {
			for (int x = 0; x < field.length; x++) {
				System.out.print(field[x][y]);
			}
			System.out.println();
		}
		for (int x = 0; x < field.length; x++) {
			if (field[x][0] == 0) {
				field[x][0] = 4;
				finish[x] = this.PercolateRE(field);
			}
		}
		for(boolean fin:finish)
		System.out.println(fin);
		System.out.println(yes);
		for (int y = 0; y < field.length; y++) {
			for (int x = 0; x < field.length; x++) {
				if(field[x][y]==1) {
					System.out.print('X');
				}else if(field[x][y]==0){
					System.out.print('O');
				}else if(field[x][y]>1) {
					System.out.print('*');
				}
				//System.out.print(field[x][y]==0));
			}
			System.out.println();
		}
		
	}

	public boolean PercolateRE(int[][] field) {
		int xCord = 0;
		int yCord = 0;
		Out: for (int x = 0; x < field.length; x++) {
			for (int y = 0; y < field.length; y++) {
				if (field[x][y] == 4) {
					xCord = x;
					yCord = y;
					break Out;
				}
			}
		}
		if ((yCord < field.length-1)) {
			if (field[xCord][yCord + 1] == 0) {
				field[xCord][yCord + 1] = 4;
				field[xCord][yCord] = 3;
				PercolateRE(field);
			}
		}
		if ((xCord < field.length-1)) {
			if (field[xCord + 1][yCord] == 0) {
				field[xCord + 1][yCord] = 4;
				field[xCord][yCord] = 3;
				PercolateRE(field);
			}
		}
		if ((yCord > 0)) {
			if (field[xCord][yCord - 1] == 0) {
				field[xCord][yCord - 1] = 4;
				field[xCord][yCord] = 3;
				PercolateRE(field);
			}
		}
		if ((xCord > 0) && (field[xCord - 1][yCord] == 0)) {
			field[xCord - 1][yCord] = 4;
			field[xCord][yCord] = 3;
			PercolateRE(field);
		}
		if (yCord == field.length-1) {
			yes++;
			System.out.println("ues");
			return true;
		} else {
			return false;
		}
	}
}