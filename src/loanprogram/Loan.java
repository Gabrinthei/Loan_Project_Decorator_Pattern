/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loanprogram;

/**
 *
 * @author James Sonntag and William Bromley
 */
public abstract class Loan {
    String description = "Unknown Loan";
    
    public String getDescription(){
        return description;
    }
    
    public abstract boolean evaluation();
}
