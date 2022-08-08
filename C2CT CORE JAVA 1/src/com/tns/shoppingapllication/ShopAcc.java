package com.tns.shoppingapllication;


	public abstract class ShopAcc {
	    private int accNo;
	    private String accNm;
	    private float charges;
	    public ShopAcc(int accNo,String accNm,float charges){
	        this.accNo=accNo;
	        this.accNm=accNm;
	        this.charges=charges;
	    }
	    public abstract void bookProduct(float param);
	    public int getAccNo() {
	        return accNo;
	    }
	    public String getAccNm() {
	        return accNm;
	    }
	    public void setAccNm(String accNm) {
	        this.accNm = accNm;
	    }
	    public float getCharges() {
	        return charges;
	    }
	    public  void items(float param){

	    }
	    public  String toString(){
	        String data="Account Number :"+this.accNo;
	        data+="\n Account Name : "+this.accNm;
	        data+="\n Charges :"+this.charges;
	        return data;
	    }
	}


