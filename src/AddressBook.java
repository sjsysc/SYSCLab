import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> Buddy;

    public AddressBook() {
      Buddy = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo newbuddy){
        if (newbuddy!=null) {
            Buddy.add(newbuddy);
        }
    }

    public void removeBuddy(int index){
        if (index>0 && index< Buddy.size()) {
            Buddy.remove(index);
        }
    }
    public static void main(String[] args) {
        BuddyInfo b=new BuddyInfo("A");
        BuddyInfo b2=new BuddyInfo("B");
        AddressBook a=new AddressBook();
        a.addBuddy(b);
        a.addBuddy(b2);
        a.removeBuddy(0);
    }

}
