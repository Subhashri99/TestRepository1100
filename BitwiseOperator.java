class BitwiseOperator {
	public static void main(String args[]){
int x=10;
int y=15;
if(++x<10 & ++y>5){
x++;
}
else{
y++;
}
System.out.println(x);
System.out.println(y);
}
}