package org.guilherme.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.io.Serializable;


@Builder
public class Customer implements Serializable {

    @JsonProperty
    private String cpf;
    @JsonProperty
    private String name;

    public Customer(String cpf, String name) {
        this.cpf = cpf;
        this.name = name;
    }

    public Customer() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
