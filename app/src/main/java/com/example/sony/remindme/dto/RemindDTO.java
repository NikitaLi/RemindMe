package com.example.sony.remindme.dto;

/**
 * Created by Nikita on 08.06.2017.
 * Copyright © 2017 All rights reserved.
 */
public class RemindDTO {

    private String title;

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
