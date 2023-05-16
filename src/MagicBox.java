import java.util.Random;

public class MagicBox<T> {
    Random random = new Random();
    int randomInt = random.nextInt(5);
    T[] items = (T[]) new Object[5];


    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("Коробка заполнена");
        return false;
    }

    public <T> T pick() {
        int sum;
        int itemCount = 0;
        T itemPick;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                sum = i + 1;
                itemCount = items.length - sum;
            }
        }
        System.out.println("Осталось заполнить " + itemCount + " ячеек");
        itemPick = (T) items[randomInt];
        return itemPick;
    }
}
