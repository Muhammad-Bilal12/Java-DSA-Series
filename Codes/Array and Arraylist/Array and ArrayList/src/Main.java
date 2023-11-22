public class Main {
    public static void main(String[] args) {

//        Array and ArrayList

        // lets take a look on questions:
//        Q1: Store the roll no of the student?
        int rno = 12;

//        Q: Store the name of the student?
        String  name = "Bilal";


//        Q: Store 5 roll no in variable, here we confused. What we are going to do is
        int rno1  = 12;
        int rno2 = 13;
        int rno3 = 14;
        // and so on. but if there are 500 students we are creating 500 variable like this?

        // so here come an Array.
        //// *Array* is the collection of data type used to store same type of data.


        // Syntax
        // datatype[] var_name = new datatype[size];

//        store 5 roll no
        int[] rnos = new int[5]; // if we not define size it will give an error: "ARRAY Inilializer expected" or "array dimension missing"

        // or we can directly do this;
        int[] rnos2 = {23,45,3,5,2};

        System.out.println(rnos2); //[I@65ab7765

        // lets dive into an array
        int[] arr; // declaration: array is getting defined in the stack
        arr = new int[5]; // Initialization: actually here, object are being created in memory (heap).




    }
}