package com.exmertec.cabinet.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

public class Cabinet {
    @Length(max = 10)
    private String content;

    public Cabinet() {
    }

    public Cabinet(String content) {
        this.content = content;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}
