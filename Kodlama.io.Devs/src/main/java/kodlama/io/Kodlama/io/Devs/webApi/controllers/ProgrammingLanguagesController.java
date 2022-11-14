package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlama.io.Kodlama.io.Devs.business.abstracts.programmingLanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("api/programlanguages")
public class ProgrammingLanguagesController {

	programmingLanguageService languageService;

	public ProgrammingLanguagesController(programmingLanguageService languageService) {
		super();
		this.languageService = languageService;
	};

	@PostMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {

		languageService.add(programmingLanguage);
	}

	@DeleteMapping("/delete/{id}")
	public void remove(@PathVariable(name = "id") int id) {

		languageService.remove(id);
	}

	@PutMapping("/update")
	public void update(ProgrammingLanguage programmingLanguage) {
		languageService.update(programmingLanguage);
	}
	
	@GetMapping("/get/all")
	public List<ProgrammingLanguage> getAll() {
		return languageService.getAll();

	}

	@GetMapping("/get{id}")
	public ProgrammingLanguage getById(@PathVariable(name = "id") int id) {

		return languageService.getById(id);
	}
}
