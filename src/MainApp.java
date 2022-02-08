import Model.User;

public class MainApp {

    public static void main(String[] args) {

//        User user = new User("Rafaela", "Testowa", "test@wp.pl", 35);
//        System.out.println(user.firstName);
//        System.out.println(user.isUserAdult());

//        user.setEmail(("test@wp.ru"));
//        System.out.println(user.getEmail());

        Model.Bug bug = new Model.Bug("This is new bug.","test_buga@com.pl",5);

        bug.showAllBugInfo();
        bug.setDescriptionBug("This is new bug part 2");
        bug.showAllBugInfo();

        bug.setAddressEmail("testcom.pl");
        bug.showAllBugInfo();
        bug.setAddressEmail("test_part2@com.pl");
        bug.showAllBugInfo();

        bug.setPriorityBug(0);
        bug.showAllBugInfo();
        bug.setPriorityBug(4);
        bug.showAllBugInfo();


    }
}
