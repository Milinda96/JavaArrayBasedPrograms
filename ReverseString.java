class ReverseString {
	public static void main(String args[]) {
		String string = "Milinda";
		String reversedStr = "";

		for (int i = string.length() - 1; i >= 0; --i) {
			reversedStr = reversedStr + string.charAt(i);
		}
		System.out.println("Original: " + string);
		System.out.println("Reversed: " + reversedStr);
	}
}