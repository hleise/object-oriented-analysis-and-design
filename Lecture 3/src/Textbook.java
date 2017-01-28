
public class Textbook extends Book {
    private int gradeLevel;
    
    public Textbook(String title, int totalPages, int gradeLevel) {
        super(title, totalPages);
        this.setGradeLevel(gradeLevel);
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    
    public void printDetails() {
        System.out.println("Grade Level: " + this.gradeLevel);
    }
    
    public void restart() {
        
    }
    
    public void setRandomStartPosition() {
        
    }
    
}
