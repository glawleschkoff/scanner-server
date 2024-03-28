package de.glawleschkoff.moritz.cloudyleopard.controller;

import de.glawleschkoff.moritz.cloudyleopard.service.FileStorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class FileController {

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @Autowired
    private FileStorageService fileStorageService;

    @GetMapping("/api/v1/image/bauteil")
    //public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
    public ResponseEntity<Resource> downloadImageBauteil(@RequestParam String id, @RequestParam String name, HttpServletRequest request) {
        // Load file as Resource
        //Resource resource = fileStorageService.loadFileAsResource(fileName);
        Resource resource = fileStorageService.loadFileAsResource(new String[]{"Kuhnle","A",id,"GRAFIK",name});
        System.out.println("blub");

        // Try to determine file's content type
        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            logger.info("Could not determine file type.");
        }

        // Fallback to the default content type if type could not be determined
        if(contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }

    @GetMapping("/api/v1/image/material")
    //public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
    public ResponseEntity<Resource> downloadImageMaterial(@RequestParam String name, HttpServletRequest request) {
        // Load file as Resource
        //Resource resource = fileStorageService.loadFileAsResource(fileName);
        Resource resource = fileStorageService.loadFileAsResource(new String[]{"Kuhnle","Textur",name});

        // Try to determine file's content type
        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            logger.info("Could not determine file type.");
        }

        // Fallback to the default content type if type could not be determined
        if(contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
}
