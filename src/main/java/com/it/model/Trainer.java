package com.it.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Class for the entity Trainer. It's trainer table in database
 */
@Entity
@Table
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "trainingType_id", nullable = false)
    private TrainingType trainingType;

    @OneToMany(mappedBy = "trainer")
    private Set<Section> sections;

    public Trainer(Integer id, User user, TrainingType trainingType, Set<Section> sections) {
        this.id = id;
        this.user = user;
        this.trainingType = trainingType;
        this.sections = sections;
    }

    public Trainer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TrainingType getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(TrainingType trainingType) {
        this.trainingType = trainingType;
    }

    public Set<Section> getSections() {
        return sections;
    }

    public void setSections(Set<Section> sections) {
        this.sections = sections;
    }

}