package Bai16_copy_file_text.model.entity;

public class FileCopyInfor {
    private String originalPath;
    private String clonePath;

    public FileCopyInfor(){}

    public FileCopyInfor(String originalPath, String clonePath) {
        this.originalPath = originalPath;
        this.clonePath = clonePath;
    }

    public String getOriginalPath() {
        return originalPath;
    }

    public String getClonePath() {
        return clonePath;
    }
}
