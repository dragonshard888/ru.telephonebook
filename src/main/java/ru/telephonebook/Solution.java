package ru.telephonebook;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, ArrayList<String>> book = createMap();
        System.out.print("Введите Фамилию: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String surname = reader.readLine();

        if (book.containsKey(surname)) {
            for (Map.Entry<String, ArrayList<String>> pair : book.entrySet()) {
                if (pair.getKey().equals(surname)) {
                    System.out.println("Номера телефонов:");
                    for (int i = 0; i < pair.getValue().size(); i++) {
                        System.out.println(i + 1 + ". " + pair.getValue().get(i));
                    }
                }
            }
        } else System.out.println("Контакт " + surname + " не найден в БД");
    }

    private static HashMap<String, ArrayList<String>> createMap() {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        map.put("Иванов И.И.", new ArrayList<String>(Arrays.asList("+8 800 2000 500", " +8 800 200 600")));
        map.put("Петров П.П.", new ArrayList<String>(Arrays.asList("+8 800 2000 700")));
        map.put("Сидоров С.С.", new ArrayList<String>(Arrays.asList(" +8 800 2000 800", " +8 800 2000 900", " +8 800 2000 000")));
        return map;
    }
}
