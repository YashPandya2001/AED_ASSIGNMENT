/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class VitalSignsHistory {
    
    private ArrayList<VitalSigns> vitalSignsHistory;

    public VitalSignsHistory()
    {
        vitalSignsHistory=new ArrayList<VitalSigns>();
        
    }
    public ArrayList<VitalSigns> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSigns> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }
    
    public VitalSigns addVital()
    {
        VitalSigns vs=new VitalSigns();
        vitalSignsHistory.add(vs);
        return vs;
    }
    public void removeVital(VitalSigns v)
    {
        vitalSignsHistory.remove(v);
        
    }
}
