public class Variable {
	
	public static void main(String[] args) {
		long proName = 2100;//
		byte numberOfCores = 2;
		double proSpeed = 3.1d;
		char size = 'B';
		char giga = 'G';
		char mega = 'M';
		char herz1 = 'H';
		char herz2 = 'z';
		int numberOfThreads = 4;
		short smartCache = 3;
		float ram = 31.9f;
		boolean data = true;

		System.out.println("CPU Intel Core i3 - " + proName + ", number of cores " + numberOfCores);
		System.out.println("Processor speed " + proSpeed + giga + herz1 + herz2 + ", number of threads " + numberOfThreads);
		System.out.println("Smart Cache " + smartCache + mega + size + ", RAM " + ram + mega + size);
		System.out.println(data);
	
	}
}