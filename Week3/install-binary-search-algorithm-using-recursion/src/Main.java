public class Main {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int number;

        long startTime = System.currentTimeMillis();
        for (int i=0; i<array.length; i++){
            number = (int) Math.floor(Math.random()*1000);
            array[i]=number;
        }

        for (int arr: array){
            System.out.print(arr+" ");
        }
        bubbleSortByStep(array);
        System.out.println("Input value");
        int value = BinarySearch.binarySearch(array,0,array.length-1,0);
        long endTime = System.currentTimeMillis();
        System.out.println("\nIndex of 31 is: "+value);
        System.out.println("Execution time: "+(endTime-startTime)+" miliseconds");
    }
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;/* Next pass still needed */
                }
            }
            /* Array may be sorted and next pass not needed */
            if (!needNextPass) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            /* Show the list after sort */
            System.out.print("List after the  " + k + "' sort: ");
            for (int i : list) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}