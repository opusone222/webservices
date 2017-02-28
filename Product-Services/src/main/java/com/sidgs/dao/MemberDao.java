package com.sidgs.dao;

import com.sidgs.model.Member;

import java.util.List;

/**
 * Created by Shylaja on 2/23/2017.
 */
public interface MemberDao {
    public void addMember(Member member);

    public List<Member> getAllMembers();

    public void deleteMember(Integer memberId);

    public Member updateMember(Member member);

    public Member getMember(int memberId);

}