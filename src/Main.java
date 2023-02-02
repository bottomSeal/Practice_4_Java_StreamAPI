import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Character> characters = (ArrayList<Character>) new CharacterListGenerator().randomCats(20);

        // TODO Вывести персонажа с максимальным количеством HP среди всех

        Optional<Character> characterOptionalMaxHp = characters.stream()
                .max(Comparator.comparingInt(Character::getMaxHp));

        characterOptionalMaxHp.ifPresent(System.out::println);

        // TODO Вывести персонажа с минимальным количеством HP среди всех

        Optional<Character> characterOptionalMinHp = characters.stream()
                .min(Comparator.comparingInt(Character::getMaxHp));

        characterOptionalMinHp.ifPresent(System.out::println);

        // TODO Сортировать персонажей по силе атаки, выбрать только тех, у кого она меньше 100. Вывести на экран;

        characters.stream()
                .filter(character -> character.getAtk() < 100)
                .forEach(System.out::println);

        // TODO Тоже самое, что в (c), но убрать из выборки всех, у кого меньше 100;

        characters.stream()
                .filter(character -> !(character.getAtk() < 100))
                .forEach(System.out::println);

        // TODO Произвести выборку персонажей по одному типу архонта/специализации
        //  и для всех изменить произвольную характеристику умножив её значение на 2.
        //  Выборку собрать в коллекцию List и вывести на экран;

        characters.stream()
                .filter(character -> character.getElement().equals("Крио"))
                .peek(character -> character.setCritRate(character.getCritRate() * 2))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // TODO Найти персонажа со значением характеристики силы атаки в 1337, вывод функции .get()
        //  произвести в объект класса Optional<Character>. Если такой объект существует,
        //  то вывести на экран его и добавить перед его именем слово l33t.
        //  Если такого объекта нет, вывести на экран “No l33t”);

        Optional<Character> characterOptionalAtk = characters.stream()
                .filter(character -> (character.getAtk() == 1337)).findFirst();

        if (characterOptionalAtk.isPresent()) {
            System.out.print("l33t");
            characterOptionalAtk.ifPresent(System.out::println);
        }
        else {
            System.out.println("No l33t");
        }

        // TODO Посчитать для каждой специализации количество персонажей. Вывести на экран в виде таблички.

        long count;

        System.out.println("-----------");

        for (String element: CharacterListGenerator.getElements()) {
            count = characters.stream().filter(character -> character.getElement().equals(element)).count();

            String str = element + "|" + count;
            System.out.format("|%7s|%1s|\n", element, count);
        }
        System.out.println("-----------");

    }
}