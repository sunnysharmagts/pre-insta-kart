package com.preinstakart.util;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;

@Slf4j
@UtilityClass
public class Utility {

  public static String trimSafe(@Nullable String input){
    return input != null ? input.trim() : input;
  }

  public static String getElementSafe(String[] arr, int index, String fallback){
    if(arr!= null && index>=0 && index<arr.length){
      return arr[index];
    }
    else{
      return null;
    }
  }

}
