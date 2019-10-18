package com.reginapeyfuss.creational.prototype;

import com.reginapeyfuss.creational.prototype.Item;

public class Movie extends Item {
    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    private String runtime;

}
