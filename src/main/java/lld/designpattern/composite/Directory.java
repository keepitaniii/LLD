package main.java.lld.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
  String directoryName;
  List<FileSystem> directories = new ArrayList<>();

  public Directory(String name) {
    this.directoryName = name;
  }

  public void add(FileSystem fileSystem) {
    this.directories.add(fileSystem);
  }

  @Override
  public void ls() {
    System.out.println("Directory name: " + directoryName);

    for (FileSystem fs : directories) {
      fs.ls();
    }
  }
}
