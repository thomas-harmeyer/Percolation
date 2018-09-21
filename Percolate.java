public class Percolate
	public PercolateHelp(int [] field){
		for(int x = 0; x < field.length; x++){
			if(field[x][0]==0){
				field[x][0]=4;
				Percolate(field);
			}
		}
	}
	
	public PercolateRE(int [] field){
		for (int x = 0;
	}
}