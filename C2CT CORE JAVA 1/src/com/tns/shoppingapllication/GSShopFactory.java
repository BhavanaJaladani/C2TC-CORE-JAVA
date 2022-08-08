package com.tns.shoppingapllication;


	public class GSShopFactory extends ShopFactory{
	    @Override
	    public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
	        return new GSPrimeAcc( accNo, accNm, charges, isPrime);
	    }

	    @Override
	    public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
	        return new GSNormalAcc(accNo,accNm,charges,deliveryCharges);
	    }
	}


