import java.io.*;
class Test
{
	public static void main(String args[]) throws IOException
	{
		FileWriter fw=new FileWriter("./T.text",true);
		BufferedWriter bf=new BufferedWriter(fw);
		bf.write("This is preeti Kant");
		bf.close();
		//fw.delete();
	}
}