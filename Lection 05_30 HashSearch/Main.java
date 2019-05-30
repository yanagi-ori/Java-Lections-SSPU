/* Линейное зондирование
 *
 * [говорил что-то непонятное про способ поиска]
 *
 * РЕАЛИЗАЦИЯ *
 * размер таблицы надо задавать заранее
 * задаем размер больше, чем нужно, чтобы таблица была разрежена
 * меньше таблица - минус эффективнсть, хорошая память, больше - наоборот
 *
 * В случае конфликта (хф возврашает адрес, который уже занят) проверяется следующий элемент в таблице
 * (это и есть зондирование), если и следующий занят, поиск происходит по всей таблице до встречи с начальным элементом.
 * поиск прекращается в случае:
 * - позиция таблицы содержит элемент с искомым ключом (найден)
 * - пустого элемента в таблице (нет)
 *
 *
 */


public class Main {
    public static void main(String[] args) {

    }
}

class Item {
    Integer key;
    String data;
}

class LinearProbing {
    private Item[] st;
    private int count;
    private int size;

    public LinearProbing(int maxSize) {
        count = 0;
        size = 2 * maxSize; // в идеале простое число
        st = new Item[size];
    }

    private int hash(int key) {
        /*...*/
        return 1;
    } // заглушка хф

    public int getSize() {
        return size;
    }

    public void insert(Item it) {
        var i = hash(it.key);
        while (st[i] != null) { // элемент занят
            i = (i + 1) % size; // переход к следующему элементу
        }
        st[i] = it;
        ++count;
    }

    public Item search(int key) {
        int i = hash(key);
        while (st[i] != null) {
            if (key == st[i].key) return st[i];
            else i = (i + 1) % size;

        }
        return null;
    }
}