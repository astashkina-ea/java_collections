package collectionExample;

import java.util.ArrayList;

// Collection - базовый интерфейс для всех коллекций и других интерфейсов коллекций
//Интерфейс Collection является обобщенным и расширяет интерфейс Iterable,
// поэтому все объекты коллекций можно перебирать в цикле по типу for-each.

//Collection
//    boolean add (E item): добавляет в коллекцию объект item. При удачном добавлении возвращает true, при неудачном - false
//
//    boolean addAll (Collection<? extends E> col): добавляет в коллекцию все элементы из коллекции col. При удачном добавлении возвращает true, при неудачном - false
//
//    void clear (): удаляет все элементы из коллекции
//
//    boolean contains (Object item): возвращает true, если объект item содержится в коллекции, иначе возвращает false
//
//    boolean isEmpty (): возвращает true, если коллекция пуста, иначе возвращает false

// Iterator<E> iterator (): возвращает объект Iterator для обхода элементов коллекции
//
//    boolean remove (Object item): возвращает true, если объект item удачно удален из коллекции, иначе возвращается false
//
//    boolean removeAll (Collection<?> col): удаляет все объекты коллекции col из текущей коллекции. Если текущая коллекция изменилась, возвращает true, иначе возвращается false
//
//    boolean retainAll (Collection<?> col): удаляет все объекты из текущей коллекции, кроме тех, которые содержатся в коллекции col. Если текущая коллекция после удаления изменилась, возвращает true, иначе возвращается false
//
//    int size (): возвращает число элементов в коллекции
//
//    Object[] toArray (): возвращает массив, содержащий все элементы коллекции

//AbstractCollection
//базовый абстрактный класс для других коллекций, который применяет интерфейс Collection


public class ArrayListExample_01 {
    public static void main(String[] args) {

        //Для создания простых списков применяется интерфейс List, который расширяет функцональность интерфейса Collection.
        //у него есть те же методы что и Collection +
//        void add(int index, E obj): добавляет в список по индексу index объект obj
//
//        boolean addAll(int index, Collection<? extends E> col): добавляет в список по индексу index все элементы коллекции col. Если в результате добавления список был изменен, то возвращается true, иначе возвращается false
//
//        E get(int index): возвращает объект из списка по индексу index
//
//        int indexOf(Object obj): возвращает индекс первого вхождения объекта obj в список. Если объект не найден, то возвращается -1
//
//        int lastIndexOf(Object obj): возвращает индекс последнего вхождения объекта obj в список. Если объект не найден, то возвращается -1
//        ListIterator<E> listIterator (): возвращает объект ListIterator для обхода элементов списка
//
//        static <E> List<E> of(элементы): создает из набора элементов объект List
//
//        E remove(int index): удаляет объект из списка по индексу index, возвращая при этом удаленный объект
//
//        E set(int index, E obj): присваивает значение объекта obj элементу, который находится по индексу index
//
//        void sort(Comparator<? super E> comp): сортирует список с помощью компаратора comp
//
//        List<E> subList(int start, int end): получает набор элементов, которые находятся в списке между индексами start и end

// List реализует ArrayList
        //По умолчанию в Java есть встроенная реализация этого интерфейса - класс ArrayList.
        // Класс ArrayList представляет обобщенную коллекцию, которая наследует свою функциональность от класса AbstractList
        // и применяет интерфейс List. Проще говоря, ArrayList представляет простой список, аналогичный массиву,
        // за тем исключением, что количество элементов в нем не фиксировано.

        //у ArrayList-a нет размера в отличии от массива

        //    ArrayList(): создает пустой список
        //
        //    ArrayList(Collection <? extends E> col): создает список, в который добавляются все элементы коллекции col.
        //
        //    ArrayList (int capacity): создает список, который имеет начальную емкость capacity
        //
        //
        //Емкость в ArrayList представляет размер массива, который будет использоваться для хранения объектов.
        // При добавлении элементов фактически происходит перераспределение памяти - создание нового массива и копирование
        // в него элементов из старого массива. Изначальное задание емкости ArrayList позволяет снизить подобные
        // перераспределения памяти, тем самым повышая производительность.


        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>(list);//на вход подается другой массив
        ArrayList<String> list2 = new ArrayList<String>(10);//имеет емкость

        list.add("Hello"); //добавить эл-т листа
        list.add("World");

        System.out.println(list.get(0)); //получить эл-т листа
        list.set(1, "World!"); //изменить эл-т листа
        //пройтись по эл-там листа вар1
        for (int i = 0; i < list.size(); i++) { // получить размер диста
            System.out.println(list.get(i));
        }
        //вар2
        for (String el : list) {
            System.out.println(el);
        }

        System.out.println(list.toString()); //вывести весь лист
        list.add(0, "Start"); //добавление в начало листа
        System.out.println(list.toString());
        list.remove(0); //удаление эл-та листа
        System.out.println(list.toString());
        System.out.println(list.contains("Hello")); //проверяет содержит ли лист это слово

        String[] sa = new String[3];
        list.toArray(sa);//сдлеать лист массиовом
        System.out.println(sa[0]);


    }

}
