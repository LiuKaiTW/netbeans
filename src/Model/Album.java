
package Model;


public class Album {
    String CDName;  //CD專輯名稱
    String CDNum;	//CD專輯編號
    String Singer;	//CD專輯歌手
    public int CDPrice;	//CD專輯價格
    public int CDCount=1;	//CD專輯數量
    public int Sum=CDPrice*CDCount;
    public static int ALLcount=0;
    public static int ALLtotal;


    public Album(String CDName,String CDNum,String Singer,int CDPrice)
    {
    this.CDName=CDName;this.CDNum=CDNum;
    this.Singer=Singer;this.CDPrice=CDPrice;
    }
	
    
    public String Buy()
    {return ("專輯:" + CDName
                + "\n數量:" + (CDCount-1)
                + "\n小計:" + Sum+"\n");
    }
    
    public String[] getData()
   {
     String CDCOUNT,CDPRICE,SUM;
     CDCOUNT=Integer.toString(CDCount); 
     CDPRICE=Integer.toString(CDPrice);
     SUM=Integer.toString(Sum);
   String[] data = new String[]{CDName,CDCOUNT,CDPRICE,SUM};
   return data;
   }
    
    public void countadd()
    {CDCount++; }
    
    public void BuyCD()
    {Sum=CDPrice*CDCount;
    CDCount++;
    ALLtotal+=Sum; 
    ALLcount++;
    }
   
}
