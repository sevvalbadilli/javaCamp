package day3_2.dataAccess;

import java.util.ArrayList;
import java.util.List;

import day3_2.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	List<Category> categories = new ArrayList<Category>();

	@Override
	public void add(Category category) {

		System.out.println("Hibernate ile eklendi : " + category.getCategoryName());
	}

	@Override
	public void remove(Category category) {

		System.out.println("Hibernate ile silindi : " + category.getCategoryName());

	}

	@Override
	public void update(Category category) {

		System.out.println("Hibernate ile güncellendi : " + category.getCategoryName());

	}

	@Override
	public List<Category> getAll() {
		return this.categories;
	}

}
