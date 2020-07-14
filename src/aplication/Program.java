package aplication;

import java.util.Date;

import entities.Order;
import entities_Enum.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Order order = new Order(1000, new Date(), OrderStatus.PAGAMENTO_PEDENTE);
		
		System.out.println(order);
		
		// nesse metedo converte um tipo String do pedido para um enumerado.
		
		OrderStatus os1 = OrderStatus.ENTREGUE;
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE"); // pegando o nome igual em forma de String do tipo enumerado, passando para enum.
		
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
