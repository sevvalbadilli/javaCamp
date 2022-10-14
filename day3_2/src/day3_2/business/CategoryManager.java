package day3_2.business;

import java.util.List;

import day3_2.core.logging.Logger;

import day3_2.dataAccess.CategoryDao;
import day3_2.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;

	private List<Category> categories;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;

	}

	public void add(Category category) throws Exception {

		for (Category ctr : categories) {
			if (ctr.getCategoryName().equals(category.getCategoryName())) {

				throw new Exception(
						category.getCategoryName() + " isimde kategory mevcuttur Lütfen farklı isim seçini");

			}
		}

		categoryDao.add(category);
		categories.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}

	}

	public void remove(Category category) {

		this.categoryDao.remove(category);
	}

	public void update(Category category) {
		this.categoryDao.update(category);

	}

}
