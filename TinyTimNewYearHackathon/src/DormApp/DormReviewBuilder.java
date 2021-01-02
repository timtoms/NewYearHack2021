package DormApp;

import java.util.ArrayList;

public class DormReviewBuilder {

	
	/*
	 private int rating;
	private int location;
	private String buildingReview;
	private String roomReview;
	private List<String> tags;
	private String generalReview;
	 */
	
	private IDormReview review;
	private final int STARMIN = 0;
	private final int STARMAX = 5;
	private ArrayList<String> tags;
	
	public DormReviewBuilder() {
		this.review = new DormReview();
		this.tags = new ArrayList<String>();
	}
	
	public IDormReview createReview() {
		if (this.review.getRating() == -1 || this.review.getLocation() == -1) throw new IllegalArgumentException("Please fill out all Required Fields!");
		else if (tags.size() > 0) this.review.setTags(tags);
		return this.review;
	}
	
	public void addRating(String sRating) {
		int rating;
		try {
			rating = Integer.parseInt(sRating);
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException("Rating must be a number");
			}
		if (rating >= STARMIN && rating <= STARMAX) {
			throw new IllegalArgumentException("Rating must be between" + STARMIN + " and " + STARMAX);
		}
		this.review.setRating(rating);
	}
	
	public void addLocation(String sLocation) {
		int location;
		try {
			location = Integer.parseInt(sLocation);
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException("Location Rating must be a number");
			}
		if (location >= STARMIN && location <= STARMAX) {
			throw new IllegalArgumentException("Location Rating must be between" + STARMIN + " and " + STARMAX);
		}
		this.review.setLocation(location);
	}
	
	public void addBuildingReview(String s) {
		this.review.setBuildingReview(s);
	}
	
	public void addRoomReview(String s) {
		this.review.setGeneralReview(s);
	}
	
	public void addGeneralReview(String s) {
		this.review.setGeneralReview(s);
	}
	
	public void addTag(String s) {
		if (s == null || s.equals("")) throw new IllegalArgumentException("Must enter a valid tag!");
		else if (!tags.contains(s)) this.tags.add(s);
	}
	
	public void removeTag(String s) {
		if (tags.contains(s)) tags.remove(tags.indexOf(s));
	}
	
	
	
	
}
