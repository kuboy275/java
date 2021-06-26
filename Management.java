package DOAN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management {

	public static void displayListMenu() {
		System.out.println("1: Hiển thị danh sách");
		System.out.println("2: Thêm danh sách");
		System.out.println("3: Chỉnh sửa đồ uống");
		System.out.println("4: Xóa đồ uống");
		System.out.println("5: Lưu danh sách");
		System.out.println("any: Thoát chương trình");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		List<Drinks> list = new ArrayList<Drinks>();

		list.add(new Drinks("Bo Huc", 12000));
		list.add(new Drinks("CaFe", 22000));
		
		//upcasting
		CrudFeature a = new Water();  
		displayListMenu();
		while(true) {
			int index;
			System.out.println("Xin mời chọn menu: ");
			int choise = 0;
			while(choise == 0) {
				try {
					 choise =  Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					System.out.println("Vui lòng nhập số theo menu");
				}
			}
			System.out.println("");
			switch (choise) {
			case 1:
				a.display(list);
				break;
			case 2:
				a.add(list);
				System.out.println("Thêm thành công!");
				break;
			case 3:
				a.display(list);
				System.out.print("Vui lòng chọn phần tử cần sửa: ");
				index = Integer.parseInt(sc.nextLine());
				a.edit(list, index);
				System.out.println("Sửa thành công!");
				break;
			case 4:
				a.display(list);
				System.out.print("Vui lòng chọn phần tử cần xóa: ");
				index = Integer.parseInt(sc.nextLine());
				a.delete(list, index);
				System.out.println("Xóa thành công!");
				break;
			case 5:
				a.save(list);
				break;
			default:
				System.out.print("Thoát khỏi chương trình");
				System.exit(0);
			}
		}

	}

}
