package com.resetful.model;

import lombok.Data;

/**
 * Created by xu on 2017/11/24.
 */
@Data
public class Area {
    private Integer id;
    private String name;
    private Integer sort;

    public Area(){

    }

    public Area(String name,Integer sort){
        this.name = name;
        this.sort = sort;
    }
}
