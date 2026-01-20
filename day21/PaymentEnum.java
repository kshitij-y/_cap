/**
 * 
 * Payment Mode Validation
A shopping application supports different payment modes using an enum.
Requirements :
Create an enum named PaymentMode with constants:
	CASH
	UPI
	DEBIT_CARD
	CREDIT_CARD
	NET_BANKING

Create a class Payment with:
	double amount
	PaymentMode mode

Add:
	A parameterized constructor
	A method processPayment()

Logic inside processPayment():
	If mode is CASH, print: Payment will be collected on delivery
	If mode is UPI or NET_BANKING, print: Online payment successful
	If mode is DEBIT_CARD or CREDIT_CARD, print: Card payment processed
Use switch-case with enum

In main():
	Create at least two Payment objects with different modes
	Call processPayment() for each
 */

public class PaymentEnum {
    
}
