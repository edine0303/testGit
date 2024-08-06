package kr.softsoldesk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.softsoldesk.DAO.MemberDAO;
import kr.softsoldesk.beans.MemberBean;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
	//회원등록
	public void addMember(MemberBean memberBean) {
		memberDAO.addMember(memberBean);
	}
	
}//class
