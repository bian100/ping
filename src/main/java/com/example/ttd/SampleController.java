package com.example.ttd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ping")
public class SampleController{

    @GetMapping(value = "", headers = "Accept=application/json", produces = "application/json")
    public ResponseEntity ping() {
        Map ret = new HashMap();
        ret.put("ping", "pang");
        return ResponseEntity.ok(ret);
    }
}
