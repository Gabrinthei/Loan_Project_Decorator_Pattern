/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loanprogram;

/**
 *
 * @author James Sonntag and William Bromley
 */
public class VariableLoan extends Loan{
    public VariableLoan(){
        description = "Variable";
    }
    
    public boolean evaluation() {
        return true;
    }
}
