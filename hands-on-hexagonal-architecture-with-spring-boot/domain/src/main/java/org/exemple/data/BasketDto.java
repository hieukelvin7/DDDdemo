package org.exemple.data;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Builder
public class BasketDto {

    private Long id;

    private String role;

    private String workname;

    private String status;

    private String action;

    public BasketDto() {
    }

    public BasketDto(Long id, String role, String workname, String status, String action) {
        this.id = id;
        this.role = role;
        this.workname = workname;
        this.status = status;
        this.action = action;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
