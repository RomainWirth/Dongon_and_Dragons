package fr.campus.dungeon.equipments.offense.spells;

public class IceRain extends Spell {
    public IceRain(){super(10);}

    @Override
    public String toString() {
        return "Ice Rain {\n" +
                " attack level = " + attackLevel +
                '}';
    }
}