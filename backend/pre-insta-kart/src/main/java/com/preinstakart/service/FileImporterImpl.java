package com.preinstakart.service;


import com.preinstakart.InventryDao;
import com.preinstakart.dto.ImportSession;
import com.preinstakart.entity.ItemEntity;
import com.preinstakart.util.CSVInputReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileImporterImpl {

  @Autowired
  private CSVInputReader csvInputReader;

  @Autowired
  private InventryDao inventryDao;

  public ImportSession response(InputStream inputStream) throws IOException {
    ImportSession output = csvInputReader.read(inputStream);
    return output;
  }

  public List<ItemEntity> getItems() {
    return inventryDao.getItems("iphone11");
  }
}
