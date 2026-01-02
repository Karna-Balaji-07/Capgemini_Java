package OOPs;

class Tracker
{
    private String title;
    private String Author;
    private boolean issued;
    private String issuedTo;

    public Tracker(String Title, String Author){
        this.title = Title;
        this.Author = Author;
        this.issued = false;
        this.issuedTo = null;

    }
    public boolean issueTo(String user){
        if(issued) return false;
        this.issuedTo = user;
        this.issued = true;

        return true;
    }
    public boolean returnBook(){
        if (!issued) {
            return false; // not issued
        }
        this.issued = false;
        this.issuedTo = null;
        return true;
    }

    public boolean isIssued(){
        return issued;
    }
    public String getIssuedTo() {
        return issuedTo;
    }

    public String getTitle() {
        return title;
    }


}


public class SmartLIbrary {
    public static void main(String[] args) {
        Tracker obj = new Tracker("Inferno","Dan Brown");
        if(obj.issueTo("John")) System.out.println("Book issued to John");
        else System.out.println("Book already issued");
        if(!obj.issueTo("Cal")) System.out.println("Cannot issue book now");
        if(obj.returnBook()) System.out.println("Book returned successfully");
        if(!obj.returnBook()) System.out.println("Book has not been issued to return");
    }
}
