package javaTSP;

public class City {
    double x;
    double y;
    
    // Constructs a randomly placed city
   /* public City(){
        this.x = (double)(Math.random()*200);
        this.y = (double)(Math.random()*200);
    }
    */
    
    // Constructs a city at chosen x, y location
    public City(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    // Gets city's x coordinate
    public double getX(){
        return this.x;
    }
    
    // Gets city's y coordinate
    public double getY(){
        return this.y;
    }
    
    // Gets the distance to given city
    public double distanceTo(City city){
        double xDistance = Math.abs(getX() - city.getX());
        double yDistance = Math.abs(getY() - city.getY());
        double distance = Math.sqrt( (xDistance*xDistance) + (yDistance*yDistance) );
        
        return distance;
    }
    
    @Override
    public String toString(){
        return getX()+", "+getY();
    }
}



//
/*
宣告一個城市的物件,給x,y的座標
例如外部的程式如果要宣告一個城市的物件
用: City Taiwan = new City(100,200);
算離這個城市的距離

他提供幾個方法
getX(), getY()用來得到這個城市的x跟y座標
所以剛剛宣告Taiwan的x座標就是100,y座標就是200
有另外一個construnctor (建構子) 是可以用來隨機給x,y座標
但是那個城市被comment out起來
   // Constructs a randomly placed city
   //public City(){
    //    this.x = (double)(Math.random()*200);
    //  this.y = (double)(Math.random()*200);
    //
    
可以給任何座標
double x, double y代表可以給小數點都可以

程式本來是隨機產生座標
宣告一個城市,一定要給x,y座標
例如你在主程式要這樣寫
City Taipei = new City(200, 500)
City Taichung = new City(-100, 300);
要算台中到台北的距離就要
double dist = Taipei.distanceTo(Taichung);
dist就是台北到台中的距離
*/
