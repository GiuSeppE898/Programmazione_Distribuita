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
        name="java:global/jdbc/EJB_EsamePD_DS",
        user="APP",
        password="APP",
        databaseName="EsameDB",
        properties={"connectionAttribute=;create=true"}

)
public class DatabasePopulator {
@Inject 
MuseoEJB m;
Museo m1,m2,m3;
@PostConstruct
public void CreateDB(){
    m1 = new Museo(1,"Museo di Paestum","Gabriel Zuchtriegel",430,"Capaccio","Salerno","Campania");
    m.add(m1);
    m2 = new Museo(2,"Musei Vaticani","Barbara Jatta",5978,"Roma","Roma","Lazio");
    m.add(m2);
    m3 = new Museo(3,"Galleria degli Uffizi","Eike Dieter Schmidt",1935,"Firenze","Firenze","Toscana");
    m.add(m3);
}
@PreDestroy
public void DeleteDB(){
    m.delete(m1);
    m.delete(m2);
    m.delete(m3);
}
}
