/**
 * Created by Mattnub on 11/03/2016.
 */
public class AccLinkedList {
    /**
     * Properties
     **/
    public Account head = null;
    public int count = 0;

    /**
     * Constructor
     **/
    public AccLinkedList() {
    }

    /**
     * Behaviors
     **/
    public void addAccount(Account a) {
        if (count == 0) {
            head = a;
        } else {
            if (count == 1) {
                if (head.getBalance() > a.getBalance()) {
                    head.next = a;
                    head = a;
                } else {
                    head.next = a;
                }
            } else {
              
                } else {
                    Account previous = head;
                    Account current = head.next;
                    try {

                        while (!((a.getBalance() > previous.getBalance()) && (a.getBalance() < current.getBalance()))) {
                            previous = current;
                            current = current.next;
                            if (current == null) {
                                previous.next = a;
                            }
                        }
                        a.next = current;
                        previous.next = a;
                    } catch (Exception ex) {
                        previous.next = a;
                    }
                }
            }
        }
        count++;
    }

    public void display() {
        Account item = head;
        System.out.println("Items in List: " + count);
        for (; item != null; ) {
            item.display();
            item = item.next;
        }
    }

    public static void main(String[] args) {
        Account a1, a2, a3, a4, a5;
        a1 = new Account(1111, "Frank", 1500.0);
        a2 = new Account(2222, "Bill", 1300.0);
        a3 = new Account(3333, "George", 1000.0);
        a4 = new Account(4444, "Smitty", 650.0);
        a5 = new Account(5555, "Harrison", 300.0);

        AccLinkedList accountList = new AccLinkedList();
        accountList.addAccount(a4);
        accountList.addAccount(a2);
        accountList.addAccount(a5);
        accountList.addAccount(a1);
        accountList.addAccount(a3);
    }
}

