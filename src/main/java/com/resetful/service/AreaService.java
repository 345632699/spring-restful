package com.resetful.service;

import com.resetful.model.Area;

import java.util.List;

/**
 * Created by xu on 2017/11/24.
 */
public interface AreaService {
    Area getAreaById(Integer id);

    public List<Area> getAreaList();
}
