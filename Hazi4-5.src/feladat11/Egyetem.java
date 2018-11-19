/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat11;

import java.util.List;

/**
 *
 * @author Pig
 */
public class Egyetem {
    public List<Hallgató>diák;
    public List<Oktató>tanár;
    public Egyetem(List<Hallgató> diák, List<Oktató> tanár) {
        this.diák = diák;
        this.tanár = tanár;
    }
    public List<Hallgató> getDiák() {
        return diák;
    }
    public void setDiák(List<Hallgató> diák) {
        this.diák = diák;
    }
    public List<Oktató> getTanár() {
        return tanár;
    }
    public void setTanár(List<Oktató> tanár) {
        this.tanár = tanár;
    }
    public void legfiatalabb(List<Hallgató> h)
    {Hallgató tmp;
        if(h.size()>3)
        {
            for(int i=0;i<h.size();++i)
            {
                for(int j=0;j<h.size();++j)
                    if(h.get(i).életkor>h.get(j).életkor)
                    {
                        tmp=h.get(i);
                        h.set(i, h.get(j));
                        h.set(j, tmp);
                    }
            }
            for(int i=0;i<3;++i)
                System.out.println(h.toString());
        }
        else System.out.println(h.toString());
    }
    public void IT(List<Oktató>okt)
    {
        for(int i=0;i<okt.size();++i)
        {
            if(okt.get(i).Tanszék.equals("IT"))
                okt.get(i).Tanszék.concat("!");
        }
    }
}