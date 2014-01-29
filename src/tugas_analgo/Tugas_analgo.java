/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_analgo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Hernanda-snoop
 */
public class Tugas_analgo {

    /**
     * @param args the command line arguments
     */
    class data  
{  
       String no;  
       int data_di;  
}  
    
      public static int cek_nomer(String nomer,String[] pattern)
    {
        int i,j=0,d=0,x=0;
        boolean ketemu = false;
        int [] k = new int[10000];
        String[] temp = new String[10000];
        System.out.println( nomer.length());
        while(j<pattern.length&&pattern[j]!=null)
        {
            System.out.println("---------------------------------------------");
            System.out.println("cek data nomer: "+nomer);
            System.out.println("cek nomer yg ada di data: "+pattern[j]);
            System.out.println("----------------------------------------------");
            if(nomer.length()==pattern[j].length())
            {
                for(i=5;i<nomer.length();i++)
                {  
                    System.out.println("nomer ="+nomer.charAt(i));
                    System.out.println("data  = "+pattern[j].charAt(i));
                    System.out.println("---------------------------------------");
                   if(nomer.charAt(i)==pattern[j].charAt(i))
                    {
                      if(i==nomer.length()-1)
                      {
                          System.out.println("kalo udah masuk sini berarti benar");
                        x++;
                      }
                    }else
                    {
                        System.out.println("kalo masuk sini salah");
                        System.out.println("------------------------------------");
                        break;
                    }   
                }
            }
        j++;
       }       
      return x; 
    }
    
