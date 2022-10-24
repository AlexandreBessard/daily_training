package objectOrientedDesign.File_System;

public class Entry {
    Directory parent;
    String name;
    public Entry(String name, Directory directory) {
        this.name = name;
        parent = directory;
    }
}
