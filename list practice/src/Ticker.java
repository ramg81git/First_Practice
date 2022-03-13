public class Ticker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stock123 s1 = new Stock123("MSFT",100,200,50);
		Stock123 s2 = new Stock123("GOOG",250,230,100);
		Stock123 s3 = new Stock123("AAPL",150,200,150);
		System.out.println(s1);
		
		s1.Alert();
		s2.Alert();
		s3.Alert();

	}

}


class Stock123 {
	
	String tname;
	int tprice,t52wh,t52wl;
	
	Stock123(String tname,int tprice,int t52wh,int t52wl)
	{
		this.tname=tname;
		this.tprice=tprice;
		this.t52wh=t52wh;
		this.t52wl=t52wl;
			
		
	}

	@Override
	public String toString() {
		return "Stock123 [tname=" + tname + ", tprice=" + tprice + ", t52wh=" + t52wh + ", t52wl=" + t52wl + "]";
	}
	
	
	public void Alert()
	{
		int x;
	x=t52wh-(20/100*t52wh);
	if(tprice<x)
		System.out.println("stock price 20% drop alert  "  +tname);
	}
	}
	
	
