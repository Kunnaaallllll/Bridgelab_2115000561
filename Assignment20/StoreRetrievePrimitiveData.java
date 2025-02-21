import java.io.*;


class StoreRetrievePrimitiveData{
	public static void main(String[]args){
		String path = "Data.dat";
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(path))) {
            dos.writeInt(2115000284);
            dos.writeUTF("Bhagyodaya");
            dos.writeDouble(7.7);

            dos.writeInt(2115000146);
            dos.writeUTF("SomeOne");
            dos.writeDouble(7.6);

            System.out.println("Done");
        } catch (Exception e) {
            System.out.println(e);
        }
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream(path))) {
            while (dis.available() > 0) {
                System.out.println("Roll No: " + dis.readInt() + ", Name: " + dis.readUTF() + ", CGPA: " + dis.readDouble());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
	}
}