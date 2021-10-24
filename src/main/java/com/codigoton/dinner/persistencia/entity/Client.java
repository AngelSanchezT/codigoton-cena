package com.codigoton.dinner.persistencia.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "male")
    private Short male;

    @Column(name = "type")
    private Integer type;

    @Column(name = "location")
    private String location;

    @Column(name = "company")
    private String company;

    @Column(name = "encrypt")
    private Short encrypt;

    @OneToMany(mappedBy = "clientId")
    private List<Account> accountList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Short getMale() {
        return male;
    }

    public void setMale(Short male) {
        this.male = male;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Short getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Short encrypt) {
        this.encrypt = encrypt;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
}
