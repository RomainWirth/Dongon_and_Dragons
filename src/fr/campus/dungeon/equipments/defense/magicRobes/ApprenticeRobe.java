package fr.campus.dungeon.equipments.defense.magicRobes;

public class ApprenticeRobe extends Robe {
    public ApprenticeRobe(){super(2);}

    @Override
    public String toString() {
        return "Apprentice Robe {\n" +
                " defense level = " + defenseLevel +
                '}';
    }
}
