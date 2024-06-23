package com.byt3social.logging.dto;

import java.time.LocalDateTime;

public record LogDTO(
        String action,
        String actionDescription,
        String ipAddress,
        String microservice,
        String requestPath,
        String requestMethod,
        String requestOrigin,
        String requestAt,
        String statusCode,
        String userType,
        String user
) {
}
