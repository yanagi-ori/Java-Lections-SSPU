/*
Рекурсивные методы

Рекурсивный метод - метод, который вызывает сам себя.
*/


/*
Простейший способ организации рекурсии
Плохой способ

class Recurs{
    private int sum;
    private int n;
    public static void main(String[] args){
        Recurs recurs = new Recurs();
        recurs.sum = 0;
        recurs.n = 0;
        recurs.m1();
        System.out.println(""+recurs.sum);
    }

    private void m1(){
        if(n == 100) return;
        sum += n;
        ++n;
        m1();  // Метод вызывает сам себя - это рекурсия.
    }
}
*/


/*
Нормальный вариант

class Recurs {
    private int sum;

    public static void main(String[] args) {
        Recurs recurs = new Recurs();
        recurs.sum = 0;
        recurs.m1(10);
        System.out.println("" + recurs.sum);
    }

    private void m1(int n) {
        if (n == 0) return;  // условие выхода из рекурсии необходимо
        System.out.print(n + " "); // На развертывании

        sum += n;
        m1(n - 1);
        System.out.print(n + " "); // На свертывании

    }
}
 */

/*
Эталон

class Recurs {
    public static void main(String[] args) {
        Recurs recurs = new Recurs();
        System.out.println("" + recurs.m1(10));
    }

    int m1(int n) {
        if (n == 0) return 0;  // условие выхода из рекурсии необходимо
        return n + m1(n-1);
    }
}


 */


class Recurs {
    public static void main(String[] args) {
        Recurs recurs = new Recurs();
        int[] a = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int m = recurs.getMax(a, 0, a.length - 1);
        System.out.println("" + m);
    }

    // Фиббоначи рекурсивно
    int fib(int N) {
        if (N == 1 || N == 2) {
            return 1;
        }
        return fib(N - 1) + (fib(N - 2));
    }


    // Сумма элементов массива
    private int sumArrR(int[] ar, int i) {
        if (i >= ar.length) return 0;
        return ar[i] + sumArrR(ar, i + 1);
    }

    // Обертка для более простого вызова
    public int sumArr(int[] ar) {
        return sumArrR(ar, 0);
    }


    // "Разделяй и властвуй"
    int getMax(int[] ar, int left, int right) {
        if (left == right) {
            return ar[left];
        }
        int mid = (left + left) / 2;
        int maxLeft = getMax(ar, left, mid);
        int maxRight = getMax(ar, mid + 1, right);
        if (maxLeft > maxRight) {
            return maxLeft;
        } else return maxRight;
    }


}

