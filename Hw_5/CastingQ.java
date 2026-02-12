public class CastingQ {
    int i1 = 5;			
//value already matches the variable type; whole numbers are int by default

//int i2 = 5.2;		
//error because… 5.2 is a decimal (double by default) and cannot be stored in an int without casting

float f1 = 2;           
//automatic conversion; int 2 is converted to float 2.0

float f2 = 3.0f;        
//value already matches the variable type; f tells Java this is a float

//float f2 = 3.0;		
//error because… 3.0 is double by default and Java will not automatically convert double to float

//float f3 = 3.5;		
//error because… 3.5 is double by default and cannot be stored in float without casting

double d1 = 3.5;		
//value already matches the variable type; decimals are double by default

double d2 = 2.0;		
//value already matches the variable type

double d3 = 4;		
//automatic conversion; int 4 is converted to double 4.0

double d4 = 3.5d;		
//value already matches the variable type; d tells Java this is a double

i1 = (int) d1; 		
//explicit cast; double 3.5 becomes int 3 because the decimal part is removed
System.out.println ("i = " + i1);	
//prints i = 3

//i1 = 5.0 / 9.0;	
//error because… 5.0/9.0 produces a double result and double cannot be automatically converted to int

i1 = 5 / 9;			
//integer division; both numbers are int so the decimal part is removed
System.out.println ("i = " + i1);	
//prints i = 0

f1 = (float) d1;      
//explicit cast; double 3.5 is converted to float 3.5
System.out.println ("f = " + f1);
//prints f = 3.5

f1 = 5 / 9;         
//integer division gives 0, then it is automatically converted to float
System.out.println ("f = " + f1);
//prints f = 0.0

//f1 = 5.0/9.0;		
//error because… result is double and cannot be automatically converted to float

f1 = 5.0f / 9.0f;
//float divided by float gives a float result
System.out.println ("f = " + f1);
//prints f = 0.5555556 (approximately)

d1 = 3.5 / 2.6;
//double divided by double gives a double result
System.out.println ("d = " + d1);
//prints d ≈ 1.3461538

d1 = (int) 3.5 / 2.6;
//3.5 becomes 3 first, then 3 divided by 2.6 gives a double result
System.out.println ("d = " + d1);
//prints d ≈ 1.1538461

d1 = (int) (3.5) / 2.6;
//same as above; 3.5 becomes 3 before division
System.out.println ("d = " + d1);
//prints d ≈ 1.1538461

d1 = (int) (3.5 / 2.6);
//division happens first, then the result is cast to int
System.out.println ("d = " + d1);
//prints d = 1.0

//d1 = int 3.5 / 2.6;   
//error because… casting must use parentheses like (int)

d1 = (int) (3.5 / 2.6);
//same as before; result becomes 1
System.out.println ("d = " + d1);
//prints d = 1.0

d1 = 3.5 / (int) 2.6; 
//2.6 becomes 2, then 3.5 divided by 2 gives a double result
System.out.println ("d = " + d1);
//prints d = 1.75

d1 = (float) (int) (3.5 / 2.6);
//3.5/2.6 ≈1.346 → cast to int 1 → cast to float 1.0 → stored in double
System.out.println ("d = " + d1);
//prints d = 1.0
       
short smallValue = 45;
//value fits in short range

//short s = 3.5;                
//error because… decimal value cannot be stored in short without casting

//smallValue = 234251434324324; 
//error because… the number is too large for the short range

int littleValue = smallValue;
//automatic conversion; short is converted to int

smallValue = (short) littleValue;
//explicit cast from int back to short
System.out.println ("smallValue = " + smallValue);
//prints smallValue = 45

smallValue = (short) 234251434;
//explicit cast; number is too large for short range so it wraps around
System.out.println ("smallValue = " + smallValue);
//prints a wrapped negative value

//int over = 1111111111111; 
//error because… the number is too large for the int range

float pay = 42234.45f;
//value already matches the variable type; f tells Java this is a float

long bigValue = 45243224L;
//value already matches the variable type; L tells Java this is a long

double amount = 345.45d;
//value already matches the variable type; decimals are double by default

}
