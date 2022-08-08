package com.tns.shoppingapllication;

public class GSNormalAcc extends NormalAcc{

public GSNormalAcc(int accNo,String accNm,float charges,float deliveryCharges){
	 super(accNo,accNm,charges,deliveryCharges);
}
public void bookProduct(float param){
    super.bookProduct(param);
}
public String toString(){
    return super.toString();
}
}

