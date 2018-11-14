package MultiLingo_projekt.entity;

import java.time.LocalDate;

public class Test {

	private Long id;
	private String createdBy;
	private LocalDate createdDate;
	private int numberOfQuestions;
	private double rating;
	private double averageResult;
	private int nubmerOfRatings;
	private String information;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}

	public void setNumberOfQuestions(int numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getAverageResult() {
		return averageResult;
	}

	public void setAverageResult(double averageResult) {
		this.averageResult = averageResult;
	}

	public int getNubmerOfRatings() {
		return nubmerOfRatings;
	}

	public void setNubmerOfRatings(int nubmerOfRatings) {
		this.nubmerOfRatings = nubmerOfRatings;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	@Override
	public String toString() {
		return "Created by: " + createdBy + ", Date of creation: " + createdDate + ", Number of questions: "
				+ numberOfQuestions + ", Rating: " + rating + ", Average result: " + averageResult + ", Nubmer of ratings: "
				+ nubmerOfRatings + ", Information: " + information;
	}

}
