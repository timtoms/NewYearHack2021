package GradebookApp;

import java.util.HashMap;
import java.util.List;

public class Gradebook {
	
	private static HashMap<String,Double> gradePoints;
	
	public Gradebook() {
		gradePoints = new HashMap<String, Double>();
		gradePoints.put("A+", 4.3);
		gradePoints.put("A", 4.0);
		gradePoints.put("A-", 3.7);
		gradePoints.put("B+", 3.3);
		gradePoints.put("B", 3.0);
		gradePoints.put("B-", 2.7);
		gradePoints.put("C+", 2.3);
		gradePoints.put("C", 2.0);
		gradePoints.put("C-", 1.7);
		gradePoints.put("D+", 1.3);
		gradePoints.put("D", 1.0);
		gradePoints.put("D-", 0.7);
		gradePoints.put("F", 0.0);
		
	}
	
	public static double getFinalMinimum(double desireGrade, double currGrade, double finalWeight) {
		return (desireGrade - (currGrade * (1 - finalWeight))) / finalWeight;
	}
	
	public static double getGPA(List<Course> grades) {
		int credits = 0;
		double gpt = 0.0;
		for (Course c : grades) {
			if (gradePoints.containsKey(c.getGrade().toUpperCase())) {
				gpt += gradePoints.get(c.getGrade().toUpperCase());
				credits+= c.getCredits();
			}
		}
		
		return gpt/credits;
		}

	
	public static double getFinalGrade(double currGrade, double finalScore, double finalWeight) {
		return ((1 - finalWeight) * currGrade) + (finalWeight * finalScore);
	}
	
	
	
}
