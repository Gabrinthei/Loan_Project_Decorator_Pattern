/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loanprogram;

/**
 *
 * @author James Sonntag and William Bromley
 */
public class Rule1 extends RuleDecorator {
    Loan loan;
    public int score;
    
    public Rule1(Loan loan, int score) {
        this.loan = loan;
        this.score = score;
    }
    
    public String getDescription(){
        return loan.getDescription() + ", Rule1";
    }
    
    public boolean evaluation(){
        if(score < 650)
            return false & loan.evaluation();
        return true & loan.evaluation();
    }
}
