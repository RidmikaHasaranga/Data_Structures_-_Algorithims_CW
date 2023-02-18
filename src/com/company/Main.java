package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        QueueAsLinkedList normalCustomer = new QueueAsLinkedList();
        QueueAsLinkedList highPriorityCustomer = new QueueAsLinkedList();
        QueueAsLinkedList innerCircleCustomer = new QueueAsLinkedList();

        ArrayList<String> normalCustomerNIC = new ArrayList<String>();
        ArrayList<Integer> normalCustomerAccountNumber = new ArrayList<Integer>();
        ArrayList<String> normalCustomerTypeOfLoan = new ArrayList<String>();
        ArrayList<String> normalCustomerReasonForApplication = new ArrayList<String>();
        ArrayList<String> normalCustomerDescription = new ArrayList<String>();

        ArrayList<String> highPriorityCustomerNIC = new ArrayList<String>();
        ArrayList<Integer> highPriorityCustomerAccountNumber = new ArrayList<Integer>();
        ArrayList<String> highPriorityCustomerTypeOfLoan = new ArrayList<String>();
        ArrayList<String> highPriorityCustomerReasonForApplication = new ArrayList<String>();
        ArrayList<String> highPriorityCustomerDescription = new ArrayList<String>();

        ArrayList<String> innerCircleCustomerNIC = new ArrayList<String>();
        ArrayList<Integer> innerCircleCustomerAccountNumber = new ArrayList<Integer>();
        ArrayList<String> innerCircleCustomerTypeOfLoan = new ArrayList<String>();
        ArrayList<String> innerCircleCustomerReasonForApplication = new ArrayList<String>();
        ArrayList<String> innerCircleCustomerDescription = new ArrayList<String>();

        int option = startMenu();
        while (option != 3) {
            if (option == 1) {
                int customer = selectCustomer();

                Scanner input = new Scanner(System.in);
                System.out.print("Enter Account Number: ");
                int accNumber = input.nextInt();

                System.out.print("Enter NIC Number: ");
                String nicNumber = input.next();

                System.out.print("Enter Loan type: ");
                String loanType = input.next();

                System.out.print("Enter Reason for Application: ");
                String reason = input.next();

                System.out.print("Enter Description of the collateral/s: ");
                String description = input.next();
                System.out.println("Account Number:" + accNumber + " Nic:" + nicNumber + " Loan type:" + loanType + " Reason:" + reason + " Description:" + description);
                if (customer == 1) {
                    normalCustomer.enqueue(accNumber);

                    normalCustomerAccountNumber.add(accNumber);
                    normalCustomerNIC.add(nicNumber);
                    normalCustomerTypeOfLoan.add(loanType);
                    normalCustomerReasonForApplication.add(reason);
                    normalCustomerDescription.add(description);
                } else if (customer == 2) {
                    highPriorityCustomer.enqueue(accNumber);

                    highPriorityCustomerAccountNumber.add(accNumber);
                    highPriorityCustomerNIC.add(nicNumber);
                    highPriorityCustomerTypeOfLoan.add(loanType);
                    highPriorityCustomerReasonForApplication.add(reason);
                    highPriorityCustomerDescription.add(description);
                } else if (customer == 3) {
                    innerCircleCustomer.enqueue(accNumber);

                    innerCircleCustomerAccountNumber.add(accNumber);
                    innerCircleCustomerNIC.add(nicNumber);
                    innerCircleCustomerTypeOfLoan.add(loanType);
                    innerCircleCustomerReasonForApplication.add(reason);
                    innerCircleCustomerDescription.add(description);
                } else {
                    System.out.println("Incorrect Input");

                }
            } else if (option == 2) {
                int customer = selectCustomer();
                if (customer == 1) {
                    if (normalCustomer.isEmpty()) {
                        System.out.println("No data!");
                    } else {
                        System.out.println("Account Number:"+ normalCustomerAccountNumber.get(0));
                        System.out.println("NIC:"+normalCustomerNIC.get(0));
                        System.out.println("Type of Loan:"+normalCustomerTypeOfLoan.get(0));
                        System.out.println("Reason:"+normalCustomerReasonForApplication.get(0));
                        System.out.println("Description:"+normalCustomerDescription.get(0));

                        Scanner input = new Scanner(System.in);
                        System.out.print("Are you approve this loan?(Enter y or n): ");
                        String ans = input.next();
                        if (ans.equals("y")) {
                            normalCustomer.dequeue();

                            normalCustomerNIC.remove(0);
                            normalCustomerAccountNumber.remove(0);
                            normalCustomerTypeOfLoan.remove(0);
                            normalCustomerReasonForApplication.remove(0);
                            normalCustomerDescription.remove(0);

                            System.out.println("\nApproval Done!\nRemoved Data from System");
                        }
                    }
                } else if (customer == 2) {
                    if (highPriorityCustomer.isEmpty()) {
                        System.out.println("No data!");
                    } else {
                        System.out.println("Account Number:"+ highPriorityCustomerAccountNumber.get(0));
                        System.out.println("NIC:"+highPriorityCustomerNIC.get(0));
                        System.out.println("Type of Loan:"+highPriorityCustomerTypeOfLoan.get(0));
                        System.out.println("Reason:"+highPriorityCustomerReasonForApplication.get(0));
                        System.out.println("Description:"+highPriorityCustomerDescription.get(0));

                        Scanner input = new Scanner(System.in);
                        System.out.print("Are you approve this loan?(Enter y or n): ");
                        String ans = input.next();
                        if (ans.equals("y")) {
                            highPriorityCustomer.dequeue();

                            highPriorityCustomerNIC.remove(0);
                            highPriorityCustomerAccountNumber.remove(0);
                            highPriorityCustomerTypeOfLoan.remove(0);
                            highPriorityCustomerReasonForApplication.remove(0);
                            highPriorityCustomerDescription.remove(0);

                            System.out.println("\nApproval Done!\nRemoved Data from System");
                        }
                    }
                } else if (customer == 3) {
                    if (innerCircleCustomer.isEmpty()) {
                        System.out.println("No data!");
                    } else {
                        System.out.println("Account Number:"+ innerCircleCustomerAccountNumber.get(0));
                        System.out.println("NIC:"+innerCircleCustomerNIC.get(0));
                        System.out.println("Type of Loan:"+innerCircleCustomerTypeOfLoan.get(0));
                        System.out.println("Reason:"+innerCircleCustomerReasonForApplication.get(0));
                        System.out.println("Description:"+innerCircleCustomerDescription.get(0));

                        Scanner input = new Scanner(System.in);
                        System.out.print("Are you approve this loan?(Enter y or n): ");
                        String ans = input.next();
                        if (ans.equals("y")) {
                            innerCircleCustomer.dequeue();

                            innerCircleCustomerNIC.remove(0);
                            innerCircleCustomerAccountNumber.remove(0);
                            innerCircleCustomerTypeOfLoan.remove(0);
                            innerCircleCustomerReasonForApplication.remove(0);
                            innerCircleCustomerDescription.remove(0);

                            System.out.println("\nApproval Done!\nRemoved Data from System");
                        }
                    }
                } else {
                    System.out.println("Incorrect Input");

                }
            } else if (option == 3){
                break;
            }
            else {
                System.out.println("Incorrect Input");
            }
            option = startMenu();
        }
    }

    public static int startMenu(){
        System.out.println("Hatton National Bank\n\tSri Lanka\n\nInternet Banking Service\n(Loan Application System)");
        System.out.println();
        System.out.println("1.Add new customer");
        System.out.println("2.Approval Loans");
        System.out.println("3.Exit");
        Scanner input = new Scanner(System.in);
        System.out.print("Select option: ");
        return input.nextInt();
    }

    public static int selectCustomer(){
        System.out.println("\nHatton National Bank\n\tSri Lanka\n\nInternet Banking Service\n(Loan Application System)");
        System.out.println();
        System.out.println("1.Normal Customer");
        System.out.println("2.High Priority Customer");
        System.out.println("3.Inner Circle Customer\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Select Customer Type: ");
        return input.nextInt();
    }
}
