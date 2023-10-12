package wbsantiago.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * 
 * ID
 * Usuario (ID_USER)
 * descricao
 * titulo
 * data de inicio
 * data de termino
 * prioridade
 * 
 */

@Data
@Entity(name = "tb_tasks")
public class TaskModel {

    @Id
    @GeneratedValue
    private UUID id;
    private String description;
    
    @Column(length = 50)
    private String title;
    private LocalDateTime StartAt;
    private LocalDateTime EndAt;
    private String priority;
    
    private UUID idUser;

    @CreationTimestamp
    private LocalDateTime createdAt;

}