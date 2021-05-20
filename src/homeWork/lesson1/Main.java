package homeWork.lesson1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> catLinkedHashMap = new LinkedHashMap<>();
        ArrayList dogArrayList = new ArrayList();
        LinkedList catLinkedList = new LinkedList();

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

        String scottishLopEared = "Scottish Lop-eared";
        String britishShorthair = "British Shorthair";
        String maineCoon = "Maine Coon";
        System.out.println(catLinkedList);
        catLinkedList.add(scottishLopEared);
        catLinkedList.add(englishBulldog);
        catLinkedList.add(beagle);
        System.out.println(catLinkedList);


    }
}
