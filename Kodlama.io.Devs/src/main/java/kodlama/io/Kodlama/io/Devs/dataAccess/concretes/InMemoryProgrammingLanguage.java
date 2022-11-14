package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
@Repository
public class InMemoryProgrammingLanguage implements ProgrammingLanguageRepository {

	
	
	List<ProgrammingLanguage> programmingLanguages;
	
	
	
	
	
	public InMemoryProgrammingLanguage() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"c#"));
		programmingLanguages.add(new ProgrammingLanguage(2,"java"));
		programmingLanguages.add(new ProgrammingLanguage(3,"phyton"));
		programmingLanguages.add(new ProgrammingLanguage(4,"Php"));
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {

		programmingLanguages.add(programmingLanguage);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {

		programmingLanguages.remove(getById(programmingLanguage.getId()));
		programmingLanguages.add(programmingLanguage);
	}

	@Override
	public void remove(int id) {
		programmingLanguages.remove(id);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {

		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if (programmingLanguage.getId()==id) {
				return programmingLanguage;
			}
		}
		
		return null;
	}

}
