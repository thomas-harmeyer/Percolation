public class Percolate {
	public PercolateHelp(int [] field){
		for(int x = 0; x < field.length; x++){
			if(field[x][0]==0){
				field[x][0]=4;
				Percolate(field);
			}
		}
	}

	public PercolateRE(int [] field){
		int xCord = 0;
		int yCord = 0;
		Out:for (int x = 0; x < field.length; x++){
			for (int y = 0; y < field.length; y++){
				if(field[x][y]==4){
					xCord=x;
					yCord=y;
					break Out;
				}
			}
		}
		if((y!=0) && (field[xCord][yCord+1]==0){
			field[xCord][yCord+1]=4;
			field[xCord][yCord]=3;
			PercolateRE(field)
		}
	}
}