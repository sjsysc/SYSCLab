import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> Buddy;


    public AddressBook() {
      Buddy = new ArrayList<BuddyInfo>();
    }

    public boolean addBuddy(BuddyInfo newbuddy){
        return Buddy.add(newbuddy);
    }

    public boolean removeBuddy(BuddyInfo clearbuddy){
        return Buddy.remove(clearbuddy);
    }
    public static void main(String[] args) {

        System.out.println("Address Book2");
    }

}
