package day3_1;

public class Company extends Customer {

	private String companyName;
	private String textNumber;

	public Company() {

	}

	public Company(String companyName, String textNumber) {
		super();
		this.companyName = companyName;
		this.textNumber = textNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTextNumber() {
		return textNumber;
	}

	public void setTextNumber(String textNumber) {
		this.textNumber = textNumber;
	}

}
