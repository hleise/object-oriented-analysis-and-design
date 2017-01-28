public class MP3 extends Media{
    
    private int year;
    public MP3(String title, int year)
    {
        this.title = title;
        this.year = year;
    }
    public int getYear()     { return year;  }
    public String toString()
    {
        return year + ": " + title + " [MP3]";
    }
    public int compareTo(Media _m) {
        if (_m instanceof MP3) {
            MP3 m = (MP3) _m; // Necessary to tell the compiler it's okay
            int result = this.title.compareTo(m.title);
            if (result == 0)
                result = this.getYear() - m.getYear();
            return result;
        }
        else {
            return super.compareTo(_m);
        }
     }
}
