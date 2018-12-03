package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args:-Xms100m 最小堆
 * -Xmx100m 最大堆
 * -Xss1m
 * -XX:+HeapDumpOnOutOfMemoryError 打印
 */
@RestController
public class MainController {
    private int i = 0;

    @GetMapping("oom")
    public void oom() {
        List<byte[]> list = new ArrayList<>();
        while (true) {
            list.add(new byte[1024*1024]);
        }
    }

    @GetMapping("sof")
    public void sof() {
        i++;
        sof();
    }

}
