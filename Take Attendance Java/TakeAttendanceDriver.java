import java.util.Vector;


public class TakeAttendanceDriver {

	public static void main(String[] args) {
		Vector<String> testVector = BluetoothDeviceVector.getMacVector();
		for(int x=0; x<testVector.size();x++){
			String[] attendance = {"","ITEC 110 - Java 1","2016-02-29"};
			attendance[0]=getUserFromMac.getUser(testVector.elementAt(x));
			SetAttendance.setAttendance(attendance);
//			System.out.println(getUserFromMac.getUser(testVector.elementAt(x)));
			
			
		}
//		System.out.println(getUserFromMac.getUser(mac));
//		System.out.println(getUserFromMac.getUser(mac));
		
	
		
	}

}
