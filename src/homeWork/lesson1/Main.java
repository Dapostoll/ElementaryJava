package homeWork.lesson1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Animal objectsphinx = new Animal("Sphinx");
        Map<String, String> catLinkedHashMap = new LinkedHashMap<>();
        ArrayList dogArrayList = new ArrayList();
        LinkedList catLinkedList = new LinkedList();
        Map hastable = new Hashtable();
        Map treeMap = new TreeMap();
        List stack = new Stack();
        Set iset = new HashSet();
        iset.add(objectsphinx);
        Iterator itr = iset.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().toString());
        }
        stack.add(objectsphinx);
        stack.add("1234");
        stack.add(objectsphinx);
        System.out.println(stack);
        stack.remove(1);
        System.out.println(stack);
        System.out.println(hastable);
        hastable.put(1, 2);
        treeMap.putAll(hastable);
        System.out.println(treeMap);
        treeMap.clear();
        System.out.println(hastable);
        hastable.equals(objectsphinx);
        hastable.remove(1);
        hastable.put(objectsphinx, 23);
        System.out.println(hastable);
        catLinkedHashMap.put("Sphinx", "Sphinx");
        System.out.println(catLinkedHashMap);
        catLinkedHashMap.clear();
        System.out.println(catLinkedHashMap);
        String sphinx = "Sphinx ";
        String siamese = "Siamese ";
        String sphinxPrice = " 400$";
        String siamesePrice = " 300$";
        System.out.println(catLinkedHashMap.toString());
        catLinkedHashMap.put(sphinx, sphinxPrice);
        catLinkedHashMap.put(siamese, siamesePrice);
        System.out.println(catLinkedHashMap.toString());
        String frenchBulldog = "French Bulldog";
        String englishBulldog = "English Bulldog";
        String beagle = "Beagle";
        System.out.println(dogArrayList);
        dogArrayList.add(frenchBulldog);
        dogArrayList.add(englishBulldog);
        dogArrayList.add(beagle);
        System.out.println(dogArrayList);
        dogArrayList.remove(2);
        System.out.println(dogArrayList);
        dogArrayList.removeAll(dogArrayList);
        System.out.println(dogArrayList);
        String scottishLopEared = "Scottish Lop-eared";
        System.out.println(catLinkedList);
        catLinkedList.add(scottishLopEared);
        catLinkedList.add(englishBulldog);
        catLinkedList.add(beagle);
        System.out.println(catLinkedList);
    }
}
