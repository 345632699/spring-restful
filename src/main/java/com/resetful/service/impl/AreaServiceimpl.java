package com.resetful.service.impl;

import com.resetful.mapper.AreaMapper;
import com.resetful.model.Area;
import com.resetful.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xu on 2017/11/24.
 */
@Service
public class AreaServiceimpl implements AreaService {
    @Autowired
    private AreaMapper areaMapper;
    @Override
    public Area getAreaById(Integer id) {
        return areaMapper.getAreaById(id);
    }

    @Override
    public List<Area> getAreaList() {
        return areaMapper.getAreaList();
    }
}
