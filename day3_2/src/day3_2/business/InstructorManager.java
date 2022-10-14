package day3_2.business;

import day3_2.core.logging.Logger;
import day3_2.dataAccess.InstructorDao;
import day3_2.entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {

		this.instructorDao.add(instructor);

		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + instructor.getLastName());
		}

	}

	public void remove(Instructor instructor) {

		this.instructorDao.remove(instructor);

	}

	public void update(Instructor instructor) {

		this.instructorDao.update(instructor);

	}
}
