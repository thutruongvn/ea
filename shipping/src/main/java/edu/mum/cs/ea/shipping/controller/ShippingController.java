package edu.mum.cs.ea.shipping.controller;

import edu.mum.cs.ea.shipping.model.Shipping;
import edu.mum.cs.ea.shipping.model.ShippingStatus;
import edu.mum.cs.ea.shipping.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shipping")
public class ShippingController {
    @Autowired
    private ShippingService shippingService;

    @PostMapping
    public @ResponseBody
    Shipping postShipping(@RequestBody Shipping shipping){
        return shippingService.createShipping(shipping);
    }

    @RequestMapping(value = "/process/{shipping_id}", method = RequestMethod.PUT)
    public @ResponseBody Shipping processShipping(@PathVariable Long shippingId){
        return shippingService.updateShippingStatus(shippingId, ShippingStatus.SHIPPED);
    }
}
