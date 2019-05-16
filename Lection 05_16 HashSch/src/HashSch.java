import java.util.ArrayList;

public class HashSch {
    public static void main(String[] args) {

    }

}


/* Поиск индексирование по ключу
 * Самый быстрый способ поиска
 * Ключом могут быть только целые положительные числа,
 * значения ключей должны находиться в достаточно компактном диапазоне.
 * Ключ - адрес элемента данных */

/*class ItemIK {
    int key;
    String data;

    public ItemIK(int key, String data) {
        this.key = key;
        this.data = data;
    }
}

class SymbTableIK {
    ItemIK[] arr;

    public SymbTableIK(int maxSize) {
        arr = new ItemIK[maxSize];
    }

    boolean insert(ItemIK it) {
        if (it == null) return false; // check
        if (it.key < 0 || it.key >= arr.length) return false; // check
        arr[it.key] = it; // insert
        return true;
    }

    ItemIK search(int key) {
        if (key < 0 || key >= arr.length) return null;
        return arr[key];
    }
}
*/

/*Hash Search
 * Ключ - хэш-функция
 * Улучшенный способ поиска
 * Идеальных хэш-функций не существет:
 * всегда наступет момент, когда находится два разных элемента с одинаковым хэш-код,
 * такая ситуация называется конфликтом или коллизией.
 * Принимает в качестве параметра индекс ключа, возвращает - целое число,
 * это число - адресс элемента в таблице символов.
 *
 *
 * Для организации хэш-поиска нужны три элемента:
 * - определить хэш-функцию для ключа
 * - способ разрешения конфликтов (коллизии)
 * - сама таблица символов
 *
 * Хэш-функция зависит от вида ключа
 * */

class ItemIK {
    int key;
    String data;

    public ItemIK(int key, String data) {
        this.key = key;
        this.data = data;
    }
}

class SymbTableIK {
    ItemIK[] arr;

    public SymbTableIK(int maxSize) {
        arr = new ItemIK[maxSize];
    }

    boolean insert(ItemIK it) {
        if (it == null) return false; // check
        if (it.key < 0 || it.key >= arr.length) return false; // check
        arr[it.key] = it; // insert
        return true;
    }

    /*ItemIK search(int key) {
        if (key < 0 || key >= arr.length) return null;
        return arr[hash1(key)];
    }*/
}

/*
    примеры хэш-функции
    int hash1(int k) {
        return k % arr.length; // делим индекс на длину массива и получаем остаток
    }

    int hash2(String key) {
        key.hashCode() // встроенная реализация хэш-кода
    }
} */

/* Способы разрешения конфликтов

 * Способ раздельного связывания
 * Реализация: */

class SepLink {
    ArrayList[] arr;

    SepLink(int maxSize) {
        arr = new ArrayList[maxSize / 5];
    }

    int hash(int k) {
        return k % arr.length; // не реализовано
    }

    void insert(ItemIK it) {
        int i = hash(it.key);
        if (arr[i] != null) {
            arr[i] = new ArrayList();
        } else arr[i].add(it);
    }

    ItemIK search(int key) {
        int i = hash(key);
        if (arr[i] == null) return null;
        ItemIK p;
        for (int j = 0; j < arr[i].size(); ++j) {
            p = (ItemIK) arr[i].get(j);
            if (p.key == key) return p;
        }
        return null;
    }
}



/* Литература, которую читать не надо:
 * Сэджвик - Фундаментальные алгоритмы на С++ */

}