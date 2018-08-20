package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "leaders")
@Inheritance(strategy = InheritanceType.JOINED)
public class Leader extends Explorer {
    private int yearsAsLeader;
    private List<Expedition> expeditions;
    private Expedition currentExpedition;

    public Leader() {
    }

    public Leader(String name, Specialty specialty, int yearsOfExperience, int yearsAsLeader) {
        super(name, specialty, yearsOfExperience);
        this.yearsAsLeader = yearsAsLeader;
        this.expeditions = new ArrayList<Expedition>();
        this.currentExpedition = null;
    }

    public int getYearsAsLeader() {
        return yearsAsLeader;
    }

    public void setYearsAsLeader(int yearsAsLeader) {
        this.yearsAsLeader = yearsAsLeader;
    }

    public Expedition getCurrentExpedition() {
        return currentExpedition;
    }

    public void setCurrentExpedition(Expedition expedition) {
        currentExpedition = expedition;
    }

    public void addExpeditionToLeader(Expedition expedition){
        this.expeditions.add(expedition);
        this.setCurrentExpedition(expedition);
    }

    @OneToMany(mappedBy = "leader", fetch = FetchType.LAZY)
    public List<Expedition> getExpeditions() {
        return expeditions;
    }

    public void setExpeditions(List<Expedition> expeditions) {
        this.expeditions = expeditions;
    }
}
