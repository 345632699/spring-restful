package com.resetful.controller;

import com.resetful.model.Area;
import com.resetful.model.JsonResult;
import com.resetful.model.User;
import com.resetful.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xu on 2017/11/24.
 */
@RestController
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "area/{id}",method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getUserById (@PathVariable(value = "id") Integer id){
        JsonResult r = new JsonResult();
        try {
            Area area = areaService.getAreaById(id);
            r.setResult(area);
            r.setStatus("ok");
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

}
