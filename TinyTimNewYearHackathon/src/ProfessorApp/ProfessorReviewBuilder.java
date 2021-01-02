package ProfessorApp;

import java.util.ArrayList;
import java.util.Arrays;

public class ProfessorReviewBuilder {

	/*
	 private String courseCode;
	private int rating;
	private int difficutly;
	private int approachability;
	private TFResponse takeAgain;
	private TFResponse attendance;
	private TFResponse forCredit;
	private TFResponse textbook;
	private int textbookUseful;
	private String gradeRecieved;
	private String hoursPerWeek;
	private List<String> tags;
	private String review;
	
	 */
	
	private final int STARMIN = 0;
	private final int STARMAX = 5;
	private final ArrayList<String> VALIDGRADES = new ArrayList<String>(Arrays.asList("A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F", "P", "NP", "I", "W", ""));
	private ArrayList<String> tags;
	private IProfessorReview review;
	
	
	public ProfessorReviewBuilder() {
		this.review = new ProfessorReview();
		this.tags = new ArrayList<String>();
	}
	
	public IProfessorReview createReview() {
		if (this.review.getRating() == -1 || this.review.getDifficultly() == -1) throw new IllegalArgumentException("Please fill out all Required Fields!");
		else if (tags.size() > 0) this.review.setTags(tags);
		return this.review;
	}
	
	public void addCourseCode(String courseCode) {
		//TODO check course code is a valid course code
		this.review.setCourseCode(courseCode);
	}
	
	public void addRating(String sRating) {
		int rating;
		try {
		rating = Integer.parseInt(sRating);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Rating must be a number");
		}
		if (rating >= STARMIN && rating <= STARMAX) {
			throw new IllegalArgumentException("Course Code must be between" + STARMIN + " and " + STARMAX);
		}
		this.review.setRating(rating);
	}
	
	public void addDifficulty(String sDifficulty) {
		int difficulty;
		try {
			difficulty = Integer.parseInt(sDifficulty);
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException("Difficulty must be a number");
			}
		if (difficulty >= STARMIN && difficulty <= STARMAX) {
			throw new IllegalArgumentException("Difficulty must be between" + STARMIN + " and " + STARMAX);
		}
		this.review.setDifficultly(difficulty);
	}
	
	public void addApproachability(String sApproachability) {
		int approachability;
		try {
			approachability = Integer.parseInt(sApproachability);
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException("Approachability must be a number");
			}
		if (approachability >= STARMIN && approachability <= STARMAX) {
			throw new IllegalArgumentException("Approachabilitye must be between" + STARMIN + " and " + STARMAX);
		}
		this.review.setApproachability(approachability);
	}
	
	public void addTakeAgain(String s) {
		if (s.toUpperCase().equals("YES")) this.review.setTakeAgain(TFResponse.YES);
		else if (s.toUpperCase().equals("NO")) this.review.setTakeAgain(TFResponse.NO);
		else if (s.toUpperCase().equals("")) this.review.setTakeAgain(TFResponse.NOANSWER);
		else throw new IllegalArgumentException();
	}
	
	public void addAttendance(String s) {
		if (s.toUpperCase().equals("YES")) this.review.setAttendance(TFResponse.YES);
		else if (s.toUpperCase().equals("NO")) this.review.setAttendance(TFResponse.NO);
		else if (s.toUpperCase().equals("")) this.review.setAttendance(TFResponse.NOANSWER);
		else throw new IllegalArgumentException();
	}
	
	public void addForCredit(String s) {
		if (s.toUpperCase().equals("YES")) this.review.setForCredit(TFResponse.YES);
		else if (s.toUpperCase().equals("NO")) this.review.setForCredit(TFResponse.NO);
		else if (s.toUpperCase().equals("")) this.review.setForCredit(TFResponse.NOANSWER);
		else throw new IllegalArgumentException();
	}
	
	public void addTextbook(String s) {
		if (s.toUpperCase().equals("YES")) this.review.setTextbook(TFResponse.YES);
		else if (s.toUpperCase().equals("NO")) this.review.setTextbook(TFResponse.NO);
		else if (s.toUpperCase().equals("")) this.review.setTextbook(TFResponse.NOANSWER);
		else throw new IllegalArgumentException();
	}
	
	public void addTextbookUseful(String sUseful) {
		int textbook;
		try {
		textbook = Integer.parseInt(sUseful);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Rating must be a number");
		}
		if (textbook >= STARMIN && textbook <= STARMAX) {
			throw new IllegalArgumentException("Textbook Usefulness must be between" + STARMIN + " and " + STARMAX);
		}
		this.review.setRating(textbook);
	}
	
	public void addGradeReceived(String s) {
		
		if (!this.VALIDGRADES.contains(s)) throw new IllegalArgumentException("Must enter a valid Grade!");
		this.review.setGradeRecieved(s);		
	}
	
	//TODO Need to come up with hours per week restrictions
	public void addHoursPerWeek(String s) {
		this.review.setHoursPerWeek(s);
	}
	
	public void addTag(String s) {
		if (s == null || s.equals("")) throw new IllegalArgumentException("Must enter a valid tag!");
		else if (!tags.contains(s)) this.tags.add(s);
	}
	
	public void removeTag(String s) {
		if (tags.contains(s)) tags.remove(tags.indexOf(s));
	}
	
	public void addReview(String s) {
		this.review.setReview(s);
	}
	
	
	
	
	
}
