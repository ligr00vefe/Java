package p374p375;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare(); 	// Vehicle �������̽����� checkFare()�� ����
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
	}
	
}
