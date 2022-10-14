package day3_2.business;

import java.util.List;

import day3_2.core.logging.Logger;

import day3_2.dataAccess.CourseDao;

import day3_2.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;

	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;

	}

	public void add(Course course) throws Exception {

		if (course.getPrice() < 0) {
			throw new Exception("Ürün fiyatı 0 dan küçük olamaz");

		}

		for (Course crs : courses) {
			if (crs.getCourseName().equals(course.getCourseName())) {
				throw new Exception(course.getCourseName() + " adında kurs mevcutur lütfen farklı kurs adı seçiniz");
			}
		}

		courseDao.add(course);
		courses.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}

	public void remove(Course course) {

		this.courseDao.remove(course);

	}

	public void update(Course course) {

		this.courseDao.update(course);
	}

}
