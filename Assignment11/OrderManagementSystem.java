class OnlineRetailsOrderManagement{
	public static void main(String[]args){
		Order order = new Order(101,"02-02-2025");
		System.out.println("Order Status of Order Id: "+order.getOrderId()+" Order Status: "+order.getOrderStatus());
		ShippedOrder shippedOrder = new ShippedOrder(102,"03-02-2025",102541);
		System.out.println("Order Status of Order Id: "+shippedOrder.getOrderId()+" Order Status: "+shippedOrder.getOrderStatus());
		DeliveredOrder deliveredOrder = new DeliveredOrder(103,"04-02-2025",102547,"10-02-2025");
		System.out.println("Order Status of Order Id: "+deliveredOrder.getOrderId()+" Order Status: "+deliveredOrder.getOrderStatus());
	}
}
class Order{
	private int orderId;
	private String orderDate;
	Order(int orderId, String orderDate){
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	public String getOrderStatus(){
		return "Order Placed";
	}
	public int getOrderId(){
		return orderId;
	}
}
class ShippedOrder extends Order{
	private int trackingNumber;
	ShippedOrder(int orderId, String orderDate, int trackingNumber){
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}
	public String getOrderStatus(){
		return "Order Shipped";
	}
}
class DeliveredOrder extends ShippedOrder{
	private String deliveryDate;
	DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate){
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	public String getOrderStatus(){
		return "Order Delivered";
	}
}