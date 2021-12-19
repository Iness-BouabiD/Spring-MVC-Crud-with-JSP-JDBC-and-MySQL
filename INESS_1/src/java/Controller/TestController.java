/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.Connexion;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author HP
 */
public class TestController {
    Connexion con = new Connexion();
    JdbcTemplate jdbctemplate = new JdbcTemplate(con.getConnection());
    ModelAndView mav  = new ModelAndView();
    
    @RequestMapping("index.htm")
    public ModelAndView Lister(){
        String sql = "select * from article";
        List datos = this.jdbctemplate.queryForList(sql);
        mav.addObject("list",datos);
        mav.setViewName("index");
        return mav;
    }
}
