package algorithm_prac;

class Member {
    
	private String student;
	private String teacher;
	private int age;
	
	public Member(){
		
	}
	public Member(String name , int age){
		this.student = name;
		this.age = age;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	
}