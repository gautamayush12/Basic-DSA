package JavaConceptsPrac;

public class singletonPattern{
    //Steps:
    //Create a private static variable of the same class that is the only instance of the class.
    private static singletonPattern instance;
    //Make the constructor private so that this class cannot be instantiated.
    private singletonPattern(){}
    //Create a public static method getInstance that returns the instance of the class.
    public static singletonPattern getInstance(){
        //Apply conditional check to ensure that only one instance is created.
        if(instance == null){
            instance  = new singletonPattern();
        }return instance;
    }
    public static void main(String[] args) {
        singletonPattern obj1 = new singletonPattern();
        singletonPattern obj2 = new singletonPattern();
        System.out.println(obj1 == obj2);   
        // This will print false as both are different instances
    }
}