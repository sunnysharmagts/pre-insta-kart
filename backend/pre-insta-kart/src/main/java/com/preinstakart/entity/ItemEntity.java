package com.preinstakart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = ItemEntity.NAME)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemEntity {

  protected static final String NAME = "item";

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "item_name")
  private String itemName;

  @Column(name = "quantity")
  private int quantity;

  @Override
  public String toString() {
    return "Item{" +
        "id=" + id +
        ", itemName='" + itemName + '\'' +
        ", quantity=" + quantity +
        ", price=" + price +
        '}';
  }

  @Column(name = "price")
  private int price;


}
