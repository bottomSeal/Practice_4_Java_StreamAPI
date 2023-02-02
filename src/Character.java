public class Character {

    private final String name;

    private final int maxHp;

    private final int atk;

    private final int def;

    private final int em;

    private final int stamina;

    private int critRate;

    private final String element;

    public Character(String name, int maxHp, int atk, int def, int em, int stamina, int critRate, String element) {
        this.name = name;
        this.maxHp = maxHp;
        this.atk = atk;
        this.def = def;
        this.em = em;
        this.stamina = stamina;
        this.critRate = critRate;
        this.element = element;
    }

    public String getName() {
        return name;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getEm() {
        return em;
    }

    public int getStamina() {
        return stamina;
    }

    public int getCritRate() {
        return critRate;
    }

    public String getElement() {
        return element;
    }

    public void setCritRate(int critRate) {
        this.critRate = critRate;
    }

    @Override
    public String toString() {
        return "".concat(getName())
                .concat("\n")
                .concat("Максимальное хп: ").concat(String.valueOf(getMaxHp()))
                .concat("\n")
                .concat("Сила атаки: ").concat(String.valueOf(getAtk()))
                .concat("\n")
                .concat("Защита: ").concat(String.valueOf(getDef()))
                .concat("\n")
                .concat("Мастерство стихий: ").concat(String.valueOf(getEm()))
                .concat("\n")
                .concat("Выносливость: ").concat(String.valueOf(getStamina()))
                .concat("\n")
                .concat("Тип Архонта: ").concat(getElement())
                .concat("\n")
                .concat("Шанс крит.попадания: ").concat(getCritRate() + "%")
                .concat("\n---------------------------\n");
    }
}
