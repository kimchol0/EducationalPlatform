package com.hp.bean;

public class User {
    private Integer uId;

    private Integer gNum;

    private Integer checkNum;

    private Integer cStatus;

    private Integer cNum;

    private Integer classNum;

    private Integer uExp;

    private String uName;

    private String uSex;

    private String uPhone;

    private String uEmail;

    private String uAcc;

    private String uPwd;

    private String credit;
    
    private City city;
    
    private Class uClass;
    
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Class getuClass() {
		return uClass;
	}

	public void setuClass(Class uClass) {
		this.uClass = uClass;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}
    
    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getgNum() {
        return gNum;
    }

    public void setgNum(Integer gNum) {
        this.gNum = gNum;
    }

    public Integer getCheckNum() {
        return checkNum;
    }

    public void setCheckNum(Integer checkNum) {
        this.checkNum = checkNum;
    }

    public Integer getcStatus() {
        return cStatus;
    }

    public void setcStatus(Integer cStatus) {
        this.cStatus = cStatus;
    }

    public Integer getcNum() {
        return cNum;
    }

    public void setcNum(Integer cNum) {
        this.cNum = cNum;
    }

    public Integer getClassNum() {
        return classNum;
    }

    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    public Integer getuExp() {
        return uExp;
    }

    public void setuExp(Integer uExp) {
        this.uExp = uExp;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public String getuAcc() {
        return uAcc;
    }

    public void setuAcc(String uAcc) {
        this.uAcc = uAcc == null ? null : uAcc.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }
}