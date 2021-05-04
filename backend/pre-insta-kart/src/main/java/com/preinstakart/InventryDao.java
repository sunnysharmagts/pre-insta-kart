package com.preinstakart;

import com.preinstakart.entity.ItemEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InventryDao extends JpaRepository<ItemEntity, Integer> {

  @Query(value = "SELECT * FROM item WHERE item_name LIKE CONCAT('%',:keyword,'%')", nativeQuery = true)
  List<ItemEntity> getItems(String keyword);
}
