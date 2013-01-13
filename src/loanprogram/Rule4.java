/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loanprogram;

/**
 *
 * @author James Sonntag and William Bromley
 */
public class Rule4 extends RuleDecorator{
    Loan loan;
    public boolean firstTime;
    public int type;
    
    public Rule4(Loan loan, boolean firstTime, int type) {
        this.loan = loan;
        this.firstTime = firstTime;
        this.type = type;
    }
    
    public String getDescription(){
        return loan.getDescription() + ", Rule4";
    }
    
    public boolean evaluation(){
        if(firstTime == false && type == 3)
            return false & loan.evaluation();
        else
            return true & loan.evaluation();
    }
}
