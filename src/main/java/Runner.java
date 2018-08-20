import db.DBHelper;
import models.*;

public class Runner {

    public static void main(String[] args) {
        Adventurer adventurer1 = new Adventurer("Markus", Specialty.FORESTER, 1);
        DBHelper.save(adventurer1);
        Adventurer adventurer2 = new Adventurer("Hanna", Specialty.DIVER, 4);
        DBHelper.save(adventurer2);
        Adventurer adventurer3 = new Adventurer("Sophia", Specialty.MOUNTAINEER, 3);
        DBHelper.save(adventurer3);

        Leader leader1 = new Leader("Elizabeth", Specialty.MOUNTAINEER, 8, 2);
        DBHelper.save(leader1);

        Leader leader2 = new Leader("Thomas", Specialty.FORESTER, 10, 4);
        DBHelper.save(leader2);

        Patron patron = new Patron ("Paul");
        DBHelper.save(patron);

        Expedition expedition1 = new Expedition("Journey through the woods", "The black forest",
                leader2, patron);
        DBHelper.save(expedition1);
    }
}
