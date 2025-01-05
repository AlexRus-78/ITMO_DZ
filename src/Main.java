import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Создаем лист
        ArrayList<String> list =new ArrayList<>();


        //Добавляем элемент

        list.add(0,"Яблоко");
        list.add(1,"Грушка");
        list.add(2,"Персик");
        list.add("Абрикос");

        //Выводим весь массив в строку
        System.out.println(list);



        //Выводим один элемент массива
        System.out.println("Выводим  третий элемент массива - " +  list.get(3-1));
        System.out.println();   // отсупаем строку

        // Выводим все элементы массива
        for (String lists : list){
            System.out.println(lists);
        }

        // Размер массива
        System.out.println("Размер массива " + list.size());

        // Ищем есть ли элемент в массиве
        System.out.println("Ищем элемент Персик ");

        boolean yesNo = list.contains("Персик");
        System.out.println("Нашил или нет -  " + yesNo);


        // Ищем есть ли элемент в массиве и получаем его индекс
        System.out.println("Элемент имеет индекс " + list.indexOf("Персик"));


        // Iterrator
        Iterator myIterator = list.iterator();
        System.out.println("Indexof только через iterator - " + list.indexOf(myIterator.next()));




        // Очистить весь массив
        list.clear();
        System.out.println("Количестово элементов в массиве - " + list.size());
        System.out.println("Массив содержит - " + list);
    }
}