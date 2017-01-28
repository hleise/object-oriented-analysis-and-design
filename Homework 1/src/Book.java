class Book extends Media
{
    private String author;
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
	public String getAuthor() { return author; }
    public String toString()
    {
        return getTitle() + " by " + getAuthor();
	}
    public int compareTo(Media m) {
        if (m instanceof Book) {
            Book b = (Book) m; // Necessary to tell the compiler it's okay
            int result = this.getTitle().compareTo(b.getTitle());
            if (result == 0)
                result = this.getAuthor().compareTo(b.getAuthor());
            return result;
        }
        else {
            return super.compareTo(m);
        }
     }
}

