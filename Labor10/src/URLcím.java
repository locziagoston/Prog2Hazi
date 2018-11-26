
/**
 *
 * @author hallgato
 */
public class URLcím {
    private String protokoll;
    private String tartomány;
    private String elérési_út;

    public URLcím(String url_cím) throws URLcímException {
        
        if(url_cím.length()<5)
            throw new URLcímException(1, "At url cím hossza kisebb mint 5");
        if (url_cím.indexOf("://") != url_cím.lastIndexOf("://"))
            throw new URLcímException(2, "több ://");
        if (!url_cím.contains("://"))
            throw new URLcímException(2, "nincs ://");
        
        String [] tmp1 = url_cím.split("://");
        
        if(tmp1[0].equals("http") || tmp1[0].equals("ftp") || tmp1[0].equals("file"))
            throw new URLcímException(3, "hibás protokoll");
        
        this.protokoll=tmp1[0];
        
        //eza negyedik este
        if(!tmp1[1].contains("/") )
        {
            this.elérési_út="";
            String [] tmp2 = tmp1[1].split("\\.",-1); //így hivatkozunk a sima pont karakterre, -1 ha a pont után nincs semmi
            if(tmp2.length==1){
                throw new URLcímException(4, "nincs pont");
            }
            
            for(String s:tmp2)
                if(s.equals(""))
                    throw new URLcímException(4, "két pont kozott ures karakter");
            if(tmp2[tmp2.length-1].length()<2)
                throw new URLcímException(4, "utolso pont utani resz hossza <2");
            this.tartomány=tmp1[1];
        }else //különben az 5. eset
        {
            
            
            
        }
    }

    public String getProtokoll() {
        return protokoll;
    }

    public String getTartomány() {
        return tartomány;
    }

    public String getElérési_út() {
        return elérési_út;
    }

    @Override
    public String toString() {
        return "URLc\u00edm{" + "protokoll=" + protokoll + ", tartom\u00e1ny=" + tartomány + ", el\u00e9r\u00e9si_\u00fat=" + elérési_út + '}';
    }
        
    
    
}
    
    
    

