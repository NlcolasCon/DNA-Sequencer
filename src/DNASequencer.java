
public class DNASequencer {

	public static void main(String[] args) {
		System.out.print( "java DNASequencer " );
		
			if ( args.length == 0 ) {			//Checks if args array is empty
				System.out.println("");
				System.out.println("Wrong input!");
				System.out.println("Expected input: <strand1> <strand2> ...");
			}
			else {		
				for (int i = 0; i < args.length; i++) {
					System.out.print( args[i] + " " );
				}
				System.out.println("");
				
				int		clone_size = 0;											
				int		n = 0, m = 0, k = 0, j = 0, l = 0, i = 0;				
				boolean is_equals  = true;											
				String  max_cl     = "";											
				int		max        = Integer.MIN_VALUE;								
				String  rest_of_strand_2 = "";									
				String  clone      = "";																			
				String  strand_2   = "";		
				boolean is_Null [] = new boolean [args.length];
				boolean is_Usable  = false;
				
				
				for ( i = 0; i < args.length; i++ ) {
					is_Null[i] = false;
				}
				String  strand = "";	
				for ( i = 0; i < args.length; i++ ) {			//checks if there are usable strands
					for ( j = 0; j < args[i].length(); j++ ) {
						if ( args[i].charAt(j) != 'a' && args[i].charAt(j) != 'g' && args[i].charAt(j) != 'c' && args[i].charAt(j) != 't')
							is_Null[i] = true; 
					}
					if ( is_Null[i] == false )
						is_Usable = true;
				}
				
				if( is_Usable == false ) {					//if no usable strands exist
					System.out.println("Wrong input!");
				}
				else if (is_Usable == true ) {				//if there is at least a usable strand
					i=0;
					boolean is_NotNull = false;
					while (is_NotNull==false && i < args.length ) {			//finding main strand (first usable strand)
						if( is_Null[i] == false) {
							strand = args[i];
							is_NotNull=true;
						}
						i++;
					}
					int index = i;
					
					
					
					if ( index == args.length )			// if main strand is the only strand
						System.out.println(strand);
					
					
					else {
						for ( index = i; index < args.length; index++ ) {	//for loop for each strand (second to last)
							if ( is_Null[index] == false) {
								strand_2 = "";
								strand_2 = args[index];										 
								k 	     = strand.length() - 1;							
								j	     = 0;											
								max      = Integer.MIN_VALUE;							
								max_cl   = "";
								while( k >= 0 ){											
									j          = 0;												 
									clone_size = 0;										
									clone      = "";									
									m          = 0;										
									n          = 0;										
									if( strand.charAt(k) == strand_2.charAt(j) ) {		// if first character of back strand equals with a character of the main strand
																						
										clone += strand_2.charAt(j);					
										clone_size++;							
										
										m		  = k+1;																	
										n 		  = j+1;																	
										is_equals = true;																	
										while ( m < strand.length() && n < strand_2.length() && is_equals == true ) {  // then it checks how many characters in sequence are equal to each other
												if( strand.charAt(m) == strand_2.charAt(n) ) {
													clone += strand_2.charAt(n);											
													clone_size++;															
													n++;																	
													m++;
												}					// if character are not equal then is_equals = false and while loop stops
												else
													is_equals = false;
										}
										
										if( max < clone_size ) {	// used to find max sequence both strands share
											max    = clone_size;
											max_cl = clone;
										}
										
										
									}
									k--;												
																						
								}
								
								
								if( max_cl.length() != strand_2.length() && max_cl.length() >=4 && ( max_cl.length() != strand_2.length() && strand.charAt(strand.length()-1) == max_cl.charAt(max_cl.length()-1)) ) {		// if max's size is bigger or equal than 4 and is not equal to back strand's size (so they are not equal)
									rest_of_strand_2 = "";																																									// and if the second strand doesn't share a clone with the main strand with the clone not in the end of the main strand and the
									for ( l = max_cl.length(); l < strand_2.length(); l++ ) {																																// second strand having a non shared letter after the shared sequence, then the not shared remaining of the back strand is encapsulated in the main strand
										rest_of_strand_2 += strand_2.charAt(l);						
									}																
									strand += rest_of_strand_2;																
								}
		
								max_cl = "";															
								max    = Integer.MIN_VALUE;											
							}
						}
						
						System.out.println("DNA molecule : " + strand);							
					}
				}
			}
	}
}
	



				/*
				 * Author:		Nicolas Constantinou
				 * Written: 		26/09/2023
				 * Last updated:    01/10/2023
				 *
				 * The code gets input from the args array (strands), with the first one potentially
				 * connecting with the second one and so on. The program finds the shared encapsulated
				 * string that the sequenced strands have. Then, depending on what it's size is, the back 
				 * strand connects with the other. Lastly, the DNA molecule that is formed from the strands
				 * is printed on screen through the console. 
				 */