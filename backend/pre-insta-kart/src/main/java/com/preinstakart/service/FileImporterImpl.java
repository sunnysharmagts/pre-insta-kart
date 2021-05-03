package com.preinstakart.service;


import com.walmart.hackathon.preinstamart.dto.ImportSession;
import com.walmart.hackathon.preinstamart.util.CSVInputReader;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileImporterImpl {

  @Autowired
  private CSVInputReader csvInputReader;

  public ImportSession response(InputStream inputStream) throws IOException {
    ImportSession output = csvInputReader.read(inputStream);
    return output;
  }
}
