package io.zeebe.order.persistence;

import io.zeebe.order.domain.Order;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<Order, String> {

}
