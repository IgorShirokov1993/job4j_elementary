package ru.job4j.live;

public class Reduce {
    /* Поле класса для хранения массива */
    private int[] array;

    /* Метод to сохраняет переданный массив в поле класса */
    public void to(int[] array) {
        this.array = array;  /* Используем this, чтобы обратиться к полю класса */
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array); // Передаём массив в объект
        reduce.print(); // Выводим элементы массива
    }
}
