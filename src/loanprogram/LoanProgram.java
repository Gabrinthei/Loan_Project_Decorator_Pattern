/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loanprogram;

import java.util.Scanner;

/**
 *
 * @author James Sonntag and William Bromley
 */
public class LoanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int type;
        int score;
        int downPayment;
        int salary;
        int debt;
        int costOfHouse;
        boolean firstTime;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter:");
        System.out.println("1 for a 15-year Loan, ");
        System.out.println("2 for a 30-year Loan, ");
        System.out.println("3 for a FHA Loan, ");
        System.out.print("4 for a Variable Rate Loan: ");
        type = scan.nextInt();           
        System.out.println();
        System.out.print("Please enter your credit score: ");
        score = scan.nextInt();
        System.out.println();
        System.out.print("Please enter your down payment amount: ");
        downPayment = scan.nextInt();
        System.out.println();
        System.out.print("Please enter your monthly salary: ");
        salary = scan.nextInt();
        System.out.println();
        System.out.print("Please enter your monthly debt: ");
        debt = scan.nextInt();
        System.out.println();
        System.out.print("Please enter the cost of the House: ");
        costOfHouse = scan.nextInt();
        System.out.println();
        System.out.print("Please enter: ");
        System.out.println("'true' if you are a First-Time buyer, or ");
        System.out.print("'false' if not: ");
        firstTime = scan.nextBoolean();
        
        Loan loan = new FifteenYearLoan();
        switch(type) {
            case 1: loan = new FifteenYearLoan();
                break;
            case 2: loan = new ThirtyYearLoan();
                break;
            case 3: loan = new FHALoan();
                break;
            case 4: loan = new VariableLoan();
                break;
        }
        
        loan = new Rule1(loan, score);
        loan = new Rule2(loan, salary, debt);
        loan = new Rule3(loan, downPayment, costOfHouse, salary);
        loan = new Rule4(loan, firstTime, type);
        
        if(loan.evaluation())
        {
            System.out.println("Contrats! You have been approved for the loan!");
        }
        else
            System.out.println("Sorry! You suck!");
        
    }
}
