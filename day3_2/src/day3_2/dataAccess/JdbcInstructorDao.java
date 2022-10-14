package day3_2.dataAccess;

import java.util.ArrayList;
import java.util.List;

import day3_2.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	List<Instructor> instructors = new ArrayList<Instructor>();

	@Override
	public void add(Instructor instructor) {

		System.out.println("Jdbc ile eklendi : " + instructor.getFirstName());
	}

	@Override
	public void remove(Instructor instructor) {

		System.out.println("Jdbc ile silindi : " + instructor.getFirstName());

	}

	@Override
	public void update(Instructor instructor) {

		System.out.println("Jdbc ile güncellendi : " + instructor.getFirstName());

	}

	@Override
	public List<Instructor> getAll() {
		return this.instructors;
	}

}
