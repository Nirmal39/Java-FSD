
public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr;
		arr=new int[2][2];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[1][0]=3;
		arr[1][1]=4;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}

	}

}
