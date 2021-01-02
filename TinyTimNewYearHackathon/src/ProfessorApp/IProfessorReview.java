package ProfessorApp;
import java.util.List;

public interface IProfessorReview {


	/**
	 * @return the courseCode
	 */
	public String getCourseCode();

	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode);

	/**
	 * @return the rating
	 */
	public int getRating();

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating);

	/**
	 * @return the difficutly
	 */
	public int getDifficultly();

	/**
	 * @param difficutly the difficutly to set
	 */
	public void setDifficultly(int difficultly);

	/**
	 * @return the approachability
	 */
	public int getApproachability();

	/**
	 * @param approachability the approachability to set
	 */
	public void setApproachability(int approachability);

	/**
	 * @return the takeAgain
	 */
	public TFResponse getTakeAgain();

	/**
	 * @param takeAgain the takeAgain to set
	 */
	public void setTakeAgain(TFResponse takeAgain);

	/**
	 * @return the attendance
	 */
	public TFResponse getAttendance();

	/**
	 * @param attendance the attendance to set
	 */
	public void setAttendance(TFResponse attendance);
	/**
	 * @return the forCredit
	 */
	public TFResponse getForCredit();

	/**
	 * @param forCredit the forCredit to set
	 */
	public void setForCredit(TFResponse forCredit);

	/**
	 * @return the textbook
	 */
	public TFResponse getTextbook();

	/**
	 * @param textbook the textbook to set
	 */
	public void setTextbook(TFResponse textbook);

	/**
	 * @return the textbookUseful
	 */
	public int getTextbookUseful();

	/**
	 * @param textbookUseful the textbookUseful to set
	 */
	public void setTextbookUseful(int textbookUseful);

	/**
	 * @return the gradeRecieved
	 */
	public String getGradeRecieved();

	/**
	 * @param gradeRecieved the gradeRecieved to set
	 */
	public void setGradeRecieved(String gradeRecieved);

	/**
	 * @return the hoursPerWeek
	 */
	public String getHoursPerWeek();
	/**
	 * @param hoursPerWeek the hoursPerWeek to set
	 */
	public void setHoursPerWeek(String hoursPerWeek);

	/**
	 * @return the tags
	 */
	public List<String> getTags();

	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<String> tags);

	/**
	 * @return the review
	 */
	public String getReview();

	/**
	 * @param review the review to set
	 */
	public void setReview(String review);

	
	
	
	
	
	
	
	
	
	
	
}


