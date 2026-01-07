class MyAccount{
int accNo;
double balance;
MyAccount(){
System.out.println("In Constructor");
}
}
class MyBank {
public static void main(String[] args){
MyAccount ma= new MyAccount();
System.out.println("balance="+ma.balance);
}
}