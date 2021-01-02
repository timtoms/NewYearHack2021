package ProfessorApp;
import java.util.ArrayList;
import java.util.List;

public class ProfessorReview implements IProfessorReview {

	
	private String courseCode;
	private int rating;
	private int difficulty;
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
	
	public ProfessorReview() {
		
		this.setCourseCode("");
		this.setRating(-1);
		this.setDifficultly(-1);
		this.setApproachability(-1);
		this.setTakeAgain(TFResponse.NOANSWER);
		this.setAttendance(TFResponse.NOANSWER);
		this.setForCredit(TFResponse.NOANSWER);
		this.setTextbook(TFResponse.NOANSWER);
		this.setTextbookUseful(-1);
		this.setGradeRecieved("");
		this.setHoursPerWeek("");
		this.setTags(new ArrayList<String>());
		this.setReview("");
	}

	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return this.courseCode;
	}

	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return this.rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the difficutly
	 */
	public int getDifficultly() {
		return this.difficulty;
	}

	/**
	 * @param difficutly the difficutly to set
	 */
	public void setDifficultly(int difficultly) {
		this.difficulty = difficultly;
	}

	/**
	 * @return the approachability
	 */
	public int getApproachability() {
		return this.approachability;
	}

	/**
	 * @param approachability the approachability to set
	 */
	public void setApproachability(int approachability) {
		this.approachability = approachability;
	}

	/**
	 * @return the takeAgain
	 */
	public TFResponse getTakeAgain() {
		return this.takeAgain;
	}

	/**
	 * @param takeAgain the takeAgain to set
	 */
	public void setTakeAgain(TFResponse takeAgain) {
		this.takeAgain = takeAgain;
	}

	/**
	 * @return the attendance
	 */
	public TFResponse getAttendance() {
		return this.attendance;
	}

	/**
	 * @param attendance the attendance to set
	 */
	public void setAttendance(TFResponse attendance) {
		this.attendance = attendance;
	}

	/**
	 * @return the forCredit
	 */
	public TFResponse getForCredit() {
		return this.forCredit;
	}

	/**
	 * @param forCredit the forCredit to set
	 */
	public void setForCredit(TFResponse forCredit) {
		this.forCredit = forCredit;
	}

	/**
	 * @return the textbook
	 */
	public TFResponse getTextbook() {
		return this.textbook;
	}

	/**
	 * @param textbook the textbook to set
	 */
	public void setTextbook(TFResponse textbook) {
		this.textbook = textbook;
	}

	/**
	 * @return the textbookUseful
	 */
	public int getTextbookUseful() {
		return this.textbookUseful;
	}

	/**
	 * @param textbookUseful the textbookUseful to set
	 */
	public void setTextbookUseful(int textbookUseful) {
		this.textbookUseful = textbookUseful;
	}

	/**
	 * @return the gradeRecieved
	 */
	public String getGradeRecieved() {
		return this.gradeRecieved;
	}

	/**
	 * @param gradeRecieved the gradeRecieved to set
	 */
	public void setGradeRecieved(String gradeRecieved) {
		this.gradeRecieved = gradeRecieved;
	}

	/**
	 * @return the hoursPerWeek
	 */
	public String getHoursPerWeek() {
		return this.hoursPerWeek;
	}

	/**
	 * @param hoursPerWeek the hoursPerWeek to set
	 */
	public void setHoursPerWeek(String hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	/**
	 * @return the tags
	 */
	public List<String> getTags() {
		return this.tags;
	}

	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	/**
	 * @return the review
	 */
	public String getReview() {
		return this.review;
	}

	/**
	 * @param review the review to set
	 */
	public void setReview(String review) {
		this.review = review;
	}

	
	
	
	
	
	
	
	
	
	
	
}

