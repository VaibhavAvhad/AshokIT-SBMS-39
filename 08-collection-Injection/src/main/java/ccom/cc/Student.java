package ccom.cc;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	public Student() {
		System.out.println("Default constructor");
	}

	private Integer sId;
	private String sName;
	private List<String> courses;
	private Set<String> hobbies;
	private Map<String, String> Phone;

	public void setSId(Integer sId) {
		this.sId = sId;
	}

	public Integer getSId() {
		return sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public Set<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Map<String, String> getPhone() {
		return Phone;
	}

	public void setPhone(Map<String, String> phone) {
		Phone = phone;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", courses=" + courses + ", hobbies=" + hobbies + ", Phone="
				+ Phone + "]";
	}

}
