package day3_2.dataAccess;

import java.util.List;

import day3_2.entities.Category;

public interface CategoryDao {

	void add(Category category);

	void remove(Category category);

	void update(Category category);

	List<Category> getAll();

}
