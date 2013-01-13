/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loanprogram;

/**
 *
 * @author James Sonntag and William Bromley
 */
public class FHALoan extends Loan {
    public FHALoan(){
        description = "FHA";
    }
    
    public boolean evaluation() {
        return true;
    }
}
