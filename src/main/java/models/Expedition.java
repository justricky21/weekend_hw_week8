package models;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "expeditions")
public class Expedition {
    private String title;
    private String location;
    private List<Adventurer> party;
    private Leader leader;
    private Patron patron;
    private int id;

    public Expedition(String title, String location, Leader leader, Patron patron) {
        this.title = title;
        this.location = location;
        this.leader = leader;
        this.party = new ArrayList<Adventurer>();
        this.patron = patron;
    }

    public Expedition() {
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Cascade(CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(name = "adventurer_expedition",
            joinColumns = {@JoinColumn(name = "expedition_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "adventurer_id", nullable = false, updatable = false)})
    public List<Adventurer> getParty() {
        return party;
    }

    public void setParty(List<Adventurer> party) {
        this.party = party;
    }

    @ManyToOne
    @JoinColumn(name = "leader_id", nullable = false)
    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    public void setExpeditionLeader(Leader leader) {
        this.leader = leader;
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

    @ManyToOne
    @JoinColumn(name = "patron_id", nullable = false)
    public Patron getPatron() {
        return patron;
    }

    public void setPatron(Patron patron) {
        this.patron = patron;
    }

    public void addAdventurerToParty(Adventurer adventurer){
        this.party.add(adventurer);
    }


}
