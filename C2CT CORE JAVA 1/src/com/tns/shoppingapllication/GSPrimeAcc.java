package com.tns.shoppingapllication;


	public class GSPrimeAcc extends PrimeAcc{
	  private static final float charges=0;
	    public GSPrimeAcc(int accNo,String accNm,float charges,boolean isPrime){
	        super(accNo, accNm, charges, isPrime);
	    }
	    public void bookProduct(float charg){
	        if(isPrime()){
	            //do not allow extra delivery charges to it
	            System.out.println("\n*****\nNo delivery charges required!!!");
	        }
	    }
	    public String toString(){
	        String data=super.toString();
	        return data;
	    }
	}
