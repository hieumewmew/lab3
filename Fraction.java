import java.util.Scanner;

public class Fraction{
    private int nume;
    private int deno;
    public Fraction(int nume,int deno){
        this.nume = nume;
        this.deno = deno;
        if(deno==0)
            System.out.print("Ohh . mau so phai khac khong . ");
    }
    public void print(){
        System.out.println("Phan so ban da nhap la : "+nume+"/"+deno);
    }
    public compact extends Fraction(){
        int nume;
        int deno;
        public conpact(int nume, int deno){
            this.nume=nume; this.deno=deno;
        }
        int GCD(int a,int b){
            while(a!=b)
            {
                if (a>b)
                    a=a-b;
                else b=b-a;
            }
            return a;
        }
        void compact(){
            int gcd=GCD(nume,deno);
            nume=nume/gcd;
            deno=deno/gcd;
        }
    }
    public static Fraction Add(Fraction F1,Fraction F2){
        int yy=F1.deno*F2.deno;
        int xx=F1.nume*F2.deno+F2.nume*F1.deno;
        compact t= new compact(int xx,int yy);
        xx=t.xx;
        yy=t.yy;
        Function F=new Function(xx,yy);
        return F;
    }
    public static ps Subtraction(Function F1,Function F2){
        int yy=F1.deno*F2.deno;
        int xx=F1.nume*F2.deno-F2.nume*F1.deno;
        compact t= new compact(int xx,int yy);
        xx=t.xx;
        yy=t.yy;
        Function F=new Function(xx,yy);
        return F;
    }
    public static ps Mutil(Function F1,Function F2){
        int yy=F1.deno*F2.deno;
        int xx=F1.nume*F2.nume;
        compact t= new compact(int xx,int yy);
        xx=t.xx;
        yy=t.yy;
        Function F=new Function(xx,yy);
        return F;
    }
    public static ps Division(Function F1,Function F2){
        int yy=F1.deno*F2.nume;
        int xx=F1.nume*F2.deno;
       	compact t= new compact(int xx,int yy);
        xx=t.xx;
        yy=t.yy;
        Function F=new Function(xx,yy);
        return F;
    }

    public static boolean equals(Function F1,Function F2){
        int xx=F1.nume*F2.deno-F1.deno*F2.nume;
        return (xx==0);
    }
}