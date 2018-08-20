package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "leaders")
public class Leader extends Explorer {
    private int yearsAsLeader;
    private List<Expedition> expeditions;

    public Leader() {
    }

    public Leader(String name, Specialty specialty, int yearsOfExperience, int yearsAsLeader) {
        super(name, specialty, yearsOfExperience);
        this.yearsAsLeader = yearsAsLeader;
        this.expeditions = new ArrayList<Expedition>();
    }

    public int getYearsAsLeader() {
        return yearsAsLeader;
    }

    public void setYearsAsLeader(int yearsAsLeader) {
        this.yearsAsLeader = yearsAsLeader;
    }


    public void addExpeditionToLeader(Expedition expedition){
        this.expeditions.add(expedition);
    }

    @OneToMany(mappedBy = "leader", fetch = FetchType.LAZY)
    public List<Expedition> getExpeditions() {
        return expeditions;
    }

    public void setExpeditions(List<Expedition> expeditions) {
        this.expeditions = expeditions;
    }
}
