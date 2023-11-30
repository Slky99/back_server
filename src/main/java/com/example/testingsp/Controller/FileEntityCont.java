package com.example.testingsp.Controller;

import com.example.testingsp.DTO.FileEntity;
import com.example.testingsp.Repository.FileEntityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api/files")
@CrossOrigin
public class FileEntityCont {

    private static final String UPLOAD_DIR = "C:\\Users\\DELL\\OneDrive\\Bureau\\Angular_rh-master\\Cv_tech";

    @Autowired
    private FileEntityRepo fileEntityRepo ;

    @PostMapping(path = "/savefile/{prospectId}")
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file,
                                                   @PathVariable String prospectId) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("Please select a file to upload");
        }

        try {
            // Create the upload directory if it doesn't exist
            File uploadDir = new File(UPLOAD_DIR);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }

            String originalFileName = file.getOriginalFilename();
            String uniqueFileName = System.currentTimeMillis() + "_" + originalFileName;
            Path filePath = Paths.get(UPLOAD_DIR, uniqueFileName);

            // Save the file to the server
            file.transferTo(filePath.toFile());

            // Save file information to the database
            FileEntity fileEntity = new FileEntity(uniqueFileName, prospectId);
            fileEntityRepo.save(fileEntity);

            return ResponseEntity.ok("File uploaded successfully");
                   }
        catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Failed to upload the file");
        }
    }
}
