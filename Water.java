package DOAN;

import java.util.List;
import java.util.Scanner;

public class Water implements CrudFeature {
	Scanner sc = new Scanner(System.in);

	@Override
	public void display(List<Drinks> list) {
		int i = 0 ;
		for (Drinks drinks : list) {
			System.out.print(i++ + ": ");
			drinks.displayDrinks();
		}
	}

	@Override
	public void save(List<Drinks> list) {
		// TODO Auto-generated method stub
		System.out.println("Lưu thành công");
	}

	@Override
	public void add(List<Drinks> list) {
		
		System.out.print("Nhập tên thức uống: ");
		String name = sc.nextLine();
		System.out.print("Nhập giá thức uống: ");
		int price = Integer.parseInt(sc.nextLine());
		Drinks x = new Drinks(name,price);
		
		list.add(x);
	}

	@Override
	public void edit(List<Drinks> list, int i) {
		
		System.out.println("Bắt đầu sửa: ");
		
		System.out.print("Nhập tên thức uống mới: ");
		String name = sc.nextLine();
		
		System.out.print("Nhập giá thức uống mới: ");
		int price = Integer.parseInt(sc.nextLine());
		
		list.get(i).setName(name);
		list.get(i).setPrice(price);
		
	}

	@Override
	public void delete(List<Drinks> list, int i) {
		// TODO Auto-generated method stub
		list.remove(i);
	}

}
