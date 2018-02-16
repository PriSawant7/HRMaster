package test;

public class HRMaster {
	private String Personal;
	private String Subgroup;
private String gender;
private String nationality;
public String getPersonal() {
	return Personal;
}
public void setPersonal(String personal) {
	Personal = personal;
}
public String getSubgroup() {
	return Subgroup;
}
public void setSubgroup(String subgroup) {
	Subgroup = subgroup;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public HRMaster(String personal, String subgroup, String gender, String nationality) {
	super();
	Personal = personal;
	Subgroup = subgroup;
	this.gender = gender;
	this.nationality = nationality;
}
public HRMaster() {
	super();
	// TODO Auto-generated constructor stub
}


}