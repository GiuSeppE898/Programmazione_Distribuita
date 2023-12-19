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
@DataSourceDefinition (
        className = "org.apache.derby.jdbc.EmbeddedDataSource",
        name = "java:global/jdbc/EJB_EsamePD_DS",
        user= "APP",
        password = "APP",
        databaseName = "EJB_EsamePD_DB",
        properties = {"connectionAttributes=;create=true"}
)
public class DatabasePopulator {
    @Inject
    ScuolaEJB s;
    Scuola s1,s2,s3;
    
    @PostConstruct
    public void createDB(){
        s1 = new Scuola(1,"Margherita Kack","Tecnico","Salerno","Mario Rossi","BioInformatica",40,false);
        s2 = new Scuola(2,"Focaccia","Tecnico","Salerno","Guido Verdi","IoT",50,false);
        s3 = new Scuola(3,"Genovesi-Da Vinci","Scientifico","Salerno","Gianluca Bianchi","CodingGirls",55,false);
        s.createScuola(s1);
        s.createScuola(s2);
        s.createScuola(s3);
    }
    @PreDestroy
    public void clearDB(){
        s.deleteScuola(s1);
        s.deleteScuola(s2);
        s.deleteScuola(s3);
    }
    
    
    
}
