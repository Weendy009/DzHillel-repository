package Home_Work.Dz13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator("/path/to/file");

        FileData file1 = new FileData("files.txt", 100, "/path/to/file");
        FileData file2 = new FileData("firstApp.java", 200, "/path/to/file");
        FileData file3 = new FileData("document.docx", 150, "/another/path");

        fileNavigator.add(file1);
        fileNavigator.add(file2);
        fileNavigator.add(file3);

        List<FileData> filesAtPath = fileNavigator.find("/path/to/file");
        System.out.println("Files by path /path/to/file:");
        for (FileData file : filesAtPath) {
            System.out.println(file.getFileName());
        }
        System.out.println();

        long maxSize = 150;
        List<FileData> filteredFiles = fileNavigator.filterBySize(maxSize);
        System.out.println("Files whose size does not exceed " + maxSize + " bytes:");
        for (FileData file : filteredFiles) {
            System.out.println(file.getFileName());
        }
        System.out.println();

        String filePathToRemove = "/path/to/file";
        fileNavigator.remove(filePathToRemove);
        filesAtPath = fileNavigator.find(filePathToRemove);
        if (filesAtPath == null) {
            System.out.println("Files by path " + filePathToRemove + " відсутні");
        }
        System.out.println();

        List<FileData> sortedFiles = fileNavigator.sortBySize();
        System.out.println("Files sorted by size:");
        for (FileData file : sortedFiles) {
            System.out.println(file.getFileName() + " - " + file.getFileSize() + " байтів");
        }
        System.out.println();
    }
}
