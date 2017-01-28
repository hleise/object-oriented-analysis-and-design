
// We want reusability, so these methods should only do one thing (not printing also).
public abstract class Book implements Media {
    protected String title;
    protected int pageCount;
    protected int currentPage;
    
    public Book(String title, int totalPages) {
        this.title = title;
        this.pageCount = totalPages;
        setPage(0);
        
        System.out.println("Book Name: " + this.title);
        System.out.println("Total pages: " + this.pageCount);
    }
    
    public void setPage(int newpage) {
        this.currentPage = newpage;
        System.out.println("Current Page: " + this.currentPage);
    }
    
    public void nextPage() {
        if (this.currentPage < this.pageCount) {
            this.currentPage += 1;
        }
        System.out.println("Current Page: " + this.currentPage);
    }
    
    public abstract void printDetails();
}
