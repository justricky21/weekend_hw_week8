package models;

import java.util.ArrayList;
import java.util.List;

public class Expedition {
    private String title;
    private String location;
    private List<Adventurer> party;
    private Leader expeditionLeader;
    private int id;

    public Expedition(String title, String location, Leader expeditionLeader) {
        this.title = title;
        this.location = location;
        this.expeditionLeader = expeditionLeader;
        this.party = new ArrayList<Adventurer>();
    }

    public Expedition() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Adventurer> getParty() {
        return party;
    }

    public void setParty(List<Adventurer> party) {
        this.party = party;
    }

    public Leader getExpeditionLeader() {
        return expeditionLeader;
    }

    public void setExpeditionLeader(Leader expeditionLeader) {
        this.expeditionLeader = expeditionLeader;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addAdventurerToParty(Adventurer adventurer){
        this.party.add(adventurer);
    }
}
