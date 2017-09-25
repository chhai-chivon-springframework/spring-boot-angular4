package com.chhaichivon.backend.springbootangular4.utils;

import org.springframework.data.domain.Page;

public class Response<T> {
    private Page<T> data;

    public Page<T> getData() {
        return data;
    }

    public void setData(Page<T> data) {
        this.data = data;
    }
}
