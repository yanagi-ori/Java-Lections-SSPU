/* Дерево - частный случай графа
 * Путь - это список узлов между двумя вершинами, уникален
 * Чаще всего встречаются деревья с корнем, но могут быть и без выделенного корня
 *
 * Размерность
 * Часто у деревьев задают максимальное количество потомков
 *
 * Уровень узла от вершины
 * Высота - масимальный уровень узла дерева
 *
 * Длина пути - сумма уровней всех узлов дерева
 */


public class Main {
}


// Бинарное дерево
class Item {
    private String data;
    private Item left, right;
}

class Item10 {
    Item[] child;
    private String data;

    // конструктор
    Item10(String d) {
        data = d;
        child = new Item[10];
    }
}

// Метод прохода по дереву
class BinTree{
    Item root;

    private void print(Item r){
        if (r == null) return;
        System.out.println(r.data);
        print(r.left);
        print(r.right);
    }

    void print(Item10 r){
        if (r == null) return;
        System.out.println(r.data);
        for (int i = 0; i < child.lenght; ++i){
            print(r.child[i]);
        }
    }
}

// не рекурсивный способ
