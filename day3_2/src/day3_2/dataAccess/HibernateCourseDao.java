package day3_2.dataAccess;

import java.util.ArrayList;
import java.util.List;

import day3_2.entities.Course;

public class HibernateCourseDao implements CourseDao {

	List<Course> courses = new ArrayList<Course>();

	@Override
	public void add(Course course) {

		System.out.println("hibernate ile eklendi : " + course.getCourseName());
	}

	@Override
	public void remove(Course course) {

		System.out.println("hibernate ile silindi : " + course.getCourseName());
	}

	@Override
	public void update(Course course) {

		System.out.println("hibernate ile güncellendi : " + course.getCourseName());
	}

	@Override
	public List<Course> getAll() {
		return this.courses;
	}

}
