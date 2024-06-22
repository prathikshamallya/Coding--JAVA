import java.util.*;

public class linkedlist{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> ll=new LinkedList<>();
        System.out.print("Enter the no of elements in the LinkedList: ");
        int n=sc.nextInt();
        System.out.println("Enter the LinkedList elements");
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            ll.add(ele);
        }
        System.out.println("The linked list Eleemnts are:");
        for(int i:ll){
            System.out.print(" "+i);
        }
        System.out.println();
        System.out.println("Linked list Operations:");
        System.out.println("1.to Insert some Elements at the Specified Position:");
        System.out.println("2.swap two elements in a linked list");
        System.out.println("3.to Iterate a LinkedList in Reverse Order");
        System.out.println("4.to Compare Two LinkedList");
        System.out.println("5.to Convert a LinkedList to ArrayList");
        System.out.println("6.Display ll");
        System.out.println("7.Exit");
        while (true) {
            System.out.print("Enter your Choice:");
            int ch=sc.nextInt();
            System.out.println();
            switch (ch) {
                case 1:{
                    System.out.print("Enter the index to add the element:");
                    int index=sc.nextInt();System.out.println();
                    System.out.print("Enter the Element to be added:");
                    int num=sc.nextInt();
                    ll.add(index,num);
                    break;
                }
                case 2:{
                    System.out.println();
                    System.out.print("Enter the index of the element 1");
                    int fir=sc.nextInt();
                    System.out.println();
                    System.out.print("Enter the index of the element 2");
                    int sec=sc.nextInt();
                    Collections.swap(ll, fir, sec); 
                    break;
                }
                case 3:{
                    ListIterator<Integer> it= ll.listIterator(ll.size());
                    while(it.hasPrevious()){
                        System.out.println(it.previous()+" ");
                    }
                    break;
                }
                case 4:{
                    System.out.println("Enter the size of 2n Linkedlist:");
                    int size=sc.nextInt();
                    LinkedList<Integer> ll2=new LinkedList<>();
                    System.out.println("Enter the LinkedList elements");
                    for(int i=0;i<size;i++){
                        int ele=sc.nextInt();
                        ll2.add(ele);
                    }
                    if(ll.equals(ll2)){
                        System.out.println("Both ll are equal");
                    }else{
                        System.out.println("not equal");
                    }
                    break;
                }
                
                case 5:{
                    ArrayList<Integer> al=new ArrayList<>(ll);
                    System.out.println(al);break;
                }
                case 6:{
                    for(int i:ll){
                        System.out.print(" " +i);
                    }
                    break;
                }
                case 7:{
                    sc.close();
                    System.exit(0);
                }
                default:
                    System.out.println("Invalid Operation choice");
                    break;
            }
            
        }
    }
}