package com.psss.registro.services;

import com.psss.registro.models.Classe;
import com.psss.registro.models.Docente;
import com.psss.registro.repositories.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ClasseService {

    @Autowired
    private ClasseRepository classeRepository;

    public List<Classe> findAll() {
        return classeRepository.findAll();
    }

    public Optional<Classe> findById(Long id) {
        return classeRepository.findById(id);
    }

    public List<Classe> findByAnnoScolastico(int anno) {
        return classeRepository.findByAnnoScolastico(anno);
    }

    public List<Classe> findByAnnoScolasticoAndSezione(int anno, Character sezione){
        return classeRepository.findByAnnoScolasticoAndSezione(anno, sezione);
    }

    public Classe createClasse(Classe c) {
        return classeRepository.saveAndFlush(c);
    }

    public Classe updateClasse(Classe classe, Classe classeUpdated) {
        classe.setAnno(classeUpdated.getAnno());
        classe.setSezione(classeUpdated.getSezione());
        classe.setAnnoScolastico(classeUpdated.getAnnoScolastico());
        return classeRepository.saveAndFlush(classe);
    }

    public void deleteById(Long id) {
        classeRepository.deleteById(id);
    }

}
