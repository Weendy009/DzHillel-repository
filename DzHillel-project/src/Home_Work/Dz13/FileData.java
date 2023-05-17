package Home_Work.Dz13;

import java.util.Objects;

public class FileData {
    private final String fileName;
    private final int fileSize;
    private final String filePath;

    public FileData(String fileName, int fileSize, String filePath) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.filePath = filePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileData fileData = (FileData) o;

        if (fileSize != fileData.fileSize) return false;
        if (!Objects.equals(fileName, fileData.fileName)) return false;
        return Objects.equals(filePath, fileData.filePath);
    }

    @Override
    public int hashCode() {
        int result = fileName != null ? fileName.hashCode() : 0;
        result = 31 * result + fileSize;
        result = 31 * result + (filePath != null ? filePath.hashCode() : 0);
        return result;
    }

    public String getFileName() {
        return fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public String getFilePath() {
        return filePath;
    }
}
