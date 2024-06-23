package com.byt3social.logging.controllers;

import com.byt3social.logging.models.Log;
import com.byt3social.logging.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LogsController {
    @Autowired
    private LogService logService;

    @GetMapping("/logs")
    public ResponseEntity consultarLogs(@RequestParam(value = "page", required = false) Integer page) {
        List<Log> logs = logService.buscarLogsDoSistema(page);

        return new ResponseEntity(logs, HttpStatus.OK);
    }
}
