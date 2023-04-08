package de.glawleschkoff.moritz.cloudyleopard.controller;

import de.glawleschkoff.moritz.cloudyleopard.UploadFileResponse;
import de.glawleschkoff.moritz.cloudyleopard.service.FileStorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FileController {

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @Autowired
    private FileStorageService fileStorageService;

    @PostMapping("/api/v1/feedback")
    public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file) {
        String fileName = fileStorageService.storeFile(file, new String[]{"ScanFeedback"});

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/api/v1/feedback/")
                .path(fileName)
                .toUriString();

        return new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
    }

    @PostMapping("/uploadMultipleFiles")
    public List<UploadFileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        return Arrays.asList(files)
                .stream()
                .map(file -> uploadFile(file))
                .collect(Collectors.toList());
    }

    //@GetMapping("/downloadFile/{fileName:.+}")
    @GetMapping("/api/v1/feedback")
    //public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
    public ResponseEntity<Resource> downloadFeedback(@RequestParam String name, HttpServletRequest request) {
        // Load file as Resource
        //Resource resource = fileStorageService.loadFileAsResource(fileName);
        Resource resource = fileStorageService.loadFileAsResource(new String[]{"ScanFeedback",name});
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

    @GetMapping("/api/v1/image")
    //public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
    public ResponseEntity<Resource> downloadImage(@RequestParam String id, @RequestParam String name, HttpServletRequest request) {
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
}
