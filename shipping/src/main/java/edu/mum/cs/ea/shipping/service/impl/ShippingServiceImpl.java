package edu.mum.cs.ea.shipping.service.impl;

import edu.mum.cs.ea.shipping.model.Shipping;
import edu.mum.cs.ea.shipping.model.ShippingStatus;
import edu.mum.cs.ea.shipping.repository.ShippingRepository;
import edu.mum.cs.ea.shipping.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingServiceImpl implements ShippingService {
    @Autowired
    private ShippingRepository shippingRepository;

    @Override
    public Shipping createShipping(Shipping shipping) {
        return shippingRepository.save(shipping);
    }

    @Override
    public Shipping updateShippingStatus(Long shippingId, ShippingStatus status) {
        Shipping shipping = shippingRepository.findById(shippingId).orElse(null);
        if(shipping != null){
            shipping.setStatus(status);
        }
        return shippingRepository.save(shipping);
    }
}
