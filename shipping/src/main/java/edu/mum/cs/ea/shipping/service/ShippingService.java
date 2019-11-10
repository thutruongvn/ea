package edu.mum.cs.ea.shipping.service;

import edu.mum.cs.ea.shipping.model.Shipping;
import edu.mum.cs.ea.shipping.model.ShippingStatus;

public interface ShippingService {
    public Shipping createShipping(Shipping shipping);

    public Shipping updateShippingStatus(Long shippingId, ShippingStatus status);
}
