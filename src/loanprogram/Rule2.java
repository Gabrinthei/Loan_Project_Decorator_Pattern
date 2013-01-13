/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loanprogram;

/**
 *
 * @author James Sonntag and William Bromley
 */
public class Rule2 extends RuleDecorator{
    Loan loan;
    public int salary;
    public int debt;
    
    public Rule2(Loan loan, int salary, int debt) {
        this.loan = loan;
        this.salary = salary;
        this.debt = debt;
    }
    
    public String getDescription(){
        return loan.getDescription() + ", Rule2";
    }
    
    public boolean evaluation(){
        double ratio = debt/salary;
        if(ratio <= .28)
            return true & loan.evaluation();
        return false & loan.evaluation();
    }
}
