package org.phone;

public class InternalStorage {
	private void processorName() {
		System.out.println("Processor Name is : intel");
	}
private void ramSize() {
	System.out.println("RamSize is : 256 GB");
}
public static void main(String[] args) {
	InternalStorage internal = new InternalStorage();
	internal.processorName();
	internal.ramSize();
	ExternalStorage external = new ExternalStorage();
	external.size();
	
}
}
