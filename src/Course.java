import java.util.ArrayList;

public class Course {
	
	private String title;
	private ArrayList<Student> students = new ArrayList<Student>();

	public Course(String title) {
		
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void addStudent(Student aStudent) {
		
		students.add(aStudent);
	}
	
	public void printData() {
		
		System.out.println("Course name: " + title);
		System.out.println("Students: ");
		
		for(Student student: students)
			System.out.println(student);
		System.out.println("---------------");
			
	}
	

}
