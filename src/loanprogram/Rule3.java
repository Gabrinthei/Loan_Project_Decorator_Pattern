/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loanprogram;

/**
 *
 * @author James Sonntag and William Bromley
 */
public class Rule3 extends RuleDecorator{
    Loan loan;
    public int down;
    public int total;
    public int salary;
    
    public Rule3(Loan loan, int down, int total, int salary) {
        this.loan = loan;
        this.down = down;
        this.total = total;
        this.salary = salary;
    }
    
    public String getDescription(){
        return loan.getDescription() + ", Rule3";
    }
    
    public boolean evaluation(){
        if(down/total < .05)
        {
            if(total < 48*salary)
                return true & loan.evaluation();
            else
                return false & loan.evaluation();
        }
        return true & loan.evaluation();
        
    }
}
