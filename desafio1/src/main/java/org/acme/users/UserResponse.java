package org.acme.users;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbPropertyOrder;

import java.util.List;

@JsonbPropertyOrder({"users","total"})
public class UserResponse {

    private List<ExternalUser> users;
    private int total;

    @JsonbProperty("total")
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @JsonbProperty("users")
    public List<ExternalUser> getUsers() {
        return users;
    }


    public void setUsers(List<ExternalUser> users) {
        this.users = users;
    }
}
