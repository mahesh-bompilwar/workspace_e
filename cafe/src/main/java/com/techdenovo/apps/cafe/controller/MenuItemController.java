package com.techdenovo.apps.cafe.controller;

import com.techdenovo.apps.cafe.entity.MenuItem;
import com.techdenovo.apps.cafe.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MenuItemController {

    @Autowired
    MenuItemService menuItemService;

    @GetMapping("/getMenuItems")
    public List<MenuItem> getMenuItems(){
        return menuItemService.getMenuItems();
    }

    @GetMapping("/getMenuItem/{id}")
    public MenuItem getMenuItem(@PathVariable long id){
        return menuItemService.getMenuItem(id);
    }

    @PostMapping("/addMenuItem")
    public MenuItem addMenuItem(@RequestBody MenuItem menuItem){
        return menuItemService.addMenuItem(menuItem);
    }
    @PostMapping("/updateMenuItem")
    public MenuItem updateMenuItem(@RequestBody MenuItem menuItem){
        return menuItemService.updateMenuItem(menuItem);
    }

    @PostMapping("/deleteMenuItem/{id}")
    public String deleteMenuItem(@PathVariable long id){
        return menuItemService.deleteMenuItem(id);
    }
}
