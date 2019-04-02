package ueb01;

class Palindrom{
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!

		if (s.length() == 1){
			return true;
		}

		CharStack stack = new CharStackImpl();
		char [] cs = s.toLowerCase().replaceAll("","").toCharArray();

		int i =0;
		for (;i < cs.length / 2; i++){
			stack.push(cs[i]);
		}

		if (cs.length % 2 ==1){
			i++;
		}


		return false;
	}
}
