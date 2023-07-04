package com.learning.springboot.learnjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.learning.dao.SubjectJPADao;
import com.learning.entity.MSubject;

@Component
public class JPACommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private SubjectJPADao subjectJPADao;

	@Override
	public void run(String... args) throws Exception {

		// JPA Insert - Start
			subjectJPADao.insert(new MSubject(1, "1001", "Relational Database", "Mr. Doland Trump"));
			subjectJPADao.insert(new MSubject(2, "1002", "Programming Languages", "Mr. John Whick"));
			subjectJPADao.insert(new MSubject(3, "1003", "Operating System", "Ms. Alia Bhatt"));
			subjectJPADao.insert(new MSubject(4, "1004", "Data Structure", "Ms. Shakira"));
		// JPA Insert - End
			
		// JPA Select - Start
			MSubject subject = subjectJPADao.findById(1);
			System.out.println(subject);
		// JPA Select - End
			
		// JPA Select All- Start
			List<MSubject> subjects = subjectJPADao.findAll();
			System.out.println(subjects);
		// JPA Select All - End
			
		// JPA Delete Single - Start
			subjectJPADao.deleteById(4);
		// JPA Delete Single - End
			
		// JPA Select All- Start
			List<MSubject> remainingBooks = subjectJPADao.findAll();
			System.out.println(remainingBooks);
		// JPA Select All - End

	}

	
}
