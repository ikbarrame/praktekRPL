  public class Sesuatu {
  public static void main(String[] args){

	int[] a={22,33,44,55,66,77,88,99};
	System.out.println("ke-1:"+fungsi_sesuatu(a,44));
	System.out.println("ke-2:"+fungsi_sesuatu(a,50));
	System.out.println("ke-3:"+fungsi_sesuatu(a,77));
	System.out.println("ke-4:"+fungsi_sesuatu(a,100));
	}
	public static int fungsi_sesuatu(int[]a, int x)
	{
		for (int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{return i;
			}
		
		}
		return-1;
		}

    }
	