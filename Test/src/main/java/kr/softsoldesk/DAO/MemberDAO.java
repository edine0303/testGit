package kr.softsoldesk.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.softsoldesk.beans.MemberBean;
import kr.softsoldesk.mapper.MemberMapper;

@Repository
public class MemberDAO {
	
	@Autowired
	private MemberMapper memberMapper;
	
	//회원등록
	public void addMember(MemberBean memberBean) {
		memberMapper.addMember(memberBean);
	}
	
}//class
