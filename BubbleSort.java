class BubbleSort
	{
	public static void main (String [] args)
		{
			int [] array = new int [10];
			
			init(array);
			print(array);
			sort(array);
			
		}
		
		//array initialisation
		static int[] init(int[] array)  
		{ 
			for (int i=0;i<array.length; i++)	
			{
				array[i] = (int)(Math.random()*100);
			}	
			return array; 
		}
			
			
		//sorting array
		static int[] sort(int[] array)
			{ 
			boolean sorted = false;
			int i,iteration=0;
			
			//while array not sorted
			while(!sorted)
			{
				int c=0;
				for (i=0;i<array.length-1; i++)
				{
					if (array[i] > array[i+1])
					{	
						int temp = array[i+1];
						array[i+1] = array[i];
						array[i] = temp;
						c++;
						print(array);
						iteration++;
					}
				}
				
				
			//if you are at the end of array and never swaped any element pairs --> sorted
				if ((i == (array.length-1)) && (c==0))
				{
					sorted = true;
					System.out.println("sorted on iteration: "+iteration);
				}
			
			}
				return array;
	}
	
	
	
	
	
	

	
		 static void print(int[] array)
	{
			for (int i=0;i<array.length; i++)
				{
					System.out.print(array[i]+" ");
				}
			System.out.println();
	}
		
		
		
	
	}