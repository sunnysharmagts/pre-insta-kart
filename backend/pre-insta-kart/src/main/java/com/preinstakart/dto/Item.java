package com.preinstakart.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

  private String itemNbr;
  private String itemName;
  private String quantity;
  private String retailAmount;
  private String retailType;

}