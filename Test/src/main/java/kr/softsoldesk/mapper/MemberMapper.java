package kr.softsoldesk.mapper;

import org.apache.ibatis.annotations.Insert;

import kr.softsoldesk.beans.MemberBean;

public interface MemberMapper {
	
	@Insert("insert into member_table values(member_seq.nextval, #{member_id}, #{member_name}, #{member_pw})")
	void addMember(MemberBean memberBean);
	
}//interface
