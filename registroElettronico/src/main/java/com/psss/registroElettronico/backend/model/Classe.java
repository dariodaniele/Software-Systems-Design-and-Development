package com.psss.registroElettronico.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "classi")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Classe {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private int anno;
    private Character sezione;
    private int annoScolastico;

    @ManyToMany()
    private List<Materia> materie;
    @ManyToMany(mappedBy = "classi")
    private List<Docente> docenti;
    @OneToMany(mappedBy = "classe", cascade = CascadeType.ALL, orphanRemoval = true)
    //TODO: decidere se elminare o meno gli studenti all'atto dell'eliminazione della classe
    private List<Studente> studenti;
}
