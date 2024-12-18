package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

class ObjectWrapper {
	DigitalVideoDisc o;
	public ObjectWrapper(DigitalVideoDisc o) {
		this.o = o;
	}
}

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

		ObjectWrapper objWrapper1 = new ObjectWrapper(jungleDVD);
		ObjectWrapper objWrapper2 = new ObjectWrapper(cinderellaDVD);

		swap(objWrapper1, objWrapper2);
		System.out.println("Jungle DVD title: " + objWrapper1.o.getTitle());
		System.out.println("Cinderella DVD title: " + objWrapper2.o.getTitle());

		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
	}

	public static void swap(ObjectWrapper o1, ObjectWrapper o2) {
		DigitalVideoDisc tmp = o1.o;
		o1.o = o2.o;
		o2.o = tmp;
	}


	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}
