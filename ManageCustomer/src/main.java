import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		List<Customer> dskh = new ArrayList<Customer>();

		Customer oCus;
		String selection;
		Scanner sc = new Scanner(System.in);
		System.out.println("Chương trình tạo danh sách khách hàng");
		
		do {
			System.out.println("Bấm '1' để thêm, bấm nút bất kỳ để thoát");
			selection = sc.next();
			oCus = new Customer();
			switch (selection) {
			case "1":
				addCus(oCus);
				dskh.add(oCus);
				break;

			default:
				System.out.println("Thoát chế độ nhập!");
				break;
			}
		} while (selection.equals("1"));
		
		/*for(int i =0; i<dskh.size(); i++){
			Customer oCust = dskh.get(i);	
			System.out.println();		
			System.out.println("+ Mã khách hàng: "+ oCustomer.iCustomerID);
			System.out.println("+ Họ và tên: "+ oCustomer.sFullname);
			System.out.println("+ Điện thoại: "+ oCustomer.sPhoneNo);
			
		}*/
		System.out.println("Danh sách khách hàng");
		for(Customer oCustomer : dskh){
			System.out.println();
			System.out.println("+ Mã khách hàng: "+ oCustomer.iCustomerID);
			System.out.println("+ Họ và tên: "+ oCustomer.sFullname);
			System.out.println("+ Điện thoại: "+ oCustomer.sPhoneNo);
		}
		System.out.println("push len branch2");

	}

	static void addCus(Customer cus) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mã khách hàng (bằng số):");
		cus.iCustomerID = sc.nextInt();
		sc.nextLine();//bỏ bộ đệm /n
		System.out.println("Tên khách hàng:");
		cus.sFullname = sc.next();
		sc.nextLine();//bỏ bộ đệm /n
		System.out.println("Số điện thoại:");
		cus.sPhoneNo = sc.next();
		sc.nextLine();//bỏ bộ đệm /n

	}

}
