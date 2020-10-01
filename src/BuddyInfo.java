public class BuddyInfo {

    // name representing a friend
    public String name;

    /**
     * Constructor for BuddyInfo
     * @param name of a friend
     */
    public BuddyInfo(String name) {
        this.name=name;
    }

    /**
     * Return the name of the chosen friend
     * @return String name of chosen friend
     */
    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        //create a BuddyInfo object with the given name of a friend
        BuddyInfo buddy=new BuddyInfo("Homer");
        //Print out a Hello statement
        System.out.println("Hello "+ buddy.getName());
    }

}
