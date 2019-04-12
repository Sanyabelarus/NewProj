package com.it.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Class for the entity TrainingTypes. It's trainingTypes table in database
 */
@Entity
@Table
public class TrainingType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "trainingType")
    private Set<Trainer> trainers;

    private String trainingName;

    public TrainingType(Integer id, Set<Trainer> trainers, String trainingName) {
        this.id = id;
        this.trainers = trainers;
        this.trainingName = trainingName;
    }

    public TrainingType() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    public Set<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(Set<Trainer> trainers) {
        this.trainers = trainers;
    }


}
