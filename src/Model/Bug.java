package Model;

import org.w3c.dom.ls.LSOutput;

public class Bug {
    private String descriptionBug;
    private String addressEmail;
    private int priorityBug;
    private boolean isOpen;

    public Bug(String descriptionBug, String addressEmail, int priorityBug) {
        this.descriptionBug = descriptionBug;
        this.addressEmail = addressEmail;
        this.priorityBug = priorityBug;
        this.isOpen = false;
    }

    //Gettery i Settery

    public String getDescriptionBug() {
        return descriptionBug;
    }

    public void setDescriptionBug(String descriptionBug) {
        if ((descriptionBug.length()) < 10) {
            System.out.println("Incorrect bug description");
        } else {
            this.descriptionBug = descriptionBug;
        }
    }

    public String getAddressEmail() {
        return addressEmail;
    }

    public void setAddressEmail(String addressEmail) {
        if (!addressEmail.contains("@")) {
            System.out.println("Incorrect email format");
        } else {
            this.addressEmail = addressEmail;
        }
    }

    public int getPriorityBug() {
        return priorityBug;
    }

    public void setPriorityBug(int priorityBug) {
        switch (priorityBug) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.priorityBug = priorityBug;
                break;
            default: {
                System.out.println("Incorrect priority bug");
            }
        }
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    // Metody
    public void showAllBugInfo() {
        System.out.println("Bug description: " + descriptionBug + " " + "Email: " +  addressEmail + " "
                + "Bug priority: " +  priorityBug + " " + "Bug status: " + isOpen);
    }

    public void showEmail() {
        System.out.println("Email: " + addressEmail);
    }

    public void showBugStatus() {
        System.out.println("Model.Bug status: " + isOpen);
    }
}
