package models;

public class Leader extends Explorer {
    private int yearsAsLeader;

    public Leader() {
    }

    public Leader(String name, Specialty specialty, int yearsOfExperience, int yearsAsLeader) {
        super(name, specialty, yearsOfExperience);
        this.yearsAsLeader = yearsAsLeader;
    }
}
