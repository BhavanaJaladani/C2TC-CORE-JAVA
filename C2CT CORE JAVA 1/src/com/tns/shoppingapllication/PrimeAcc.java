package com.tns.shoppingapllication;


	public abstract  class PrimeAcc extends ShopAcc {
		private boolean isPrime;
		private static final float deliveryCharges=0;
		public PrimeAcc(int accNo,String accNm,float charges,boolean isPrime){
		    super(accNo,accNm,charges);
		    this.isPrime=isPrime;
		}

		    public boolean isPrime() {
		        return isPrime;
		    }

		    public abstract void bookProduct(float charg);
		public String toString(){
		    String data=super.toString();
		    data+="\n Delivery Charges: "+deliveryCharges;
		    return data;
		}
	}


