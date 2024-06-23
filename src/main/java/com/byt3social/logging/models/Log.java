package com.byt3social.logging.models;

import com.byt3social.logging.dto.LogDTO;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@Entity(name = "Log")
@Table(name = "logs")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String action;
    @Column(name = "action_description")
    private String actionDescription;
    @Column(name = "ip_address")
    private String ipAddress;
    private String microservice;
    @Column(name = "request_path")
    private String requestPath;
    @Column(name = "request_method")
    private String requestMethod;
    @Column(name = "request_origin")
    private String requestOrigin;
    @Column(name = "requested_at")
    private LocalDateTime requestAt;
    @Column(name = "status_code")
    private String statusCode;
    @Column(name = "user_type")
    private String userType;
    private String user;
    @CreationTimestamp
    @Column(name = "created_at")
    private Date createdAt;

    public Log(LogDTO logDTO) {
        this.action = logDTO.action();
        this.actionDescription = logDTO.actionDescription();
        this.ipAddress = logDTO.ipAddress();
        this.microservice = logDTO.microservice();
        this.requestPath = logDTO.requestPath();
        this.requestMethod = logDTO.requestMethod();
        this.requestOrigin = logDTO.requestOrigin();
        this.requestAt = LocalDateTime.parse(logDTO.requestAt());
        this.statusCode = logDTO.statusCode();
        this.userType = logDTO.userType();
        this.user = logDTO.user();
    }
}
