package com.preinstakart.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class ImportSession {

 public List<Item> data = new ArrayList<>();
}