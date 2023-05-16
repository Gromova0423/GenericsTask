import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<>();
        magicBox.add("Vera");
        magicBox.add("Alex");
        magicBox.add("Mary");
        magicBox.pick();
        magicBox.add("Aron");
        magicBox.add("David");
        magicBox.add("Ivan");// данный обьект добавлен, показать заполненность коробки
        System.out.println("Случайное имя: " + (String) magicBox.pick());
        System.out.println(Arrays.toString(magicBox.items));
        System.out.println();

        MagicBox<Integer> magicBox2 = new MagicBox<>();
        magicBox2.add(200);
        magicBox2.add(300);
        magicBox2.pick();
        magicBox2.add(400);
        magicBox2.add(500);
        magicBox2.add(600);
        magicBox2.add(700);// данный обьект добавлен, показать заполненность коробки
        System.out.println("Случайное число: " + (Integer) magicBox2.pick());
        System.out.println(Arrays.toString(magicBox2.items));
    }
}






