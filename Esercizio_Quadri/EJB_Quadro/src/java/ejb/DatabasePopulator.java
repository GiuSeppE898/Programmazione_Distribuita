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
        name = "java:global/jdbc/EsameDS",
        user="APP",
        password="APP",
        databaseName="EsameDB",
        properties={"connectionAttribute=;create=true"}       

)
public class DatabasePopulator {
    @Inject
    QuadroEJB q;
    Quadro q1,q2,q3;
    @PostConstruct
    public void Populatedb(){
        q1 = new Quadro(1,"Deposizione","Caravaggio",1604,"Olio su tela",12,"sede");
        q.add(q1);
        q2 = new Quadro(2,"Trittico Stefaneschi","Giotto",1320,"Tempera su tavola",2,"sede");
        q.add(q2);
        q3 = new Quadro(3,"Pala dei Decemviri","Perugino",1496,"Olio su tavola",7,"restauro");
        q.add(q3);
    }
    
    @PreDestroy
    public void Deletedb(){
        q.delete(q1);
        q.delete(q2);
        q.delete(q3);
    }
}
