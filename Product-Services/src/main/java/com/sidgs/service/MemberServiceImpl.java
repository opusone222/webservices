package com.sidgs.service;

import com.sidgs.service.MemberService;
import com.sidgs.dao.MemberDao;
import com.sidgs.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Shylaja on 2/24/2017.
 */


@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    @Override
    @Transactional
    public void addMember(Member member) {
        memberDao.addMember(member);
    }

    @Override
    @Transactional
    public List<Member> getAllMembers() {
        return memberDao.getAllMembers();
    }

    @Override
    @Transactional
    public void deleteMember(Integer memberId) {
        memberDao.deleteMember(memberId);
    }

    public Member getMember(int memberId) {
        return memberDao.getMember(memberId);
    }

    public Member updateMember(Member member) {
        // TODO Auto-generated method stub
        return memberDao.updateMember(member);
    }

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

}


