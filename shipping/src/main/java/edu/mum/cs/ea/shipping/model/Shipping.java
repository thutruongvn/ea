package edu.mum.cs.ea.shipping.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "shipping")
@NoArgsConstructor
@AllArgsConstructor
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;
    private Address address;

    @Enumerated(EnumType.STRING)
    private ShippingStatus status;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ShippingItem> itemList;
}
