abstract class Media implements Comparable<Media>
{
    protected String title;
	public String getTitle()  { return title; }
	public int compareTo(Media m) {
	    String cName = this.getClass().getName();
	    return -cName.compareTo(m.getClass().getName());
	}
}
