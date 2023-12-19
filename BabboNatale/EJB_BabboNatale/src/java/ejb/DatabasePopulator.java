/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author sorre
 */
@Singleton
@Startup
@DataSourceDefinition(
        className = "org.apache.derby.jdbc.EmbeddedDataSource",
        name = "java:global/jdbc/EJB_EsamePD_DS",
        user= "APP",
        password = "APP",
        databaseName = "EJB_EsamePD_DB",
        properties = {"connectionAttributes=;create=true"}

)
public class DatabasePopulator {    
    @Inject
    BambinoEJB b;
    Bambino b1,b2,b3;
    @PostConstruct
    public void populateDB(){
        b1 = new Bambino(1,"Di Dio Angelo","Messina","Italia",4,3,true,false);
        b2 = new Bambino(2,"God Angelina","New York","USA",3,10,false,false);
        b3 = new Bambino(3,"Birbantello Luigi","Salerno","Italia",5,3,true,true);
        b.createBambino(b1);
        b.createBambino(b2);
        b.createBambino(b3);
    }
    
    @PreDestroy
    public void ClearDB(){
        b.deleteBambino(b1);
        b.deleteBambino(b2);
        b.deleteBambino(b3);
    }
    
    
}
