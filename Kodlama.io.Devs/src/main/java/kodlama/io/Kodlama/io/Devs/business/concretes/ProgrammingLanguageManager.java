package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.programmingLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
@Service
public class ProgrammingLanguageManager implements programmingLanguageService {

	private ProgrammingLanguageRepository languageRepository;
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {

        if (programmingLanguage.getName().isEmpty()) {
			throw new Exception("isim yeri boş geçilmez");
		}
        else if (isValid(programmingLanguage)==false) {
			throw new Exception("bu dil mevcuttur");
		}
        else {
			languageRepository.add(programmingLanguage);
		}
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {

       languageRepository.update(programmingLanguage);
	}

	@Override
	public void remove(int id) {
       languageRepository.remove(id);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return languageRepository.getById(id);
	}

	@Override
	public boolean isValid(ProgrammingLanguage programmingLanguage) {

		for (ProgrammingLanguage language1 : getAll()) {
			if (language1.getName().equalsIgnoreCase(programmingLanguage.getName())) {
				return false;
			}
		}
		return true;
	}

}
