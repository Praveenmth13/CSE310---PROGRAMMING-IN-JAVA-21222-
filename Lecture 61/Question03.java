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


Statement 3 will result in a compilation error. Since class B is already using a type parameter T, class C cannot use a type parameter with same name.
Statement 4 will result in a compilation error because only String or an Integer can be used as type argument and not a custom class such as A.
Statement 5 will result in compilation error. Since class C is a generic class that accepts only one type parameter and not a nested type parameter.
Statement 6 will not result in compilation errors.
Statement 7 will not result in compilation error.
Statement 8 will result in compilation error.
