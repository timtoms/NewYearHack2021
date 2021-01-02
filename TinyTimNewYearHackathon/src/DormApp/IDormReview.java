package DormApp;

import java.util.List;

public interface IDormReview {
	
	/**
	 * @return the rating
	 */
	public int getRating();

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating);


	/**
	 * @return the location
	 */
	public int getLocation();


	/**
	 * @param location the location to set
	 */
	public void setLocation(int location);




	/**
	 * @return the buildingReview
	 */
	public String getBuildingReview();


	/**
	 * @param buildingReview the buildingReview to set
	 */
	public void setBuildingReview(String buildingReview);


	/**
	 * @return the roomReview
	 */
	public String getRoomReview();


	/**
	 * @param roomReview the roomReview to set
	 */
	public void setRoomReview(String roomReview);


	/**
	 * @return the tags
	 */
	public List<String> getTags();


	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<String> tags);


	/**
	 * @return the generalReview
	 */
	public String getGeneralReview();


	/**
	 * @param generalReview the generalReview to set
	 */
	public void setGeneralReview(String generalReview);
	

}

