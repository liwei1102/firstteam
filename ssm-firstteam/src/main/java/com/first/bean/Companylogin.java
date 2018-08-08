package com.first.bean;

public class Companylogin {
    private Integer comploginid;

    private String username;

    public Companylogin(Integer comploginid, String username, String password, String email, String question,
			String answer) {
		super();
		this.comploginid = comploginid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.question = question;
		this.answer = answer;
	}

	public Companylogin() {
		super();
	}

	public Companylogin(String username, String password, String email, String question, String answer) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.question = question;
		this.answer = answer;
	}

	private String password;

    private String email;

    private String question;

    private String answer;

    public Integer getComploginid() {
        return comploginid;
    }

    public void setComploginid(Integer comploginid) {
        this.comploginid = comploginid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}