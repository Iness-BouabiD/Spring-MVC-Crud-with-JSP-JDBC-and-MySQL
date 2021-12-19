/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author HP
 */
public class ArticleMapper implements RowMapper<Article> {

    @Override
    public Article mapRow(ResultSet rs, int i) throws SQLException {
       Article article = new Article();
       article.setID_Article(rs.getInt("ID_Article"));
       article.setDesignation(rs.getString("Designation"));
       article.setCategorie(rs.getString("Categorie"));
       article.setPrix(rs.getFloat("Prix"));
       article.setQuantite(rs.getInt("Quantite"));
       return article;
    }
    
}
