class DVD extends Media
{
    private int year;
    public DVD(String title, int year)
    {
        this.title = title;
        this.year = year;
    }
	public int getYear() 	 { return year;  }
    public String toString()
    {
        return year + ": " + title + " [DVD]";
	}
    public int compareTo(Media m) {
        if (m instanceof DVD) {
            DVD d = (DVD) m; // Necessary to tell the compiler it's okay
            int result = this.title.compareTo(d.title);
            if (result == 0)
                result = this.getYear() - d.getYear();
            return result;
        }
        else {
            return super.compareTo(m);
        }
     }
}
