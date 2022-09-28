public class BinarySearch {
    public static void binarySearch(char array[], int first, int last, char element){

        while( first <= last ){
            int mid = first + (last - first)/2;
            if ( (int)array[mid] < (int)element ){
                first = mid + 1;
            }else if ( array[mid] == element ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }

        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
    public static void main(String args[]){
        char array[] = {'a','b','c','d','e','f','g','h','i'}; 
        char element = 'a'; // Search value

        binarySearch(array,0,array.length-1,element);
    }
}
