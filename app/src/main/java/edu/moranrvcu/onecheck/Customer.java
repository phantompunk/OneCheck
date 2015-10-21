package edu.moranrvcu.onecheck;

/**
 * Created by rigo on 10/21/15.
 */
public class Customer {

    private String firstName;
    private String lastName;
    private String custID;
    private String[] acctID;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String[] getAcctID() {
        return acctID;
    }

    public void setAcctID(String[] acctID) {
        this.acctID = acctID;
    }
}
