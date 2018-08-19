package models;

import java.util.List;

public class Patron {
    private String name;
    private List<Expedition> expeditions;
    private Expedition currentExpedition;

    public Patron(String name) {
        this.name = name;
    }

    public Patron() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Expedition> getExpeditions() {
        return expeditions;
    }

    public void setExpeditions(List<Expedition> expeditions) {
        this.expeditions = expeditions;
    }

    public Expedition getCurrentExpedition() {
        return currentExpedition;
    }

    public void setCurrentExpedition(Expedition currentExpedition) {
        this.currentExpedition = currentExpedition;
    }
}
