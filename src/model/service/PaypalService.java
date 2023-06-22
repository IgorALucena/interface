package model.service;

public class PaypalService implements OnlinePaymentService {
	
	public final static double PE_PAYMENTFEE = 0.02;
	public final static double PE_INTEREST = 0.01;
	
	@Override
	public Double paymentFee(Double amount) {
	
		return amount * PE_PAYMENTFEE;
	}
	@Override
	public Double interest(Double amount, Integer months) {
		
		return amount * PE_INTEREST * months;
	}
	

}
