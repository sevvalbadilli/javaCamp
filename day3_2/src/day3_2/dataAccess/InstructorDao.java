package day3_2.dataAccess;

import java.util.List;

import day3_2.entities.Instructor;

public interface InstructorDao {

	void add(Instructor instructor);

	void remove(Instructor instructor);

	void update(Instructor instructor);

	List<Instructor> getAll();

}
