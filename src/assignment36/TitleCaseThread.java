package assignment36;

public class TitleCaseThread
{ 
	String summary;
	public TitleCaseThread() 
	{
		super();
		} 
	public TitleCaseThread(String summary) 
	{ 
		this.summary = summary; 
		} 
	public String getModifiedSummary()
	{ 
		char[] c = summary.toCharArray(); 
		for(int i=0;i<c.length;i++) 
		{ 
			if(i==0)
			{ 
				c[i]=(Character.toUpperCase(c[i])); i++; 
				} 
			if(c[i]==' ')
			{
				c[i] = ' '; i++; c[i]=(Character.toUpperCase(c[i])); 
				} 
			else c[i]=(Character.toLowerCase(c[i]));
			} 
		summary = String.valueOf(c); 
		return summary;
		}
	}

