package vo;

import java.util.Objects;

public class MemberVO {
	private Long id;
	private String memberEmail;
	private String memberPassword;
	private String memberName;
	private Integer memberAge;
	private String memberAddress;
	
	public MemberVO() {;}

	public MemberVO(Long id, String memberEmail, String memberPassword, String memberName, Integer memberAge,
			String memberAddress) {
		super();
		this.id = id;
		this.memberEmail = memberEmail;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.memberAddress = memberAddress;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Integer getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(Integer memberAge) {
		this.memberAge = memberAge;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", memberEmail=" + memberEmail + ", memberPassword=" + memberPassword
				+ ", memberName=" + memberName + ", memberAge=" + memberAge + ", memberAddress=" + memberAddress + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(id, other.id);
	}
	
}
