package kr.softsoldesk.mapper;

import org.apache.ibatis.annotations.Insert;

import kr.softsoldesk.beans.MemberBean;

public interface MemberMapper {
	
	//회원등록
	@Insert("insert into member_table values(member_seq.nextval, #{member_id}, #{member_name}, #{member_pw})")
	void addMember(MemberBean memberBean);
	
	//회원호출
	
	
}//interface