  public static int cek_nomer(String nomer)
    {

           
         if(nomer.charAt(0)!='0'&&nomer.charAt(1)!='8'){
    
                    return 0;
                   }else if(nomer.charAt(2)=='1'&&nomer.charAt(3)=='1')
                    {   

                        return 1;
                    }else if(nomer.charAt(2)=='1'&&nomer.charAt(3)=='2')
                   {

                        return 1;
                   }else if(nomer.charAt(2)=='1'&&nomer.charAt(3)=='3')
                   {
                      
                        return 1;
                   }
                   else if(nomer.charAt(2)=='2')
                   {

                       return 1;
                   }else if(nomer.charAt(2)=='5'&&nomer.charAt(3)=='2')
                   {
                    
                      return 1;
                   }else if(nomer.charAt(2)=='5'&&nomer.charAt(3)=='3')
                   {
                        return 1;//simpati
                   }else if(nomer.charAt(2)=='5'&&nomer.charAt(3)=='6')
                   {
            
                       return 2;
                   }else if(nomer.charAt(2)=='5'&&nomer.charAt(3)=='7')
                   {
                 
                       return 2;
                   }else if(nomer.charAt(2)=='5'&&nomer.charAt(3)=='8')
                   {
        
                        return 2;
                   }else if(nomer.charAt(2)=='5'&&nomer.charAt(3)=='5')
                   {
                    
                       return 2;
                   }else if(nomer.charAt(2)=='1'&&nomer.charAt(3)=='4')
                   {
              
                        return 2;
                   }else if(nomer.charAt(2)=='1'&&nomer.charAt(3)=='5')
                   {
                        return 2;
                   }else if(nomer.charAt(2)=='1'&&nomer.charAt(3)=='6')
                   {
                    
                        return 2;//indosa
                   }else if(nomer.charAt(2)=='1'&&nomer.charAt(3)=='7')
                   {
                        return 3;//xl
                   }
                   else if(nomer.charAt(2)=='1'&&nomer.charAt(3)=='8')
                   { 
                     
                      return 3;
                   }else if(nomer.charAt(2)=='1'&&nomer.charAt(3)=='9')
                   { 
                     
                       return 3;
                   }else if(nomer.charAt(2)=='5'&&nomer.charAt(3)=='9')
                   { 
                 
                       return 3;
                   }else if(nomer.charAt(2)=='7'&&nomer.charAt(3)=='7')
                   { 
                     
                      return 3;
                   }else if(nomer.charAt(2)=='7'&&nomer.charAt(3)=='8')
                   { 

                     
                      return 3;
                   }else if(nomer.charAt(2)=='9'&&nomer.charAt(3)=='6')
                   { 
                       
                       return 4;
                   }else if(nomer.charAt(2)=='9'&&nomer.charAt(3)=='7')
                   { 
                       
                      return 4;
                   }else if(nomer.charAt(2)=='9'&&nomer.charAt(3)=='8')
                   { 
                       
                      return 4;
                   }else if(nomer.charAt(2)=='9'&&nomer.charAt(3)=='9')
                   { 
                     
                       return 4;//tri
                   }else if(nomer.charAt(2)=='3'&&nomer.charAt(3)=='1')
                   { 
                      
                      return 5;//axis
                   }else if(nomer.charAt(2)=='3'&&nomer.charAt(3)=='8')
                   { 
                  
                        return 5;
                   }else if(nomer.charAt(2)=='8'&&nomer.charAt(3)=='1')
                   { 
                    
                       return 6;//smart
                   }
                   else if(nomer.charAt(2)=='8'&&nomer.charAt(3)=='2')
                   { 
                    
                       return 6;
                   }
                   else if(nomer.charAt(2)=='8'&&nomer.charAt(3)=='3')
                   { 
                  
                       return 6;
                   }
                   else if(nomer.charAt(2)=='8'&&nomer.charAt(3)=='4')
                   { 
                    
                     return 6;
                   }
                   else if(nomer.charAt(2)=='8'&&nomer.charAt(3)=='5')
                   { 
                     
                     return 6;
                   }
                   else if(nomer.charAt(2)=='8'&&nomer.charAt(3)=='6')
                   { 
                     
                       return 6;
                   }
                   else if(nomer.charAt(2)=='8'&&nomer.charAt(3)=='7')
                   { 
             
                      return 6;
                   }
                   else if(nomer.charAt(2)=='8'&&nomer.charAt(3)=='8')
                   { 
                 
                       return 6;
                   }  else if(nomer.charAt(2)=='8'&&nomer.charAt(3)=='9')
                   { 
                     
                      return 6;
                   }else
                   {
                       
                      return 0;
                   }
    
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
            File file = new File("src/tugas_analgo/analgo.txt");
           BufferedReader reader = new BufferedReader(new FileReader(file.getAbsolutePath()));
           String line;
           String [] lines;
           int simpati = 0;
           int indosat = 0;
           int xl = 0;
           int tri = 0;
           int axis = 0;
           int smart = 0;
           int bukanoperator = 0;
           int total ;  
           int i = 0;
           int tz = 0;
           int tidakterdefinisi = 0;
           data[] big_data = new data[5];  
           String[] datasimpati = new String[10000];
           String[] dataindosat = new String[10000];
           String[] dataxl = new String[10000];
           String[] datatri = new String[10000];
           String[] dataaxis = new String[10000];
           String[] datasmart = new String[10000];
           String[] databukan = new String[100000];
           while ((line = reader.readLine()) != null) {
                 lines = line.split(" ");
                 if(lines.length>2)
                 {
                    // System.out.println(lines[2].charAt(2));
                   if(lines[2].charAt(0)!='0'&&lines[2].charAt(1)!='8'){
                     databukan[bukanoperator] = lines[2];  
                     bukanoperator++;
                     tz++;
                   }else if(lines[2].charAt(2)=='1'&&lines[2].charAt(3)=='1')
                    {   
                      datasimpati[simpati]=lines[2];  
                      simpati++;
                    }else if(lines[2].charAt(2)=='1'&&lines[2].charAt(3)=='2')
                   {
                       datasimpati[simpati]=lines[2]; 
                       simpati++;
                   }else if(lines[2].charAt(2)=='1'&&lines[2].charAt(3)=='3')
                   {
                       datasimpati[simpati]=lines[2]; 
                       simpati++;
                   }
                   else if(lines[2].charAt(2)=='2')
                   {
                       datasimpati[simpati]=lines[2]; 
                       simpati++;
                   }else if(lines[2].charAt(2)=='5'&&lines[2].charAt(3)=='2')
                   {
                       datasimpati[simpati]=lines[2]; 
                       simpati++;
                   }else if(lines[2].charAt(2)=='5'&&lines[2].charAt(3)=='3')
                   {datasimpati[simpati]=lines[2]; 
                       simpati++;
                   }else if(lines[2].charAt(2)=='5'&&lines[2].charAt(3)=='6')
                   {
                       dataindosat[indosat]=lines[2]; 
                       indosat++;
                   }else if(lines[2].charAt(2)=='5'&&lines[2].charAt(3)=='7')
                   {
                       dataindosat[indosat]=lines[2];
                      indosat++;tz++;
                   }else if(lines[2].charAt(2)=='5'&&lines[2].charAt(3)=='8')
                   {
                       dataindosat[indosat]=lines[2];
                       indosat++;
                   }else if(lines[2].charAt(2)=='5'&&lines[2].charAt(3)=='5')
                   {
                       dataindosat[indosat]=lines[2];
                       indosat++;
                   }else if(lines[2].charAt(2)=='1'&&lines[2].charAt(3)=='4')
                   {
                       dataindosat[indosat]=lines[2];
                       indosat++;
                   }else if(lines[2].charAt(2)=='1'&&lines[2].charAt(3)=='5')
                   {
                       dataindosat[indosat]=lines[2];
                       indosat++;
                   }else if(lines[2].charAt(2)=='1'&&lines[2].charAt(3)=='6')
                   {
                       dataindosat[indosat]=lines[2];
                       indosat++;
                   }else if(lines[2].charAt(2)=='1'&&lines[2].charAt(3)=='7')
                   { 
                       dataxl[xl]=lines[2];
                       xl++;
                   }
                   else if(lines[2].charAt(2)=='1'&&lines[2].charAt(3)=='8')
                   { 
                       dataxl[xl]=lines[2];
                       xl++;;
                   }else if(lines[2].charAt(2)=='1'&&lines[2].charAt(3)=='9')
                   { 
                       dataxl[xl]=lines[2];
                       xl++;
                   }else if(lines[2].charAt(2)=='5'&&lines[2].charAt(3)=='9')
                   { 
                       dataxl[xl]=lines[2];
                       xl++;
                   }else if(lines[2].charAt(2)=='7'&&lines[2].charAt(3)=='7')
                   { 
                       dataxl[xl]=lines[2];
                       xl++;
                   }else if(lines[2].charAt(2)=='7'&&lines[2].charAt(3)=='8')
                   { 

                       dataxl[xl]=lines[2];
                       xl++;
                   }else if(lines[2].charAt(2)=='9'&&lines[2].charAt(3)=='6')
                   { 
                       datatri[tri]=lines[2];
                       tri++;
                   }else if(lines[2].charAt(2)=='9'&&lines[2].charAt(3)=='7')
                   { 
                       datatri[tri]=lines[2];
                       tri++;
                   }else if(lines[2].charAt(2)=='9'&&lines[2].charAt(3)=='8')
                   { 
                       datatri[tri]=lines[2];
                       tri++;
                   }else if(lines[2].charAt(2)=='9'&&lines[2].charAt(3)=='9')
                   { 
                       datatri[tri]=lines[2];
                       tri++;
                   }else if(lines[2].charAt(2)=='3'&&lines[2].charAt(3)=='1')
                   { 
                       dataaxis[axis]=lines[2];
                       axis++;
                   }else if(lines[2].charAt(2)=='3'&&lines[2].charAt(3)=='8')
                   { 
                       dataaxis[axis]=lines[2];
                       axis++;
                   }else if(lines[2].charAt(2)=='8'&&lines[2].charAt(3)=='1')
                   { 
                       datasmart[smart]=lines[2];
                       smart++;
                   }
                   else if(lines[2].charAt(2)=='8'&&lines[2].charAt(3)=='2')
                   { 
                       datasmart[smart]=lines[2];
                       smart++;
                   }
                   else if(lines[2].charAt(2)=='8'&&lines[2].charAt(3)=='3')
                   { 
                       datasmart[smart]=lines[2];
                       smart++;
                   }
                   else if(lines[2].charAt(2)=='8'&&lines[2].charAt(3)=='4')
                   { 
                       datasmart[smart]=lines[2];
                       smart++;
                   }
                   else if(lines[2].charAt(2)=='8'&&lines[2].charAt(3)=='5')
                   { 
                       datasmart[smart]=lines[2];
                       smart++;
                   }
                   else if(lines[2].charAt(2)=='8'&&lines[2].charAt(3)=='6')
                   { 
                       datasmart[smart]=lines[2];
                       smart++;
                   }
                   else if(lines[2].charAt(2)=='8'&&lines[2].charAt(3)=='7')
                   { 
                       datasmart[smart]=lines[2];
                       smart++;
                   }
                   else if(lines[2].charAt(2)=='8'&&lines[2].charAt(3)=='8')
                   { 
                       datasmart[smart]=lines[2];
                       smart++;
                   }  else if(lines[2].charAt(2)=='8'&&lines[2].charAt(3)=='9')
                   { 
                       datasmart[smart]=lines[2];
                       smart++;
                   }else
                   {
                       databukan[bukanoperator]=lines[2];
                       bukanoperator++;
                   }
                 }else
                 {
                    bukanoperator++;tz++;
                 }
                 i++;
             }
           //input
           
        
            DataInputStream dtm=new      DataInputStream(System.in);
            System.out.print("Masukan Nomer : ");
            String nomer=dtm.readLine();
            int cek_no ;
            cek_no = cek_nomer(nomer);
            System.out.println("yg ini "+cek_no);
            if(cek_no ==0)
            {
                System.out.println("bukan Operator");
            }else
            {
                if(cek_no == 1)
                {
                  cek_no=  cek_nomer(nomer,datasimpati);
                }else if(cek_no == 2)
                {
                     cek_no= cek_nomer(nomer,dataindosat);
                }else if(cek_no == 3)
                {
                     cek_no= cek_nomer(nomer,dataxl);
                }else if(cek_no == 4)
                {
                     cek_no= cek_nomer(nomer,datatri);
                }else if(cek_no == 5)
                {
                     cek_no= cek_nomer(nomer,dataaxis);
                }else if(cek_no == 6)
                {
                     cek_no= cek_nomer(nomer,datasmart);
                }
            }
        
        System.out.println("Bukan operator HP : "+bukanoperator);
        System.out.println("Pengguna Simpati : "+simpati);
        System.out.println("Pengguna Indosat : "+indosat);
        System.out.println("Pengguna Three : "+tri);
        System.out.println("Pengguna Axis : "+axis);
        System.out.println("Pengguna Smart : "+smart);
        System.out.println("Pengguna XL : "+xl);
        total = bukanoperator+simpati+tri+axis+smart+indosat+xl;
        System.out.println("total: "+total);
        System.out.println("banyak data: "+i);
        System.out.println("---------------------------------------------");
        System.out.println("banyak data Bertransaksi : "+cek_no);


    }
}
