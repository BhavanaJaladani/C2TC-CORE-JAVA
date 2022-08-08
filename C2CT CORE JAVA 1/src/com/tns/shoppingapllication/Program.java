package com.tns.shoppingapllication;

public class Program {

	public static void main(String[] args) {
		ShopFactory sf=new GSShopFactory();
        PrimeAcc pa=new GSPrimeAcc(1,"ABC",1.9f,true);
        NormalAcc na=new GSNormalAcc(2,"XYZ",1.9f,0.3f);
        pa.bookProduct(0.1f);
        System.out.println(pa);  // it will automatically call toString method
        na.bookProduct(0.1f);
        System.out.println(na);  // it will automatically call toString method

	}

}
