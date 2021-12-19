/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.Connexion;
import Model.Article;
import Model.ArticleMapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author HP
 */
@Controller
public class HelloController {
    
    
     Connexion con = new Connexion();
    JdbcTemplate jdbctemplate = new JdbcTemplate(con.getConnection());
    ModelAndView mav  = new ModelAndView();
    int id;
    
   /*    @RequestMapping(value={"/hello"}, method = RequestMethod.GET)
        public ModelAndView Lister(){
        String sql = "select * from article";
        List datos = this.jdbctemplate.queryForList(sql);
        mav.addObject("Liste",datos);
        mav.setViewName("hello");
        return mav; 
}*/
        
        @RequestMapping(value={"/hello"}, method = RequestMethod.GET)
        public List<Article> Lister(ModelMap model){
        String sql = "Select * from article";
        List<Article> article = new ArrayList<>();
        List<Map<String, Object>> rows = this.jdbctemplate.queryForList(sql);
        
        for (Map row : rows) {
            Article obj = new Article();

            obj.setID_Article(((Integer) row.get("ID_Article")));
            obj.setDesignation((String) row.get("Designation"));
            obj.setCategorie(((String) row.get("Categorie"))); 
            obj.setPrix(((float) row.get("Prix")));
            obj.setQuantite(((Integer) row.get("Quantite")));
            article.add(obj);
            model.addAttribute("list",article);
            model.addAttribute("form",article.get(0).getCategorie());
        }
        return article;
}
        
        
         @RequestMapping(value={"/ajouter"},method=RequestMethod.GET)
        public ModelAndView ajouter(Article a){
            
        String sql = "insert into article(Designation,Quantite,Prix,Categorie) values (?,?,?,?)";
        if(a.getDesignation()!="" && a.getPrix()!=0 && a.getQuantite()!=0 && a.getCategorie()!=""){
             this.jdbctemplate.update(sql,a.getDesignation(),a.getQuantite(),a.getPrix(),a.getCategorie());
        }  
    
        return new ModelAndView("redirect:/index.htm");
        }
        
        
           @RequestMapping(value={"/modifier"},method=RequestMethod.GET)
        public String modifier(HttpServletRequest request,ModelMap model){
        id = Integer.parseInt(request.getParameter("id"));
        String sql ="select * from article where ID_Article="+id;
        List<Article> article = new ArrayList<>();
        List<Map<String, Object>> rows = this.jdbctemplate.queryForList(sql);
          for (Map row : rows) {
            Article obj = new Article();

            obj.setID_Article(((Integer) row.get("ID_Article")));
            obj.setDesignation((String) row.get("Designation"));
            obj.setCategorie(((String) row.get("Categorie"))); 
            obj.setPrix(((float) row.get("Prix")));
            obj.setQuantite(((Integer) row.get("Quantite")));
            article.add(obj);
            model.addAttribute("message",article.get(0));
        }
        return "modifier";
        }
        
        
        @RequestMapping(value={"/modifier"},method=RequestMethod.POST)
        public ModelAndView modifier(Article a){
            String sql = "update article set Designation=?,Prix=?,Quantite =?,Categorie=? where ID_Article="+id;
            this.jdbctemplate.update(sql,a.getDesignation(),a.getPrix(),a.getQuantite(),a.getCategorie());
            return new ModelAndView("redirect:/index.htm");
            
        }
    
        
          @RequestMapping(value={"/supprimer"})
          public ModelAndView supprimer(HttpServletRequest request,ModelMap model)
          {
              id=Integer.parseInt(request.getParameter("id"));
              String sql = "delete from article where ID_Article="+id;
              this.jdbctemplate.update(sql);
              model.addAttribute("deleteOK",this.jdbctemplate.update(sql));
              return new ModelAndView("redirect:/index.htm");
          }
          
          
          @RequestMapping(value={"/details"})
         public String details(HttpServletRequest request,ModelMap model){
              id = Integer.parseInt(request.getParameter("id"));
        String sql ="select * from article where ID_Article="+id;
        List<Article> article = new ArrayList<>();
        List<Map<String, Object>> rows = this.jdbctemplate.queryForList(sql);
          for (Map row : rows) {
            Article obj = new Article();

            obj.setID_Article(((Integer) row.get("ID_Article")));
            obj.setDesignation((String) row.get("Designation"));
            obj.setCategorie(((String) row.get("Categorie"))); 
            obj.setPrix(((float) row.get("Prix")));
            obj.setQuantite(((Integer) row.get("Quantite")));
            article.add(obj);
            model.addAttribute("message",article.get(0));
         }
          return "details";
        }
         
       
         
   /* @RequestMapping("/hello")
    public String printHello(ModelMap model){
     String sql = "Select * from Article";  
     List<Map<String, Object>> result = this.jdbctemplate.queryForList(sql);
     //ArrayList result = (ArrayList) this.jdbctemplate.queryForList(sql);
     model.addAttribute("message", result.get(0));
     return "hello";
    }*/
    
        @RequestMapping("/marhaba")
    public String printMarhaba(@RequestParam(value="name",required=false,defaultValue="Iness" ) String name, ModelMap model){
        model.addAttribute("message","Marhaba my  name is : "+name);
        return "marhaba";
    }
    
 
}
