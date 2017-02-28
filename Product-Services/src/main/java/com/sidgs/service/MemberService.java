package com.sidgs.service;

import com.sidgs.model.Member;

import java.util.List;

/**
 * Created by Shylaja on 2/24/2017.
 */
public interface MemberService {

    public void addMember (Member member);
    public List<Member> getAllMembers();
    public void deleteMember(Integer memberId);
    public Member getMember(int memberId);
    public Member updateMember (Member member);



}
