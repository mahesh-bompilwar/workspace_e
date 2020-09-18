package com.techdenovo.apps.cafe.service;

import com.techdenovo.apps.cafe.entity.MenuItem;
import com.techdenovo.apps.cafe.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemService {
    @Autowired
    MenuItemRepository menuItemRepository;

    public List<MenuItem> getMenuItems(){
        return menuItemRepository.findAll();
    }

    public MenuItem getMenuItem(long id){
        return menuItemRepository.findById(id).orElse(null);
    }

    public MenuItem addMenuItem(MenuItem menuItem){
        return menuItemRepository.save(menuItem);
    }

    public MenuItem updateMenuItem(MenuItem menuItem){
        MenuItem existingMenuItem = menuItemRepository.findById(menuItem.getId()).orElse(null);
        if(existingMenuItem.getId()==menuItem.getId()){
            existingMenuItem.setName(menuItem.getName());
            existingMenuItem.setPrice(menuItem.getPrice());
        }
        menuItemRepository.save(existingMenuItem);
        return existingMenuItem;
    }

    public String deleteMenuItem(long id){
        menuItemRepository.deleteById(id);
        return "Menu Item Deleted Successfully...";
    }
}
