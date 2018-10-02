
public class Cat{
    String Height,Weight,Color;
    Int Age;
    puublic Cat(String Height,String Weight,String Color,Int Age){
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
    Int Ram,Rom,VersionAndroi;
    public Cellphone( String Length,String Width,Int Ram,Int Rom,Int VersionAndroi;){
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
    public Int getRam(){
        return Ram;
    }
    public void setRam(Int Ram){
        this.Ram = Ram;
    }
    public Int getRom(){
        return Rom;
    }
    public void setRom(Int Rom){
        this.Rom = Rom;
    }
    public Int getVersionAndroi(){
        return VersionAndroi;
    }
    public void setVersionAndroi(Int VersionAndroi){
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
    Int Price;
    String Brand;
    public Bike(Int Price,String Brand){
        this.Price=Price;
        this.Brand=Brand;
    }
    public Int getPrice() {
        return Price;
    }
    public String getBrand(){
        return Brand;   
    }
    public void setGia(Int Price) {
        this.Price = Price;
    }
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }
}

    