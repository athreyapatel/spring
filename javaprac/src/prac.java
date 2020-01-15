//new creates objects on heap area
//upcasting-parent has prop of child
//upcasted pointer will only refer to parent but only if the child has parents method overrided
//Liskov principle
//perspective is collection of views

/** This is a API comment/JAVA doc comments


*/

Anonumous Class
Classes created wo a name created from interfaces

One method to implement in interface then functional interface

<inside, this> is generic type 
inp and op may not be the same


cmd+shift+f = to format 
cmd+shift+o = to remove unnecessery imports

equals and equalsto difference


hashcode is numerical rep of obj
any data storing in hashcode should contain hashcode() and equals()
We can generate it using RightCLick source + generate hashcode()  and equals()


//Problem

Create a class Triplet with int first; int second; int sum

Write the function in ArrayUtil.java to get all the triplets <A, B, C> such that A+B = C 
public static List<Triplet> printTriplets(int[ ] data) { 
}

data = { 2,3,4,5,7}

<2,3,5>
<2,5,7>
<3,4,7>

data = {1,2,3,4,5,7,9}

<1,2,3>
<1,3,4>
<1,4,5>
<2,3,5>
<2,5,7>
<3,4,7>
<4,5,9>


@Test
void testTriplet() {
        int data[] = { 2,3,4,5,7};
        List<Triplet> triplets = ArrayUtil.printTriplets(data);
        Triplet t = triplets.get(0);
        assertEquals(3, t.size());
        assertEquals(2, t.getFirst());
        assertEquals(3, t.getSecond());
        assertEquals(5, t.getSum());


}



