//parent class
class Mammals{
    void mam( ){
        System.out.println("Inside Mammals Class");
        }
}
//child class
class Lion extends Mammals{
    void roar( ){
        System. out.println("Inside Lion class ");
        }
}
//child
class Human extends Mammals{
    void hum( ){
        System. out.println("Inside Human");
        }
}
class az{
   public static void main(String args[]){
   Lion obj=new Lion( );
   obj.hum();
   obj.roar();
   obj.mam();
   }
}