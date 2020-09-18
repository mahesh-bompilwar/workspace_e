package com.techdenovo.apps.cafe.repository;

import com.techdenovo.apps.cafe.entity.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}
