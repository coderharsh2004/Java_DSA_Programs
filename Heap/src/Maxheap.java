public class Maxheap {
    int heap[];
    int maxsize,size;
    Maxheap(int maxsize){
        this.maxsize=maxsize;
        heap=new int[maxsize];
        size=0;
    }
    public int parent (int index){
        return (index-1)/2;
    }
    public int left(int index){
        return (2*index)+1;
    }
    public int right(int index){
        return (2*index)+2;
    }
    public void insert(int data){
        int pos=size;
        heap[pos]=data;
        //check if the properties is not voilated.
        while(heap[pos]>heap[parent(pos)]){
            swap(pos,parent(pos));
            pos=parent(pos);
        }
        ++size;
    }
    public void swap(int fpos,int spos){
        int temp;
        temp=heap[fpos];
        heap[fpos]=heap[spos];
        heap[spos]=temp;
    }
    public void display(){
        for(int i=0;i<(size/2);i++){
            System.out.print("Parent  - "+heap[i]+"  |  ");
            if(left(i)<size)
               System.out.print("Left  - "+heap[left(i)]+"  |  ");
            if(right(i)<size)
                System.out.print("Right  - "+heap[right(i)]+"  |  ");
            System.out.println();
        }

    }
    public static void main(String args[]){
        Maxheap heap=new Maxheap(10);
        heap.insert(10);
        heap.insert(20);
        heap.insert(30);
        heap.insert(40);
        heap.insert(50);
        heap.display();
    }
}
