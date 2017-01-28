
public class Driver {

    public static void main(String[] args) {
        Pet myPet = new Pet();
        myPet.setName("Sassy");
        myPet.setType("Cat");
        myPet.setAge(2);
        
        Pet yourPet = new Pet(4, "Lucky", "Fish");
        
        System.out.println(myPet.toString());
        System.out.println(yourPet.toString());
    }

}
