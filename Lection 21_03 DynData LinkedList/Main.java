public class Main {
    /*
    Длина массива не изменяется, мы изначально задаем длину
    Элемениарная часть связанного списка состоит из двух частей (данные и служебный элемент - ссылка на
    следующий элемент) (у последнего элемента ссылка равна null). Это односвязный список!
    Чтобы иметь доступ к списку, нужно иметь досутп к вершине (первому элементу) списка.
     */

    /*
    Эффективнее ссылку с последнего элемента отправлять на первый элемент

    Двусвязанный список - то же, но с двумя служебными элементами. Один указывает на следующий элемент,
    а другой - на предыдущий. Позволяет перемещение по списку в две стороны.
     */
    public static void main(String[] args) {
        String[] as = {"aa", "bb", "cc", "dd", "ee"};
        LinkedList1 list1 = new LinkedList1();
        //for (int i = 0; i < as.length; i++) list1.addToTop(as[i]);
        //list1.print();
        for (int i = 0; i < as.length; i++) list1.addToEnd(as[i]);
        list1.delFromEnd();
        list1.delFromTop();
        list1.print();

        RingList1 ringList = new RingList1();
        ringList.print();

    }
}

class Item1 {
    String data;  // Данные
    Item1 next = null;  // Ссылка

    Item1(String s) {
        data = s;
    }
}
