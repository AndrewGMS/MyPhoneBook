
public class Runner {

    static PhoneBook phoneBook;

    public static void init(){
  //      phoneBook.addContact();
        phoneBook.addContact("Andrey", "+111 111 11 11", "main" );
        phoneBook.addContact("Boris", "+222 222 22 22", "family" );
        phoneBook.addContact("Carol", "+333 333 33 33", "main" );
        phoneBook.addContact("Dan", "+444 444 44 44", "main" );
        phoneBook.addContact("Edward", "+555 555 55 55", "main" );
    }


    public static void main(String[] args) {
        phoneBook = new PhoneBook();
        init();
        String findName = "Dan";
        System.out.println(findName+ "'s number is " + phoneBook.findPhoneNumber(findName));
        phoneBook.addContact("Forest", "+666 666 66 66", "main" );


    }


}
