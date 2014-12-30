package assignment2;

public class quizResults {

	public static void main(String[] args) {
		String results[][]={
							{"A","B","A","C","C","D","E","E","A","D"},
							{"D","B","A","B","C","A","E","E","A","D"},
							{"E","D","D","A","C","B","E","E","A","D"},
							{"C","B","A","E","D","C","E","E","A","D"},
							{"A","B","D","C","C","D","E","E","A","D"},
							{"B","B","E","C","C","D","E","E","A","D"},
							{"B","B","A","C","C","D","E","E","A","D"},
							{"E","B","E","C","C","D","E","E","A","D"}
						};
		String key[]={"D","B","D","C","C","D","A","E","A","D"};
		int totalRight=0;
		for(int i=0;i<results.length;i++){
			totalRight=0;
			for(int j=0;j<results[0].length;j++){
				if(results[i][j].equals(key[j])){
					totalRight++;
				}
			}
			System.out.println("Student "+i+"'s"+" correct count is "+totalRight);
		}
	}

}
