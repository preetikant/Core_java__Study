import java.io.*;
class FileE
{
	public static void main(String args[]) throws IOException
	{
		int i;
		FileOutputStream f=new FileOutputStream("./myfile.txt",true);
		String s="Preeti";
		char a[]=s.toCharArray();
		for(i=0;i<s.length();i++)
		f.write(a[i]);
		f.close();
	}
}