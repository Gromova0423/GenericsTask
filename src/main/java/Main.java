import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<>(7);
        magicBox.add("Vera");
        magicBox.add("Alex");
        magicBox.add("Mary");
        magicBox.add("Ivan");
        magicBox.add("Lili");
        magicBox.add("David");
        magicBox.add("Sara");
        magicBox.pick();
        System.out.println(Arrays.toString(magicBox.items));
        System.out.println();

        MagicBox<Integer> magicBox2 = new MagicBox<>(5);
        magicBox2.add(200);
        magicBox2.add(300);
        magicBox2.add(400);
        magicBox2.add(700);
        magicBox2.pick();
        System.out.println(Arrays.toString(magicBox2.items));
    }
}






