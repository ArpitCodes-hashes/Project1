package Dto;

public class AadharDto {

	private String AadharId;
	private int personId;
	public String getAadharNo() {
		return AadharId;
	}
	public void setAadharNo(String aadharId) {
		AadharId = aadharId;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
}
