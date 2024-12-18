package hust.soict.dsai.test.cart;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);

		List<String> authors1 = new ArrayList<>();
		authors1.add("Than Quang Khoat");
		authors1.add("Dinh Viet Sang");
		Book book1 = new Book(4, "Intro to A.I", "Math & Science", 25.5f, authors1);

		List<String> authors2 = new ArrayList<>();
		authors2.add("Trinh Tuan Dat");
		authors2.add("Nguyen Thi Thu Trang");
		Book book2 = new Book(5, "OOP Techniques", "Computer Science", 29.5f, authors2);

		cart.addMedia(book1);
		cart.addMedia(book2);

		cart.removeMedia(book2);
		cart.displayCart();
	}
}
