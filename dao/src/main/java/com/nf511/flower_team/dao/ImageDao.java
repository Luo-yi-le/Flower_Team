package com.nf511.flower_team.dao;

import com.nf511.flower_team.entity.Image;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImageDao {
    List<Image> selectAllImage();
    Image selectAllImageId(@Param("imageId") String imageId);
    List<Image>selectAllImageByPage(@Param("pagelimit")int pagelimit,@Param("size")int size);
    int insertImage(Image image);
    int updateImage(Image image);
    int deleteImage(@Param("imageId") int imageId);
    int deleteAll(@Param("imageIds") List<Integer>items);
}
