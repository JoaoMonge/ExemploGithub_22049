import java.rmi.MarshalException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Gera um array com 500 números aleatórios
        ArrayList<Integer> numbers = new ArrayList<>();
        int size = 15000;
        for (int i = 0; i < size; i++) {
            numbers.add((int) Math.round(Math.random() * 1000));
        }
        //1. Indicar a soma de todos os elementos do array
        long sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Somatório: " + sum);
        //2. Indicar a média
        System.out.println("Média: " + sum / numbers.size());
        //3. Indicar o máximo
        int max = -2147483647;
        for (int num : numbers) {

            if (num > max) {
                max = num;
            }

        }
        System.out.println(" O maior é " + max);

        //4. Indicar o minimo
        int min = 2147483647;
        for (int num : numbers) {

            if (num < min) {
                min = num;
            }
        }
        System.out.println(" O menor é " + min);



        ArrayList<Character> hello = new ArrayList<>();
        hello.add('o');
        hello.add('l');
        hello.add('l');
        hello.add('e');
        hello.add('h');
        //1. Inverta o array hello e imprima os caracteres usando o System.out.print(); Deverá ser possível visualizar hello na consola
        for (int i = hello.size() - 1; i >= 0; i--) {
            System.out.print(hello.get(i));
        }
        System.out.println();
        ArrayList<Integer> duplicados = new ArrayList<>();
        duplicados.add(10);
        duplicados.add(10);
        duplicados.add(11);
        duplicados.add(10);
        duplicados.add(11);
        duplicados.add(12);
        //1. Remova os duplicados do Array
        for (int i = 0; i < duplicados.size(); i++) {
            int num_a_verificar = duplicados.get(i);
            for (int j = i + 1; j < duplicados.size(); j++) {
                if (num_a_verificar == duplicados.get(j)) {
                    duplicados.remove(j);
                }
            }
        }
        for (int num : duplicados) {
            System.out.println(num);
        }
    }
}


