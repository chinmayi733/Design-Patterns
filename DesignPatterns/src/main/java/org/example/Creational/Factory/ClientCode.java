package org.example.Creational.Factory;

public class ClientCode {
    public static void main(String[] args) {

        //Tightly coupled (object creation) client is aware of subclass object creation
//        Transport t = new RoadTransport();
//        t.deliver();
//
//        Transport t1 = new SeaTransport();
//        t1.deliver();
        //suppose their is one more type of transport introduced the??
        //when we want to create a single object of a type and if we have multiple subclasses/subtypes then instead of creating object on client side
        // we can have a factory to return us the desired type of object

        Transport t =TransportFactory.getInstance("SEA");
        t.deliver();

        //now clientcode is unaware of object creation on it's side, object gets created in factory
        //if else if else on client side is moved on factory side
        //so multiple instances jaha we have to decide which object is to be created is replaced by factory method
        //code clean and robust
        //code extensibility
        //example: valueOf method

        String.valueOf(1);
    }
}
