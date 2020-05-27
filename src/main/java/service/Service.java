package service;

import model.Customer;
import model.Customers;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class Service {

    public Customers processFromPojoToXml() {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(Customers.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        Unmarshaller unmarshaller = null;
        try {
            unmarshaller = context.createUnmarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        File f = new File("customers_small.xml"); //resources/

        Customers customers = null;
        try {
            customers = (Customers) unmarshaller.unmarshal(f);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        List<Customer> customerList = customers.getCustomerList();


        for (Customer customer: customerList) {
            System.out.println(customer);
        }

    return new Customers();
    }

    public void processFromXmlToPojo() {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(Customers.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        Unmarshaller unmarshaller = null;
        try {
            unmarshaller = context.createUnmarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        File f = new File("customers_small.xml"); //resources/

        Customers customers = null;
        try {
            customers = (Customers) unmarshaller.unmarshal(f);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        List<Customer> customerList = customers.getCustomerList();


        for (Customer customer: customerList) {
            System.out.println(customer);
        }

    }
}
