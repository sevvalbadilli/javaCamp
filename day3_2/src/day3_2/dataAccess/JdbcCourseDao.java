package day3_2.dataAccess;

import java.util.ArrayList;
import java.util.List;

import day3_2.entities.Course;

public class JdbcCourseDao implements CourseDao {

	List<Course> courses = new ArrayList<Course>();

	@Override
	public void add(Course course) {

		System.out.println("Jdbc ile eklendi : " + course.getCourseName());

	}

	@Override
	public void remove(Course course) {

		System.out.println("Jdbc ile silindi : " + course.getCourseName());

	}

	@Override
	public void update(Course course) {

		System.out.println("Jdbc ile güncellendi : " + course.getCourseName());

	}

	@Override
	public List<Course> getAll() {
		return this.courses;
	}

}
