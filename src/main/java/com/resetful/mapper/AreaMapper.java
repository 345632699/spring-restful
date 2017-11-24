package com.resetful.mapper;

import com.resetful.model.Area;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xu on 2017/11/24.
 */
public interface AreaMapper {
    @Select("SELECT * FROM area WHERE id = #{id}")
    Area getAreaById(Integer id);

    @Select("SELECT * FROM area")
    public List<Area> getAreaList();
}
