package objectOrientedDesign.File_System;

public class File extends Entry {
    int size;

    public File(String name, Directory directory, int size) {
        super(name, directory);
        this.size = size;
    }
}
