package com.apirest.webflux.document;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Playlist {
    private String id;
    private String name;

    public Playlist(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
