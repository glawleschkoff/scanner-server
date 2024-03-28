package de.glawleschkoff.moritz.cloudyleopard.service;


import de.glawleschkoff.moritz.cloudyleopard.FileStorageProperties;
import de.glawleschkoff.moritz.cloudyleopard.exception.FileStorageException;
import de.glawleschkoff.moritz.cloudyleopard.exception.MyFileNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileStorageService {

    private final Path fileStorageLocation;

    @Autowired
    public FileStorageService(FileStorageProperties fileStorageProperties) {
        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir())
                .toAbsolutePath().normalize();
        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception ex) {
            throw new FileStorageException("Could not create the directory where the uploaded files will be stored.", ex);
        }
    }

    public Resource loadFileAsResource(String... path) {
        try {
            Path filePath = this.fileStorageLocation;
            for(String s : path){
                filePath = filePath.resolve(s);
            }
            filePath.normalize();
            Resource resource = new UrlResource(filePath.toUri());
            if(resource.exists()) {
                return resource;
            } else {
                throw new MyFileNotFoundException("File not found " + path);
            }
        } catch (MalformedURLException ex) {
            throw new MyFileNotFoundException("File not found " + path, ex);
        }
    }
}
