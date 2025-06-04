package student_management.model.entity;

public class Student {
    private String studentId;
    private String studentName;
    private String studentClass;
    private String studentAddress;
    private Float mathScore;
    private Float literatureScore;
    private Float languageScore;

    public Student() {
    }

    public Student(String studentId, String studentName, String studentClass, String studentAddress, Float mathScore, Float literatureScore, Float languageScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.studentAddress = studentAddress;
        this.mathScore = mathScore;
        this.literatureScore = literatureScore;
        this.languageScore = languageScore;
    }

    public Student(String studentId, String studentName, String studentClass, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.studentAddress = studentAddress;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Float getMathScore() {
        return mathScore;
    }

    public void setMathScore(Float mathScore) {
        this.mathScore = mathScore;
    }

    public Float getLiteratureScore() {
        return literatureScore;
    }

    public void setLiteratureScore(Float literatureScore) {
        this.literatureScore = literatureScore;
    }

    public Float getLanguageScore() {
        return languageScore;
    }

    public void setLanguageScore(Float languageScore) {
        this.languageScore = languageScore;
    }

    @Override
    public String toString() {
        return "id: " + this.studentId +
                "; name: " + this.studentName +
                "; class: " + this.studentClass +
                "; address: " + this.studentAddress +
                "; math: " + this.mathScore +
                "; literature: " + this.literatureScore +
                "; language: " + this.languageScore;
    }
}
