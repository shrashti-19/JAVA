public class circularQueue{
    static class Queue{
        static int rear;
        static int front;
        static int arr[];
        static int size;
        
        Queue(int n){
            arr = new int[n];
            rear =-1;
            size=n;
            front =-1;
        }

        public boolean isEmpty(){
            return front==-1 && rear==-1;
        }

        public boolean isFull(){
            return (rear+1)%size == front;
        }
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }

            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public int remove(){
           
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
             int result = arr[front];
            if(rear==front){ //last element remove
                rear=front=-1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);

        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
     

        

    }
}