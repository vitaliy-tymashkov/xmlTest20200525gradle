import service.Service;

import javax.xml.bind.JAXBException;

public class App {
    public static void main(String[] args) throws JAXBException {


        System.out.println("START");

        new Service().processFromXmlToPojo();


    }
}
