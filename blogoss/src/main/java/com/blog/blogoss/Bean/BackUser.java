package com.blog.blogoss.Bean;


public class BackUser {

    private Integer id;

    private String username;

    private String password;

    private String nick_name;

    private String email;

    private  int phone_num;

    private String spare1;

    private String spare2;

    private String spare3;

    private String spare4;

    private String spare5;

    private String creata_time;

    private String update_time;

    private String work_group;

    private int login_num;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(int phone_num) {
        this.phone_num = phone_num;
    }

    public String getSpare1() {
        return spare1;
    }

    public void setSpare1(String spare1) {
        this.spare1 = spare1;
    }

    public String getSpare2() {
        return spare2;
    }

    public void setSpare2(String spare2) {
        this.spare2 = spare2;
    }

    public String getSpare3() {
        return spare3;
    }

    public void setSpare3(String spare3) {
        this.spare3 = spare3;
    }

    public String getSpare4() {
        return spare4;
    }

    public void setSpare4(String spare4) {
        this.spare4 = spare4;
    }

    public String getSpare5() {
        return spare5;
    }

    public void setSpare5(String spare5) {
        this.spare5 = spare5;
    }

    public String getCreata_time() {
        return creata_time;
    }

    public void setCreata_time(String creata_time) {
        this.creata_time = creata_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getWork_group() {
        return work_group;
    }

    public void setWork_group(String work_group) {
        this.work_group = work_group;
    }

    public int getLogin_num() {
        return login_num;
    }

    public void setLogin_num(int login_num) {
        this.login_num = login_num;
    }

    @Override
    public String toString() {
        return "BackUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nick_name='" + nick_name + '\'' +
                ", email='" + email + '\'' +
                ", phone_num=" + phone_num +
                ", spare1='" + spare1 + '\'' +
                ", spare2='" + spare2 + '\'' +
                ", spare3='" + spare3 + '\'' +
                ", spare4='" + spare4 + '\'' +
                ", spare5='" + spare5 + '\'' +
                ", creata_time='" + creata_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", work_group='" + work_group + '\'' +
                ", login_num=" + login_num +
                '}';
    }
}
