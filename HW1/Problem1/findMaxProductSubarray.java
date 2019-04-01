
import java.util.Arrays;

public class findMaxProductSubarray {

    public static double max_product(double[] array) {
        int size = array.length;
        int i;
        double max = 0; //an index that is useful to say where a max product ends
        double max_sub_array_product = 0;// the result of the computation
        double current_product_bzo = 0; //bzo=between zero one
        double current_product_gto = 0; //gto=greater than one
        double max_current_product = 0; //the greater between bzo&gto
        for (i = 0; i < size; i++) {
            if (array[i] < 0) {
                System.out.println("The value: " + array[i] + " is negative but we are considering and accepting only positive numbers, so the array " + Arrays.toString(array) + " won't be considered!");
            }
            if (array[i] >= 0 && array[i] < 1) {//here I'm considering the case when the value of the array is a real number between or equal zero and one.
                max = array[i];
                if (max_sub_array_product >= 1 && current_product_bzo < current_product_gto) {
                    current_product_bzo = max_sub_array_product; //it's useless to update current_product_bzo if it is greater than current_product_gto 
                }                                                //because otherwise it will update it with a value that is lower than the previous one.
                if (max_sub_array_product == 0 || max_sub_array_product >= 1 && i + 1 < size && current_product_gto * max * array[i + 1] < max_sub_array_product) { //if the max product is zero or greater or equal to one, because the  
                    max_sub_array_product = 0; //multiplication with a value included between zero and one will return a value lower than the previous one,
                }                              //I reinitialize the variable to skip these values.

            } else {
                if (max_sub_array_product < 1) {//if the max product is lower than one I have to initialize the variable max to one because in this way the 
                    max = 1;                    //algorithm will skip values included between zero and one.
                }
                max *= array[i];
                current_product_gto = max;
                if (current_product_gto < max_sub_array_product) {
                    max *= max_sub_array_product;
                }

            }
            if (max_sub_array_product < max) {
                max_sub_array_product = max;
            }
        }
        max_current_product = current_product_bzo < current_product_gto? current_product_gto : current_product_bzo;
        if (max_sub_array_product < max_current_product) {
            max_sub_array_product = max_current_product;
        }
        return max_sub_array_product;
    }

}
