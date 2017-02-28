package com.sidgs.dao;

import com.sidgs.model.Member;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Shylaja on 2/23/2017.
 */

@Repository
public class MemberDaoImpl implements MemberDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addMember(Member member) {
        sessionFactory.getCurrentSession().saveOrUpdate(member);

    }

    @SuppressWarnings("unchecked")
    public List<Member> getAllMembers() {

        return sessionFactory.getCurrentSession().createQuery("from Member")
                .list();
    }

    @Override
    public void deleteMember(Integer memberId) {
        Member member = (Member) sessionFactory.getCurrentSession().load(
                Member.class, memberId);
        if (null != member) {
            this.sessionFactory.getCurrentSession().delete(member);
        }

    }

    public Member getMember(int memberid) {
        return (Member) sessionFactory.getCurrentSession().get(
                Member.class, memberid);
    }

    @Override
    public Member updateMember(Member member) {
        sessionFactory.getCurrentSession().update(member);
        return member;
    }

}
