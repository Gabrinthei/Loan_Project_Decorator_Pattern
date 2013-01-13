/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loanprogram;

/**
 *
 * @author James Sonntag and William Bromley
 */
public class FifteenYearLoan extends Loan {
    public FifteenYearLoan(){
        description = "FifteenYear";
    }

    @Override
    public boolean evaluation() {
        return true;
    }
}
