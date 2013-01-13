/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loanprogram;

/**
 *
 * @author James Sonntag and William Bromley
 */
public class ThirtyYearLoan extends Loan {
    public ThirtyYearLoan(){
        description = "ThirtyYear";
    }
    
    public boolean evaluation() {
        return true;
    }
}
