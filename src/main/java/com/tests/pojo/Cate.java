package com.tests.pojo;

import java.time.LocalDateTime;

public class Cate {
    private int categoryId;
    private String Name;

    private LocalDateTime lastUpdate;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "catrgory{" +
                "categoryId=" + categoryId +
                ", name='" + Name + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
