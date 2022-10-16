package SpringMVCAndThymeleafDemo.Customer.Website;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//@org.springframework.stereotype.Controller
//public class RentalCarController{
//    @Autowired
//    CustomerService customerService;
//
//    @Autowired
//    RentalCarService rentalCarService;
//
//    public RentalCarController(CustomerService customerService, RentalCarService rentalCarService) {
//        this.customerService = customerService;
//        this.rentalCarService = rentalCarService;
//    }
//
//    @GetMapping("/")
//    public String vewRentalCarHomePage(Model model) {
//        // Here you call the service to retrieve all the rental cars
//        final List<RentalCar> rentalCarList = rentalCarService.getAllCars();
//        // Once the rental cars are retrieved, you can store them in model and return it to the view
//        model.addAttribute("rentalCarList", rentalCarList);
//        return "rental-car-index";
//    }
//
//    @GetMapping("/new")
//    public String showNewCustomerPage(Model model) {
//        // Here a new (empty) Customer is created and then sent to the view
//        Customer customer = new Customer();
//        model.addAttribute("customer", customer);
//        return "new-customer";
//
//    }
//
//    @PostMapping(value = "/save")
//    // As the Model is received back from the view, @ModelAttribute
//    // creates a Customer based on the object you collected from
//    // the HTML page above
//    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
//        customerService.saveCustomer(customer);
//        return "redirect:/";
//    }
//
//    @GetMapping("/edit/{id}")
//    // The path variable "id" is used to pull a customer from the database
//    public ModelAndView showEditCustomerPage(@PathVariable(name = "id") Long id) {
//        // Since the previous methods use Model, this one uses ModelAndView
//        // to get some experience using both. Model is more common these days,
//        // but ModelAndView accomplishes the same thing and can be useful in
//        // certain circumstances. The view name is passed to the constructor.
//        ModelAndView mav = new ModelAndView("edit-customer");
//        Customer customer = customerService.getCustomer(id);
//        mav.addObject("customer", customer);
//        return mav;
//    }
//
//    @PostMapping("/update/{id}")
//    public String updateCustomer(@PathVariable(name = "id") Long id, @ModelAttribute("customer") Customer customer, Model model) {
//        if (!id.equals(customer.getId())) {
//            model.addAttribute("message",
//                    "Cannot update, customer id " + customer.getId()
//                            + " doesn't match id to be updated: " + id + ".");
//            return "error-page";
//        }
//        customerService.saveCustomer(customer);
//        return "redirect:/";
//    }
//
//    @RequestMapping("/delete/{id}")
//    public String deleteCustomer(@PathVariable(name = "id") Long id) {
//        customerService.deleteCustomer(id);
//        return "redirect:/";
//    }
//
//}
