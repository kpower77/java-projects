
package hello;
import java.util.*;
/**
 * @author Kenneth Power x14101556
 * 
 */
public class HelloMessage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Set up GUI
        //PersonGUI myGUI = new PersonGUI();
        //myGUI.setVisible(true);
        
        //Set up and add to ArrayList
        ArrayList<String> personInfo = new ArrayList<String>(); 
        personInfo.add("Frank");
        personInfo.add("Mary");
        personInfo.add("Mark");
        personInfo.add("Brian");
        personInfo.add("Joan");
        
        System.out.println("Personal Information: " + personInfo.toString());
        
        personInfo.remove("Mary");
        
        System.out.println("Personal Information: " + personInfo.toString());
        
        //Print out list of names using for loop
        System.out.println();
        System.out.println("For loop: ");
        for(int i = 0; i < personInfo.size(); i++){
            System.out.println(personInfo.get(i));
        }
        
        //Print out list of names using Iterator
        System.out.println();
        System.out.println("Iterator: ");
        Iterator i;
        i = personInfo.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
        //Prompt user to enter name to search for
        System.out.println();
        System.out.println("Enter name to search: ");
        Scanner keyboard = new Scanner(System.in);
        String searchName = keyboard.nextLine();
        
        //Go through list and if the name is found print 
        for(int j = 0; j < personInfo.size(); j++){
            if(searchName.equals(personInfo.get(j))){
                System.out.println("Match Found!");
            }
        }
        
        //Create new Person
//        Person myPerson = new Person("John", 22);
//        
//        myPerson.printPerson();
//        
//        myPerson.setName("Harry");
//        myPerson.setAge(45);
//        myPerson.printPerson();
        
    }
    
}
