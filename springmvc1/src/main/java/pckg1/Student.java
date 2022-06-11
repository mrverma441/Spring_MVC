package pckg1;

import java.util.Date;
import java.util.List;

public class Student {
	private Long id;
	private String name;
	private Date date;
	private List<String> courses;
	private String gender;
	private String type;
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Long id, String name, Date date, List<String> courses, String gender, String type) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.courses = courses;
		this.gender = gender;
		this.type = type;
	}
		@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", date=" + date + ", courses=" + courses + ", gender=" + gender
				+ ", type=" + type + ", address=" + address + "]";
	}
		public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
