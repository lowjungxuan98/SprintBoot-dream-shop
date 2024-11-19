package com.lowjungxuan.dreamshop.services.image;

import com.lowjungxuan.dreamshop.dto.ImageDto;
import com.lowjungxuan.dreamshop.models.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImage(Long id);
    List<ImageDto> saveImage(List<MultipartFile> file, Long imageId);
    void updateImage(MultipartFile file, Long imageId);
}