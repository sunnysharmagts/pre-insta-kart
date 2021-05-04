package com.preinstakart.util;


import static com.preinstakart.util.Utility.trimSafe;

import com.opencsv.CSVReader;
import com.preinstakart.dto.ImportSession;
import com.preinstakart.dto.Item;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import static com.preinstakart.util.Utility.*;

@Slf4j
@Component
@RequiredArgsConstructor
public class CSVInputReader {

  private static final Function<String[], Item> DATA_FROM_CSV = (strings) ->
      new Item(trimSafe(getElementSafe(strings, 0,null)),
               trimSafe(getElementSafe(strings, 1,null)),
               trimSafe(getElementSafe(strings, 2,null)),
               trimSafe(getElementSafe(strings, 3,null)),
               trimSafe(getElementSafe(strings, 4,null)));

  public ImportSession read(InputStream inputStream) throws IOException {
    ImportSession session = new ImportSession();
    if(inputStream!=null){
      Optional<InputStream>  opt= Optional.ofNullable(inputStream);
      if(opt.isPresent()){
        try(CSVReader reader = new CSVReader(new InputStreamReader(opt.get(), StandardCharsets.UTF_8))){
          reader.readAll()
                .stream()
                .map(DATA_FROM_CSV)
                .collect(Collectors.toCollection(session::getData));
        }
      }
    }
    return session;
  }
}
