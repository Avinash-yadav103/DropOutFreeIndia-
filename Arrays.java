public class Arrays {
    public static void main(String[] args){
        // Classroom of 500 students - You have to store marks of these 500 students
        // You have 2 options:
        // 1. Create 500 variables
        // 2. Use Arrays (recommended)

        //There are three main ways to create an array in Java:
        // 1. int [] terms = new int[5];

        // Declaration and then memory allocation
        // 2. int [] terms;
        // int [] marks;
        // marks = new int[5];
        //Initialization
        // marks[0] = 50;
        // marks[1] = 60;
        // marks[2] = 70;
        // marks[3] = 80;
        // marks[4] = 90;
        // System.out.println(marks[4]);   // output: 90

        // 3. Declaration , memory allocation and initialization together
    //     int [] terms = {1,2,3,4,5};
    //     System.out.println(terms);

        int [] marks = {98, 95, 90, 85, 80};
        float [] marks2 = {98.5f, 95.5f, 90.5f, 85.5f, 80.5f};
        System.out.println(marks[0]);
        System.out.println(marks.length);
        System.out.println(marks2[0]);
        String [] students = {"John", "Avinash", "Risshi", "Saransh", "Rahul"};
        System.out.println(students[0]);
        //Displaying the array (Naive way)
        //1. Method first
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        // 2. Method second
        for(float i = 0; i<marks.length; i++){
            System.out.println(i);
        }


        //**Important**
        // Displaying the Array by using (for-each loop)
        for(int element: marks){
            System.out.println(element);
        }


        // Multidimentional Arrays
        //1D Array
        int [] hello = {1,2,3,4,5};
        System.out.println(hello[0]);
        //2D Array
        int [][] flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        System.out.println(flats[0][0]);  // output: 101 

        //Displaying the 2D Array using for loop
        for(int i =0 ; i<flats.length ; i++){
            for(int j=0; j< flats[i].length ; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
                
            }
            System.out.println("");
        }

    }

}


