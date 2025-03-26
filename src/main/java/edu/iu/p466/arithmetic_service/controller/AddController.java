package edu.iu.p466.arithmetic_service.controller;


import edu.iu.p466.arithmetic_service.service.AddService;
import edu.iu.p466.arithmetic_service.service.IAddService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/add")
public class AddController {

    IAddService addService;

    public AddController(IAddService addService){
        this.addService = addService;
    }

    @GetMapping("/{n}/{m}")
    public int addInt(@PathVariable int n, @PathVariable int m){
        return addService.add(n, m);
    }


}
