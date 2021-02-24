package inArrayList;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class ProductExample {

		List productp=null;
		List cart=null;
		Scanner sc=new Scanner(System.in);
	    public void addProduct()
	    {
	    	productp=new ArrayList();
	    	System.out.println("How many product to you buy");
	    	int i=sc.nextInt();
	    	for(int j=0;j<i;j++)
	    	{
	    		ProductSample p=new ProductSample();
	    		System.out.println("Enter product id");
	    		p.setPid(sc.nextInt());
	    		
	    		System.out.println("Enter product name");
	    		p.setPname(sc.next());
	    		
	    		System.out.println("Enter product price");
	    		p.setPrice(sc.nextDouble());
	    		productp.add(p);
	    	}
	    }
	    
	    public void displayProduct()
	    {
	    		System.out.println("----------------------------------------------------");
	    		System.out.println("Product Id"+" "+"Product Name"+" "+"Product Price");
	    		for (Object object : productp) 
	    		{
					ProductSample pr=(ProductSample)object;		
					
					System.out.println(pr.getPid()+"    "+pr.getPname()+"   "+pr.getPrice());
				}
	    		System.out.println("-----------------------------------------------------");
	    	
	    }
	    
	    
	    public void addToCart()
	    {
	    	if(!productp.isEmpty())
	    	{
	    		displayProduct();
	    		
	    		System.out.println("How many product do you want to add");
	    		int i=sc.nextInt();
	    		cart=new ArrayList();
	    		
	    		for(int j=0;j<i;j++)
	    		{
	    			System.out.println("Enter id for allocation");
	    			int id=sc.nextInt();
	    			
	    			for (Object object : productp)
	    			{
						ProductSample ps=( ProductSample)object;					
						if(ps.getPid()==id)
						{
							cart.add(ps);
						}
						ps.setProducts(cart);
					}
	    		}
	    	}
	    }
	    
	    public void addBill()
	    {
	    	if(!cart.isEmpty())
	    	{
	    	double b=0;
	    	for (Object object :cart)
	    	{
	    		ProductSample d=(ProductSample)object;
				System.out.println(d.getPid()+" "+d.getPname()+" "+d.getPrice());
				b=b+d.getPrice();
			}
	    	}
	    }
		public static void main(String[] args) 
		{
			ProductExample e=new ProductExample();
			e.addProduct();
			e.displayProduct();
			e.addToCart();
			e.addBill();
	    }

	}


