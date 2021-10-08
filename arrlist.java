public class arrlist{

int[] arr;
int Default = 4;
int position = 0;
public arrlist(){
arr = new int[Default];
}

public arrlist(int initsize){
arr = new int[initsize];
}


public boolean set (int element){
if(position < arr.length){
	arr[position++] = element;
}else{
        int sizearr = arr.length + (arr.length>>1);
	int[] arr2 = new int[sizearr];
	for(int i = 0;i<arr.length ; i++){
	arr2[i] = arr[i];
}
	arr = arr2;
	arr[position++] = element;
}
return true;
}

public int get(int index){
return arr[index];
}
}
class array{
public static void main(String args[]){

arrlist neww = new arrlist();
neww.set(10);
neww.set(105);
neww.set(103);
neww.set(101);
neww.set(100);
System.out.println(neww.get(0));
System.out.println(neww.get(4));
}
}