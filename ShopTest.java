abstract class Shop
{
	public void print()
	{
		System.out.println("Items in Shop are as follows.");
	}
}
class Item extends Shop
{
	public void print()
	{
		System.out.println("Vegetables and Fruits present");
	}
}
public class ShopTest 
{
	public static void main(String[] args) 
	{
		Shop s = new Item();
		Item i = new Item();
		s.print();
		i.print();
	}
}