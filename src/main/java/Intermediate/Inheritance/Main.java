package Intermediate.Inheritance;

public class Main {
    public static void main(String[] args) {
        IndividualCustomer engin = new IndividualCustomer();
        engin.customerNumber = "12345";


        CorporateCustomer corp = new CorporateCustomer();
        corp.customerNumber = "3456778";

        CustomerManager cus = new CustomerManager();
//        cus.add(engin);
//        cus.add(corp);
        Customer [] customers = {engin, corp};
        cus.addMultiple(customers);

    }
}
