package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "patrons")
public class Patron {
    private String name;
    private List<Expedition> expeditions;
    private int id;

    public Patron(String name) {
        this.name = name;
        this.expeditions = new ArrayList<Expedition>();
    }

    public Patron() {
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "patron", fetch = FetchType.LAZY)
    public List<Expedition> getExpeditions() {
        return expeditions;
    }

    public void setExpeditions(List<Expedition> expeditions) {
        this.expeditions = expeditions;
    }


    public void addExpeditionToMyExpeditions(Expedition expedition){
        this.expeditions.add(expedition);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
