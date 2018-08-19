package models;

import java.util.List;

public abstract class Explorer {
    private String name;
    private Specialty specialty;
    private int yearsOfExperience;
    private int id;
    private ITool tool;

    public Explorer() {
    }

    public Explorer(String name, Specialty specialty, int yearsOfExperience, ITool tool) {
        this.name = name;
        this.specialty = specialty;
        this.yearsOfExperience = yearsOfExperience;
        this.tool = tool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String useTool(){
        return this.tool.applyTool();
    }

    public ITool getTool() {
        return tool;
    }

    public void setTool(ITool tool) {
        this.tool = tool;
    }
}
