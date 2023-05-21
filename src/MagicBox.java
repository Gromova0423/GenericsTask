import java.util.Random;

public class MagicBox<T> {
    private int size;
    protected T[] items;
    private Random random;
    private int randomInt;

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

    //    public <T> T pick() {
//        int sum;
//        int itemCount = 0;
//        T itemPick = (T) items[randomInt];
//        for (int i = 0; i < items.length; i++) {
//            if (items[i] != null) {
//                sum = i + 1;
//                itemCount = items.length - sum;
//            }
//        }
//        System.out.println("Осталось заполнить " + itemCount + " ячеек");
//        for (int i = 0; i < items.length; i++) {
//            if (itemPick == null) {
//                itemPick = (T) items[i + 1];
//            }
//        }
//        return itemPick;
//    }
    public <T> T pick() {
        int sum = 0;
        T itemPick = null;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                sum = sum + 1;
            }
        }
        System.out.println("Осталось заполнить " + sum + " элемента");
        if (sum == 0){
            itemPick = (T) items[randomInt];
            System.out.println("Коробка заполнена. Случайный элемент: " + itemPick);
        }
        return itemPick;
    }


}





