package models;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "adventurers")
@Inheritance(strategy = InheritanceType.JOINED)

public class Adventurer extends Explorer {
    private List<Expedition> expeditions;

    public Adventurer(String name, Specialty specialty, int yearsOfExperience) {
        super(name, specialty, yearsOfExperience);
        expeditions = new ArrayList<Expedition>();
    }

    public void addExpeditionToAdventurer(Expedition expedition){
        this.expeditions.add(expedition);
    }

    @Cascade(CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(name = "adventurer_expedition",
            joinColumns = {@JoinColumn(name = "adventurer_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "expedition_id", nullable = false, updatable = false)})
    public List<Expedition> getExpeditions() {
        return expeditions;
    }

    public void setExpeditions(List<Expedition> expeditions) {
        this.expeditions = expeditions;
    }
}
