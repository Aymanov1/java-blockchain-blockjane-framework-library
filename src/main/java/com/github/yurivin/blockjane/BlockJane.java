package com.github.yurivin.blockjane;

import com.github.yurivin.blockjane.infrastracture.Chaining;
import com.github.yurivin.blockjane.infrastracture.Environment;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class BlockJane {

    private boolean running;
    public BlockJane(Environment env) {
        if(env == null) {
            throw new IllegalStateException("BlockJane environment should be not null");
        }
        this.env = env;
    }

    private final Environment env;

    public void run() {
        running = true;
        Thread chaining = new Thread(new Chaining(this));
        chaining.start();
    }

}