public class Max_Heap {
    int [] array;
    int max_size;
    int heap_size;
    public Max_Heap(int max_size){
        this.max_size = max_size;
        array = new int[max_size];
        heap_size = 0;
    }
    public void max_heap(int i){
        int right = (2*i+2);
        int left = (2*i+1);
        int max = i ;
        if(left < heap_size && array[left]>array[i]){
            max = left;
        } else if (right<heap_size && array[right]> array[i]) {
            max = right;
        } else if (max != i) {
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
            max_heap(max);

        }
    }
}
