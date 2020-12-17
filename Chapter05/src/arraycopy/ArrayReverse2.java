package arraycopy;

public class ArrayReverse2 {

	public static void main(String[] args) {
		// 역순(거꾸로) 저장(복사)
		String[] animal1 = {"cat", "dog", "pig"};
		String[] animal2 = new String[3];
		int i,j;		
		for(i=0; i<animal1.length; i++) {
			animal2[i] = animal1[i];
		}
		for(i=0; i<animal2.length; i++) {
			System.out.print(animal2[i] + " ");
		}
		System.out.println();
		for(i=0; i<animal1.length; i++) {
			animal2[2-i] = animal1[i];
		}
		for(i=0; i<animal2.length; i++) {
			System.out.print(animal2[i] + " ");
		}

			/*
		for(i=1; i<leng; i++) {
			temp = arr1;
			j=0;
			
			System.out.print(arr1[i] + " ");
			
			for
		}
		*/
		

	}

}
