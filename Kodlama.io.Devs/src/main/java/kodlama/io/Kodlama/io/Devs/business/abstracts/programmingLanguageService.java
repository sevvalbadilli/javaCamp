package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface programmingLanguageService {

	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	void update(ProgrammingLanguage programmingLanguage);
	void remove(int id);
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	boolean isValid(ProgrammingLanguage programmingLanguage);
}
