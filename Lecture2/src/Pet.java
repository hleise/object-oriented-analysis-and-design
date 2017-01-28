
// All classes inherit from a java object automatically
public class Pet {
    private int age;
    private String name;
    private String type;
    
    public Pet() {
        // age = -1;
        // name = "unknown";
        // type = "unknown";
        
        // Calls default constructor. This is prettier than the above.
        this(-1, "unknown", "unknown");
    }
    
    public Pet(int _age, String _name, String _type) {
        age = _age;
        name = _name;
        type = _type;
    }
    
    public String toString() {
        return name + " [" + age + "] is a " + type;
    }
    
    // Can automatically create getter and setters under Source > Generate Getters and Setters
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        // could add an _ in front of the parameter name
        // then you don't need 'this' since it can differentiate the two
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
}
