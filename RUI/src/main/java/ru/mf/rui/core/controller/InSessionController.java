/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mf.rui.core.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import ru.pavel.forum.core.entity.Users;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/topics")
public class InSessionController {

   // @RequestMapping(value = "/post", method = RequestMethod.GET)
    public String PageTest(HttpServletRequest req) {
        HttpSession ses = req.getSession();
      //  if (ses.getAttribute("personSession") != null) {
            //Users user = (Users) ses.getAttribute("personSession");
            return "PostTopic";
//        } else {
//            return "index";
//        }
    }
}
