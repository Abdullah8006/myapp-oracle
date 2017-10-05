package com.appster.abdullah.module.FileUpload.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.appster.abdullah.entity.User;

import net.coobird.thumbnailator.Thumbnails;

@Service
public class FileUploadService {

    @Value("${user.file.upload.folder}")
    private String UPLOAD_FOLDER;

    @Value("${user.file.upload.thumbnail.size.one}")
    private String THUMBNAIL_SIZE_ONE;

    @Value("${user.file.upload.thumbnail.size.two}")
    private String THUMBNAIL_SIZE_TWO;

    public String uploadFile(User user, MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        long imageHolder = ((int) (user.getId() / 100) + 1);
        String fileName = generateFileName(user.getId(), file.getOriginalFilename());
        Path path = Paths.get(UPLOAD_FOLDER, String.valueOf(imageHolder));
        if (!Files.exists(path)) {
            path = Files.createDirectory(path);
            path = Paths.get(path.toString(), fileName);
            path = Files.write(path, bytes);
        } else {
            path = Paths.get(path.toString(), fileName);
            path = Files.write(path, bytes);
        }

        Thumbnails.of(path.toFile()).size(160, 160).toFile(new File(
                path.toFile().getParentFile().getAbsolutePath() + File.separatorChar + THUMBNAIL_SIZE_ONE + fileName));
        Thumbnails.of(path.toFile()).size(80, 80).toFile(new File(
                path.toFile().getParentFile().getAbsolutePath() + File.separatorChar + THUMBNAIL_SIZE_TWO + fileName));

        return path.toString();
    }

    private String generateFileName(long id, String originalFilename) {
        return id + Calendar.getInstance().getTimeInMillis() + originalFilename;
    }

}
