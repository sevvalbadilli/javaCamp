package day3_2.dataAccess;

import java.util.ArrayList;
import java.util.List;

import day3_2.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	List<Category> categories = new ArrayList<Category>();

	@Override
	public void add(Category category) {

		System.out.println("Jdbc ile eklendi : " + category.getCategoryName());

	}

	@Override
	public void remove(Category category) {

		System.out.println("Jdbc ile silindi : " + category.getCategoryName());

	}

	@Override
	public void update(Category category) {

		System.out.println("Jdbc ile güncellendi : " + category.getCategoryName());

	}

	@Override
	public List<Category> getAll() {
		return this.categories;
	}

}
