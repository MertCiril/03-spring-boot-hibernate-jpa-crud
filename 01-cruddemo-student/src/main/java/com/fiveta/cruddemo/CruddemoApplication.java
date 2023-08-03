package com.fiveta.cruddemo;

import com.fiveta.cruddemo.dao.IStudentDAO;
import com.fiveta.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(IStudentDAO iStudentDAO){
		return runner -> {
			createStudent(iStudentDAO);
		};
	}

	private void createStudent(IStudentDAO iStudentDAO) {
		//create the student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Mert","Çiril","cirilmert@gmail.com");

		//save the student object
		System.out.println("Saving the student...");
		iStudentDAO.save(tempStudent);

		//display id of the saved student
		System.out.println("Saved student. Generated id: "+tempStudent.getId());
	}
}
