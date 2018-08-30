package np.com.pangait.controller;

import np.com.pangait.model.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shova Yakami Dangol on 8/30/2018 5:57 PM.
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping(value="/getCustomer",method= RequestMethod.GET,produces="application/json")
    public Customer getCustomer() {
        Customer cust = new Customer();
        cust.setName("Som");
        cust.setId(1540);
        cust.setAddress("Parasi");
        return  cust;
    }
}
