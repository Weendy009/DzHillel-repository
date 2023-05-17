package Home_Work.Dz13;

import java.util.*;

public class FileNavigator {
    private final String filesPath;
    private Map<String, List<FileData>> fileMap;

    public FileNavigator(String filesPath) {
        this.filesPath = filesPath;
        this.fileMap = new HashMap<>();
    }

    public void add(FileData fileData) {
        String filePath = fileData.getFilePath();

        if (!filePath.equals(filesPath)) {
            System.err.println("Помилка: шлях-ключ і шлях до файлу не співпадають!");
            return;
        }

        if (fileMap.containsKey(filePath)) {
            List<FileData> files = fileMap.get(filePath);
            files.add(fileData);
        } else {
            List<FileData> files = new ArrayList<>();
            files.add(fileData);
            fileMap.put(filePath, files);
        }
    }


    public List<FileData> find(String keyPath) {
        return fileMap.get(keyPath);
    }

    public List<FileData> filterBySize(long byteSize) {
        List<FileData> filteredFiles = new ArrayList<>();

        for (List<FileData> fileList : fileMap.values()) {
            for (FileData file : fileList) {
                if (file.getFileSize() <= byteSize) {
                    filteredFiles.add(file);
                }
            }
        }

        return filteredFiles;
    }

    public void remove(String filePath) {
        fileMap.remove(filePath);
    }

    public List<FileData> sortBySize() {
        List<FileData> allFiles = new ArrayList<>();

        for (List<FileData> fileList : fileMap.values()) {
            allFiles.addAll(fileList);
        }

        Collections.sort(allFiles, Comparator.comparingLong(FileData::getFileSize));

        return allFiles;
    }


}
