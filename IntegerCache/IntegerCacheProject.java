//Importing Package For io
import java.io.*;

class IntegerCacheProject{

	//variable declarations
	int min_IntegerValue = -128;//Lower Limit Of IntegerCache
	int max_IntegerValue = 127;//Upper Limit Of IntegerCache
	
	static int IntegerCache[] = new int[256];// Static Integer Array 

	//Method
	void IntegerCacheMethod(int z){
	
		//variable declarations
		boolean check = false;//To Check The Number Is Present In Array Or Not

		//Checking If Number Is In Range 
		if(z < min_IntegerValue || z > max_IntegerValue)
			System.out.println("The Value Is Out Of Range Of Integer Cache, Therefore It Will Create A New Object On Heap With Unique Reference.");
		else{
			
			//Checking For The Presence Of Value In IntegerCache
			for(int x : IntegerCache){

				if(x == z)
					check =  true;
				else 
					continue;			

			}

		}
				
		//Working Of IntegerCache
		if(z >= min_IntegerValue && z <= max_IntegerValue){

			if(check == true){
	
				System.out.println("The Value Has Previously Been Stored In The Integer Cache.");
				System.out.println("Just The Reference To The Object That Is Already In The Integer Cache On HEAP Will Be Pointed To The Variable In The Main Frame Of The" 				+"Java Stack.");

				if(IntegerCache[(z - min_IntegerValue)] != 0){
				
					System.out.println();	
					for(int i = 0 ; i < 256; i++){
			
						System.out.println("IntegerCache["+i+"]"+" = "+IntegerCache[i]);

					}
					System.out.println();
					System.out.println("\nThe Number You Entered : "+z);
					System.out.println("\nThe Index Of The Array :"+(z - min_IntegerValue));
					System.out.println("\nHence, Demonstrating That No New Object Is Created, Just The Variable Points The Reference Of the Object.");
					System.out.println();
		
				}
					
			}
			else{

				System.out.println("There Is No Value In The Integer Cache.");
				System.out.println("As A Result, A New Object Has Been Created On The Integer Cache, And The Variable In The Java stack's Main Frame Will Point To  Its" 				+"Reference.");
	
				for(int i = 0 ; i < IntegerCache.length; i++){

					if(IntegerCache[(z - min_IntegerValue)] == 0)
						IntegerCache[(z - min_IntegerValue)] = z;
			
				}
				System.out.println();
				for(int i = 0 ; i < 256; i++){
			
						System.out.println("IntegerCache["+i+"]"+" = "+IntegerCache[i]);

				}
				System.out.println();
				System.out.println("\nThe Number You Entered : "+z);
				System.out.println("\nThe Index Of The Array :"+(z - min_IntegerValue));
				System.out.println("\nNew Object Is Being Created.");
				System.out.println();

			}
		
		}

	}//end of method

	
		

	public static void main(String[] args) throws IOException{

	
		//Creating Object of Class BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//Creating Object Of Class IntegerCacheProject
		IntegerCacheProject icp = new IntegerCacheProject();

		//variable declarations
		int num = 0;
		String str = "y";//for continuity of the loop		

		//code

		System.out.println();
		System.out.println();
		System.out.println("This program provides a thorough explanation of how the integer cache operates, effectively illuminating how well Java handles memory management.");
		System.out.println();
		System.out.println();
		
		System.out.println("Range of Integer Cache"+"\n"+"Lower Limit : -128"+"\n"+"Upper Limit : 127");
		System.out.println();
	
		for(int start = 0; (str.equals("Y") || str.equals("y")); start++){

			System.out.println("Enter The Number : ");
			num = Integer.parseInt(br.readLine());//Accepting Input From User
			System.out.println();

			icp.IntegerCacheMethod(num);//Method Call
			
			System.out.println("\nIf You Want To Continue Enter Y, Else N");
			str = br.readLine();
			System.out.println();

		}

		System.out.println("Integer Cache Executed Successfully.");	

		

	}//end of entry point function

}//end of class

