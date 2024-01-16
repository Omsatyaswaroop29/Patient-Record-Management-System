/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASS;

/**
 *
 * @author vaish
 */
public class Login {
    
    public static Login instance;

    
   public static Login getInstance() {
        if (instance == null) 
        {
            instance = new Login();
        }
        return instance;
    } 
}
    

