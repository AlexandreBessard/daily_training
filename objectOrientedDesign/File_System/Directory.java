package objectOrientedDesign.File_System;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {

    List<Entry> contents;

    public Directory(String name, Directory directory) {
        super(name, directory);
        contents = new ArrayList<>();
    }

    public void addEntry(Entry... entry) {
        contents.addAll(List.of(entry));
    }

    public String getFullPath() {
        if(parent != null) {
            return parent.getFullPath() + "/" + name;
        } else {
            return name;
        }
    }

    public int numberOfFiles() {
        int count = 0;
        for(Entry entry : contents) {
            if(entry instanceof Directory) {
                count += ((Directory) entry).numberOfFiles();
            } else if(entry instanceof File) {
                count += ((File) entry).size;
            }
        }
        return count;
    }
}
