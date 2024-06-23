package com.byt3social.logging.services;

import com.byt3social.logging.dto.LogDTO;
import com.byt3social.logging.models.Log;
import com.byt3social.logging.repositories.LogRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class LogService {
    @Autowired
    private LogRepository logRepository;

    @Transactional
    public void registrarLog(LogDTO logDTO) {
        logRepository.save(new Log(logDTO));
    }

    public List<Log> buscarLogsDoSistema(Integer page) {
        page = page != null ? page : 0;

        Page<Log> logPage = logRepository.findAll(PageRequest.of(page, 20, Sort.by(Sort.Direction.DESC, "requestAt")));

        if(!logPage.isEmpty()) {
            return logPage.getContent();
        }

        return Collections.emptyList();
    }
}
