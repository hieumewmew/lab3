
public class Cat{
    String Height,Weight,Color;
    int Age;
    puublic Cat(String Height,String Weight,String Color,int Age){
        this.Height=Height;
        this.Weight=Weight;
        this.Color=Color;
        this.Age=Age;
    }
    public String getHeight(){
        return Height;
    }
    public String getWeight(){
        return Weight;
    }
    public String getAge(){
        return Age;
    }
    public String getColor(){
        return Color;
    }
    public void setHeight(String Height){
        this.Height = Height;
    }
    public void setWeight(String Weight){
        this.Weight = Weight;
    }
    public void setAge(String Age){
        this.Age = Age;
    }
    public void setColor(String Color){
        this.Color = Color;
    }    
}
public class Cellphone{
    String Length,Width;
    int Ram,Rom,VersionAndroi;
    public Cellphone( String Length,String Width,int Ram,int Rom,int VersionAndroi;){
        this.Length=Length;
        this.Width=Width;
        this.Ram=Ram;
        this.Rom=Rom;
        this.VersionAndroi=VersionAndroi;
    }
    public String getLength(){
        return Length;
    }
    public void setLength(String Length){
        this.Length = Length;
    }
    public int getRam(){
        return Ram;
    }
    public void setRam(int Ram){
        this.Ram = Ram;
    }
    public int getRom(){
        return Rom;
    }
    public void setRom(int Rom){
        this.Rom = Rom;
    }
    public int getVersionAndroi(){
        return VersionAndroi;
    }
    public void setVersionAndroi(int VersionAndroi){
        this.VersionAndroi = VersionAndroi;
    }
    public String getWidth(){
        return Width;
    }
    public void setWidth(String Width){
        this.Width = Width;
    }
}
class Bike{
    int Price;
    String Brand;
    public Bike(int Price,String Brand){
        this.Price=Price;
        this.Brand=Brand;
    }
    public int getPrice() {
        return Price;
    }
    public String getBrand(){
        return Brand;   
    }
    public void setGia(int Price) {
        this.Price = Price;
    }
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }
}

    
