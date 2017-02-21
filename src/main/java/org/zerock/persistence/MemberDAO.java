package org.zerock.persistence;

import java.sql.SQLException;

import org.zerock.domain.MemberVO;

/**
 * SpringBoard 
 * 클래스명 : MemberDAO.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 21.
 * 클래스 소개 : Member 인터페이스
 */
public interface MemberDAO {

	//현재 시간 알아보기
	public String getTime();
	
	//사용자 추가 테스트
	public void insertMember(MemberVO vo);

	//사용자 아이디를 이용한 조회 테스트
	public MemberVO readMember(String userid) throws Exception;
	
	//사용자 아이디와 비밀번호를 이용한 조회 테스트
	public MemberVO readWithPW(String userid, String userpw) throws Exception;
}
