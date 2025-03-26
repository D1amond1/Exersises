import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class Excersises {
    public static void main(String[] args) {
        //ArrayList

        // 17
        ArrayList<String> clear17 = new ArrayList<>();
        clear17.add("Something");
        clear17.add("Word1");
        clear17.add("Word2");

        clear17.clear();

        System.out.println(clear17);

        //18
        ArrayList<String> empty = new ArrayList<>();
        empty.add("Java");

        System.out.println(empty.isEmpty());

        empty.clear();

        System.out.println(empty.isEmpty());

        //19
        ArrayList<Integer> minimize = new ArrayList<>(100);
        minimize.add(10);
        minimize.add(20);

        System.out.println(minimize.size());

        minimize.trimToSize();

        System.out.println(minimize.size());

        //20
        ArrayList<String> increase = new ArrayList<>();
        increase.add("Red");
        increase.add("Green");

        System.out.println(increase.size());

        while (increase.size() < 5) {
            increase.add(null);
        }

        System.out.println(increase.size());

        //21
        ArrayList<String> replace = new ArrayList<>();
        replace.add("Iphone");
        replace.add("Banana");
        replace.add("Car");

        System.out.println(replace);

        replace.set(1, "Torsher");

        System.out.println(replace);

        //22
        ArrayList<String> positions = new ArrayList<>();
        positions.add("Java");
        positions.add("Python");
        positions.add("Js");
        positions.add("Dart");

        for (int i = 0; i < positions.size(); i++) {
            System.out.println("Позиция " + i + ": " + positions.get(i));
        }

        //LinkedList

        //21
        LinkedList<String> last = new LinkedList<>();
        last.add("Apple");
        last.add("Banana");
        last.add("Cherry");

        String lastElement = last.peekLast();
        System.out.println(lastElement);
        System.out.println(last);

        //22
        LinkedList<Integer> check = new LinkedList<>();
        check.add(10);
        check.add(20);
        check.add(30);

        System.out.println(check.contains(20));
        System.out.println(check.contains(99));

        //23
        LinkedList<String> convert = new LinkedList<>();
        convert.add("Java");
        convert.add("Python");
        convert.add("Js");

        ArrayList<String> arrayList = new ArrayList<>(convert);

        System.out.println(arrayList);

        //24
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("A");
        list2.add("B");

        System.out.println(list1.equals(list2));

        //25
        LinkedList<String> listEmpty = new LinkedList<>();
        System.out.println(listEmpty.isEmpty());

        listEmpty.add("Hello");
        System.out.println(listEmpty.isEmpty());

        //26
        LinkedList<String> listReplace = new LinkedList<>();
        listReplace.add("Red");
        listReplace.add("Green");
        listReplace.add("Blue");

        System.out.println(listReplace);

        listReplace.set(1, "Yellow");

        System.out.println(listReplace);

        //HashSet

        //7
        HashSet<String> convertAr = new HashSet<>();
        convertAr.add("Red");
        convertAr.add("Green");
        convertAr.add("Blue");
        String[] colorsArray = convertAr.toArray(new String[0]);
        System.out.println(Arrays.toString(colorsArray));

        //8
        HashSet<String> convertTs = new HashSet<>();
        convertTs.add("Paris");
        convertTs.add("London");
        convertTs.add("Tokyo");
        TreeSet<String> citiesTreeSet = new TreeSet<>(convertTs);
        System.out.println(citiesTreeSet);

        //9
        TreeSet<Integer> numbersTS = new TreeSet<>();
        numbersTS.add(3);
        numbersTS.add(5);
        numbersTS.add(7);
        numbersTS.add(9);
        Set<Integer> lessThan7 = numbersTS.headSet(7);
        System.out.println(lessThan7);

        //10
        HashSet<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        HashSet<String> set2 = new HashSet<>();
        set2.add("A");
        set2.add("B");
        set2.add("D");
        System.out.println(set1.equals(set2));

        //11
        HashSet<String> setA = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        HashSet<String> setB = new HashSet<>();
        setB.add("D");
        setB.add("E");
        setB.add("C");

        setA.retainAll(setB);
        System.out.println(setA);

        //12.
        HashSet<String> tempSet = new HashSet<>();
        setB.add("One");
        setB.add("Two");
        setB.add("Tree");

        tempSet.clear();
        System.out.println(tempSet);

        //TreeSet

        //11
        TreeSet<Integer> ages = new TreeSet<>();
        ages.add(20);
        ages.add(25);
        ages.add(30);
        ages.add(35);
        System.out.println(ages.floor(28));

        //12
        TreeSet<Integer> scores = new TreeSet<>(Arrays.asList(50, 65, 80, 90));
        scores.add(50);
        scores.add(65);
        scores.add(80);
        scores.add(90);
        System.out.println(scores.ceiling(75));

        //13
        TreeSet<Integer> prices = new TreeSet<>();
        prices.add(100);
        prices.add(200);
        prices.add(300);
        prices.add(400);
        System.out.println(prices.lower(250));

        //14
        TreeSet<String> names = new TreeSet<>();
        names.add("People");
        names.add("Bala");
        names.add("Adam");
        System.out.println(names.pollFirst());
        System.out.println(names);

        //15
        TreeSet<String> fruitsTS = new TreeSet<>();
        fruitsTS.add("Apple");
        fruitsTS.add("Banana");
        fruitsTS.add("Potato");
        System.out.println(fruitsTS.pollLast());
        System.out.println(fruitsTS);

        //16
        TreeSet<Integer> temps = new TreeSet<>();
        temps.add(15);
        temps.add(20);
        temps.add(25);
        temps.add(30);

        temps.remove(20);
        System.out.println(temps);

        //PriorityQueue

        //7
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.add("A");
        queue1.add("B");
        queue1.add("C");
        PriorityQueue<String> queue2 = new PriorityQueue<>();
        queue2.add("A");
        queue2.add("C");
        queue2.add("B");
        System.out.println(queue1.equals(queue2));

        //8
        PriorityQueue<Integer> numbersPQ = new PriorityQueue<>();
        numbersPQ.add(5);
        numbersPQ.add(3);
        numbersPQ.add(8);
        System.out.println("8. First element: " + numbersPQ.peek());

        //9
        PriorityQueue<String> tasks = new PriorityQueue<>();
        tasks.add("Task1");
        tasks.add("Task2");
        tasks.add("Task3");
        System.out.println(tasks.poll());
        System.out.println(tasks);

        //10
        PriorityQueue<Character> letters = new PriorityQueue<>();
        letters.add('A');
        letters.add('C');
        letters.add('B');
        Character[] lettersArray = letters.toArray(new Character[0]);
        System.out.println(Arrays.toString(lettersArray));

        //11
        PriorityQueue<Double> values = new PriorityQueue<>();
        values.add(1.5);
        values.add(2.3);
        values.add(0.8);
        System.out.println(values.toString());

        //12
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(15);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(minHeap);
        System.out.println(maxHeap);

        //HashMap

        //6
        HashMap<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "One");
        originalMap.put(2, "Two");
        HashMap<Integer, String> copiedMap = new HashMap<>(originalMap);
        System.out.println(copiedMap);

        //7
        HashMap<String, Integer> wordCount = new HashMap<>();
        wordCount.put("apple", 5);
        wordCount.put("banana", 3);
        System.out.println(wordCount.containsKey("apple"));

        //8
        System.out.println(wordCount.containsValue(3));

        //9
        HashMap<Character, Boolean> flags = new HashMap<>();
        flags.put('A', true);
        flags.put('B', false);
        Set<Map.Entry<Character, Boolean>> entries = flags.entrySet();
        System.out.println(entries);

        //10
        HashMap<String, String> countries = new HashMap<>();
        countries.put("FR", "France");
        countries.put("UK", "United Kingdom");
        System.out.println(countries.get("FR"));

        //11
        Set<String> countryCodes = countries.keySet();
        System.out.println(countryCodes);

        //12
        Collection<String> countryNames = countries.values();
        System.out.println(countryNames);

        //TreeMap

        //6
        TreeMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Zebra", 5);
        sortedMap.put("Ant", 2);
        TreeMap<String, Integer> sortedMapCopy = new TreeMap<>(sortedMap);
        System.out.println(sortedMapCopy);

        //7
        System.out.println(sortedMap.containsKey("Ant"));

        //8
        System.out.println(sortedMap.containsValue(5));

        //9
        Set<Map.Entry<String, Integer>> sortedEntries = sortedMap.entrySet();
        System.out.println(sortedEntries);

        //10
        System.out.println(sortedMap.get("Zebra"));

        //11
        Set<String> animals = sortedMap.keySet();
        System.out.println(animals);

        //12
        Collection<Integer> counts = sortedMap.values();
        System.out.println(counts);
    }

}