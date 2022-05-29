
public class Tiles 
{
	public static void main(String[] args)
	{
		int TotalWidth = 100;
		int TileWidth = 5;
		int Space = 10;
		int NUMBER_OF_TILES = TotalWidth / TileWidth;
		
		int Pairs = (NUMBER_OF_TILES - Space / 5) / 2;
		System.out.println("Number of White/black pairs are: " + Pairs);
		
		double Gap = (Space - 5) / 2.0;
		System.out.println("Gap size on both sides equals: " + Gap);
	}
}	
