package inheritance;

public class teacher extends person {
    
    String qualification;
    
    void displayInformation2()
    {
        displayInformation();
        System.out.println("Qualification: " +qualification);


    }
}