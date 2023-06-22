import java.util.Random;

public class MagicBox<T> {
    public int size;
    protected T[] items;
    protected static int[] itemsTest;
    private Random random;
    private int randomInt;
    private static int randomInt2;

    public MagicBox(int size) {
        this.size = size;
        this.items = (T[]) new Object[size];
        this.random = new Random();
        this.randomInt = random.nextInt(size);
    }


    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public static boolean addTest(int item) {
        for (int i = 0; i < itemsTest.length; i++) {
            if (itemsTest[i] == 0) {
                itemsTest[i] = item;
                return true;
            }
        }
        return false;
    }


    public <T> T pick(){
        int sum = 0;
        T itemPick = null;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                sum = sum + 1;
            }
        }
        //System.out.println("Осталось заполнить " + sum + " элемента");
        if (sum == 0){
            itemPick = (T) items[randomInt];
            System.out.println("Коробка заполнена. Случайный элемент: " + itemPick);
        }
        else {
            throw new RuntimeException("Коробка не полна, осталось заполнить: " + sum + " ячеек");
        }
        return itemPick;
    }

    public static int pickTest(){
        int sum = 0;
        int itemPick;
        for (int i = 0; i < itemsTest.length; i++) {
            if (itemsTest[i] == 0) {
                sum = sum + 1;
            }
        }
        //System.out.println("Осталось заполнить " + sum + " элемента");
        if (sum == 0){
            itemPick = itemsTest[randomInt2];
            System.out.println("Коробка заполнена. Случайный элемент: " + itemPick);
        }
        else {
            throw new RuntimeException("Коробка не полна, осталось заполнить: " + sum + " ячеек");
        }
        return itemPick;
    }


}





