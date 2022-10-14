package day3_2.dataAccess;

import java.util.List;

import day3_2.entities.Course;

public interface CourseDao {

	void add(Course course);

	void remove(Course course);

	void update(Course course);

	List<Course> getAll();

}
