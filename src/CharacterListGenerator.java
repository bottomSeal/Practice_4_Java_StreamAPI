import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CharacterListGenerator {

    private String[] names = {"Ксяо", "Йома", "Синий", "Чугун", "Свинь Янь",
                            "Лисожена", "Коза", "Дед", "Рыбожена", "Дилдюк"};

    private static String[] elements = {"Дендро", "Пиро", "Крио", "Гидро",
                                "Гео", "Анемо", "Электро"};

    public List<Character> randomCats(int count) {

        final ArrayList<Character> characters = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {

            String randomName = names[ThreadLocalRandom.current().nextInt(names.length)];

            int randomMaxHp  = ThreadLocalRandom.current().nextInt(10000, 40000);

            int randomAtk  = ThreadLocalRandom.current().nextInt(0, 2200);

            int randomDef  = ThreadLocalRandom.current().nextInt(700, 2500);

            int randomEm  = ThreadLocalRandom.current().nextInt(0, 1000);

            int randomStamina  = ThreadLocalRandom.current().nextInt(0, 300);

            int randomCritRate  = ThreadLocalRandom.current().nextInt(0, 100);

            String randomElement = elements[ThreadLocalRandom.current().nextInt(elements.length)];

            characters.add(new Character(randomName, randomMaxHp, randomAtk, randomDef, randomEm, randomStamina, randomCritRate, randomElement));
        }

        return characters;
    }

    public static String[] getElements() {
        return elements;
    }
}
