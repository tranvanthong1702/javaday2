import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App
{
	public static void main(String[] args)
	{
		List<Product> productList = new ArrayList<Product>();
		// list
		productList.add(new Product(1, "laptop", 25,true,LocalDate.of(2022, 7, 6)));
		productList.add(new Product(2, "dienthoai", 15,true,LocalDate.now()));
		productList.add(new Product(3, "tai nghe", 10,true,LocalDate.of(2022, 7, 15)));
		productList.add(new Product(4, "ban phim", 40,false,LocalDate.now()));
		productList.add(new Product(5, "chuot", 10,true,LocalDate.of(2022, 10,20)));

	// Collections.sort(listProduct,new Comparator<Product>() {
				// 	@Override
				// 	public int compare(Product o1, Product o2) {
				// 		return o1.getQulity() - o2.getQulity();
				// 	}
				// });
				// listProduct.forEach((product)->System.out.println(product.getName()));


		Scanner sc= new Scanner(System.in);
		int inputId;
		System.out.println("nhap id :");
		inputId=sc.nextInt();

		for(Product x:productList){
			int id=x.getId();

			if(inputId==id){
				System.out.println("thong tin san pham ban vua nhap la:");
			  System.out.println(x);
			}
		}
		System.out.println("san pham co so luong >5 va chua bi xoa:");
		for(Product x:productList){
				int qulity=x.getQulity();
				boolean isDelete=x.isDelete;
				if(qulity>0 && isDelete==true){
							System.out.println(x);
					}
		}
		System.out.println("san pham co so ngay lon hon ngay hien tai chua bi xoa:");
		for(Product x:productList){
			  LocalDate a=LocalDate.now();
				LocalDate date=x.getSaleDate();
				boolean isDelete=x.isDelete;
				if( isDelete==true && date.compareTo(a)>0){
							System.out.println(x);
					}
				}

		List<Product> filteredProductList = productList.stream()
				.filter(p -> p.getId() == 1)
				.collect(Collectors.toList());
	      System.out.println(filteredProductList);
		  	for(Product x: filteredProductList){
					System.out.println(x.getName());
				}

		List<Product>listProduct = productList.stream()
				.filter(p->p.getQulity() > 5 && true==p.isDelete())
				.collect(Collectors.toList());
				System.out.println(listProduct);

	  LocalDate a=LocalDate.now();
		System.out.println("hien tai:"+a);
		List<Product>saleDate= productList.stream()
				.filter(p-> p.isDelete==true )
				.collect(Collectors.toList());
				System.out.println(saleDate);
				for(Product x:saleDate){
					LocalDate date=x.getSaleDate();
									if(date.compareTo(a)>0){
											System.out.println(x.getName());
									}
				}

		// List<Product>sumProduct = productList.stream()
		// .filter(p->p.isDelete()==true)
		// .reduce(0,);

		List<Product>ProIdName=productList.stream()
		.filter(p-> p.getQulity()>7)
		.collect(Collectors.toList());
		for(Product x:ProIdName){
			if(x.getSaleDate().compareTo(LocalDate.now())>0){
				System.out.println("san pham co ID:"+x.getId()+", Name:"+x.getName());
			}
		}
	}
}
