package question6;

public class LabExam1 {

    public static int[] deleteElement(int[] array, int ind) {

        if (ind > array.length || ind < 0) {
            System.out.println("Invalid Index.");
            return array;
        }

        int[] newArray = new int[array.length - 1];

        for (int i = 0; i < array.length; i++) {

            if (i != ind) { newArray[i] = array[i]; }
            else { break; }
        }

        for (int i = ind + 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }    

        return newArray;
        

    }
    public static void main(String[] args) throws Exception {

        int[] array = {3, 7, 1, 9, 4};

        System.out.println(deleteElement(array, 3));

    }
}
