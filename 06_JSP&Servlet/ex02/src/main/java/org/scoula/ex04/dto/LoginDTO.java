package org.scoula.ex04.dto;

public class LoginDTO {
    private String name;
    private String passwd; //얘낸 attribute라 말해도 됨.

    public LoginDTO() {

    }

    public LoginDTO(String name, String passwd) {
        this.name = name;
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }


}
