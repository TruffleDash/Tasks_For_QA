/**
 *Задача: Написать последовательность Фибоначчи и быть готовым ее модернизировать
 */

public class TaskOne {
    public static void main(String[] args) {
        int fib = 0;
        int i = 1;
        while(true) {
            fib = fib+i;
            i = fib-i;
            System.out.println(fib);
        }
    }
}

