package com.tntheeast.la;

public class User {
	String id;
	String name;
	String password;
	String email;
	Level level;
	int login;
	int recommend;
	
	public User() {
	}
	
	public User(String id, String name, String password, String email,
			Level level, int login, int recommend) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.level = level;
		this.login = login;
		this.recommend = recommend;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	public int getLogin() {
		return login;
	}
	public void setLogin(int login) {
		this.login = login;
	}
	public int getRecommend() {
		return recommend;
	}
	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void upgradeLevel() {
		Level nextLevel = this.level.nextLevel();	
		if (nextLevel == null) { 								
			throw new IllegalStateException(this.level + "��  ���׷��̵尡 �Ұ����մϴ�");
		}
		else {
			this.level = nextLevel;
		}	
	}
	
//	private boolean canUpgradeLevel(User user) {
//		Level currentLevel = user.getLevel();
//		switch(currentLevel) {
//		case BASIC: return (user.getLogin() >= MIN_LOGCOUNT_FOR_SILVER);
//		case SILVER: return (user.getRecommend() >= MIN_RECCOMEND_FOR_GOLD);
//		case GOLD: return false;
//		default: throw new IllegalArgumentException("Unknown Level: " + currentLevel);
//		}
//	}
}
