
package Autó;


public class Test {
    
    public static void rendezMaxSzállíthatóTeher(Teherautó[] a){
    for(int i=0;i<a.length;i++)
    {
        for (int j=i+1;j<a.length; j++){
            if (a[i].getMaxSzállíthatóTeher()<=a[j].getMaxSzállíthatóTeher()){
                Teherautó tmp=a[i];a[i]=a[j];a[j]=tmp;
            }
        }
    }
    }
    
    public static int keresMax(Autó[] auto){
        int index=0;
        for(int i=0;i<auto.length;i++){
            if(auto[i].getMotorTeljesítmény()>auto[index].getMotorTeljesítmény()){
            index=i;
            }
        }
        return auto[index].getMotorTeljesítmény();
    }
            
    public static void main(String[] args) {
        Teherautó [] t1 = new Teherautó[]{
           new Teherautó(11000,"ASD001",600),
           new Teherautó(12200,"ASD002",700),
           new Teherautó(10100,"ASD003",800),
           new Teherautó(9000,"ASD004",650),
           new Teherautó(13300,"ASD005",720),
           new Teherautó(11500,"ASD006",610),
           new Teherautó(12700,"ASD007",740),
           new Teherautó(10100,"ASD008",850),
           new Teherautó(9800,"ASD009",620),
           new Teherautó(10110,"ASD010",780)
        };
        rendezMaxSzállíthatóTeher(t1);
        
        Autó[] a1 = new Autó[]{
           new Autó("ASA001",200),
           new Autó("ASA002",120),
           new Autó("ASA003",220),
           new Autó("ASDA04",130),
           new Autó("ASA005",90),
           new Teherautó(11500,"ASD006",610),
           new Teherautó(12700,"ASD007",740),
           new Teherautó(10100,"ASD008",850),
           new Teherautó(9800,"ASD009",620),
           new Teherautó(10110,"ASD010",780)
        };
        keresMax(a1);
    }
    }

