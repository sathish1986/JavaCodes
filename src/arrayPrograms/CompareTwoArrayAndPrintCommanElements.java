package arrayPrograms;

import java.util.ArrayList;

public class CompareTwoArrayAndPrintCommanElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] ={1,4,6,7,9};
		int b[]={2,4,5,7,9};

		ArrayList<Integer> al = new ArrayList<Integer>();

		for(int i=0; i<a.length;i++){
			if(a[i]==b[i]){
				al.add(a[i]);
			}
		}
		Object[] arr=al.toArray();

		for(Object o:arr){
			System.out.println(o);
		}

	}

}
