package com.chenlu.cateringsystem.controller;

import com.chenlu.cateringsystem.model.Desk;
import com.chenlu.cateringsystem.service.DeskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/Desk")
@RestController
@CrossOrigin
public class DeskController {
    @Autowired
    private DeskService deskService;

    @PostMapping("/saveDesk")
    private Desk saveDesk(@RequestBody int desk_no) {return deskService.save(desk_no);}

    @GetMapping("/deleteDesk")
    private void deleteDesk(@PathVariable("desk_id") int desk_id){deskService.delete(desk_id);}

    @PostMapping("/updateDesk")
    private Desk updateDesk(@RequestBody int desk_no) {return deskService.update(desk_no);}
}
