package Config;


import org.springframework.jdbc.datasource.DriverManagerDataSource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Connexion {
    public DriverManagerDataSource  getConnection(){
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setDriverClassName("com.mysql.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/bdarticle?serverTimezone=UTC");
        datasource.setUsername("root");
        datasource.setPassword("inessiness");
        return datasource;
    }
}
