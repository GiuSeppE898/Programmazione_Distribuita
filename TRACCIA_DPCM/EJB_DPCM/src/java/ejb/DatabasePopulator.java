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
        className ="org.apache.derby.jdbc.EmbeddedDataSource",
        name="java:global/jdbc/EJB_EsamePD_DS",
    user="APP",
    password="APP",
    databaseName = "EJB_EsamePD_DB",
    properties = {"connectionAttributes=;create=true"}
)
public class DatabasePopulator {
    @Inject
    DPCMEJB d;
    DPCM d1,d2,d3;
    @PostConstruct
    public void CreateDB(){
        d1 = new DPCM(1,"Decreto CoronaVirus","Covid", "Sanitaria","1", 12);
        d2 = new DPCM(2, "E’ arrivata la fine del mondo","Diluvio", "Fine del mondo", "1", 1);
        d3 = new DPCM(3,"La Peste Nera è qui","Peste","Sanitaria","2",8);
        d.add(d1);
        d.add(d2);
        d.add(d3);
    }
    @PreDestroy
    public void DeleteDB(){
        d.delete(d1);
        d.delete(d2);
        d.delete(d3);
        }
}
