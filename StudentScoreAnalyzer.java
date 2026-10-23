
public class StudentScoreAnalyzer {


	public static void main(String[] args){
		
		int[] scores = {
    	85, 92, 78, 95, 88,
    	76, 91, 84, 89, 93
	};
	int total = 0;
	int highest = scores[0];
	int lowest = scores[0]; 

	for (int score: scores) {
		total += score;

	if (score > highest){
		highest = score;
	}
	if (score < lowest) {
		lowest = score;
	}
	}
	double average = (double) total / scores.length;

	System.out.printf("%-8s%s%n", "Item", "Value");
	System.out.printf("%-8s%s%n", "Total", total);
	System.out.printf("%-8s%s%n", "Average", average);
	System.out.printf("%-8s%s%n", "Highest", highest);
	System.out.printf("%-8s%s%n", "Lowest", lowest);
		
	}


}
