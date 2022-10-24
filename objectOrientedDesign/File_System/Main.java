package objectOrientedDesign.File_System;

public class Main {

    public static void main(String[] args) {
        Directory root = new Directory("Food", null);
        File taco = new File("Taco", root, 4);
        File hamburger = new File("Hamburger", root, 9);
        root.addEntry(taco);
        root.addEntry(hamburger);

        Directory fruits = new Directory("Fruits", root);
        File apple = new File("Apple", fruits, 5);
        File banana = new File("Banana", fruits, 6);
        fruits.addEntry(apple, banana);

        root.addEntry(fruits);

        System.out.println(root.numberOfFiles());
        System.out.println(fruits.getFullPath());
    }

}
