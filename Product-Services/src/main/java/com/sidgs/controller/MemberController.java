package com.sidgs.controller;

import com.sidgs.service.MemberService;


import com.sidgs.model.Member;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * Created by Shylaja on 2/26/2017.
 */
@Controller
public class MemberController {

    private static final Logger logger = Logger.getLogger(MemberController.class);
    public MemberController(){
        System.out.println("MemberController()");
    }

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/member")
    public ModelAndView listMember(ModelAndView model) throws IOException {
        List<Member> listMember = memberService.getAllMembers();
        model.addObject("listMember", listMember);
        model.setViewName("memberHome");
        return model;
    }

    @RequestMapping(value = "/newMember", method = RequestMethod.GET)
    public ModelAndView newMember(ModelAndView model){
        Member member = new Member();
        model.addObject("member", member);
        model.setViewName("memberForm");
        return model;
    }

    @RequestMapping(value = "/saveMember", method = RequestMethod.POST)
    public ModelAndView saveMember(@ModelAttribute Member member) {

        if(member.getId()==0) {
            // if member id = 0 then creating the
            memberService.addMember(member);
        } else {
            memberService.updateMember(member);
        }
        return new ModelAndView("redirect:/member");
    }

    @RequestMapping(value = "/editMember", method = RequestMethod.GET)
    public ModelAndView editMember(HttpServletRequest request){
        int memberId = Integer.parseInt(request.getParameter("id"));
        Member member = memberService.getMember(memberId);
        ModelAndView model = new ModelAndView("memberForm");
        model.addObject("member",member);
        return model;
    }

    @RequestMapping(value = "/deleteMember", method = RequestMethod.GET)
    public ModelAndView deleteMember(HttpServletRequest request){
        int memberId = Integer.parseInt(request.getParameter("id"));
       memberService.deleteMember(memberId);
        return new ModelAndView("redirect:/member");


    }

}


