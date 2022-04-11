import java.util.ArrayList;
public class Packet {
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public Item getItem(int index) {
		return this.items.get(index);
	}
	
	public String raw() {
		StringBuffer result = new StringBuffer();
		for(Item item : items) {
			result.append(item.raw());
		}
		return result.toString();
	}
	
	public void parse(String data) {
		byte[] bdata = data.getBytes();
		int pos = 0;
		for (Item item : items) {
			byte[] temp = new byte[item.getLength()];
			System.arraycopy(bdata, pos, temp, 0, item.getLength());
			pos += item.getLength();
			item.setValue(new String(temp));
		}
	}
	
	public static void main(String[] args) {
		Packet packet = new Packet();
		
		Item item1 = Item.create("�̸�", 20, "ȫ�浿");
		Item item2 = Item.create("��ȭ��ȣ", 11, "01099998888");
						
		packet.addItem(item1);
		packet.addItem(item2);
		
		System.out.println("[" + packet.raw() + "]");
		
		Packet recvPacket = new Packet();
		recvPacket.addItem(Item.create("����", 8, null));
		recvPacket.addItem(Item.create("�ּ�", 50, null));
		recvPacket.parse("19801215����� ���ı� ��ǵ� 123-3               ");
		
		System.out.println(recvPacket.getItem(1).raw());
	}	
}
