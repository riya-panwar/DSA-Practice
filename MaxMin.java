
public class dsa1{
/**
 * @param args
 */
static void maxArray(int arr[],int start,int end){
int temp=0,t;
while(start<end){

if(arr[start]>temp){
t = arr[start];
arr[start] = temp;
temp = t;
}
start++;
}
System.out.println(temp);
}
static void minArray(int arr[],int start,int end){

    int temp=0,t;
while(start<end){

if(arr[start]<temp){
    t = arr[start];
    arr[start] = temp;
    temp = t;
}
start++;
}
System.out.println(temp);
}

static void printArray(int arr[],int size){

    for(int i=0;i<size;i++){
        System.out.print(arr[i] + "");
        System.out.println();
    }
}
 public static void main(String[] args){
int arr[] = {2,3,1,5,0,4};
printArray(arr, 6);
System.out.println("the max of array is \n");
maxArray(arr, 0, 5);
System.out.println("the min of array is \n");
minArray(arr, 0, 5);
}
}
