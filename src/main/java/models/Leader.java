package models;

public class Leader extends Explorer {
    private int yearsAsLeader;

    public Leader() {
    }

    public Leader(String name, Specialty specialty, int yearsOfExperience, int yearsAsLeader, ITool tool) {
        super(name, specialty, yearsOfExperience, tool);
        this.yearsAsLeader = yearsAsLeader;
    }

    public int getYearsAsLeader() {
        return yearsAsLeader;
    }

    public void setYearsAsLeader(int yearsAsLeader) {
        this.yearsAsLeader = yearsAsLeader;
    }
}
