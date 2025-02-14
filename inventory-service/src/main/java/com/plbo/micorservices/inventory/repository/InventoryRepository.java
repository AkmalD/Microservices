package com.plbo.micorservices.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.plbo.micorservices.inventory.model.Inventory;


// import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, Integer quantity);
    // List<Inventory> findBySkuCodeIn(List<String> skuCode);
}

