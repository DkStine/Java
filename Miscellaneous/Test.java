public class Test {
    public static void main(String[] args) {
        // Q1
//         int i = 0;
// for ( String s="a"; s.compareTo("aaa") ! =0 ; s =
// s + "a" )
// System.out.print(s);
// Error: 
// Random.java:4: error: ';' expected
// for ( String s="a"; s.compareTo("aaa") ! =0 ; s =
//                                       ^
// Random.java:4: error: illegal start of expression
// for ( String s="a"; s.compareTo("aaa") ! =0 ; s =
//                                          ^
// Random.java:4: error: ')' expected
// for ( String s="a"; s.compareTo("aaa") ! =0 ; s =
//                                            ^
// Random.java:5: error: ';' expected
// s + "a" )

        // Q2
//         for (int i = 0; i < 1; System.out.println("HI"))
// System.out.print("HELLO");
// // Infinite loop

//         // Q3
//         int j=0;
// for (int i = 0; i < 1; j++)
// System.out.println("HELLO");
// Infinite loop
        
        // Q4
//         for ( int i = 0; true & ++i<2; i++)
// System.out.print(i);
// Output: 1

        // Q5
//         boolean b=false;
// for ( int i = 0; b | ++i<2; i++)
// {
// System.out.print(i);
// b=!b;
// }
// // Output: 13

//         // Q6
//         for (int i = 0, double x=3.0 ; i < 2 ; i++)
// System.out.println("HELLO ");
// Error:
/* 
Test.java:47: error: <identifier> expected
        for (int i = 0, double x=3.0 ; i < 2 ; i++)
                       ^
Test.java:47: error: '.class' expected
        for (int i = 0, double x=3.0 ; i < 2 ; i++)
                               ^
Test.java:47: error: ')' expected
        for (int i = 0, double x=3.0 ; i < 2 ; i++)
                                    ^
Test.java:47: error: illegal start of type
        for (int i = 0, double x=3.0 ; i < 2 ; i++)
                                           ^
Test.java:47: error: not a statement
        for (int i = 0, double x=3.0 ; i < 2 ; i++)
                                         ^
Test.java:47: error: ';' expected
        for (int i = 0, double x=3.0 ; i < 2 ; i++)*/

        // --> Q7
//         int i=0;
// for( ; ; )
// {
// if(i>5)
// break;
// else
// i=i+2;
// System.out.println(i);
// }
// Output:
/* 
2
4
6
*/

        // --> Q8
        // int a,b;
// for(a=6,b=4;a<=24;a=a+6)
// {
// if(a % b==0)
// break;
// System.out.println(a);
// Error:
/*
 * Test.java:95: error: reached end of file while parsing
}
 */

        // --> Q9
//         int a, b;
// for(a = 1, b = 4; a < b; a++, b--)
// {
// System.out.println("a = " + a);
// System.out.println("b = " + b);
// }
/*
 * Output:
a = 1
b = 4
a = 2
b = 3
 */


        // --> Q10
//         int i=0;
// for(i=100; i<=0; i=i-10)
// {
// System.out.print(i+",");
// }
// No output

        // --> Q11
//         int i = 0;
// for (System.out.println("HI") ; i < 1 ; i+
// + )
// System.out.println("HELLO GEEKS");
/*
 * Error:
Test.java:126: error: illegal start of expression
+ )
  ^
Test.java:125: error: not a statement
for (System.out.println("HI") ; i < 1 ; i+
 */

        // --> Q12
//         for(int i = 0; i<5; i++)
// {
// System.out.println("Hello");
// break;
// }
/*
 * Output:
Hello
 */

        // --> Q13
//         String s = "friends";
// int x = 0;
// do
// {
// System.out.print(s.charAt(x));
// x++;
// } while (x < 2);
// Output:
// fr

        // --> Q14
// while(true)
// {
// System.out.println("cppbuzz");
// }
// Output: Infinite loop

        // --> Q15
//         int i;
// for ( i = 5 ; i > 10; i ++ )
// System.out.println( i
// );
// System.out.println( i * 4 );
// Output: 20

        // --> Q16
//         for(int i = 0; i < 3; i++)
// {
// for(int j = 0; j < i; j++)
// {
// System.out.print(i + " " + j
// + ",");
/*
 * Error:
Test.java:182: error: reached end of file while parsing
}
 */

        // --> Q17
//         int i, s = 0;
// for (int k = 0; k < 5; k++)
// {
// i = 0;
// do
// {
// i++; s++;
// }while (i < k);
// }
// System.out.println(s);
// Output: 11

        // --> Q18
//         String one = "Hello";
// String two = "Hello";
// if(one == two)
// {
// System.out.println("one ==
// two");
// }
// else
// {
// System.out.println("one != two");
// }
/*
 * Error:
Test.java:205: error: unclosed string literal
System.out.println("one ==
                   ^
Test.java:206: error: unclosed string literal
two");
   ^
Test.java:206: error: not a statement
two");
 */

        // --> Q19
//         int i = 1;
// int j = 20;
// int k = 31;
// while (i < j)
// {
// k += (i * j);
// i = i * 2;
// j--;
// }
// System.out.println("i = " + i + " j = "
// + j + " k = " + k);
// Output: i = 16 j = 16 k = 297

        // --> Q20
//         int n = 5;
// while( n > 0 )
// {
// n--;
// System.out.println("n = " +
// n );
// }
// // Output:
// n = 4
// n = 3
// n = 2
// n = 1
// n = 0

        // --> Q21
//         for(int i = 0; i<5; i++)
// {
// System.out.println("ITER");
// i++;
// }
// Output:
// ITER
// ITER
// ITER

        // --> Q22
//         for(int i = 0; i<5; )
// {
// System.out.println("Hello");
// }
// Output: Infinite loop

        // --> Q23
//         for(int i=0; 0; i++)
// {
// System.out.println("ICP");
// }
// Output: Test.java:272: error: incompatible types: int cannot be converted to boolean

        // --> Q24
//         int i;
// for (int i = 0; i < 3; i++);
// System.out.println(i)
// Output: 
// Test.java:281: error: ';' expected

        // --> Q25
//         while(true)
// {
// System.out.println("ITER"
// );
// break;
// }
// Output:
// ITER

        // --> Q26
//         for (int i = 0; i < 10; i++)
// int x = 10;
// System.out.println("x");
// Output:
// Test.java:297: error: variable declaration not allowed here

        // --> Q27
//         int i = 0;
// for (System.out.println("ITER"); i <
// 1; i++)
// System.out.println("SOA");
// Output:
// ITER
// SOA

        // --> Q28
//         for (int i = 0 ; ; i++)
// System.out.println("ICP");
// Output: Infinite loop

        // --> 29
//         for (int i = 0 ; i < 1 ;
// System.out.print("ITER ") )
// System.out.println("SOA");
// Output: Infinite loop

        // --> 30
//         int i = 1, j = 1;
// for ( ; ; )
// {
// if (i > 5)
// break;
// else
// j += I ;
// System.out.println(j);
// i += j;
// }
// Output: 
// Test.java:329: error: cannot find symbol

        // --> Q31
//         int i = 0;
// while(true)
// {
// System.out.println(++i);
// break;
// }
// Output:
// 1

        // --> Q32
//         int i = 3, j=5;
// do
// {
// System.out.print(i*j);
// } while(++i < --j);
// Output:
// 15

        // --> Q33
//         char a = 'a';
// while(++a<=100)
// {
// System.out.print(a);
// }
// Output:
// bcd

        // --> Q34
//         for(int i=0; false; i++)
// System.out.println("Hello");
// Output:
// Test.java:366: error: unreachable statement

        // --> Q36
//         if(cnt > 4)
// break;
// if(cnt==0)
// {
// cnt++;
// continue;
// }
// System.out.print(cnt + ",");
// cnt++;
// }
// Output:
// Test.java:383: error: class, interface, enum, or record expected

        // --> Q37
//         do
// {
// System.out.print(j + ",");
// j++;
// }while(j<4);
// i++;
// }
// Output:
// Test.java:395: error: class, interface, enum, or record expected

        // --> Q38
//         int i = 0;
// for (System.out.println("HI"); i < 1; i+
// +)
// System.out.println("HELLO ITER");
// Output:
// Test.java:398: error: illegal start of expression
// +)
//  ^
// Test.java:397: error: not a statement
// for (System.out.println("HI"); i < 1; i+

        // --> Q39
//         int i , j;
// for(i=0;i<3;i++)
// {
// for(j=1;j<4;j++)
// {
// i%=j;
// System.out.println(j);
// }
// }
// Output: Infinite loop

        // --> Q40
//         int i;
// for(i=1; i<=10; i++);
// System.out.print(i);
// Output:
// 11

        // --> Q41
//         do
// {
// while (true)
// System.out.printl
// n("HELLO");
// }while (false);
// Output:
// Test.java:431: error: ';' expected
// n("HELLO");
//  ^
// Test.java:431: error: variable declaration not allowed here
// n("HELLO");

        // --> Q42
//         do
// System.out.println("FRIENDS");
// while (true);
// System.out.println("ENEMY");
// Output:
// Test.java:444: error: unreachable statement

        // --> Q43
//         int x = 1, y = 2;
// do
// {
// System.out.println("FRIENDS");
// } while (x < y);
// System.out.println("ENEMY");
// Output: Infinite loop

        // --> Q44
//         for(int i=1; i<=10; i++);
// System.out.print(i);
// Output:
// Test.java:459: error: cannot find symbol

        // --> Q45
//         for(int i = 0; 1; i++)
// {
// System.out.println("Hello");
// break;
// }
// Output:
// Test.java:464: error: incompatible types: int cannot be converted to boolean

        // --> Q46
//         do
// {
// System.out.print(1);
// do
// {
// System.out.print(2);
// } while (false);
// } while (false);
// Output:
// 12

        // --> Q47
//         loop1:
// for (int i = 0; i < 5; i++)
// {
// for (int j = 0; j < 5; j++)
// {
// if (i == 3)
// break loop1;
// System.out.println("i = " + i + " j = " + j);
// }
// }
// Output:
// i = 0 j = 0
// i = 0 j = 1
// i = 0 j = 2
// i = 0 j = 3
// i = 0 j = 4
// i = 1 j = 0
// i = 1 j = 1
// i = 1 j = 2
// i = 1 j = 3
// i = 1 j = 4
// i = 2 j = 0
// i = 2 j = 1
// i = 2 j = 2
// i = 2 j = 3
// i = 2 j = 4

        // --> Q48
//         int x = 3, k;
// while (x-- >= 0)
// {
// System.out.println
// (x);
// }
// Output:
// 2
// 1
// 0
// -1

        // --> Q49
//         int x = -10;
// while (x++ != 0)
// ;
// System.out.println(x);
// Output: 1

        // --> Q50
//         int n = 6, i=0;
// for (i=0; Math.pow(2,i)<=n; i++);
// System.out.println(i);
// Output: 3

        // --> Q51
//         int n = 6, i=0;
// while (Math.pow(2,i)<=n);
// System.out.println(i);
// Output: No output

        // --> Q52
//         int n = 6,i,j;
// for (i=0,j=0; i<n; i++,j++)
// System.out.println(i+" "+j);
// Output:
// 0 0
// 1 1
// 2 2
// 3 3
// 4 4
// 5 5

        // --> Q53
//         do
// {
// System.out.println(i);
// } while (i < = 5 );
// Output:
// Test.java:560: error: illegal start of expression

        // --> Q54
//         do
// {
// while (true)
// System.out.println("HELLO");
// }while (false);
// Output: Infinite loop

        // --> Q55
//         do
// {
// System.out.print(1);
// do
// {
// System.out.print(2);
// } while (false);
// } while (false);
// Output: 12

        // --> Q56
//         int x = 30, y = 50;
// if (x < y)
// int a = 40;
// else
// {
// System.out.println("BYE");
// }
// Output:
// Test.java:586: error: variable declaration not allowed here

        // --> Q57
//         for(i=0;i<10;i++)
// {
// for (j=-5;j<10;j++)
// {
// if(i==j )
// break;
// System.out.println(“Hello”);
// }
// }
// Output:
// Test.java:601: error: illegal character: '\u201c'
// System.out.println(�Hello�);
//                    ^
// Test.java:601: error: illegal character: '\u201d'
// System.out.println(�Hello�);
//                          ^
// Test.java:601: error: not a statement
// System.out.println(�Hello�);

        // --> Q58
//         int i=2;
// for( ; ; )
// {
// System.out.println("Hi");
// }
// Output: Infinite loop

        // --> Q59
//         for(int i = 0; i<5; i++)
// {
// System.out.println("Hello");
// i++;
// i--;
// }
// output:
// Hello
// Hello
// Hello
// Hello
// Hello

        // --> Q60
//         for(int i = 0; i<5; i=5 )
// {
// System.out.println("Hello");
// }
// Output: Hello

        // --> Q61
//         String s = "School";
// int x = 0;
// do
// {
// System.out.print(s.charAt(x));
// x++ ;
// } while (x < 2)
// Output:
// Test.java:650: error: ';' expected

        // --> Q62
//         int i=0;
// for(i=1; i<=6;i++)
// {
// if(i%3==0)
// continue;
// System.out.print(i+",");
// }
// }
// }
// Output:
// Test.java:665: error: class, interface, enum, or record expected

        // --> Q63
//         int n = 6;
// do
// {
// System.out.println
// (Math.abs (-n));
// } while (n != 0);
// Output: Infinite loop
    }
}

