import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {
	
	private JPanel panel;
	private JTextField nameTxt;
	private JTextField idTxt;
	private JButton okBtn;
	private JTextField courseTxt;
	private JButton printBtn;
	
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public GUI() {
		
		courses.add(new Course("Java"));
		courses.add(new Course("C"));
		courses.add(new Course("Python"));
		courses.add(new Course("C++"));
		
		panel = new JPanel();
		
		nameTxt = new JTextField("Name",10);
		idTxt = new JTextField("Id",3);
		courseTxt = new JTextField(10);
		
		okBtn = new JButton("OK");
		printBtn = new JButton("Print");
		
		panel.add(nameTxt);
		panel.add(idTxt);
		panel.add(okBtn);
		panel.add(courseTxt);
		panel.add(printBtn);
		
		this.setContentPane(panel);
		
		ButtonListener listener = new ButtonListener();
		okBtn.addActionListener(listener);
		
		ButtonListener2 listener2 = new ButtonListener2();
		printBtn.addActionListener(listener2);
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("Student Form");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String name = nameTxt.getText();
			String id = idTxt.getText();
			String title = courseTxt.getText();
			
			Student s = new Student(name, id);
			
			System.out.println("Student has been created succesfully");
			
			for(Course course: courses)
				if(title.equals(course.getTitle()))
					course.addStudent(s);
			
		}
		
	}
	
	class ButtonListener2 implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			for(Course course: courses)
				course.printData();
			
		}
		
		
	}

}
