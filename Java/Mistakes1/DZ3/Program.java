package DZ3;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        ParsData parsData = new ParsData(); // Создается объект класса ParsData
        String newFileName = null; // Иннициализация переменной
        File File = new File(); // Создается объект класса File

        HashMap<String, Object> data = parsData.parsInputData(); // Иннициализация словаря
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = parsData.parsInputData();
            }
        } // Цикл для ввода данных, пока пользователь не введет корректные данные

        newFileName = data.get("lastName") + ".txt"; // Указывается файл для записи данных пользователя
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        File.writeData(String.valueOf(sb), filePath); // Вызывается метод класса File для записи в файл

    }
}

