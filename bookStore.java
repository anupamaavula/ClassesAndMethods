
// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class bookStore {
    public String name;
    public String address;
    public int square_feet;
    public boolean usedbooks;
    public boolean isOpen;
    private ArrayList<String> titles;
    
    public bookStore(String name, String address)
    {
    this.name = name;
    this.address = address;
    //all other members set here

    // init the array and then load it.
    titles = new ArrayList<String>();
    loadTitles();
    }
    public void titles2(){
        for(String i:titles)
          System.out.println(i);
    }

    public bookStore() {}

    public bookStore(String name, String address, int square_feet) {
        this.name = name;
        this.address = address;
        this.square_feet = square_feet;
    }
    
    public String getName() {
        return name;

    }

    public String getaddress() {
        return address;

    }

    public int getsquare_feet() {
        return square_feet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setsquare_feet(int square_feet) {
        this.square_feet = square_feet;

    }

    public void printstoredetails() {
        System.out.println("The name of the Store is " + name + "\n" + "It is located at " + address + "\n"
                + "Size of the store is  " + square_feet + " sqft");
    }

    public String openTime(String day) {
        if (day.equals("SUNDAY")) {
            return "Sorry, we are closed  on Sundays";
        } else if (day.equals("MONDAY")) {
            return "On Monday,Store is  open from 9am to 8pm";
        } else if (day.equals("TUESDAY")) {
            return "On Tuesday,Store is open from 9am to 8pm";
        } else if (day.equals("WEDNESDAY")) {
            return "On Wednesday,Store is  open from 9am to 8pm";
        } else if (day.equals("THURSDAY")) {
            return "On Thusrday,Store is open from 9am to 8pm";
        } else if (day.equals("FRIDAY")) {
            return "On Friday,Store is  open from 9am to 8pm";
        } else if (day.equals("SATURDAY")) {
            return "On Saturday,Store is  open from 10am to 6pm";
        }
        return day;
    }
    public void usedbookscondition() {
        if (usedbooks == false) {
            System.out.println("Store has no used books");
        } else {
            System.out.println("Store has used books");
        }

    }

    private void loadTitles()
{
  try
  {
    Utils.loadStringsToArray(this.titles);
  }
  catch (IOException e)
  {
    // for now simply init the array to zero
    System.out.println("Could not initilize the titles");
    // make sure it is empty
    this.titles = new ArrayList<String>();
    
  }
}

    public static void main(String[] args) {
        bookStore Book_store= new bookStore("TTS","Abc street,Charlotte",100);
        Book_store.printstoredetails();

        Scanner scan = new Scanner(System.in);
        bookStore check = new bookStore();
        System.out.println("What day are you looking to visit?");
        String input = scan.nextLine();
        System.out.println(check.openTime(input));
        scan.close();

        System.out.println("Checking weather the store has new or used books? ");
        Book_store.usedbookscondition();

        Book_store.titles2();

 }
}