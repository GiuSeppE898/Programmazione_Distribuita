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
    className ="org.apache.derby.jdbc.EmbeddedDataSOurce",
    name = "java:global/jdbc/EJB_EsamePD_DS",
    user="APP",
    password="APP",
    databaseName = "EJB_EsamePD_DB",
    properties = {"connectionAttributes=;create=true"}
)

public class Database_Populator {
     @Inject
    VinoEJB v;
    
    Vino v1, v2, v3;
    
    @PostConstruct
    private void populateDB() {
        v1 = new Vino(1, "Montevetrano", "Carbenet", "Colli Di Salerno", 11, "Italia", 60, "Rosso", false); 
        v2 = new Vino(2, "Terra Di Lavoro", "Aglianico", "Galardi", 15, "Italia", 50, "Rosso", false);
        v3 = new Vino(3, "Influece Miniere", "Meunier", "Rodolpe Miniere", 5, "Francia", 51, "Champagne", false );
        
        v.createVino(v1);
        v.createVino(v2);
        v.createVino(v3);
    }
    
    @PreDestroy
    private void clearDB(){
        v.deleteVino(v1);
        v.deleteVino(v2);
        v.deleteVino(v3);
    }
}
   
