import java.util.Random;
public class RandomGrid(){
	public RandomGrid(int n, double p){
		Random ran = new Random();
		int [][] field = new int[n][n];
		for(int x = 0; x < field.length; x++){
			for(int y = 0; y < field.length; y++){
				if(ran.next()<=p){
					int[x][y]=1; 
				}
			}
		}
		Percolate.percolate(field);
		
	}

}