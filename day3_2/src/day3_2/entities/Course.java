package day3_2.entities;

public class Course {

	private int id;
	private String courseName;
	private double price;

	public Course() {

	}

	public Course(int id, String courseName, double price) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
