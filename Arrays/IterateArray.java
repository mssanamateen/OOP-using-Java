class IterateArray{
		public static void main(String[] ar){
			int[] arr={1,2,4,5,6,7};
			ComArray co=new ComArray();
			for(int l:co.arr3){
				System.out.println(l);
			}
			
			ComArray.main(null);
			System.out.println("elements are");
			//array.length property tells the total elements in array
			for(int i=0;i<arr.length;i++){

				System.out.println(arr[i]);
			}
		}
}