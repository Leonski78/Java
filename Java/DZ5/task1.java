package DZ5;

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
// Пример ввода:
// Иванов 234234
// Иванов 32523
// Иванов 5687
// Иванов: 234234, 32523, 5687

// Варианты Map:
// Map<String, ArrayList>
// Map<String, String>

// Пример меню:
// 1. Добавить контакт
// 2. Вывести всех
// 3. Выход


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1 {
    
        public static void main(String[] args) {
        Map<String, ArrayList<Integer>> PhoneBook = new HashMap<>();
        addNumber("Ivanov", 12345, PhoneBook);
        addNumber("Ivanov", 12347654, PhoneBook);
        addNumber("Petrov", 98765-2765, PhoneBook);
        addNumber("Sidorov", 99956477, PhoneBook);
        addNumber("Ivanov", 777888999, PhoneBook);
        addNumber("Petrov", 998678345, PhoneBook);
        printBook(PhoneBook);
       }

       // Метод, который добавляет номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}