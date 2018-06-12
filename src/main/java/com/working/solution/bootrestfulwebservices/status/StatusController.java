package com.working.solution.bootrestfulwebservices.status;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Returns current application status
 */

@RestController
public class StatusController {

    @GetMapping(path = "/status")
    public String status() {
        return "OK";
    }

    @GetMapping(path = "/status-bean")
    public StatusBean statusBean() {
        return new StatusBean("OK");
    }

}
