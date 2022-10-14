package day3_2;

import java.util.ArrayList;
import java.util.List;

import day3_2.business.CategoryManager;

import day3_2.business.CourseManager;
import day3_2.business.InstructorManager;
import day3_2.core.logging.DatabaseLogger;
import day3_2.core.logging.FileLogger;
import day3_2.core.logging.Logger;
import day3_2.core.logging.MailLogger;
import day3_2.dataAccess.HibernateCategoryDao;
import day3_2.dataAccess.HibernateCourseDao;
import day3_2.dataAccess.JdbcInstructorDao;
import day3_2.entities.Category;
import day3_2.entities.Course;
import day3_2.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new MailLogger(), new DatabaseLogger(), new FileLogger() };

		Course course1 = new Course(1, "java", 1);
		Course course2 = new Course(2, "java", -1);
		List<Course> courses = new ArrayList<Course>();

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		courseManager.add(course1);
		// courseManager.add(course1); hata : java adında kurs mevcutur lütfen farklı
		// kurs adı seçiniz
		// courseManager.add(course2); hata: Ürün fiyatı 0 dan küçük olamaz

		Category category1 = new Category(2, "Programlama");
		Category category2 = new Category(3, "Programlama");

		List<Category> categories = new ArrayList<>();

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		categoryManager.add(category1);
		// categoryManager.add(category2); hata : Programlama isimde kategory mevcuttur
		// Lütfen farklı isim seçini

		Instructor instructor1 = new Instructor(1, "Engin", "Demroğ");
		InstructorManager ısManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		ısManager.add(instructor1);

	}

}
