package aplication;

import java.util.Date;

import entities.Order;
import entities_Enum.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order order = new Order(1000, new Date(), OrderStatus.PAGAMENTO_PEDENTE);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.ENTREGUE;
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
