package DormApp;

import java.util.ArrayList;
import java.util.List;

public class DormReview implements IDormReview {
	
	private int rating;
	private int location;
	private String buildingReview;
	private String roomReview;
	private List<String> tags;
	private String generalReview;
	
	
	public DormReview() {
		this.setRating(-1);
		this.setLocation(-1);
		this.setBuildingReview("");
		this.setRoomReview("");
		this.setTags(new ArrayList<String>());
		this.setGeneralReview("");
	}


	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}


	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}


	/**
	 * @return the location
	 */
	public int getLocation() {
		return location;
	}


	/**
	 * @param location the location to set
	 */
	public void setLocation(int location) {
		this.location = location;
	}


	/**
	 * @return the buildingReview
	 */
	public String getBuildingReview() {
		return buildingReview;
	}


	/**
	 * @param buildingReview the buildingReview to set
	 */
	public void setBuildingReview(String buildingReview) {
		this.buildingReview = buildingReview;
	}


	/**
	 * @return the roomReview
	 */
	public String getRoomReview() {
		return roomReview;
	}


	/**
	 * @param roomReview the roomReview to set
	 */
	public void setRoomReview(String roomReview) {
		this.roomReview = roomReview;
	}


	/**
	 * @return the tags
	 */
	public List<String> getTags() {
		return tags;
	}


	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
	}


	/**
	 * @return the generalReview
	 */
	public String getGeneralReview() {
		return generalReview;
	}


	/**
	 * @param generalReview the generalReview to set
	 */
	public void setGeneralReview(String generalReview) {
		this.generalReview = generalReview;
	}
	

}
