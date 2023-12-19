/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejb;

import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author sorre
 */
public class MAIN1 {
    public static void main(String[] args) throws NamingException{
        Context ctx = new InitialContext();
        DPCMEJBRemote d = (DPCMEJBRemote) ctx.lookup("java:global/EJB_DPCM/DPCMEJB!ejb.DPCMEJBRemote");
        List <DPCM> l = d.cercatutti();
        for(DPCM d1 : l){
            System.out.println(d1);
        }
        l = d.cercaemergenza("Covid");
        for(DPCM d1 : l){
            System.out.println(d1);
        }
        l = d.cercapres(10);
        for(DPCM d1 : l){
            System.out.println(d1);
        }
    }
    
}
