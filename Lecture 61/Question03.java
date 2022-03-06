Select all the correct statements for the below code:
class A { // statement 1
}

class B<T> { // statement 2
}

class C<T> { // statement 3
}

B<A> b1 = new B<A>(); // statement 4

C<B<A>> c1 = new C<B<A>>(); // statement 5

C c2 = new C(); // statement 6

C<int> c4 = new C<int>(); // statement 7

C<int[]> c3 = new C<int[]>(); // statement 8


          ------> A N S W E R <-----
            
D.) Statement 6 will not result in compilation errors.
