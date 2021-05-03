package com.preinstakart.controller;

import com.walmart.hackathon.preinstamart.dto.ImportSession;
import com.walmart.hackathon.preinstamart.service.FileImporterImpl;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file-upload")
@Slf4j
public class FileImporter {

 @Autowired
 private FileImporterImpl fileImporterImpl;

  @PostMapping(path = "/", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
  @ResponseBody
  public ImportSession processInputBlobFile(
      @RequestParam("file") @Valid @NotNull MultipartFile blobFile) {

    ImportSession response = null;
    try {
      String fileName = blobFile.getOriginalFilename();
      response = fileImporterImpl.response(blobFile.getInputStream());
      System.out.println(fileName);

    } catch (Exception e) {
      String errorMsg = "Exception While processing Input File, Reason [ " + e.getLocalizedMessage() + "]";
      log.error(errorMsg);
    }
    return response;
  }


}
