package javaprogrammingunitexam0722;

public class Member extends Person {
	
	String memberId;

	public Member(String memberId, String email, String memberId2) {
		this.memberId = memberId;
	}

	public String getter() {
		return memberId;
	}
	
	public void setter(String memberId) {
		this.memberId = memberId;
	}
	
	public String toString() {
		return email;
	}
	
	
}
